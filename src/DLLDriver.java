public class DLLDriver
{
    public static void main(String[] args)
    {
        DoubleLinkedList list = new DoubleLinkedList();

        list.addToEnd(4);
        list.addToEnd(3);
        list.addToHead(1);
        list.addToHead(2);
        list.printList();
        System.out.println();

        list.removeFromEnd();
        list.printList();
        System.out.println();
        list.removeFromStart();
        list.printList();

    }
}//end DLLDriver class
