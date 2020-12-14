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

        System.out.println("-----Prints list from 3 to start using getNext()------");
        Integer data = 3;
        while(list.isInList(data))
        {
            System.out.println(data);
            data = list.getPrev(data);
        }

        System.out.println("\n-----Prints list from 3 to end using getNext()------");
        data = 3;
        while(list.isInList(data))
        {
           System.out.println(data);
           data = list.getNext(data);
        }//end while

        //above methods can also be used to access and change data;
        System.out.println("\nchanges 1 to 20 and prints it out: ");
        list.setData(list.getPrev(2), 20);
        // or to simply print out data
        System.out.println(list.getPrev(2));
        //print lists
        System.out.println("\n----List from Start----");
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

    }
}//end DLLDriver class
