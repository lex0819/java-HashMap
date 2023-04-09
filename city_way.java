package lesson05;

import java.util.HashMap;
import java.util.Map;

public class city_way {

    /*
    * Дан массив путей от одного города до другого. Надо вернуть конечный город.
    * Из конечного города пути уже нет.
    * */

    public static String getFinalCity(Map<String, String> cities){
        String finalPoint = "";

        for(var item: cities.entrySet()){
            String city = item.getValue();
            if(!cities.containsKey(city)){
                finalPoint = city;
            }
        }

        return finalPoint;
    }

    public static void main(String[] args){
        Map<String, String> cities01 = new HashMap<>(Map.of(
                "Москва", "Самара",
                "Курск", "Пенза",
                "Самара", "Курск"
        ));

        Map<String, String> cities02 = new HashMap<>(Map.of(
                "Москва", "Самара"
        ));

        Map<String, String> cities03 = new HashMap<>(Map.of(
                "Москва", "Самара",
                "Курск", "Пенза",
                "Самара", "Курск",
                "Пенза", "Чита"
        ));

        System.out.println(getFinalCity(cities01));
        System.out.println(getFinalCity(cities02));
        System.out.println(getFinalCity(cities03));
    }
}
