package lesson05;

import java.util.*;

public class pair_count {
    /*
    * Дан список чисел. Посчитайте, сколько в нем пар элементов, равных друг другу. Считается, что любые два элемента, равные друг другу образуют одну пару, которую необходимо посчитать. Вводится список чисел. Все числа списка находятся на разных строках.
    * Ввод:   1 2 3 2 3     Вывод:  2
    * Int [1 2]  Out 0
    * Int [1 1 2]  Out 1
    * Int [1 1 1 2 2]  Out 4
    * similar Python
    * */

    public static Scanner iscanner = new Scanner(System.in); //for reading console
    public static void main(String[] args){
        System.out.println("Enter some numbers divided by space: ");
        int[] input_str = Arrays.stream(iscanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray(); //got all numbers from console
        int counter_pair = 0;
        int numbers_len = input_str.length;

//        similar Python
//        for (int i=0; i< numbers_len - 1; i++){
//            for (int j = i+1; j < numbers_len; j++){
//                if(input_str[i] == input_str[j]){
//                    counter_pair++;
//                }
//            }
//        }

        Map<Integer, Integer> map_num = new HashMap<>();
        for (int k : input_str) {
            if (map_num.containsKey(k)) {
                int j = map_num.get(k);
                map_num.put(k, j + 1);
            } else {
                map_num.put(k, 1);
            }
        }

        for(var item : map_num.entrySet()){
            int n = item.getValue();
            counter_pair += n * (n-1)/2;
        }

        System.out.printf("Count of pairs is %d", counter_pair);
    }
}
