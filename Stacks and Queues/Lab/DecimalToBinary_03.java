package StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class DecimalToBinary_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Math.abs(Integer.parseInt(scanner.nextLine()));
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        if(num == 0){
            System.out.println(0);
        }

        while(num != 0){

            stack.push(num % 2);
            num /= 2;
        }
        for (int binary : stack){
            System.out.print(binary);
        }
    }
}
