package FinishedLinkedList;

public class OurLinkedList {
    //instance variable
    private Node firstNode;


    //Constructor
    public OurLinkedList() {

        firstNode = null;
    }


    //addNode
    public void addNode(int value) {
        //create new Node and then decide where it goes
        Node newNode = new Node(value);
        if (firstNode == null) {
            firstNode = newNode;
        } else {
            Node currentNode = firstNode;
            while (currentNode.getLink() != null) {
                currentNode = currentNode.getLink();
            }
            currentNode.setLink(newNode);
        }

    }

    public int getValue(int position) {
        if (position >= size()) {
            position = size() - 1;
        }
        Node currentNode = firstNode;
        int count = 0;
        while (count < position && currentNode.getLink() != null) {
            currentNode = currentNode.getLink();
            count++;
        }
        return currentNode.getValue();
    }

    public int size() {
        int count = 0;
        Node currentNode = firstNode;
        while (currentNode != null) {
            count++;
            currentNode = currentNode.getLink();
        }
        return count;
    }

    //insert
    public void insert(int position, int value) {

       // if position is greater than size
        if (position > size()) {
            addNode(value);
        } else {
            Node newNode = new Node(value);
            if (position <= 0) {
                newNode.setLink(firstNode);
                firstNode = newNode;
            } else {
                int count = 0;
                Node currentNode = firstNode;
                while (count < (position - 1) && currentNode.getLink() != null) {
                    currentNode = currentNode.getLink();
                    count++;
                }
                Node whereToPoint = currentNode.getLink();
                newNode.setLink(whereToPoint);
                currentNode.setLink(newNode);
            }
        }
    }

    //Remove
    public void remove(int position) {

    }

    //toString
    public String toString() {
        String out = "";
        Node currentNode = firstNode;
        while (currentNode != null) {
            out = out + currentNode.getValue() + " ";
            currentNode = currentNode.getLink();
        }
        return out;
    }
}
