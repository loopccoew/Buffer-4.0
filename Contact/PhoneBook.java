package Contact;

import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.colorchooser.ColorSelectionModel;

public class PhoneBook extends JFrame implements ActionListener {
    private HashMap<String, String> phoneBook;
    private JPanel contentPane;
    JTextField numberField;
    JButton displayAllButton;
    JButton searchButton;
    JButton addButton;
    JTextField nameField;
    JTextField searchField;
    JTextArea displayArea;
    JScrollPane displayPane ;

    //String name,number;

    BufferedReader reader;


    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    PhoneBook frame = new PhoneBook();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    public PhoneBook() {
        phoneBook = new HashMap<>();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 662, 793);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);
        setResizable(false);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setBackground(new Color(255, 228, 225));
        panel.setBounds(0, 0, 648, 814);
        contentPane.add(panel);
        panel.setLayout(null);

        JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setIcon(new ImageIcon(ClassLoader.getSystemResource("Contact/phone_book.png")));
        lblNewLabel.setBackground(new Color(153, 204, 255));
        lblNewLabel.setFont(new Font("Serif", Font.BOLD, 35));
        lblNewLabel.setBounds(277, 10, 100, 109);
        panel.add(lblNewLabel);

        JLabel lblNewLabel_1 = new JLabel("CONTACTS");
        lblNewLabel_1.setBackground(new Color(153, 204, 255));
        lblNewLabel_1.setFont(new Font("Serif", Font.BOLD, 28));
        lblNewLabel_1.setBounds(251, 129, 206, 37);
        panel.add(lblNewLabel_1);

        JLabel label = new JLabel("NAME :");
        label.setForeground(new Color(0, 128, 128));
        label.setBackground(new Color(153, 204, 255));
        label.setFont(new Font("Serif", Font.BOLD, 25));
        label.setBounds(33, 178, 114, 42);
        panel.add(label);

        displayAllButton = new JButton("DISPLAY ALL CONTACTS");
        displayAllButton.setFont(new Font("Serif", Font.BOLD, 20));
        displayAllButton.setForeground(new Color(255, 240, 245));
        displayAllButton.setBackground(new Color(205, 133, 63));
        displayAllButton.setBounds(160, 489, 313, 53);
        panel.add(displayAllButton);
        displayAllButton.addActionListener(this);

        numberField = new JTextField();
        numberField.setFont(new Font("Serif", Font.PLAIN, 20));
        numberField.setForeground(new Color(0, 128, 128));
        numberField.setBackground(new Color(255, 240, 245));
        numberField.setBounds(229, 239, 313, 53);
        panel.add(numberField);
        numberField.setColumns(10);

        searchButton = new JButton("SEARCH");
        searchButton.setForeground(new Color(255, 240, 245));
        searchButton.setFont(new Font("Serif", Font.BOLD, 20));
        searchButton.setBackground(new Color(0, 139, 139));
        searchButton.setBounds(229, 442, 148, 37);
        panel.add(searchButton);
        searchButton.addActionListener(this);

        addButton = new JButton("ADD");
        addButton.setForeground(new Color(255, 240, 245));
        addButton.setFont(new Font("Serif", Font.BOLD, 20));
        addButton.setBackground(new Color(0, 139, 139));
        addButton.setBounds(229, 302, 148, 37);
        panel.add(addButton);
        addButton.addActionListener(this);


        JLabel lblNumber = new JLabel("NUMBER :");
        lblNumber.setForeground(new Color(0, 128, 128));
        lblNumber.setFont(new Font("Serif", Font.BOLD, 25));
        lblNumber.setBackground(new Color(153, 204, 255));
        lblNumber.setBounds(33, 242, 148, 42);
        panel.add(lblNumber);

        nameField = new JTextField();
        nameField.setForeground(new Color(0, 128, 128));
        nameField.setFont(new Font("Serif", Font.PLAIN, 20));
        nameField.setColumns(10);
        nameField.setBackground(new Color(255, 240, 245));
        nameField.setBounds(230, 176, 313, 53);
        panel.add(nameField);

        JLabel lblSearchName = new JLabel("SEARCH NAME :");
        lblSearchName.setForeground(new Color(0, 128, 128));
        lblSearchName.setFont(new Font("Serif", Font.BOLD, 25));
        lblSearchName.setBackground(new Color(153, 204, 255));
        lblSearchName.setBounds(10, 371, 206, 42);
        panel.add(lblSearchName);

        searchField = new JTextField();
        searchField.setForeground(new Color(0, 128, 128));
        searchField.setFont(new Font("Serif", Font.PLAIN, 20));
        searchField.setColumns(10);
        searchField.setBackground(new Color(255, 240, 245));
        searchField.setBounds(229, 368, 313, 53);
        panel.add(searchField);

        displayArea = new JTextArea();
        displayArea.setBackground(new Color(255, 228, 225));
        displayArea.setBounds(10, 606, 629, 200);
        displayArea.setFont(new Font("Serif", Font.PLAIN, 18));
        displayArea.setForeground(Color.BLACK);
        panel.add(displayArea);
        addButton.addActionListener(this);

        displayPane = new JScrollPane(displayArea);
        displayPane.setBounds(10, 552, 629, 200); // Set preferred size
        displayPane.setBorder(BorderFactory.createTitledBorder("CONTACTS :")); // Set border with title
        panel.add(displayPane);

        // Load phone book from CSV file and store into hashmap named 'phonebook'
        try {
            reader = new BufferedReader(new FileReader("csvphone.csv"));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 2) {
                    phoneBook.put(parts[0], parts[1]);
                }
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public void actionPerformed(ActionEvent e) {
        String action = e.getActionCommand();

        /*name = nameField.getText();
        number = numberField.getText();*/

        if (e.getSource()==addButton) {
            displayArea.append("");
            String name,number;
            displayArea.setText("");
            name = nameField.getText();
            number = numberField.getText();

            /*if (phoneBook.containsKey(name)) {
                displayArea.append("NUMBER FOR " + name + "  UPDATED TO " + number + "\n");

            }
            else {
                displayArea.append("ADDED  " + name + " WITH NUMBER " + number + "\n");

            }*/
            displayArea.append("ADDED SUCCESSFULLY !");
            phoneBook.put(name, number);

            savePhoneBook();


        }
        if (action.equals("SEARCH")) {
            displayArea.setText("");
            String search = searchField.getText();
            String result = phoneBook.get(search);  //searching using hashmap --> REDUCED TIME COMPLEXITY !!
            if (result == null) {
                displayArea.setText("NO RESULTS FOUND !\n");
            } else {
                displayArea.setText(search + " ---> " + result + "\n");
            }
        }
        if(action.equals("DISPLAY ALL CONTACTS")) {

            displayArea.setText("");

            Map<String, String> sortedMap = new TreeMap<>(phoneBook);
            for (Map.Entry<String, String> entry : sortedMap.entrySet()) {
                displayArea.append(entry.getKey() + "--->" + entry.getValue() + "\n");
            }
        }
    }

    public void savePhoneBook() {
        // Save phone book to CSV file
        try {
            FileWriter writer = new FileWriter("csvphone.csv");
            //CSVWriter csvwrit = new CSVWriter(writer);
            for (String key : phoneBook.keySet()) {
                String value = phoneBook.get(key);
                System.out.println(key+value);
                //writer.append(key + "," + value + "\n");
                writer.append(key);
                writer.append(",");
                writer.append(value);
                writer.append("\n");
            }
            writer.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }


}
