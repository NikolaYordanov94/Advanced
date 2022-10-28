package StacksAndQueuesExercises;
import java.util.ArrayDeque;
import java.util.Scanner;

public class SimpleTextEditor_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        ArrayDeque<Character> stack = new ArrayDeque<>();
        ArrayDeque<Character> currentAppend = new ArrayDeque<>();
        ArrayDeque<Character> currentErase = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {

            String [] command = scanner.nextLine().split(" ");
            String typeOfCommand = command[0];

            switch (typeOfCommand){

                case"1":
                    for (int j = 0; j < command[1].length(); j++) {
                        stack.push(command[1].charAt(j));
                        if(currentAppend.isEmpty()){
                            currentAppend.push(command[1].charAt(j));
                        }else{
                            currentAppend.clear();
                            currentAppend.push(command[1].charAt(j));
                        }
                    }
                    break;

                case"2":
                    for (int j = 0; j < Integer.parseInt(command[1]); j++) {
                        if(currentErase.isEmpty()){
                            currentErase.push(stack.pop());
                        }else{
                            currentErase.clear();
                            currentErase.push(stack.pop());
                        }
                    }
                    break;

                case"3":
                    if(Integer.parseInt(command[1]) == 1){
                        System.out.println(stack.getLast());
                    }else{
                        for (int j = stack.size() - Integer.parseInt(command[1]); j > 0; j--) {
                            stack.pop();
                        }
                        System.out.println(stack.peek());
                    }
                    break;

                case"4":
                    stack.toString().replace(currentAppend.toString(), "");
                    break;

            }
        }
    }
}