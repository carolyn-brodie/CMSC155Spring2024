package week9.OurLinkedList;

import FinishedLinkedList.Node;

public class NodeTester {
    public static void main(String[] args) {
        //try creating and testing a node
        FinishedLinkedList.Node node1 = new FinishedLinkedList.Node(10);
        System.out.println(node1);

        //Add a couple more nodes
        FinishedLinkedList.Node node2 = new FinishedLinkedList.Node(11);
        node1.setLink(node2);
        System.out.println();
        FinishedLinkedList.Node node3 = new FinishedLinkedList.Node(12);
        node2.setLink(node3);


        //print out list
        Node currentNode = node1;
        while (currentNode != null) {
            System.out.print(currentNode + " ");
            currentNode = currentNode.getLink();
        }
//        System.out.println();
    }
}
