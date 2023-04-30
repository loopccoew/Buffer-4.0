package footprint;

public class Attributes {

    int number_of_roads;
    double area_of_city;
    double co2;
    double co;
    double ch;
    double hc;
    double nox;
    double pm;
    double so2;
    double calculate_industry
            (
                    double co2,
                    double co,
                    double ch,
                    double hc,
                    double nox,
                    double pm,
                    double so2){
        return (ch+ co+ co2+ hc+ nox+ pm+ so2)*8.91*28 /1000;
    }
}
