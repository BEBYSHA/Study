public class linked_list {
    Node head; // Kepala List
    class Node{
        int data;
        Node next;

        Node(int d){
            data = d;
            next = null;
        }
    }
    public void push(int newData){
        Node newNode = new Node(newData);
        newNode.next = head;
        head = newNode;
    }
    public void insertAfter(Node prevNode, int newData){
        if(prevNode == null){
            System.out.println("The given previous node cannot be null");
            return;
        }
        Node newNode = new Node(newData);
        newNode.next = prevNode.next;
        prevNode.next = newNode;
    }
    public void append(int newData){
        Node newNode = new Node(newData);
        if(head == null){
            head = new Node(newData);
            return;
        }
        newNode.next = null;
        Node last = head;
        while (last.next != null)
            last = last.next;
        last.next = newNode;
        return;
    }
    public void printlist(){
        Node tnode = head;
        while (tnode != null){
            System.out.print(tnode.data + " ");
            tnode = tnode.next;
        }
    }
    public static void main(String[] args){
        linked_list llist = new linked_list();
        llist.append(0);
        llist.push(2);
        llist.push(0);
        llist.push(2);
        llist.push(0);
        llist.push(3);
        llist.push(1);
        llist.push(2);
        llist.append(1);

        llist.insertAfter(llist.head.next, 1);
        System.out.println("Data Linked List yang sudah dibuat adalah = ");
        llist.printlist();
    }
}