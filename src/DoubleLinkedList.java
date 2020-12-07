public class DoubleLinkedList
{
    private static class Node
    {
        //instance variables
        private int data;
        private Node link; //instance of a self-referencing class

        //constructors
        //public only in the class in which the private class exists
        public Node(int data, Node link)
        {
            this.data = data;
            this.link = link;
        }
        //getters/setters
        public int getData()
        {
            return data;
        }

        public Node getLink() {
            return link;
        }

        public void setData(int data) {
            this.data = data;
        }

        public void setLink(Node link) {
            this.link = link;
        }

        //toString
        public String toString()
        {
            return "data: " + data + " links to " + link;
        }

    }//end node
}//end double linked list
