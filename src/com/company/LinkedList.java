package com.company;

/*
This class define a linked list that stores integer values.
*/

public class LinkedList
{
    public Node head, tail;
    private int size;

    //constructor method to create a list of object with head, tail, and size.
    public LinkedList()
    {
        head = null;
        tail = null;
    }

    //method add node to end of list
    public void addLastNode(int data)
    {
        if (tail == null)
            head = tail = new Node(data); //empty list
        else
        {
            tail.next = new Node(data); //link new node as last node
            tail = tail.next; //make tail pointer points to last node
        }
    }

    //======== Your part to complete for this assignment =========

    //method #1: add first node
    public void addFirstNode(int data)
    {
        if (tail == null) {
            head = tail = new Node(data);
        }

        tail.next = new Node(data);
        tail = tail.next;
        size++;
    }

    //method #2: add node at index
    public void addAtIndex(int index, int data)
    {
        Node newNode = new Node(data);
        Node oldNode = head;

        for (int i=1;i<size;i++)
        {
            if (i == index)
            {
                Node myNode = oldNode.next;
                oldNode.next = newNode;
                newNode.next = myNode;
                break;
            }
            oldNode = oldNode.next;
        }
        size++ ;
    }

    //method #3: remove first node
    public void removeFirstNode()
    {
        if(head != null) {
            head = head.next;
            size = size - size;
        }
    }

    //method #4: remove last node
    public void removeLastNode()
    {
        Node myNode = head;
        while(myNode.next.next != null) {
            myNode = myNode.next;
        }
        myNode.next = null;
        size = size - size;
    }

    //method #5: remove node at index
    //method remove node at index

    public void removeAtIndex(int index)
    {

        if (index == 0)
        {
            head = head.next;
            size = size - size;
            return ;
        }

        if (index == size - 1)
        {
            Node nodeA = head;
            Node nodeB = head;

            while (nodeA != tail)

            {
                nodeB = nodeA;
                nodeA = nodeA.next;
            }

            tail = nodeB;
            tail.next = null;

            size = size - size;
            return;
        }

        Node myNode = head;

        for (int i = 1; i < size - 1; i++)
        {
            if (i == index)
            {
                Node myNode1 = myNode.next;
                myNode1 = myNode1.next;
                myNode.next = myNode1;
                break;
            }
            myNode = myNode.next;
        }

        size = size - size;

    }

    //method #6: countNodes
    public int countNodes()
    {
        return countNodesRecursive(head);
    }

    public int countNodesRecursive(Node node)
    {
        if (node == null){
            return 0;
        }

        return 1 + countNodesRecursive(node.next);
    }

    //method #7: pritnInReverse  (Recursive method)
    public void printInReverse(Node node)
    {
        if(node.next != null) {
            printInReverse(node.next);
        }
        System.out.println(node.data);
    }



    //method to print out the list
    public void printList()
    {
        Node temp;
        temp = head;
        while (temp != null)
        {
            System.out.print(temp.data + "   ");
            temp = temp.next;
        }
    }

    //class to create nodes as objects
    private class Node
    {
        private int data;  //data field
        private Node next; //link field

        public Node(int item) //constructor method
        {
            data = item;
            next = null;
        }
    }
}

