package linkedlist;

public class MyLinkedList {

    public static class Node {
        int value;
        Node next;

        Node(int val) {
            this.value = val;
        }
    }

    public static void printLinkedList(Node head) {
        if (head == null) {
            System.out.println("List is empty!");
        } else {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.value);
                temp = temp.next;
                if (temp != null) {
                    System.out.print("->");
                } else {
                    System.out.println();
                }
            }
        }
    }

    public static Node addToHead(Node headNode, int value) {
        Node newNode = new Node(value);
        if (headNode != null) {
            newNode.next = headNode;
        }

        return newNode;
    }

    public static Node addToTail(Node headNode, int value) {
        Node newNode = new Node(value);
        if(headNode == null) {
            return newNode;
        } else {
            // b1. xac dinh last node
            Node lastNode = headNode;
            while (lastNode.next != null) {
                lastNode = lastNode.next;
            }
            // b2. gan next cho lastNode = newNode
            lastNode.next = newNode;
        }
        return headNode;
    }

    public static Node addToIndex(Node headNode, int value ,int index) {

        if(index == 0) {
            return addToHead(headNode, value);
        } else {
            // b1. tim vi tri can them
            Node newNode = new Node(value);
            Node curNode = headNode;
            int count = 0;
            while (curNode != null) {
                count++;
                if (count == index) {
                    // thuc hien add
                    newNode.next = curNode.next;
                    curNode.next = newNode;
                    break;
                }
                curNode = curNode.next;
            }

        }

        return headNode;
    }

    public static Node removeAtHead(Node headNode){
        if (headNode != null) {
            return headNode.next;
        }
        return null;
    }

    public static Node removeAtTail(Node headNode) {
        if (headNode == null) {
            return null;
        }
        // b1 xac dinh last va previous
        Node lastNode = headNode;
        Node prevNode = null;

        while (lastNode.next != null) {
            prevNode = lastNode;
            lastNode = lastNode.next;
        }
        if (prevNode == null) {
            return null;
        } else {
            prevNode.next = lastNode.next;
        }
        return headNode;
    }

    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        printLinkedList(n1);
        n1 = removeAtTail(n1);
        printLinkedList(n1);
        n1 = removeAtTail(n1);
        printLinkedList(n1);
        n1 = removeAtTail(n1);
        printLinkedList(n1);
    }

}
