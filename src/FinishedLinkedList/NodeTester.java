package FinishedLinkedList;



public class NodeTester {
    public static void main(String[] args) {
        //try creating and testing a node
        Node node1 = new Node(20);
        System.out.println(node1);

        //Add a couple more nodes
        Node node2 = new Node(30);
        node1.setLink(node2);

        Node node3 = new Node(40);
        node2.setLink(node3);
//        System.out.println();
//
//
//        //print out list
        Node currentNode = node1;
        while (currentNode != null) {
            System.out.print(currentNode + " ");
            currentNode = currentNode.getLink();
        }
//        System.out.println();
    }
}
