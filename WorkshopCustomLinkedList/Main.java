package WorkshopCustomLinkedList;

public class Main {
    public static void main(String[] args) {

        DoublyLinkedList list = new DoublyLinkedList();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);

        System.out.println(list.get(0));
        System.out.println(list.removeFirst());
        System.out.println(list.removeFirst());
        list.addLast(6);
        System.out.println(list.removeLast());

        System.out.println();
    }
}
