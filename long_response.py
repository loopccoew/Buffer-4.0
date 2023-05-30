# Possible long responses

import random


R_ADVICE = "If you're experiencing menstrual cramps, try using a heating pad or taking a warm bath to help relieve the pain. Drinking chamomile tea or taking over-the-counter pain medication can also be helpful. If your cramps are severe or interfering with your daily life, consider talking to your healthcare provider about other treatment options."

R_EATING = "As an AI chatbot, I don't eat, but as a general rule, it's a good idea to eat a balanced diet during your menstrual cycle. Foods rich in iron, such as leafy greens and red meat, can help replenish your iron levels if you experience heavy bleeding. Drinking plenty of water and staying hydrated can also help reduce bloating and discomfort."

R_SYMPTOMS = "Some common symptoms of menstruation include bloating, cramping, headaches, fatigue, mood swings, and breast tenderness. It's normal to experience some discomfort during your menstrual cycle, but if you're experiencing severe or unusual symptoms, it's a good idea to talk to your healthcare provider to rule out any underlying conditions."

R_PERIOD_LENGTH = "The length of your menstrual cycle can vary from person to person, but the average length is 28 days. However, anywhere from 21 to 35 days is considered normal. The length of your actual period can also vary, but it typically lasts between three and seven days."

R_PERIOD_FLOW = "The amount of blood you lose during your menstrual cycle can vary, but the average is between 30 and 40 milliliters. However, it's normal to experience heavier or lighter bleeding from month to month. If you're experiencing heavy bleeding or passing clots, talk to your healthcare provider to rule out any underlying conditions."

R_PERIOD_FREQUENCY = "The frequency of your menstrual cycle can vary, but the average is once every 28 days. However, anywhere from 21 to 35 days is considered normal. If you're experiencing irregular periods or missing periods, it's a good idea to talk to your healthcare provider to rule out any underlying conditions."

R_PRODUCT_RECOMMENDATION = "There are many menstrual products available, including pads, tampons, menstrual cups, and period panties. The best product for you depends on your personal preference and lifestyle. Pads and tampons are the most common products, but menstrual cups and period panties are becoming increasingly popular. Consider trying different products to find what works best for you."

R_PERIOD_CRAMPS='''

1. Menstrual cramps, also known as dysmenorrhea, are a common experience for many people who menstruate.
2. The cramps are caused by the uterus contracting to shed its lining, which can cause pain and discomfort.
3. Symptoms of menstrual cramps can include pain in the lower abdomen, lower back, and thighs, as well as nausea and headaches.
4. Over-the-counter pain medications like ibuprofen or naproxen can help alleviate menstrual cramps.
5. If menstrual cramps are severe or interfere with daily activities, it may be helpful to talk to a healthcare provider to discuss possible treatment options.'
'''

R_MENSTRUATION='''

1. Menstruation is a natural process in which the body sheds the lining of the uterus through the vagina.
2. It typically occurs once a month in people who have reached puberty and lasts for 3-7 days.
3. Menstrual cycles are regulated by hormones and can vary in length and intensity from person to person.
4. It is important to practice good menstrual hygiene by changing sanitary products regularly and keeping the genital area clean to prevent infection.
5. Menstruation is a normal and healthy process, and there is no need to feel ashamed or embarrassed about it.

'''
R_PERIOD_MOOD='''

1. Many people experience mood changes during their menstrual cycle, commonly known as premenstrual syndrome (PMS).
2. Symptoms of PMS can include mood swings, irritability, anxiety, and depression, among others.
3. These mood changes are thought to be caused by hormonal fluctuations during the menstrual cycle.

'''

R_PERIOD_PRODUCTS='''

1. Period products are products used to manage menstrual bleeding, which typically occurs once a month in people who menstruate.
2. There are several types of period products, including disposable pads, tampons, menstrual cups, and period underwear.
3. Disposable pads and tampons are widely available and can be found at most drugstores and supermarkets.
4. Menstrual cups and period underwear are reusable options that can be used for several years with proper care.
5. It's important to choose a period product that works best for your needs and preferences, as well as practice good menstrual hygiene to prevent infection.
'''

R_MENSTRUAL_HYGIENE='''
Sure, here are five lines on menstrual hygiene:

1. Menstrual hygiene refers to the practices and behaviors that help maintain cleanliness and prevent infection during menstruation.
2. Good menstrual hygiene practices include changing sanitary products regularly, washing the genital area with water and mild soap, and avoiding the use of scented products.
3. It's important to wash your hands before and after changing sanitary products to prevent the spread of germs.
4. Sharing of menstrual products or personal items such as underwear should be avoided to prevent the spread of infection.
5. If you experience any unusual symptoms or discomfort during menstruation, it is important to talk to a healthcare provider to rule out any potential infections or other health concerns.
'''




def unknown():
    response = ["Could you please re-phrase that? ",
                "...",
                "Sounds about right.",
                "What does that mean?",
                "I'm sorry, I didn't understand your question. Can you please try asking again?",][
        random.randrange(4)]
    return response
