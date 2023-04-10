package lesson05;

import java.util.*;

public class task02 {
    /*
    * дана строка чисел с консоли, там могут быть повторяющиеся числа,
    * надо для каждого числа вывести Yes, если оно уже встречалось и No, если еще не встречалось
    * */
    public static Scanner iscanner = new Scanner(System.in); //for reading console
    public static void main(String[] args){

        System.out.println("Enter some numbers divided by space: ");
        String input_str = iscanner.nextLine(); //got all numbers from console

        ArrayList<String> numbers_Yes_No= new ArrayList<>(); // Array of all similar numbers
        Set<Integer> uni_numbers = new HashSet<>(); //Set contains only unique items

        Scanner scan_number_u = new Scanner(input_str); // iterator hasNextInt()
        while (scan_number_u.hasNextInt()) { // only integer type
            numbers_Yes_No.add(uni_numbers.add(scan_number_u.nextInt()) ? "NO" : "YES" );
        }

        System.out.println(numbers_Yes_No);
        //System.out.println(uni_numbers);
    }
}