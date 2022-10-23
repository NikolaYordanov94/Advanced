package StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class PrinterQueue_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> printQueue = new ArrayDeque<>();

        String input = scanner.nextLine();

        while (!input.equals("print")){
            if(input.equals("cancel")){
              //  String output = printQueue.isEmpty() ? "Printer is on standby" : "Canceled" + printQueue.poll();
                String output;
                if(printQueue.isEmpty()){
                    output = "Printer is on standby";
                }else{
                    output = "Canceled " + printQueue.poll();
                }
                System.out.println(output);
            }else{
                printQueue.offer(input);
            }

            input = scanner.nextLine();
        }
        for (String file : printQueue){
            System.out.println(file);
        }
    }
}
