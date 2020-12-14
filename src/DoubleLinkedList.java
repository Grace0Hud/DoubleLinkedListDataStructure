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

   //------------------- methods to add to list ----------------------
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

    //--------------------------methods to remove from list -------------------------------
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

    //-------------------method to modify data----------------------
    public void setData(int oldData, int updateData)
    {
        if(isInList(oldData))
        {
            getDataPosition(oldData).setData(updateData);
        }
    }

    //------------------methods to access data in the list-----------------------
    //     - can also be used to print out
    //     - can be used to transverse the list from any point in the list
    public Integer getNext(int data)
    {
        if(getDataPosition(data) != null && getDataPosition(data) != tail)
        {
            return getDataPosition(data).getNext().getData();
        }
        return null;
    }//returns the next data int he list
    public Integer getPrev(int data)
    {
        if(getDataPosition(data) != null && getDataPosition(data) != head)
        {
            return getDataPosition(data).getPrev().getData();
        }
        return null;
    }///end getprevious
    //------------------methods to print out data-------------------
    public void printListFromEnd()
    {
        Node pos = tail;
        while(pos != null)
        {
            System.out.println(pos.getData());
            pos = pos.getPrev();
        }
    }//end print list from end

    public void printListFromStart()
    {
        Node pos = head;
        while(pos != null)
        {
            System.out.println(pos.getData());
            pos = pos.getNext();
        }
    }//end print list from start

    //--------------------- brain/helper methods -------------------
    //this is kept public because it has possible uses outside of the function
    public boolean isInList(Integer data)
    {
        if(data == null)
        {
            return false;
        }
        Node position = head;
        while(position != null)
        {
            if(position.getData() == data)
            {
                return true;
            }
            position = position.getNext();
        }
        return false;
    }//end is in list

    //kept public for same reasons as above
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

    private Node getDataPosition(int data)
    {
        if(isInList(data))
        {
            Node position = head;
            while(position != null)
            {
                if(position.getData() == data)
                {
                    return position;
                }
                position = position.getNext();
            }
        }
        return null;
    }

    //-----------------Node construction private class---------------------------
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
