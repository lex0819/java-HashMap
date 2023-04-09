package lesson05;

import java.util.*;

public class Phone_book {

    public static Map<String, List<String>> getPhoneBook(){
        Map<String, List<String>> phone_book = new HashMap<>();
        phone_book.put("Иван Иванов", Arrays.asList("767676767676", "12121212121", "343434343434"));
        phone_book.put("Светлана Петрова", Arrays.asList("35353535353", "68686868686"));
        phone_book.put("Кристина Белова", Arrays.asList("1515151515151"));
        phone_book.put("Анна Мусина", Arrays.asList("86868686868", "90909090909"));
        phone_book.put("Анна Крутова", Arrays.asList("7373737373737"));
        phone_book.put("Иван Юрин", Arrays.asList("3333333333333"));
        phone_book.put("Петр Лыков", Arrays.asList("66666666444", "777777777"));
        phone_book.put("Павел Чернов", Arrays.asList("1717171717171"));
        phone_book.put("Петр Чернышов", Arrays.asList("171717171"));
        phone_book.put("Мария Федорова", Arrays.asList("34545345353", "5676575674"));
        phone_book.put("Марина Светлова", Arrays.asList("8968796868"));
        phone_book.put("Мария Савина", Arrays.asList("68968689686"));
        phone_book.put("Мария Рыкова", Arrays.asList("78478474747", "14511456145614"));
        phone_book.put("Марина Лугова", Arrays.asList("888888888"));
        phone_book.put("Анна Владимирова", Arrays.asList("88888866666"));
        phone_book.put("Иван Мечников", Arrays.asList("999999999"));
        phone_book.put("Петр Петин", Arrays.asList("0987906895"));
        phone_book.put("Иван Ежов", Arrays.asList("1570987261", "36059734", "58902834"));

        return phone_book;
    }

    public static List<String> namesList(Map<String, List<String>> book){
        List<String> names = new ArrayList<>();

        for(var item: book.entrySet()){
            String full_name = item.getKey();
            Scanner scan = new Scanner(full_name);
            String name = scan.next();
            scan.close();
            names.add(name);
        }
        return names;
    }
    public static Map<String, Integer> repeatNames(List<String> names){
        Map<String, Integer> repeat_names = new HashMap<>();
        Set<String> pure_names = new HashSet<>();

        for (String name : names) {
            boolean new_name = pure_names.add(name);
            if (new_name) {
                repeat_names.put(name, 1);
            } else {
                int count = repeat_names.get(name) + 1;
                repeat_names.put(name, count);
            }
        }
        return repeat_names;
    }

    public static Map<String, Integer> reversSort(Map<String, Integer> repeat_names){
        Map<String, Integer> sorted_names = new LinkedHashMap<>();

        repeat_names.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEach(entry -> sorted_names.put(entry.getKey(), entry.getValue()));

        return sorted_names;
    }

    public static void main(String[] args){
        Map<String, List<String>> phone_book = getPhoneBook();
        System.out.println("List of person with their phones: ");
        for(var item: phone_book.entrySet()){
            System.out.println(item);
        }

        System.out.println("\nTop popular persons: ");
        Map<String, Integer> names = reversSort( repeatNames( namesList( phone_book ) ) );
        for(var name: names.entrySet()){
            System.out.println(name);
        }
    }
}
