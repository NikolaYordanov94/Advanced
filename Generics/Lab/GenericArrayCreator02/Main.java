package Generics.GenericArrayCreator02;

public class Main {
    public static void main(String[] args) {

        Integer[] arr = ArrayCreator.create(5, 13);

        String[] strings = ArrayCreator.create(7, "Java-Generics");


        for (int i : arr){
            System.out.print(i + " ");
        }

        for(String str : strings){
            System.out.print(str + " ");
        }

    }
}
