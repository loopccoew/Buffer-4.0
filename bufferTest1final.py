# Ash
#Importing all the necessary modules
import webbrowser
import json
#shrey import 
import re
import long_response as long
#sak import
import calendar
import datetime
import numpy as np
from sklearn.linear_model import LinearRegression
import matplotlib.pyplot as plt
import numpy as np


#shrey db
db = {
    'Whisper Ultra Clean Menstrual Sanitary Pads': {
        'li': [3.75, 3.56, 3.55, 3.21, 4.1]
    },
    'Stayfree All Night XL Dry Max Cover Sanitary Napkins': {
        'li': [3.75, 3.56, 4.5, 4]
    },
    'Sofy Antibacteria Extra Long Pads': {
        'li': [3.75, 3.56, 3.53, 5, 1.2, 2.2]
    },
    'Vwash Wow Ultra Size Sanitary Pads':{
       'li':[3.75, 1.35, 2.45, 5, 1.2 , 2.2, 3.0]
    },
    'Whisper ULtra Soft Extra Large Sanitary Pads':{
       'li':[3.5, 4.0, 1.0, 3.31, 1.02]
    }
}

comment2d=[["good","needs improvement","thanks for creating this system"],["needs to add more products"],["i need therapy"]]



#sak database

users = {
    'Alice': 'password123',
    'Felicia': 'password456',
    'Charlie': 'password789',
    'Genny':'password102',
    'Millie':'password564',
    'Julie':'password008',
    'Kelly':'password342',
    'Elena':'password876'
}

user_tracker = {
    'Alice': [25,28,28,25,28,29,30,31,28,28,28,29,29,29,28,28,27,27,29,30,31,28,28,29,28],
    'Felicia': [24, 25, 24, 25, 26, 25, 25, 24, 24,26,26,28,25,26],
    'Charlie': [26, 26, 26, 26,25,26,27,26,26,27],
    'Genny':[27,28,28,28,27,29,28],
    'Millie':[27, 25, 24, 25, 26, 25, 25, 24, 24,26,27],
    'Julie':[25,25,26,27,27,25,26,26,25,27],
    'Kelly':[28,28,29,29,28,27,30,29,25,30,30,31,31,27,27,28,28,25],
    'Elena':[24,26,26,27,24,26]
}


def menstruation_physiology():
    webbrowser.open('https://nursingcrib.com/news-blog/physiology-of-menstruation/')
    print("\n Redirecting to 'Physiology of Menstruation' article...")

def hormonal_changes():
    webbrowser.open('https://www.forthwithlife.co.uk/blog/menstrual-cycle-tune-into-your-hormones/#:~:text=This'
                    '%20produces%20decreasing%20levels%20of,night%20sweats%20and%20mood%20changes.')
    print("\n Redirecting to 'Hormonal changes' article..")

def products_and_hygiene():
    webbrowser.open('https://www.health.harvard.edu/blog/how-to-choose-period-products-202210052828')
    print("\n Redirecting to 'Products and Hygiene' article..")

def menstrual_disorders():
    webbrowser.open('https://pharmeasy.in/blog/common-menstrual-disorders-you-need-to-know-about/')
    print("\n Redirecting to 'Menstrual Disorders' article..")

def premenstrual_symptoms():
    webbrowser.open('https://www.womenshealth.gov/menstrual-cycle/premenstrual-syndrome#:~:text=Most%20women%2C'
                    '%20over%2090%25%2C,bloating%2C%20headaches%2C%20and%20moodiness.&text=For%20some%20women%2C'
                    '%20these%20symptoms,most%20likely%20to%20have%20PMS.')
    print("\n Redirecting to 'Premenstrual Symptoms' article..")

# A dictionary with function references - DATABASE
links = {
    1: menstruation_physiology,
    2: hormonal_changes,
    3: products_and_hygiene,
    4: menstrual_disorders,
    5: premenstrual_symptoms
}


#main1
def education():
    
    # driver's code for Buffer final 1 (1).py
    print("\n\n Choose a topic you wish to learn:")
    print("\t\t\t\t\t  1. Menstruation Physiology")
    print("\t\t\t\t\t  2. Hormonal Changes")
    print("\t\t\t\t\t  3. Products and Hygiene")
    print("\t\t\t\t\t  4. Menstrual Disorders")
    print("\t\t\t\t\t  5. Premenstrual Symptoms")

    # Call the functions and get the user's choice
    while True:
        try:
            choice = int(input("\nEnter your choice (1-5): "))
            if choice in links:
                links[choice]()
                break
            else:
                print("Invalid choice!")
        except ValueError:
            print("Invalid input. Please enter a number between 1 and 5.")


def Menstrual_cycle():
    # Function to determine phase range for Cycle length input by user
    cycle_length = int(input('\nEnter your Menstrual Cycle length (21-30):'))
    current_day = int(input('\nEnter the current day of your Menstrual Cycle:'))

    if current_day <= cycle_length / 2:
        if current_day <= cycle_length / 4:
            phase = 'Early Follicular Phase'
            print('\nYou may experience some Tiredness, Fatigue, Bloating, Mood Changes, and Mild Cramps.')
        else:
            phase = 'Late Follicular Phase'
            print('\nYou may experience Increased Energy, Breast tenderness, and Mood Swings.')
    else:
        if current_day <= cycle_length * 3 / 4:
            phase = 'Luteal Phase'
            print('\nYou may experience Severe Cramps, Headache, and Bloating.')
        else:
            phase = 'Menstrual Phase'
            print('\nYou may experience Menstrual Bleeding, Discomfort, Fatigue, and Nausea.')

    # Determining Phase based on the Current day and Cycle length
    print(f"Because You are currently in the {phase} of your menstrual cycle.\n\n")


def Menstrual_lifestyle():
    #Function to provide lifestyle tips based on Symptoms provided by user 
    while True:
        print('\n\t\t\t-----------------------------------------------------------------')
        print("\t\t\t\t\t Welcome to Menstrual Phase Lifestyle Tips!")
        #Providing Menu to user
        print("\n\t\t\t\t Please select an option from the menu:")
        print("\t\t\t\t 1. Enter Symptoms")
        print("\t\t\t\t 2. Recommended Menstrual Products")
        print("\t\t\t\t 3. Exit")
        print('\n\t\t\t-----------------------------------------------------------------\n')
        choice = input("Enter your choice (1 or 2 or 3):")
        if choice == "1":
            print("\n\nPlease enter your symptoms separated by commas:")
            symptoms = input().lower().split(",")
            print("\n\t\t\t\tBased on your provided symptoms, the recommended lifestyle is:\n")
            # Exercise
            if "tiredness" in symptoms or "fatigue" in symptoms:
                print("\t\t\t\t 1. Avoid overexertion and rest!")
                print("\t\t\t\t 2. Stay active with light exercise and walking!")
                
            if "nausea" in symptoms or "diarrhea" in symptoms:
                print("\t\t\t\t3. Drink plenty of water and stay hydrated!")
                
            # Diet and Nutrition
            if "cramps" in symptoms:
                print("\t\t\t\t 4. Eat foods rich in magnesium!")
                print("\t\t\t\t 5. Avoid strenuous exercise!")
                print("\t\t\t\t 6. Use pain relievers like hot water bags/heating pads!")
                
            if "bloating" in symptoms:
                print("\t\t\t\t 7. Eat green vegetables and fiber-rich fruits like apple, orange, etc. Have a balanced diet!")
                
            if "headache" in symptoms:
                print("\t\t\t\t 8. Avoid oily, processed foods, and caffeine!")
                print("\t\t\t\t 9. Try relaxation techniques like yoga and meditation!")
                
            # Self Care
            if "mood swings" in symptoms or "irritability" in symptoms:
                print("\t\t\t\t 10. Practice self-care, read, listen to music!")
                
            else:
                
                open_link = True
                for symptom in symptoms :
                    if symptom in ["tiredness", "fatigue", "nausea", "diarrhea", "cramps", "bloating", "headache", "mood swings", "irritability"]:
                         open_link = False
                         break
                    else:
                        print('Redirecting you to a page where you can look for remedies to your Symptoms')
                        webbrowser.open('https://www.mountsinai.org/health-library/report/menstrual-disorders')
                

        elif choice == "2":
            #Recommended Menstrual Products
            products = [
                {"Name": "Pad", "Absorbency": "High", "Size": "Large", "Price": 5.99},
                {"Name": "Tampon", "Absorbency": "Super", "Size": "Large", "Price": 6.99},
                {"Name": "Menstrual Cup", "Absorbency": "High", "Size": "Large", "Price": 19.99},
                {"Name": "Menstrual discs", "Absorbency": "High", "Size": "Regular", "Price": 29.99}
            ]
            print(json.dumps(products , indent=2))

        elif choice == "3":
            print("\nThank you for using Menstrual Phase Lifestyle Tips!")
            break
        else:
            print("Invalid choice! Please enter valid choice.")


#main2
def yourPersonalGuide():
    print("\n\t\t\t\t\t MENSTRUATION:-EVERYTHING YOU NEED TO KNOW !!!\n")
    Menstrual_cycle()
    Menstrual_lifestyle()


#shrey

def show_comments():
  for i in comment2d[0]:
    print(i)
    
def show_suggestions():
  for i in comment2d[1]:
    print(i)
    

#add comment 
def add_comments():
  
  print('\t\t\t\t 1. What do you think about our System? Share a few words? ')
  print('\t\t\t\t 2. Introduce ways to optimize our application ')
  print('\t\t\t\t 3. Express yourself ')
  print("\t\t\t\t 4. Take a look through the comments section")
  print("\t\t\t\t 5. Browse the suggestions that y'all have for us")
  
  

  cont=True
  while(cont):
    inp = int(input("\n\nPress the number infront of the activity : \t"))  # Get input from user
    
    if inp >= 1 and inp <= 3:  
      com=input("\n\n\n So you feel like.. ")    # Check if inp is within range
      comment2d[inp-1].append(com)  # Append the comment to the correct sublist
      cont=False
      print("\n\n\t\t\t\tResponse added successfully!.. ")
    elif inp==4:
      print("\n\033[1mComments Section\033[0m: ")
      show_comments()
      cont=False
      print("\n\n\t\t\t\tResponse added successfully!.. ")
    elif inp==5:
      print("\n\033[1mSuggestions\033[0m: ")
      show_suggestions()
      cont=False
      print("\n\n\t\t\t\tResponse added successfully!.. ")
    else:
      print("\n\n\nPlease re-enter the activity number : \t")
      cont=True

    
  print('\n\n\t\t\t\tTHANKS FOR YOUR INPUT!')
  

#display the dictionary and the average of all the ratings
def view_all_db():
    count = 0
    for i in db:
        length = 0
        count = count + 1
        print("\t\t\t",count, '] ', i)
        for j in db[i]:
            length = len(db[i][j])
            li=db[i][j]
            a = int(sum(li)) 
            b=a/length
            print('\t\t\t\t\tAverage Rating : ', round(b, 2))
            print()
# view_all_db()



#rate the product
def rate_existing():
  view_all_db()
  num=input('\n\nEnter the number infront of the product that you want to rate : ')
  flag=0
  c=1
  x=''
  for key in db:
    if int(c)==int(num):
      x=key
      flag=1
      break
    c=c+1
  
  if(flag==0):print('\n\n\t\t\tINVALID OPTION ')
      

  pro=True
  while(pro):
    rat=input('\nWhat do you want to rate the product out of 5? ')
    if(float(rat) > 5):
      print("\n\t\t\tYou entered an invalid rating")
      
    elif(float(rat)<0):
      print("\n\t\t\tYou entered an invalid rating")
      
    elif(float(rat)==-1):
      break
    else:
      break
  
      
  db[x]['li'].append(float(rat))

  count = 0
  for i in db:
    length = 0
    count = count + 1
    print("\t\t\t",count, '. ', i)
    for j in db[i]:
      length = len(db[i][j])
      li=db[i][j]
      a = sum(li) 
      b=a/length
      print('\t\t\t\t\tAverage Rating : ', round(b, 2))
      print()
      
  print('\n\n\t\t\tRating added successfully!\n\n')



#main3
def rateAndRecommend():
  #Driver's Code for buffer4.py
  print("\n\t\t\t\t\t\tWELCOME TO RATING SYSTEM \n")

  print("Let me drive you through the MENU :) \n")

  loop=False
  while(True):
    print("\n\t\t\t\t Press: ")
    print("\t\t\t\t 1. To View the Products that you can Rate")
    print("\t\t\t\t 2. Actually rate a product!")
    print("\t\t\t\t 3. Contribute to the website by writing to us \n")

    inpChoiceMain=input("\n\nWhat do you want to do today?\nEnter your choice :) ")

    if(int(inpChoiceMain)==1):
      
      print('\n\n\t\t\t-----------------------------------------------------------------\n')      
      view_all_db()
      print('\t\t\t-----------------------------------------------------------------')
    elif(int(inpChoiceMain)==2):
      print("\n\n")
      rate_existing()
    elif(int(inpChoiceMain)==3):
      print("\n\n")
      add_comments()
    else:
      print("\n\n\t\t\tSomething went wrong! Enter the right choice please.")
    
  
    inpCont=input("\n\nPress 1 to return to the System or press any key to exit: ")
    if(int(inpCont)==1):
      loop=True
    else:
      break
      print("\n\n\t\t\tThankYou for Visiting the Site!")
    
  
#shrey chatbot 
def message_probability(user_message, recognised_words, single_response=False, required_words=[]):
    message_certainty = 0
    has_required_words = True

    # Counts how many words are present in each predefined message
    for word in user_message:
        if word in recognised_words:
            message_certainty += 1

    # Calculates the percent of recognised words in a user message
    percentage = float(message_certainty) / float(len(recognised_words))

    # Checks that the required words are in the string
    for word in required_words:
        if word not in user_message:
            has_required_words = False
            break

    # Must either have the required words, or be a single response
    if has_required_words or single_response:
        return int(percentage * 100)
    else:
        return 0

def hello():
    return "Hi there! How can I help you today?"

def what_is_menstrual_cycle():
    return "The menstrual cycle is the regular natural change that occurs in the female reproductive system that makes pregnancy possible."

def how_long_menstrual_cycle():
    return "The average menstrual cycle is 28 days long, but can range from 21 to 35 days in length."

def what_is_pms():
    return "PMS, or premenstrual syndrome, refers to the physical and emotional symptoms that many women experience before their menstrual period begins."

def relieve_menstrual_cramps():
    return "There are several things you can try to relieve menstrual cramps, including taking over-the-counter pain medication, using a heating pad or hot water bottle, and practicing relaxation techniques such as deep breathing or yoga."

def check_all_messages(message):
    highest_prob_list = {}

    # Simplifies response creation / adds it to the dict
    def response(bot_response, list_of_words, single_response=False, required_words=[]):
        nonlocal highest_prob_list
        highest_prob_list[bot_response] = message_probability(message, list_of_words, single_response, required_words)

    # Responses -------------------------------------------------------------------------------------------------------
    response(hello(), ['hello', 'hi', 'hey', 'sup', 'heyo'], single_response=True)
    response(what_is_menstrual_cycle(), ['menstrual', 'cycle'], required_words=['menstrual', 'cycle'])
    response(how_long_menstrual_cycle(), ['how', 'long', ], required_words=['long',])
    response(what_is_pms(), ['what', 'is', 'pms'], required_words=['pms'])
    response(relieve_menstrual_cramps(), ['relieve', 'menstrual', 'cramps'], required_words=['cramps'])
    response(long.R_ADVICE, ['advice', 'suggestions'], required_words=['advice'])
    response(long.R_EATING, ['eating', 'habit'], required_words=['eat' ,'eating'])
    response(long.R_MENSTRUAL_HYGIENE, ['how','to','maintain','menstrual', 'hygine',], required_words=['hygine'])
    response(long.R_MENSTRUAL_HYGIENE, ['how','to','maintain','menstrual', 'hygine',], required_words=['mantain'])
    response(long.R_MENSTRUATION, ['what','is','menstruation',], required_words=['menstruation'])
    response(long.R_PERIOD_CRAMPS, ['how','to','cure','bad', 'period','cramps'], required_words=['period','cramps','bad'])
    response(long.R_PERIOD_FLOW, ['how','is','the','flow',], required_words=['flow'])
    response(long.R_PERIOD_FREQUENCY, ['what','is', 'the', 'frequency',], required_words=['frequency'])
    response(long.R_PERIOD_LENGTH, ['what','is', 'the', 'length',], required_words=['length'])
    response(long.R_PERIOD_LENGTH, ['how', 'long',], required_words=['long'])
    response(long.R_PERIOD_MOOD, ['mood','change',], required_words=['mood'])
    response(long.R_PERIOD_PRODUCTS, ['what','products', 'to', 'use',], required_words=['products'])
    response(long.R_PRODUCT_RECOMMENDATION, ['product','recommendation',], required_words=['product','recommendation',])
    response(long.R_SYMPTOMS, ['what','are', 'the', 'symptoms',], required_words=['symptoms'])
    response('My Pleasure', ['thank you','thank thank', 'thanks', 'Thank you for the help',], required_words=['thanks'])

    # end of database -------------------------------------------------------------------------------------------------------
    
    best_match = max(highest_prob_list, key=highest_prob_list.get)
    return long.unknown() if highest_prob_list[best_match] < 1 else best_match

# Used to get the response
def get_response(user_input):
    split_message = re.split(r'\s+|[,;?!.-]\s*', user_input.lower())
    response = check_all_messages(split_message)
    return response


#main4 
def chatbot():
    # Testing the response system
    print("\n\n\t\t\t\t\t Welcome to the PeriodT chatBot!")
    print("\n\t\t\t\t I am PeriodT and how can i help you today?")
    print('\n\t\t\t-----------------------------------------------------------------')
    while True:
        print('\t\t\t\t PeriodT: ' + get_response(input('\t\t\t\t You: ')))
        user_input = input("\t\t\t\t You: ") 
        if(user_input=='goodbye' or user_input=='bye' or user_input=='ta ta' or user_input=='byebye'): 
            print('\n\t\t\t-----------------------------------------------------------------')
            break
        else:
            print('\t\t\t\t PeriodT: ' + get_response(user_input))


def register():
    username = input('\n\t\t\t\t\t\t Enter a username: ')

    if username in users:
        print('\n\t\t\t\t\t\t Username already taken!')
        return

    password = input('\n\t\t\t\t\t\t Enter a password: ')
    users[username] = password
    user_tracker[username]=[]
    print('\n\t\t\t\t\t\t Registration successful!')


#main5
def tracker():
    cycle_dates = {}

    sessionUser = ''
    while True:
      print("\n\t\t\t\t\t\tLogin to your Account \n")
      print('1. New to the app? Wanna Register?')
      print('2. Already a Customer. Login!')
      c = int(input('\nEnter your option (1/2) : '))
     
      if c == 1:
          register()
      elif c == 2:
          username = input('\n\t\t\t\t\t Enter your username: ')
          password = input('\t\t\t\t\t Enter your password: ')

          if username in users and users[username] == password:
              print('\n\t\t\t\t\t Authentication successful!')
              sessionUser = username
              break
          else:
            print('\n\t\t\t\t\t\t Authentication failed!')

    option = 1
    while option == 1:
        print('\n\t\t\t-----------------------------------------------------------------')
        print("\n\t\t\t\t\t Welcome to the Homepage!! \t")
        start_date = input("\nEnter the start date of your menstrual cycle (YYYY-MM-DD), or 'q' to quit : ")
        # Add the start date to the dictionary with a value of 1
        cycle_dates[start_date] = 1
        if start_date == 'q':
            break

        l = start_date[8:10]
        l = int(l)
        mo = start_date[5:7]
        mo = int(mo)
       
        appendInML = int(input('\nEnter your cycle length : '))

        user_tracker[sessionUser].append(int(appendInML))

        dep = np.array(user_tracker[sessionUser]).reshape(-1,1)
        indep = []
        
        count=0
        for i in user_tracker[sessionUser]:
            count=count+1
            indep.append(count)
       
        # reshape the independent variable to a 2D array
        X = [[x] for x in indep]

        # create a linear regression model and fit it to the data
        model = LinearRegression().fit(X, dep)

        # print the slope and intercept of the regression line
        
        m=int(model.coef_[0])
        n=int(model.intercept_)
        
        pred=m*appendInML+n
        
        pred=int(pred)
        print('\nYour next period can be expected after : ',pred,'days of next month')
        print()
        
        # importing the required libraries

        # define data values
        x = np.array(dep) # X-axis points
        y = np.array(indep) # Y-axis points

        plt.scatter(y, x,color='hotpink', marker='*') # Plot the chart
        plt.title("CYCLE PATTERN ANALYSIS")
        plt.xlabel("MONTH NO.")
        plt.ylabel("CYCLE LENGTH")
        plt.show()

        # parse the date string into a datetime object
        date = datetime.datetime.strptime(start_date, "%Y-%m-%d").date()

        # prompt the user to enter a number of days
        # n = int(input("Enter a number of days: "))

        # calculate the date that is n days after the 28th day after the entered day
        target_date = date.replace(day=pred,month=mo+1)
        target_date2 = date.replace(day=l)
        # display the calendar for the target month and highlight the target date
        calendar.setfirstweekday(calendar.SUNDAY)  # set Sunday as the first day of the week
        cal = calendar.monthcalendar(target_date.year, target_date.month)
        cal2 = calendar.monthcalendar(target_date2.year, target_date2.month)
       
        print(f"Calendar for {target_date2.strftime('%B %Y')}:")
        for week in cal2:
            for day in week:
                if day == 0:
                    print("   ", end="")
                elif day == target_date2.day:
                    print(f"\033[7m{day:2}\033[0m ", end="")
                else:
                    print(f"{day:2} ", end="")
            print()
        print("\nThe following calendar will help you know your next month mentrual cycle date!!\n")
        print(f"Calendar for {target_date.strftime('%B %Y')}:")
        for week in cal:
            for day in week:
                if day == 0:
                    print("   ", end="")
                elif day == target_date.day:
                    print(f"\033[7m{day:2}\033[0m ", end="")
                else:
                    print(f"{day:2} ", end="")
            print()

        option = int(input("\n Do you want to check for another month ? (0/1) "))



        
#Driver' s Code
def main():
    print("\n\t\t\t\t\t\t\033[1mWELCOME TO PERIODT\033[0m \n")
    
    mainCont=True
    while(mainCont):
        
        print('\n\t\t\t-----------------------------------------------------------------')
        print('\t\t\t\t\tHow can PeriodT assist you today?')
        #print('\t\t\t-----------------------------------------------------------------\n')
        print('\n\t\t\t\t\t  \033[3m1. Menstrual Education\033[0m')
        print('\t\t\t\t\t  \033[3m2. Period Phase Symptoms Determination\033[0m')
        print('\t\t\t\t\t  \033[3m3. Your Period Tracker\033[0m')
        print('\t\t\t\t\t  \033[3m4. Rate, Recommend or let us know what you feel?\033[0m')
        print('\t\t\t\t\t  \033[3m5. The PeriodT ChatBot\033[0m')
        print('\t\t\t-----------------------------------------------------------------\n')
        mainChoice=int(input('\n\nWhere do you want to go? '))
    
        if(mainChoice==1):
            education()
        elif(mainChoice==2):
            yourPersonalGuide()  
        elif(mainChoice==3):
            tracker()
        elif(mainChoice==4):
            rateAndRecommend()
        elif(mainChoice==5):
            chatbot()
        else:
            print('\n\t\t\t\t      You entered an invalid choice!')
            
        print('\n\t\t\t\t\t Do you want to continue? ')
        YorN=int(input('\n\t\t\t\t\t Press 1 to continue: '))
        
        if(YorN==1):
            mainCont=True
        else:
            print('\n\n\t\t\t\t\033[1mThanks For Visiting! Hope we were of help!\033[0m\n\n')
            break

main()