package Generics.GenericScale03;

public class Main {
    public static void main(String[] args) {

        Integer left = 16;
        Integer right = 12;


        Scale<Integer> stringScale = new Scale<>(left, right);

        System.out.println(stringScale.getHeavier());
    }
}
