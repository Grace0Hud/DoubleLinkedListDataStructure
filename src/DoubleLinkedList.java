public class DoubleLinkedList
{
    private Node head;
    private Node tail;
    private int count;

    public DoubleLinkedList()
    {
        head = null;
        tail = null;
    }

    public void addToHead(int data)
    {
        Node node = new Node(null, data, head);
        if(head != null)
        {
            head.setPrev(node);
        }else if(length() < 2) //if this is the first element it will be both head and tail
        {
            tail = node;
        }
        head = node;
    }//end add to head

    public void addToEnd(int data)
    {
        Node node = new Node(tail, data, null);
        if(tail != null)
        {
            tail.setNext(node);
        }
        else if(length() < 2)//if this is the first element it will be both head and tail
        {
            head = node;
        }
        tail = node;
    }//end addToEnd method

    public void removeFromStart()
    {
        if(head != null)
        {
            head = head.getNext();
        }
        else
        {
            System.out.println("Remove from empty list?");
            System.exit(0);
        }
    }//end removeFromStart
    public void removeFromEnd()
    {
        if(tail != null)
        {
            tail = tail.getPrev();
            tail.setNext(null);
        }
        else
        {
            System.out.println("Remove from empty list?");
            System.exit(0);
        }
    }//end removeFromEnd

    public void setData(int oldData, int updateData)
    {
        Node position = head;
        while(position != null)
        {
            if(position.getData() == oldData)
            {
                position.setData(updateData);
            }
            position = position.getNext();
        }
    }
    public int length()
    {
        count = 0;
        Node position = head;
        while(position != null)
        {
            count ++;
            position = position.getNext();
        }
        return count;
    }//end length method

    public void printListFromEnd()
    {
        Node pos = tail;
        while(pos != null)
        {
            System.out.println(pos.getData());
            pos = pos.getPrev();
        }
    }

    public void printListFromStart()
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
