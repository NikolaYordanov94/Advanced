package IteratorsAndComparatorsExercise.StackIterator_03;

public class Node<Integer>{ //всеки елемент на стека
    public int element;
    public Node<Integer> prev;

    public Node(int element){
        this.element = element;
        this.prev = null;
    }
}
