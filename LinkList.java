public class LinkList {
    Node head;
    int size;
    LinkList(){
        size=0;
    }
    // list ka node pehle banao
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data=data;
            this.next=null; // by default, har node ka next wala null hi rakho
            // systum ko pata hai "next" kya hota hai. chill.
        }
    }

    // addFirst : dalne wale ka next = abhi wala head
    public void addFirst(String a){
        Node newNode=new Node(a);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }

    // addLast : poori list traverse karo jab tak next wala null na ho. udhar pohochkar us node ke next ko naya wala banado.
    public void addLast(String n){
        Node newNode=new Node(n);
        Node currentNode=head;
        if(head==null){
            head=newNode;
            return;
        }
        while(currentNode.next!=null){
            currentNode=currentNode.next;
        }
        currentNode.next=newNode;
    }
    public void printList(){
        Node currentNode=head;
        if(currentNode==null){
            System.out.println("list is empty.");
            return;
        }
        while(currentNode!=null){
            System.out.print(currentNode.data+" -> ");
            currentNode=currentNode.next;
        }
        System.out.println("null");
    }

    public void deleteFirst(){
        Node newNode=head;
        if(head==null){
            System.out.println("list is empty.");
            return;
        }
        if(newNode.next==null){
            head=null;
            return;
        }
        head=newNode.next;
    }

    public void deleteLast(){
        Node newNode=head;
        if(head==null){
            System.out.println("list is empty.");
            return;
        }
        if(newNode.next==null){
            head=null;
            return;
        }
        Node currentNode = head.next;
        while(currentNode.next!=null){
            newNode=newNode.next;
            currentNode=currentNode.next;
        }
        newNode.next=null;
    }
    
    public static void main(String[] args) {
        LinkList ob=new LinkList();
        ob.addFirst("learning");
        ob.addLast("DSA");
        ob.addLast("everyday");
        ob.printList();
        ob.deleteFirst();
        ob.printList();
        ob.addLast("(trying to)");
        ob.printList();
        ob.deleteLast();
        ob.printList();
    }
}
