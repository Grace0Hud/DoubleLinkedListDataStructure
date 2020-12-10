public class DLLDriver
{
    public static void main(String[] args)
    {
        DoubleLinkedList list = new DoubleLinkedList();

        list.addToEnd(4);
        list.addToEnd(5);
        list.addToHead(3);
        list.addToHead(2);
        list.addToHead(1);
        System.out.println("----List from Start----");
        list.printListFromStart();
        System.out.println("\n----List from End----");
        list.printListFromEnd();

        System.out.println("\nRemoved data from end: ");
        list.removeFromEnd();
        list.printListFromStart();
        System.out.println("\nRemoved data from start: ");
        list.removeFromStart();
        list.printListFromStart();

    }
}//end DLLDriver class
