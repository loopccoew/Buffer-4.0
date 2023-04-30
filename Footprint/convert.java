package footprint;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
class carbon{
    static HashMap<String,Attributes> map = new HashMap<>();
    static HashMap<String,Double> carbon_city = new HashMap<>();
    static String[] emp;

    void map() throws IOException {
        String csvFile = "C:\\Users\\srush\\Downloads\\data.csv";
        BufferedReader br = new BufferedReader(new FileReader(csvFile));

        String line;
        int count=0;
        while ((line = br.readLine()) != null) {
            if(count<2)
            {
                count++;
                continue;
            }
            // use comma as separator
            emp = line.split(",");

            Attributes obj = new Attributes();
            obj.number_of_roads = Integer.parseInt(emp[1]);
            obj.area_of_city = Double.parseDouble(emp[4]);
            obj.co2 = Double.parseDouble(emp[5]);
            obj.co = Double.parseDouble(emp[6]);
            obj.ch = Double.parseDouble(emp[7]);
            obj.hc = Double.parseDouble(emp[8]);
            obj.nox = Double.parseDouble(emp[9]);
            obj.pm = Double.parseDouble(emp[10]);
            obj.so2 = Double.parseDouble(emp[11]);
            map.put(emp[0],obj);
        }
    }

    void calculate(){
        for(int i=0;i< map.size();i++){
            Attributes temp = map.get(map.keySet().toArray()[i].toString());
            double footprint = (temp.ch+ temp.co+ temp.co2+ temp.hc+ temp.nox+ temp.pm+ temp.so2)*8.91*28 /1000;
            carbon_city.put(map.keySet().toArray()[i].toString(),footprint/1000);
        }
        System.out.println(carbon_city);
    }
}
public class convert {

    public static void main(String[] args) throws IOException {
        carbon obj = new carbon();
        obj.map();
        obj.calculate();
    }
}

