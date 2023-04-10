package lesson05;

import java.util.*;

public class unique_items {
    /*
    * дана строка чисел с консоли, там могут быть повторяющиеся числа,
    * надо посчитать, сколько там уникальных чисел, они не повторяются
    * */
    public static Scanner iscanner = new Scanner(System.in); //for reading console
    public static void main(String[] args){

        System.out.println("Enter some numbers divided by space: ");
        String input_str = iscanner.nextLine(); //got all numbers from console

        Set<Integer> numbers = new HashSet<>(); //Set contains only unique items

        Scanner scan_number = new Scanner(input_str); // iterator hasNextInt()
            while (scan_number.hasNextInt()) { // only integer type
                numbers.add(scan_number.nextInt());
            }
        System.out.println(numbers);
        System.out.println(numbers.size());
    }
}