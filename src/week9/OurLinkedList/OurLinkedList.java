package week9.OurLinkedList;

import FinishedLinkedList.Node;

public class OurLinkedList {
    //instance variable
    private FinishedLinkedList.Node firstNode;


    //Constructor
    public OurLinkedList() {
                firstNode = null;
    }


    //addNode
    public void addNode(int value) {
        //create new Node and then decide where it goes


    }

    public int getValue(int position) {

        return 0;
    }

    public int size() {
        int count = 0;
        FinishedLinkedList.Node currentNode = firstNode;
        while (currentNode != null) {
            count++;
            currentNode = currentNode.getLink();
        }
        return count;
    }

    //insert
    public void insert(int position, int value) {

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
