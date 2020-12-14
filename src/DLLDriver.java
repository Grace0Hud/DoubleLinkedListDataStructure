public class DLLDriver
{
    public static void main(String[] args)
    {
        DoubleLinkedList list = new DoubleLinkedList();


        //add data to list
        list.addToEnd(4);
        list.addToEnd(5);
        list.addToHead(3);
        list.addToHead(2);
        list.addToHead(1);

        int count = 0;
        int data =1;
        while(count < list.length())
        {
            System.out.println(data);
           data = list.getNext(data);
           count ++;
        }

       // list.printListFromStart();
        /*
        //print lists
        System.out.println("----List from Start----");
        list.printListFromStart();
        System.out.println("\n----List from End----");
        list.printListFromEnd();
        //remove data
        System.out.println("\nRemoved data from end: ");
        list.removeFromEnd();
        list.printListFromStart();
        System.out.println("\nRemoved data from start: ");
        list.removeFromStart();
        list.printListFromStart();
        //setData
        System.out.println("\nSetting 2 to 10");
        list.setData(2, 10);
        list.printListFromStart();

         */
    }
}//end DLLDriver class
