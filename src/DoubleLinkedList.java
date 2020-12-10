public class DoubleLinkedList
{
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
