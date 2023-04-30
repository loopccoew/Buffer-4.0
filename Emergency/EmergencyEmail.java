package Emergency;

import javax.mail.*;
import javax.mail.internet.*;
import java.util.*;

public class EmergencyEmail
{
    static Queue<String> receiverQueue=new LinkedList<>();
    final String senderEmail = "daksha.kulkarni@cumminscollege.in"; //change email address

    final String senderPassword = "daksha23"; //change password

    final String emailSMTPserver = "smtp.gmail.com";

    final String emailServerPort = "465";

    String receiverEmail1 = null;
    String receiverEmail2=null;
    String receiverEmail3=null;
     static String receiverEmail;

    static String emailSubject;


    static String emailBody=null;

    public EmergencyEmail() {

        //receiver email



        //subject

        this.emailSubject = "Emergency";

        //body

        this.emailBody =" Your Loved ones need your help..please look into the matter";


        Properties props = new Properties();

        props.put("mail.smtp.user",senderEmail);

        props.put("mail.smtp.host", emailSMTPserver);

        props.put("mail.smtp.port", emailServerPort);

        props.put("mail.smtp.starttls.enable", "true");

        props.put("mail.smtp.auth", "true");

        props.put("mail.smtp.socketFactory.port", emailServerPort);

        props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");

        props.put("mail.smtp.socketFactory.fallback", "false");

        @SuppressWarnings("removal")

        SecurityManager security = System.getSecurityManager();
        String receiverEmail1 = "daksha.kulkarni@cumminscollege.in";
         String receiverEmail2 = "saniya.dighe@cumminscollege.in";
         String receieverEmail3="gayatri.joshi@cumminscollege.in";

        receiverQueue.add(receiverEmail1);
         receiverQueue.add(receiverEmail2);
         receiverQueue.add(receieverEmail3);
         while(!receiverQueue.isEmpty()){
             String qemail=receiverQueue.peek();
            // new EmergencyEmail(qemail,subject,emailBody);
             receiverEmail=qemail;
             receiverQueue.remove();
             try {

                 Authenticator auth = new SMTPAuthenticator();

                 Session session = Session.getInstance(props, auth);

                 MimeMessage msg = new MimeMessage(session);

                 msg.setText(emailBody);

                 //System.out.println(emailBody);

                 msg.setSubject(emailSubject);

                 msg.setFrom(new InternetAddress(senderEmail));



                 msg.addRecipient(Message.RecipientType.TO, new InternetAddress(receiverEmail));

                 Transport.send(msg);

                 System.out.println("Message sent successfully");

             }

             catch (Exception e)
             {
                 e.printStackTrace();
             }
         }


    }

    public class SMTPAuthenticator extends javax.mail.Authenticator
    {

        public PasswordAuthentication getPasswordAuthentication()
        {
            return new PasswordAuthentication(senderEmail, senderPassword);
        }
    }

    void calling(){


    }

    public static void main(String args[])
    {
        new EmergencyEmail();

//        String emailBody="Your Loved ones need your help..please look into the matter";
//         String receiverEmail1 = "daksha.kulkarni@cumminscollege.in";
//         String receiverEmail2 = "saniya.dighe@cumminscollege.in";
//         String receieverEmail3="gayatri.joshi@cumminscollege.in";
//         String subject="Emergency";
//         receiverQueue.add(receiverEmail1);
//         receiverQueue.add(receiverEmail2);
//         receiverQueue.add(receieverEmail3);
//
//         while(!receiverQueue.isEmpty())
//         {
//             String qemail=receiverQueue.peek();
//             new EmergencyEmail(qemail,subject,emailBody);
//             receiverQueue.remove();
//         }
    }
}
