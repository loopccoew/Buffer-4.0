package footprint;

class Node{

    String text;

    Node one;

    Node two;

    Node three;



    public Node(String text){

        this.text = text;

        this.one = null;

        this.two = null;

        this.three = null;

    }

}

public class Tree{
    static String region="  Reduce energy consumption: Use energy-efficient appliances, turn off lights and electronics when you're not using them, and adjust your thermostat to use less energy.\n" +

            "\n" +

            "  Choose sustainable transportation: Use public transport, walk, bike or carpool instead of driving alone.\n" +

            "\n" +

            "  Reduce waste: Recycle, compost, and reduce your use of single-use plastics.\n" +

            "\n" +

            "  Eat a plant-based diet: Reduce your meat consumption, eat more plant-based foods, and support local and sustainable agriculture.\n" +

            "\n" +

            "  Use renewable energy: Install solar panels or use renewable energy providers.\n" +

            "\n" +

            "  Buy carbon offsets: Support projects that reduce carbon emissions, such as renewable energy projects or reforestation efforts.\n" +

            "\n" +

            "  Educate yourself and others: Learn more about climate change and encourage others to make environmentally conscious choices.";



    public static String create(String who, double footprint){

        String target = "";





        String Individual="1. Hang out the washing instead of tumble drying \n" +

                "Hanging the washing out instead of using the tumble drier will save about 153kg CO2 a year - that's £52 (USD68) each year, based on 150 cycles a year. \n" +

                "\n" +

                "2. Turn down the heating by 1⁰C\n" +

                "Reducing your heating by 1⁰C can reduce your energy consumption by 8%. For an average household gas bill of 12,500kWh this will reduce your CO2 emissions by 184kg - that's £42 (USD55) each year.\n" +

                "\n" +

                "3. Only fill the kettle with the amount of water you need to boil\n" +

                "Only boiling the amount of water for your hot drink will save 72kg CO2 a year - that's £23 (USD30) per annum\n" +

                "\n" +

                "4. Spend less time in the shower\n" +

                "Spending 1 minute less in the shower can save 23kg CO2 and £8 (USD10) a year (based on one shower a day and a 9kW shower).\n" +

                "\n" +

                "5. Turn electrical equipment off when not in use \n" +

                "Fully turning off just one LCD TV (rather than leaving it on standby) for 18 hours a day will save about 5kg CO2 a year - saving £2 a year (USD2.64). Turn off all other electrical equipment when not in use to multiply the savings.";



        String Industry_low="If a company's carbon footprint is already low, there are several steps it can take to further reduce its carbon emissions and environmental impact:\n" +

                "\n" +

                "Set ambitious targets: The company can set aggressive, science-based targets to reduce its carbon footprint even further. These targets can be based on the latest climate science and can be aligned with the goals of the Paris Agreement.\n" +

                "\n" +

                "Invest in renewable energy: The company can invest in renewable energy sources like solar and wind power. By generating their own renewable energy, the company can reduce its dependence on fossil fuels and lower its carbon emissions.\n" +

                "\n" +

                "Improve energy efficiency: The company can adopt energy-efficient practices and technologies to reduce energy consumption. This can include upgrading to more efficient lighting, heating, and cooling systems, optimizing processes, and using energy-saving equipment.\n" +

                "\n" +

                "Reduce waste: The company can work to reduce waste and increase recycling. This can include implementing a waste reduction and recycling program, using reusable packaging, and minimizing unnecessary packaging.\n" +

                "\n" +

                "Encourage sustainable practices among employees and suppliers: The company can encourage sustainable practices among its employees and suppliers. This can include promoting the use of public transportation, telecommuting, and encouraging the use of environmentally friendly products.\n" +

                "\n" +

                "Collaborate with other companies and organizations: The company can collaborate with other companies and organizations to share best practices, develop new technologies, and advocate for policies that support sustainability.\n" +

                "\n" +

                "Overall, reducing a company's carbon footprint requires a comprehensive approach that involves setting ambitious goals, investing in renewable energy, improving energy efficiency, reducing waste, promoting sustainable practices among employees and suppliers, and collaborating with other companies and organizations.";

        String Industry_med="There are several steps that a medium-sized industry can take to reduce its carbon footprint:\n" +

                "\n" +

                "Conduct an energy audit: Conduct an energy audit to identify areas where energy is being wasted and to identify opportunities to reduce energy use. This will help the company understand how much energy they are consuming and which areas they need to focus on to improve efficiency.\n" +

                "\n" +

                "Implement energy efficiency measures: Implement measures to improve energy efficiency, such as upgrading equipment to more efficient models, installing LED lighting, and improving insulation.\n" +

                "\n" +

                "Switch to renewable energy: Switching to renewable energy sources like solar or wind power can significantly reduce carbon emissions. Companies can consider installing solar panels on their premises or purchasing renewable energy from a supplier.\n" +

                "\n" +

                "Reduce transportation emissions: Encouraging employees to carpool, use public transportation, or work remotely can reduce transportation emissions. The company can also consider switching to electric or hybrid vehicles for their fleet.\n" +

                "\n" +

                "Reduce waste: Reducing waste and increasing recycling can also reduce a company's carbon footprint. This can be achieved by implementing a waste management plan, reducing packaging, and encouraging the reuse of materials.\n" +

                "\n" +

                "Engage stakeholders: Engaging stakeholders such as suppliers, customers, and employees in sustainability efforts can create a culture of sustainability within the company and encourage others to reduce their carbon footprint.\n" +

                "\n" +

                "By implementing these steps, a medium-sized industry can significantly reduce its carbon footprint and contribute to the fight against climate change.";

        String Industry_high="Reducing a company's carbon footprint can be a complex task that requires a comprehensive and systematic approach. Here are some steps that an industry can take to reduce its carbon footprint:\n" +

                "\n" +

                "Conduct a carbon footprint assessment: Before taking any steps, it is important to understand the company's current carbon emissions and identify areas where emissions can be reduced. This will help to set a baseline and establish goals for reducing the carbon footprint.\n" +

                "\n" +

                "Increase energy efficiency: Industries can reduce their carbon footprint by improving energy efficiency. This can be achieved by upgrading equipment and technology, improving insulation, and optimizing processes to reduce energy consumption.\n" +

                "\n" +

                "Switch to renewable energy: Industries can reduce their carbon footprint by switching to renewable energy sources such as wind, solar, hydro, or geothermal. This can be achieved by installing on-site renewable energy systems or purchasing renewable energy from third-party providers.\n" +

                "\n" +

                "Implement green transportation policies: Industries can reduce their carbon footprint by implementing green transportation policies such as encouraging employees to use public transport, cycling, or carpooling. The industry can also consider using electric or hybrid vehicles in their fleet.\n" +

                "\n" +

                "Reduce waste: Industries can reduce their carbon footprint by implementing waste reduction strategies such as reducing packaging, reusing materials, and recycling. They can also explore circular economy models to minimize waste generation.\n" +

                "\n" +

                "Engage suppliers: Industries can reduce their carbon footprint by engaging their suppliers to adopt sustainable practices. They can set sustainability requirements in their procurement policies and work with suppliers to reduce carbon emissions throughout the supply chain.\n" +

                "\n" +

                "Educate employees and stakeholders: Industries can reduce their carbon footprint by educating their employees and stakeholders on sustainability and the importance of reducing carbon emissions. This can lead to a culture of sustainability that drives ongoing improvements.\n" +

                "\n" +

                "Overall, reducing a company's carbon footprint requires a long-term commitment and a willingness to adopt sustainable practices throughout the organization.";

        String Industry="Switching from lower efficiency T12 and T8 lamps to higher efficiency T5 or even better, " +

                "LED lamps will reduce energy consumption and can lead to economic savings.Heat can easily be lost through " +

                "poorly insulated windows.\nDouble glazing can reduce heat loss by 50% compared to single glazing with Low E Glass " +

                "double glazing and triple glazing reducing this loss further. When replacing windows consider those with the" +

                " lowest U-values as these will reduce heat loss the greatest.\nA Building Management System (BMS) or Building Energy Management" +

                " System (BEMS) can be used to control heating, lighting and ventilation to the optimum conditions. Having a BMS/BEMS that" +

                " can be controlled internally gives greater control over energy usage. Identifying a member of staff who is in control of " +

                "the thermostat avoids frequent changes in temperature. Increasing the thermostat by 1 degree Celsius can increase costs by 8%.";

        String Individual_low="If you have a low carbon footprint, that's great! It means you're already making conscious choices to reduce your impact on the environment. Here are some additional steps you can take to further reduce your carbon footprint:\n" +

                "\n" +

                "Reduce your energy consumption even further: Consider using LED light bulbs, turning off power strips when not in use, and upgrading to energy-efficient appliances if you haven't already.\n" +

                "\n" +

                "Encourage others: Share your sustainable practices with friends and family, and encourage them to make changes in their own lives.\n" +

                "\n" +

                "Support sustainable businesses: Look for businesses that prioritize sustainability in their practices and choose to support them.\n" +

                "\n" +

                "Invest in carbon offsets: Even if your carbon footprint is low, investing in carbon offsets can support projects that reduce carbon emissions and help offset any remaining emissions you may have.\n" +

                "\n" +

                "Eat a plant-based diet: If you're not already eating a plant-based diet, consider incorporating more plant-based meals into your diet to further reduce your carbon footprint.\n" +

                "\n" +

                "Use public transport or bike more often: If you have access to public transport, consider using it more often, or if possible, biking to your destinations instead of driving.\n" +

                "\n" +

                "By taking these additional steps, you can further reduce your carbon footprint and continue to make a positive impact on the environment." ;

        String Individual_med="Reducing your carbon footprint is an important step towards mitigating the effects of climate change. Here are some steps you can take to reduce your carbon footprint if it is medium:\n" +

                "\n" +

                "Reduce energy consumption: Turn off lights and appliances when they're not in use, use energy-efficient light bulbs, and consider using a programmable thermostat to regulate the temperature of your home.\n" +

                "\n" +

                "Reduce water usage: Fix any leaks, take shorter showers, and consider installing low-flow showerheads and toilets.\n" +

                "\n" +

                "Reduce transportation emissions: Walk, bike, carpool or use public transportation instead of driving alone, and consider purchasing a hybrid or electric vehicle.\n" +

                "\n" +

                "Reduce waste: Recycle, compost, and reduce your overall consumption of single-use plastics and packaging.\n" +

                "\n" +

                "Eat a more plant-based diet: Eating less meat and dairy can reduce your carbon footprint, as the production of animal products generates significant greenhouse gas emissions.\n" +

                "\n" +

                "Support renewable energy: Consider installing solar panels on your home, or supporting renewable energy projects through investments or advocacy.\n" +

                "\n" +

                "Reduce air travel: Air travel generates significant carbon emissions, so try to limit the number of flights you take, and consider offsetting your emissions through carbon offsets or investing in projects that reduce emissions.\n" +

                "\n" +

                "By taking these steps, you can significantly reduce your carbon footprint and contribute to the fight against climate change.";

        String Individual_high="Reducing your carbon footprint is an important step in mitigating climate change. Here are some steps you can take to reduce your carbon footprint if it is critically high:\n" +

                "\n" +

                "Reduce energy use: Turn off appliances and lights when you are not using them, and replace incandescent light bulbs with LEDs. Set your thermostat to a lower temperature in winter and a higher temperature in summer.\n" +

                "\n" +

                "Use renewable energy sources: Install solar panels or use wind power to generate electricity. Many electricity providers now offer renewable energy options, so check with your provider.\n" +

                "\n" +

                "Reduce water usage: Fix any leaks in your home and install water-efficient showerheads and toilets. Use drought-tolerant landscaping in your yard.\n" +

                "\n" +

                "Reduce waste: Reduce, reuse, and recycle. Buy products with less packaging, and recycle everything you can. Compost food waste and yard waste.\n" +

                "\n" +

                "Eat a plant-based diet: Meat production is a major contributor to greenhouse gas emissions. Eating a plant-based diet or reducing meat consumption can significantly reduce your carbon footprint.\n" +

                "\n" +

                "Reduce transportation emissions: Use public transportation, carpool, or bike instead of driving alone. Consider purchasing an electric or hybrid vehicle if you need a car.\n" +

                "\n" +

                "Support climate-friendly policies: Vote for politicians who support climate-friendly policies and advocate for policies that reduce carbon emissions.\n" +

                "\n" +

                "These are just a few steps you can take to reduce your carbon footprint. By making changes in your daily life and supporting climate-friendly policies, you can help mitigate the impacts of climate change.";



        String solution = "Carbon offsetting funds solutions to reducing carbon emissions now. Frequently carbon offsetting" +

                " reduces emissions much faster than you can as an individual/single company. Carbon offsetting projects help" +

                " to combat global climate change as well as caring for local communities. In many instances providing" +

                " much needed employment, health improvement, biodiversity,  reforestation and broad social benefits to impoverished" +

                " communities." + "\nTips and Advice to help you cut carbon and energy costs";



        Node root = new Node(solution);



        Node ptr = root;

        root.one = new Node(region);

        ptr = root.one;

        ptr.one = new Node(Individual);

        ptr.two = new Node(Industry);

        Node ptr1 = ptr;

        ptr1=ptr.two;

        ptr = ptr.one;

        ptr.one = new Node(Individual_low);

        ptr.two = new Node(Individual_med);

        ptr.three = new Node(Individual_high);



        ptr1.one = new Node(Industry_low);

        ptr1.two = new Node(Industry_med);

        ptr1.three = new Node(Industry_high);

        Indi obj5 = new Indi();



        Node pointer1 = root.one;

        if(who.equals("INDIVIDUAL FOOTPRINT")){

            pointer1=pointer1.one;



            if(footprint<0.02){

                target =  pointer1.text + pointer1.one.text;

            } else if (footprint>=0.02 && footprint<0.5 ) {

                target =  pointer1.text + pointer1.two.text;

            }

            else target =  pointer1.text + pointer1.three.text;

        }



        else if (who.equals("INDUSTRIAL FOOTPRINT")){

            pointer1 = root.two;

            if(footprint<0.02){

                target =  pointer1.text + pointer1.one.text;

            } else if (footprint>=0.02 && footprint<0.5 ) {

                target =  pointer1.text + pointer1.two.text;

            }

            else target =  pointer1.text + pointer1.three.text;

        }

        return target;

    }



}



//public class Tree{

//    public static void main(String[] args) {

//        Tree2 obj = new Tree2();

//        Indi obj1 = new Indi();

//        String s = obj.create("INDIVIDUAL FOOTPRINT",obj1.calculate_footprint());

//        //System.out.println(s);

//    }

//}

