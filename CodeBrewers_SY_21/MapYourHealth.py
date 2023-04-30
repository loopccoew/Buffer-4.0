import streamlit as st
import pandas as pd
import csv
from datetime import datetime
import altair as alt
from PIL import Image
import plotly.express as px
from streamlit import pyplot as plt
from streamlit_option_menu import option_menu




class doctor: # contains details about doctor
   
#     # list of patients under a doctor
    def __init__ (self, name="", phn="", add="", mail="", specialist="", age="", gender="", password="", degree="", yr="", patient_list=[], shared_pat_list=[]):
        self.doctor_name = name
        self.doctor_add = add
        self.doctor_phn = phn
        self.doctor_mail = mail
        self.degree = degree
        self.specialist = specialist
        self.doctor_gender = gender
        self.practice_yr = yr
        self.doctor_age = age
        self.doctor_password = password
        self.patient_list = patient_list
        self.shared_pat_list = shared_pat_list




    def login_doctor(self, dr_list):
        loggedIn_dr = None
        n = len(dr_list)
        flag1 = False
        flag2 = False




        while flag1 == False:
            email_input = st.text_input("  ")
            if email_input == "":
                st.write("Enter your Mail")
            else:
                for i in range(n):
                    if email_input == dr_list[i].doctor_mail:
                        flag1 = True
                        while flag2 == False:
                            password_input = st.text_input("", type="password")
                            if password_input == "":
                                st.write("Enter your password!")
                            else:
                                if password_input == dr_list[i].doctor_password:
                                    flag2 = True
                                    st.success("Login successful!")
                                    loggedIn_dr = dr_list[i]
                                if flag2 == False:
                                    st.warning("Invalid password! Please enter again.")
                             
                        break




                if flag1 == False:
                    st.warning("Invalid email ID! Please enter again.")




        return loggedIn_dr








    def read_csv_dr(self, path, dr_list):
        dr_details = pd.read_csv(path,encoding= 'unicode_escape')
        for i in range(len(dr_details)):
            dr = doctor(
                name = dr_details.iloc[i]["Doctor Name"],
                phn = dr_details.iloc[i]["Phone No"],
                add = dr_details.iloc[i]["Address"],
                mail = dr_details.iloc[i]["Email"],
                specialist = dr_details.iloc[i]["Specialist"],
                age = dr_details.iloc[i]["Age"],
                gender = dr_details.iloc[i]["Gender"],
                password = dr_details.iloc[i]["Password"],
                degree = dr_details.iloc[i]["Degree"],
                yr = dr_details.iloc[i]["Year of Practice"],
                patient_list = [],
                shared_pat_list = []
            )
            dr_list.append(dr)   # add doctor obj to the doctor list
        return dr_list








    def Patient_list(self,dr):
        #st.header("List of Patients")
        n = len( dr.patient_list)
        st.write(f"Number of patients in patient_list: {n}")  # add this line
        pat_list=[]
        col = ["Patient ID","Patient Name","Age","Gender","Phone No.","Email ID","Address"]
        pat_list.append(col)
        for i in dr.patient_list:            
            pat_list.append([i.patient_id,i.patient_name,i.patient_age,i.patient_gender,i.patient_phn,i.patient_mail,i.patient_add])
        st.table(pat_list)
                           
   
   
    def drPersonal_details(self):
        # for dr in dr_list:
            st.header("PROFILE")
            df={ "Name":self.doctor_name,
                  "Age":self.doctor_age,
                  "Gender":self.doctor_gender,
                  "Speciality": self.specialist,
                  "Degree":self.degree,
                  "Practice Year":self.practice_yr,
                  "Phone No.":self.doctor_phn,
                  "Email ID": self.doctor_mail,
                  "Address":self.doctor_add
                }
            st.dataframe(df)



    def Patient_personal_details(self,dr):
        st.header("PATIENT DETAILS")
        flag=0
        pat_mail=st.text_input("Enter patient mail: ")
        for pat in dr.patient_list:
            if pat.patient_mail == pat_mail:
                flag=1
                df={"Patient ID" : pat.patient_id,
                    "Name" : pat.patient_name,
                    "Age" : pat.patient_age,
                    "Gender" : pat.patient_gender,
                    "Phone no" : pat.patient_phn,
                    "Email ID" : pat.patient_mail,
                    "Address" : pat.patient_add,
                    "Past surgeries" : pat.past_surgeries,
                    "Current diseases" : pat.current_disease,
                    "Current medications" : pat.current_medication,
                    "Current BP (mmHg)" : pat.bp,
                    "Current BMI" : pat.bmi,
                    "Current WBC" : pat.wbc,
                    "Current RBC" : pat.rbc
                }
                st.dataframe(df)
                st.markdown('***Visual Analysis***')
                pat.Visulaisation(pat)
                break
        if flag==0:
            st.warning("Patient not found!")




   
    def patient_sharing(self, dr, dr_list):
        pat=patient()
        temp_dr = []
        for i in range(len(dr_list)):
            if dr.doctor_mail == dr_list[i].doctor_mail:
                continue
            temp_dr.append(dr_list[i].doctor_mail)
        list1=[]
        for i in temp_dr:
            list1.append(pat.get_name(dr_list,i))
        choice=st.radio("Select Doctor", list1)
        for i in range(len(list1)):
            if choice==list1[i]:
                share_dr_mail=temp_dr[i]
        for i in range(len(dr_list)):
            if share_dr_mail == dr_list[i].doctor_mail:
                share_dr=dr_list[i]
               
        pat_id = st.text_input("Enter patient mail to be shared:")
        if st.button("Share"):
            flag = False
            for i in range(len(dr.patient_list)):
                if dr.patient_list[i].patient_mail== pat_id:
                    share_dr.shared_pat_list.append(dr.patient_list[i])
                    st.write("Patient data shared successfully")
                    flag = True
                    break
            if not flag:
                st.error("Patient not found!")
            for item in share_dr.shared_pat_list:
                list1 = [item.patient_id, item.patient_name, item.patient_age, item.patient_add, item.patient_phn, item.patient_gender, item.patient_mail, item.patient_password]
                for i in range(len(dr_list)):
                    if share_dr.doctor_mail == dr_list[i].doctor_mail:
                        path = share_dr.doctor_name+".csv"
                        dr.append_row(path,list1)
                   








    def get_name(self,patient_list,mail):
        for i in patient_list:
            if i.patient_mail==mail:
                return i.patient_name
        return "NA"
           
    def appointment_dr(self,dr,dr_list):
        status="NC" or "C"
        ans=1
        flag=1
        app_list=[]
        app_details=pd.read_csv("appointments.csv",encoding= 'unicode_escape')
                #store all appointments in the list
        for i in range (0,len(app_details),1):
                list2=[app_details.iloc[i]["Of"],app_details.iloc[i]["With"],app_details.iloc[i]["DateTime"],app_details.iloc[i]["Status"]]                        
                app_list.append(list2)
               
         
        ans=st.selectbox("Enter Choice",["Schedule new appointment","View scheduled appointments","Cancel Appointment","Reschedule Appointment"])
              #ans=int(input("Enter choice: "))
        if ans=="Schedule new appointment":
            with_pat=st.text_input("Enter patient email to be appointed : ")
                #check if patient is present
            for i in dr_list:
                for j in i.patient_list:  
                    if j.patient_mail==with_pat:                        
                        flag=0
            if(flag==1):
                st.warning("Account doesnot exist!")
                    #return
            date = st.date_input("Select a date", value=datetime.now(), key="datetime")
            time=st.time_input("Select time (Hr-min)")
            t=str(date)+" "+str(time)
            list1=[str(dr.doctor_mail),str(with_pat),str(t),str(status)]
            flag1=1
                #check for clashings in appointments              
            for i in app_list:
                if i==list1:  #purna ditto appointment present ahe
                        flag1=0
                        st.warning("Appointment already exists")
                elif i[1]==list1[1] and i[2]==list1[2]:  #patient already has appointment at this time
                        st.warning("Patient has another appointment at this time.\nSpecify another time")
                        while(str(t)==list1[2]):
                                t=dr.input_date() #take new date
                        list1=[str(dr.doctor_mail),str(with_pat),str(t),str(status)]          
                elif i[0]==list1[0] and i[2]==list1[2]:  #dr already has appointment at this time
                        st.warning("You have another appointment scheduled at this time\nSpecify another time")
                        while(str(t)==list1[2]):
                                t=dr.input_date()
                        list1=[str(dr.doctor_mail),str(with_pat),str(t),str(status)]
            if(flag1==1):
                     #append new appointment list
                if st.button("Schedule"):
                    app_list.append(list1)
                    dr.append_row("appointments.csv",list1)
                    st.success("Appointment scheduled succesfully")
            #view
       
        elif ans == "View scheduled appointments":  
                #sort wrt date and time
                for i in app_list:
                    sorted_app_list=sorted(app_list,key=lambda x:datetime.strptime(x[2], "%Y-%m-%d %H:%M:%S"))
                ans2=st.radio("Enter Choice:",[" View all appointments","View completed appointments","View uncompleted appointments "])
                #ans2=int(input("Enter choice: "))
            #view all
                if ans2==" View all appointments":
                    appointment_list = []          
                    col = ["Patient Name", "Date and Time", "Status"]
                    flag2 = 0
                    appointment_list.append(col)
                    for i in sorted_app_list:
                        if dr.doctor_mail == i[0]:
                            flag2 = 1
                            for j in dr_list:
                                pat_name=dr.get_name(j.patient_list,i[1])
                                if pat_name!="NA":                                    
                                    appointment_list.append([pat_name,i[2],i[3]])
                    st.table(appointment_list)
                    if flag2 == 0:
                        st.info("No appointments found!")
             #only c            
                elif ans2=="View completed appointments":
                    appointment_list=[]          
                    col=["Patient Name","Date and Time","Status"]
                    appointment_list.append(col)
                    flag2=0
                    for i  in sorted_app_list:
                        if(dr.doctor_mail==i[0]):
                          if(i[3]=='C'):
                            flag2=1
                            for j in dr_list:
                                pat_name=dr.get_name(j.patient_list,i[1])
                                if pat_name!="NA":                                    
                                    appointment_list.append([pat_name,i[2],i[3]])
                    st.table(appointment_list)
                    if(flag2==0):
                         st.info("No appointments found!")
             #only nc            
                elif ans2=="View uncompleted appointments ":
                    appointment_list=[]          
                    col=["Patient Name","Date and Time","Status"]
                    appointment_list.append(col)
                    flag2=0
                    for i  in sorted_app_list:
                        if(dr.doctor_mail==i[0]):
                          if(i[3]=='NC'):
                            flag2=1
                            for j in dr_list:
                                pat_name=dr.get_name(j.patient_list,i[1])
                                if pat_name!="NA":                                    
                                    appointment_list.append([pat_name,i[2],i[3]])
                    st.table(appointment_list)                    
                    if(flag2==0):
                         st.info("No appointments found!")
















        #cancel appointments    
        elif ans== "Cancel Appointment":
                appointment_list = []          
                for i in app_list:
                    if dr.doctor_mail == i[0]:
                        appointment_list.append(str(i[1]+"  "+i[2]+"  "+i[3]))
                ans3=st.radio("Select",appointment_list)
                if st.button("Cancel"):
                    for i in range(len(appointment_list)):
                        if ans3==appointment_list[i]:
                            for item in app_list:
                                if item[0]==dr.doctor_mail:
                                    if str(item[1]+"  "+item[2]+"  "+item[3])==appointment_list[i]:
                                        app_list.remove(item)
                                        st.success("Appointment cancelled!")
                    new_file=open("appointments.csv",'w',newline='')
                    write=csv.writer(new_file)
                    write.writerow(("Of","With","DateTime","Status"))
                    new_file.close()
                    for i in app_list:
                        dr.append_row("appointments.csv",i)
       
        #reschedule
               
        elif ans=="Reschedule Appointment":
                appointment_list = []          
                flag2 = 0
                for i in app_list:
                    if dr.doctor_mail == i[0]:
                        flag2 = 1
                        appointment_list.append(str(i[1]+"  "+i[2]+"  "+i[3]))
                ans3=st.radio("Select",appointment_list)
                date = st.date_input("Select a date", value=datetime.now(), key="datetime")
                time=st.time_input("Select time (Hr-min)")
                t=str(date)+" "+str(time)
                if st.button("Reschedule"):
                    for i in range(len(appointment_list)):
                        if ans3==appointment_list[i]:
                            for item in app_list:
                                if item[0]==dr.doctor_mail:
                                    if str(item[1]+"  "+item[2]+"  "+item[3])==appointment_list[i]:
                                        list1=[str(dr.doctor_mail),item[1],str(t),str(status)]
                                        app_list.remove(item)
                                        app_list.append(list1) #add new one
                                        st.success("Appointment rescheduled!")
                    new_file=open("appointments.csv",'w',newline='')
                    write=csv.writer(new_file)
                    write.writerow(("Of","With","DateTime","Status"))
                    new_file.close()
                    for i in app_list:
                        dr.append_row("appointments.csv",i)


               
    


    def provide_medication(self,dr):
        flag1=0
        pat_mail = st.text_input("Enter patient email: ")
        # pat_list = pd.read_csv(dr.doctor_name + ".csv")
        # pat = pat_list[pat_list["Email"] == pat_mail]
        for i in dr.patient_list:
            if i.patient_mail==pat_mail:
                pat=i




        if pat==None:
            st.warning("Patient not found. Please enter a valid email address.")
            return
        #pat = pat.iloc[0]
        if pat.current_disease!='':
            curr_disease=pat.current_disease




            st.write("Diagnosed disease:", curr_disease)
            #ans = st.text("Update diagnosed disease?")
            ans = st.selectbox("Update disease?", ["Yes", "No"])
            if ans == "Yes":
                    flag1=1
                    curr_disease=st.text_input("Enter updated disease:",)
            elif ans=="No":
                curr_disease=pat.current_disease
        else:
            curr_disease= st.text_input("Enter diagnosed disease:")




        if pat.current_medication!='':
            curr_medi=pat.current_medication
            st.write("Current Medication:", curr_medi)
            ans = st.selectbox("Update medication?", ["Yes1", "No1"])
            if ans=="Yes1":
                flag1=1
                curr_medi=st.text_input("Enter updated medication:")
                #pat.current_medication = curr_medi
            elif ans=="No1":
               
               curr_medi=pat.current_medication
        else:
            curr_medi=st.text_input("Enter updated medication:")
        if flag1==1:
            if st.button("Update"):
                pat.current_medication=curr_medi            
                pat.current_disease=curr_disease
                list1=[pat.patient_id,pat.patient_name,pat.patient_age,pat.patient_add,pat.patient_phn,pat.patient_gender,pat.patient_mail,pat.patient_password,pat.past_surgeries,pat.current_disease,pat.current_medication,pat.bmi,pat.bp,pat.wbc,pat.rbc]
                flag=1
                pat_list=[]
                pat_details=pd.read_csv(dr.doctor_name+".csv",encoding= 'unicode_escape')
                for i in range (0,len(pat_details),1):
                    list2=[pat_details.iloc[i]["Patient ID"],pat_details.iloc[i]["Patient Name"],pat_details.iloc[i]["Age"],pat_details.iloc[i]["Address"],pat_details.iloc[i]["Phone No"],pat_details.iloc[i]["Gender"],pat_details.iloc[i]["Email"],pat_details.iloc[i]["Password"],pat_details.iloc[i]["Past surgeries"],pat_details.iloc[i]["Current diseases"],pat_details.iloc[i]["Current medications"],pat_details.iloc[i]["Current BP (mmHg)"],pat_details.iloc[i]["Current BMI"],pat_details.iloc[i]["Current WBC"],pat_details.iloc[i]["Current RBC"]]                        
                    pat_list.append(list2)
                for i in range(len(pat_list)):
            #check where given time and patient matches in list
                    if pat_list[i][6]==pat_mail:
                        flag=0                            
                        pat_list.pop(i)  
                        pat_list.insert(i,list1)
         
        #write whole app_list into csv again
                if flag==0:
                    new_file=open(dr.doctor_name+".csv",'w',newline='')
                    write=csv.writer(new_file)
                    write.writerow(("Patient ID","Patient Name","Age","Address","Phone No","Gender","Email","Password","Past surgeries","Current diseases","Current medications","Current BP (mmHg)","Current BMI","Current WBC","Current RBC"))
                    new_file.close()
                    for i in pat_list:
                        dr.append_row(dr.doctor_name+".csv",i)
                    st.success("Medication updated succesfully!")    
                else :
                    st.warning("Unsuccessfull...")
        else:
            st.write("") #display msg





    def append_row(self,file_name,list1):
        f=open(file_name,'a',newline='')
        write=csv.writer(f)
        write.writerow(list1)
        f.close()
   
    def dr_signUp(self,dr_list):
        email = st.text_input("Enter Email ID:")
        for i in dr_list:
            if i.doctor_mail == email:
                st.write("Your Account already exists")
                return




        password = st.text_input("Enter Password:",type="password")
        Name = st.text_input("Enter Name:")
        age = st.text_input("Enter Age:")
        gender = st.radio("Enter Gender:",["Female","Male"])
        phone_no = st.text_input("Enter Phone No:")
        address = st.text_input("Enter Address:")
        specialist = st.text_input("Enter Speciality:")
        degree = st.text_input("Enter Degree:")
        yr_practice = st.text_input("Enter Year of Practice:")
        if st.button('Signup'):
            list1 = [Name, phone_no, address, email, specialist, age, gender, password, degree, yr_practice]
            d=doctor(Name, phone_no, address, email, specialist, age, gender, password, degree, yr_practice)
            dr_list.append(d)
            d.append_row("Doctors.csv",list1)
            file_name=Name+".csv"
            new_file=open(file_name,"w")
            write=csv.writer(new_file)
            write.writerow(("Patient ID","Patient Name","Age","Address","Phone No","Gender","Email","Password","Past surgeries","Current diseases","Current medications","Current BP (mmHg)","Current BMI","Current WBC","Current RBC"))
            st.success("Successfully Signed up")




#***************************************PATIENT************************************************************************




class patient : # contains details about patient
    def __init__(self, patient_id="", patient_name="", patient_age="", patient_add="", patient_phn="", patient_gender="", patient_mail="", patient_password="", past_surgeries="", current_disease="", current_medication="", bp="", bmi="", wbc="", rbc="",blood_group="",ht="",wt=""):
            self.patient_id = patient_id
            self.patient_age = patient_age
            self.patient_name = patient_name
            self.patient_add = patient_add
            self.patient_phn = patient_phn
            self.patient_gender = patient_gender
            self.patient_mail = patient_mail
            self.patient_password = patient_password
            self.past_surgeries = past_surgeries
            self.current_disease = current_disease
            self.current_medication = current_medication
            self.bmi = bmi
            self.bp = bp
            self.wbc = wbc
            self.rbc = rbc
            self.blood_group= blood_group
            self.ht=ht
            self.wt=wt








 
    def read_csv_patient(self, path,patient_list):
        patient_list = []
        patient_details = pd.read_csv(path,encoding= 'unicode_escape')
        for i in range(len(patient_details)):
            pat = patient(
                patient_id = patient_details.iloc[i]["Patient ID"],
                patient_name = patient_details.iloc[i]["Patient Name"],
                patient_age = patient_details.iloc[i]["Age"],
                patient_add = patient_details.iloc[i]["Address"],
                patient_phn = patient_details.iloc[i]["Phone No"],
                patient_gender = patient_details.iloc[i]["Gender"],
                patient_mail = patient_details.iloc[i]["Email"],
                patient_password = patient_details.iloc[i]["Password"],
                past_surgeries = patient_details.iloc[i]["Past surgeries"],
                current_disease = patient_details.iloc[i]["Current diseases"],
                current_medication = patient_details.iloc[i]["Current medications"],
                bp = patient_details.iloc[i]["Current BP (mmHg)"],
                bmi = patient_details.iloc[i]["Current BMI"],
                wbc = patient_details.iloc[i]["Current WBC"],
                rbc = patient_details.iloc[i]["Current RBC"],
                # blood_group=patient_details.iloc[i]["Blood Group"],
                # ht = patient_details.iloc[i]["Height "],
                # wt = patient_details.iloc[i]["Weight"]
            )
            patient_list.append(pat)
        return patient_list




    def login_patient(self,email, patient_list):
        flag = False #to check correct password
        pat = patient()
        for i in range (len(patient_list)):  #search a row of patient
            if email==str(patient_list[i].patient_mail) :
                while (flag==False): #do until password is not right
                    password = st.text_input("",type="password")
                    if password=="":
                        st.write("Enter your password!")                    
                    elif (password==str(patient_list[i].patient_password)) :
                                flag = True # password match
                                st.success("\nLogin successful!")
                                pat = patient_list[i]   #store loggined patient object
                       
                    if flag == False: # password wrong
                        st.warning("Invalid password! \nPlease enter again: ")
        return pat








    def Patient_personal_details(self):
       
        st.header("PROFILE")
        df={
            "Patient ID":self.patient_id,
            "Name":self.patient_name,
            "Age":self.patient_age,
            "Gender":self.patient_gender,
            "Phone No.": self.patient_phn,
            "Email ID": self.patient_mail,
            "Address": self.patient_add
        }
        st.dataframe(df)






    def patient_signUp(self, dr_list):
        pat=patient()
        dr=doctor()
        email = st.text_input("Enter Email ID:")
        for i in dr_list:
            for j in i.patient_list:
                if j.patient_mail == email:
                    st.write("Your Account already exists")
                    return
        password = st.text_input("Enter Password:",type='password')
        id = st.text_input("Enter ID:")
        name = st.text_input("Enter Name:")
        age = st.text_input("Enter Age:")
        gender = st.radio("Enter Gender:",["Female","Male"])
        phone_no = st.text_input("Enter Phone No:")
        address = st.text_input("Enter Address:")
        list1=[]
        for i in dr_list:
            list1.append(pat.get_name(dr_list,i.doctor_mail))
        doc=st.selectbox("Select Doctor",list1)
        for i in range(len(list1)):
            if doc==list1[i]:
                    path = dr_list[i].doctor_name+ ".csv"


        if st.button('Signup'):
            list1 = [id, name, age, address, phone_no, gender, email, password]
            dr.append_row(path, list1)
            st.success("Signed up successfully!")




















    def update_medical_details(self,pat):
            if(pat.past_surgeries!=''):
                    past_sur=pat.past_surgeries
                    st.write("Past surgeries:", past_sur)
                    ans = st.selectbox("Update ?", ["Yes", "No"])
                    if ans=="Yes":
                        flag1=1
                        past_sur=st.text_input("Past surgeries:")
                    elif ans=="No":              
                        past_sur=pat.past_surgeries
            else:
                past_sur=st.text_input("Past surgeries:")
         
               
            if(pat.bmi!=''):
                    bmi=pat.bmi
                    st.write("Current BMI:", bmi)
                    ans1 = st.selectbox("Update ?", ["Yes1", "No1"])
                    if ans1=="Yes1":
                        flag1=1
                        bmi=st.text_input("Enter updated BMI:")
                    elif ans1=="No1":              
                        bmi=pat.bmi
            else:
                bmi=st.text_input("Enter updated BMI:")
            if(pat.bp!=''):
                    bp=pat.bp
                    st.write("Current BP:", bp)
                    ans2 = st.selectbox("Update ?", ["Yes2", "No2"])
                    if ans2=="Yes2":
                        flag1=1
                        bp=st.text_input("Enter updated BP:")
                    elif ans2=="No2":              
                        bp=pat.bp
            else:
                bp=st.text_input("Enter updated BP:")
            if(pat.wbc!=''):
                    wbc=pat.wbc
                    st.write("Current WBC count:", wbc)
                    ans3 = st.selectbox("Update ?", ["Yes3", "No3"])
                    if ans3=="Yes3":
                        flag1=1
                        wbc=st.text_input("Enter updated WBC count:")
                    elif ans3=="No3":              
                        wbc=pat.wbc
            else:
                wbc=st.text_input("Enter updated WBC count:")
            if(pat.rbc!=''):
                    rbc=pat.rbc
                    st.write("Current RBC count:", rbc)
                    ans4 = st.selectbox("Update ?", ["Yes4", "No4"])
                    if ans4=="Yes4":
                        flag1=1
                        rbc=st.text_input("Enter updated RBC count:")
                    elif ans4=="No4":              
                        rbc=pat.rbc
            else:
                rbc=st.text_input("Enter updated RBC count:")
            if flag1==1:
                if st.button("Update"):
                    pat.past_surgeries=past_sur            
                    pat.bmi=bmi
                    pat.bp=bp
                    pat.wbc=wbc
                    pat.rbc=rbc
                    list1=[pat.patient_id,pat.patient_name,pat.patient_age,pat.patient_add,pat.patient_phn,pat.patient_gender,pat.patient_mail,pat.patient_password,pat.past_surgeries,pat.current_disease,pat.current_medication,pat.bmi,pat.bp,pat.wbc,pat.rbc]
                    flag=1
                    pat_list=[]
                    for i in dr_list:
                        for j in i.patient_list:
                            if j==pat:
                                doc_name=i.doctor_name
                                break
                    pat_details=pd.read_csv(doc_name+".csv",encoding= 'unicode_escape')
                    for i in range (0,len(pat_details),1):
                        list2=[pat_details.iloc[i]["Patient ID"],pat_details.iloc[i]["Patient Name"],pat_details.iloc[i]["Age"],pat_details.iloc[i]["Address"],pat_details.iloc[i]["Phone No"],pat_details.iloc[i]["Gender"],pat_details.iloc[i]["Email"],pat_details.iloc[i]["Password"],pat_details.iloc[i]["Past surgeries"],pat_details.iloc[i]["Current diseases"],pat_details.iloc[i]["Current medications"],pat_details.iloc[i]["Current BP (mmHg)"],pat_details.iloc[i]["Current BMI"],pat_details.iloc[i]["Current WBC"],pat_details.iloc[i]["Current RBC"]]                        
                        pat_list.append(list2)
                    for i in range(len(pat_list)):
                        if pat_list[i][6]==pat.patient_mail:
                            flag=0                            
                            pat_list.pop(i)  
                            pat_list.insert(i,list1)
                    dr=doctor()
                    #write whole app_list into csv again
                    if flag==0:
                        new_file=open(doc_name+".csv",'w',newline='')
                        write=csv.writer(new_file)
                        write.writerow(("Patient ID","Patient Name","Age","Address","Phone No","Gender","Email","Password","Past surgeries","Current diseases","Current medications","Current BP (mmHg)","Current BMI","Current WBC","Current RBC"))
                        new_file.close()
                        for i in pat_list:
                            dr.append_row(doc_name+".csv",i)
                        st.success("Medication details updated succesfully!")    
                    else :
                        st.warning("Unsuccessfull...")
            else:
                st.write("") #display msg






    def view_medical_details(self,pat):
          ans=st.radio("Select",["View  History","View Current Disease /  Medication","Health Rate"])      
          if ans=="View  History":
            st.markdown("***History***")
            if(pat.past_surgeries==''):
                st.warning("No past surgeries present.")
            else:
                st.write("Past Surgeries: ",pat.past_surgeries)
          elif ans == "View Current Disease /  Medication":
            if(pat.current_disease==''):
                st.warning("No current disease present.")
            else:
                st.write("Current Disease: ",pat.current_disease)
            if(pat.current_medication==''):
                st.warning("No current medication present.")
            else:
                st.write("Current Medication: ",pat.current_medication)
          elif ans == "Health Rate":
            st.markdown("***Health Rate***")
            if(pat.bmi==''):
                st.warning("No current BMI present.")
            else:
                st.write("Current BMI: ",pat.bmi)
            if(pat.bp==''):
                st.warning("No current BP present.")
            else:
                st.write("Current BP: ",pat.bp)
            if(pat.wbc==''):
                st.warning("No current wbc count present.")
            else:
                st.write("Current WBC: ",pat.wbc)
            if(pat.rbc==''):
                st.warning("No current rbc count present.")
            else:
                st.write("Current RBC: ",pat.rbc)








    def get_name(self,dr_list,mail):
        for i in dr_list:
            if i.doctor_mail==mail:
                return i.doctor_name
           








    def view_pat_appointments(self,pat,dr_list):
        app_list=[]
        app_details=pd.read_csv("appointments.csv")
        for i in range (0,len(app_details),1):
            list=[app_details.iloc[i]["Of"],app_details.iloc[i]["With"],app_details.iloc[i]["DateTime"],app_details.iloc[i]["Status"]]
            app_list.append(list)
        #sort wrt date and time
        for i in app_list:
            sorted_app_list=sorted(app_list,key=lambda x:datetime.strptime(x[2], "%Y-%m-%d %H:%M:%S"))
        ans2=st.radio("Select",["View all appointments","View completed appointments","View uncompleted appointments"])
        if ans2=="View all appointments":
                appointment_list = []          
                col = ["Doctor Name", "Date and Time", "Status"]
                appointment_list.append(col)
                flag2=0
                for i in sorted_app_list:
                    if pat.patient_mail == i[1]:
                            flag2=1
                            doc_name=pat.get_name(dr_list,i[0])
                            appointment_list.append([doc_name,i[2],i[3]])
                st.table(appointment_list)
                if flag2 == 0:
                        st.info("No appointments found!")
             #only c            
        elif ans2=="View completed appointments":
                appointment_list=[]          
                col=["Doctor Name","Date and Time","Status"]
                appointment_list.append(col)
                flag2=0
                for i  in sorted_app_list:
                    if pat.patient_mail == i[1]:
                          if(i[3]=='C'):
                            flag2=1
                            doc_name=pat.get_name(dr_list,i[0])
                            appointment_list.append([doc_name,i[2],i[3]])
                st.table(appointment_list)
                if(flag2==0):
                         st.info("No appointments found!")
             #only nc            
        elif ans2=="View uncompleted appointments ":
                    appointment_list=[]          
                    col=["Doctor Name","Date and Time","Status"]
                    appointment_list.append(col)
                    flag2=0
                    for i  in app_list:
                        if pat.patient_mail == i[1]:
                          if(i[3]=='NC'):
                            flag2=1
                            doc_name=pat.get_name(dr_list,i[0])
                            appointment_list.append([doc_name,i[2],i[3]])
                    st.table(appointment_list)                    
                    if(flag2==0):
                         st.info("No appointments found!")
























    def Visulaisation(graph,pat):


# Load the dataset
        data = pd.read_csv("Health Data.csv")
        # Get the name of the person for whom we want to create the graph
        person_mail = pat.patient_mail
        person_name=pat.patient_name
        # Filter the dataset to get only the data for the selected person
        person_data = data[data['Patient Mail'] == person_mail]
        # Loop through each row in the filtered dataset
        for index, row in person_data.iterrows():
            # Create a chart for the current row
            chart_data = pd.DataFrame({'Date': [row['date_1'], row['date_2'],row['date_3'],row['date_4']], 'BMI': [row['BMI_1'], row['BMI_2'],row['BMI_3'],row['BMI_4']  ]})
            chart = alt.Chart(chart_data).mark_bar(color="#faca2b").encode(
                x='Date',
                y='BMI'
            ).properties(
                title=f"{person_name}'s BMI ",
                width=500,
                height=500)
            # Display the chart
            st.altair_chart(chart)
       
        for index, row in person_data.iterrows():
            # Create a chart for the current row
            st.write(f"{person_name}'s BP ")
            chart_data = pd.DataFrame({'Date': [row['date_1'], row['date_2'],row['date_3'],row['date_4']], 'BP': [row['BP_1'], row['BP_2'],row['BP_3'],row['BP_4']  ]})
   
            st.line_chart(chart_data.set_index('Date'))


        for index, row in person_data.iterrows():
            # Create a chart for the current row
            chart_data = pd.DataFrame({'Date': [row['date_1'], row['date_2'],row['date_3'],row['date_4']], 'Cholestrol': [row['Cholesterol_1'], row['Cholesterol_2'],row['Cholesterol_3'],row['Cholesterol_4']  ]})
            chart = alt.Chart(chart_data).mark_bar(color="#09ab3b").encode(
                x='Date',
                y='Cholestrol'
            ).properties(
                title=f"{person_name}'s Cholestrol ",
                width=500,
                height=500 )
            # Display the chart
            st.altair_chart(chart)




        for index, row in person_data.iterrows():
            # Create a chart for the current row
            st.write(f"{person_name}'s RBC ")




            chart_data = pd.DataFrame({'Date': [row['date_1'], row['date_2'],row['date_3'],row['date_4']], 'RBC': [row['RBC_1'], row['RBC_2'],row['RBC_3'],row['RBC_4']  ]})
           




            # Display the chart
            st.line_chart(chart_data.set_index('Date'))




        for index, row in person_data.iterrows():
            # Create a chart for the current row
            st.write(f"{person_name}'s WBC ")




            chart_data = pd.DataFrame({'Date': [row['date_1'], row['date_2'],row['date_3'],row['date_4']], 'WBC': [row['WBC_1'], row['WBC_2'],row['WBC_3'],row['WBC_4']  ]})
           




            # Display the chart
            st.line_chart(chart_data.set_index('Date'))
















#*********************************************************************************************************************#
dr_obj = doctor()
pat_obj = patient()




dr_list = []








# Read doctor details from CSV and append to the list of doctors
dr_list = dr_obj.read_csv_dr("Doctors.csv", dr_list)




# Read patient details for each doctor from CSV and append to the patient list of each doctor
n = len(dr_list)
for i in range(n):
    path = dr_list[i].doctor_name+ ".csv"
    #pat_obj.read_csv_patient(path, dr_list[i].patient_list)
    dr_list[i].patient_list= pat_obj.read_csv_patient(path,dr_list[i].patient_list)








# Streamlit app
st.title("Patient-Doctor Portal")
image=Image.open("Logo.png")
st.sidebar.image(image,caption=None,width=300,use_column_width=200,clamp=True,channels="RGB",output_format="auto")




while True:
 
    #choose = st.sidebar.radio("Select user", ["Login as Doctor", "Login as Patient", "SignUp as Doctor", "SignUp as Patient", "Terminate"],key="unique")
    with st.sidebar:
        choose=option_menu("", ["Login as Doctor","Login as Patient", "SignUp as Doctor","SignUp as Patient"],
                           icons=["house","house","house","house"],
        menu_icon="cast", default_index=1,
        styles={
        "container": {"padding": "5!important"},
        "icon": {"font-size": "25px"},
        "nav-link": {"font-size": "16px", "text-align": "left", "margin":"0px"},
    })
    if choose == "Login as Doctor":
       dr_obj_login = dr_obj.login_doctor(dr_list)
       if dr_obj_login is None:
            st.write("Doctor not found")
       else:
           choose = 1
           while choose != 0:
            choose = st.selectbox(
                "Select an option:",
                ["View Personal Details", "View Patient List","View Patient Details", "Share Patient Details",  "Appointments","Prescribe Medication", "Logout"]
            )




            if choose == "View Personal Details":
                dr_obj_login.drPersonal_details( )
                st.write("Personal details displayed")




            elif choose == "View Patient List":
                st.write("Patient list displayed")
                dr_obj_login.Patient_list(dr_obj_login)


            elif choose == "View Patient Details":
                dr_obj_login.Patient_personal_details(dr_obj_login)


            elif choose == "Share Patient Details":
                st.write("Patient details shared")
                dr_obj_login.patient_sharing(dr_obj_login,dr_list)




            elif choose == "Prescribe Medication":
               
                dr_obj_login. provide_medication(dr_obj_login)




            elif choose == "Appointments":
                    dr_obj_login.appointment_dr(dr_obj_login,dr_list)
             
            elif choose == "Logout":
                st.write("Logged out")








    elif choose == "Login as Patient":
      email=st.text_input("")
      p_obj_login = patient()
      if email=="":
            st.write("Enter email ID")
      else:
        for i in range (len(dr_list)):            
            # search in every list
                p_obj_login = p_obj_login.login_patient(email,dr_list[i].patient_list)            
                if p_obj_login.patient_id=="" :# patient mail is notfound continue for loop
                    continue
                else:
                    break  # else terminate the iteration          
        if p_obj_login.patient_mail=="" :
                st.warning("Invalid mail ID!Please enter again:")
        else :
            choose = 1
            while choose != 0:
                choose = st.selectbox("Select an option:", ["View Personal Details", "View Medical Details","Update Medical Details", "View scheduled appointments",
                            "Health Analysis","Logout"])
                if choose == "View Personal Details":
                    p_obj_login.Patient_personal_details()


                elif choose == "View Medical Details":
                    p_obj_login.view_medical_details(p_obj_login)


                elif choose == "Update Medical Details":
                    p_obj_login.update_medical_details(p_obj_login)


                elif choose == "View scheduled appointments":
                    p_obj_login.view_pat_appointments(p_obj_login,dr_list)


                elif choose=="Health Analysis":
                    p_obj_login.Visulaisation(p_obj_login)
                elif choose=="Logout":
                    st.success("Logout successful!")
                    p_obj_login = None
                    break




    elif choose == "SignUp as Doctor":
         dr_obj.dr_signUp(dr_list)  
 
    elif choose == "SignUp as Doctor":
         dr_obj.dr_signUp(dr_list)  
           
    elif choose == "SignUp as Patient":
        pat_obj.patient_signUp(dr_list)      
    elif choose == "Terminate":
        break













