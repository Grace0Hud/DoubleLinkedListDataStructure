public class DoubleLinkedList
{
    private Node head;
    public DoubleLinkedList()
    {
        head = null;
    }

    public void addToHead(int data)
    {
        Node node = new Node(null, data, head);
        if(head != null)
        {
            head.setPrev(node);
        }
        head = node;
    }//end add to head

    public void printList()
    {
        Node pos = head;
        while(pos != null)
        {
            System.out.println(pos.getData());
            pos = pos.getNext();
        }
    }
    private static class Node
    {
        //instance variables
        private int data;
        private Node prev; //instance of a self-referencing class
        private Node next;

        //constructors
        //public only in the class in which the private class exists
        public Node(Node prev, int data, Node next)
        {
            this.prev = prev;
            this.data = data;
            this.next = next;
        }
        //getters/setters
        public int getData()
        {
            return data;
        }

        public Node getPrev() {
            return prev;
        }

        public Node getNext() {
            return next;
        }

        public void setData(int data) {
            this.data = data;
        }

        public void setPrev(Node prev) {
            this.prev = prev;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        //toString
        public String toString()
        {
            return "prev: " + prev + " -- data: " + data + " --next: " + next;
        }
    }//end node
}//end double linked list
