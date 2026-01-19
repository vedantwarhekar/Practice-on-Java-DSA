package PWLinkedList;

public class Practice {
    //This is the structure of Node
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    public static class LinkedList{
      Node head = null;
      Node tail = null;
      int count = 0;

      void insertAtEnd(int data){
          Node temp = new Node(data);
          // id the list is empty
          if(head == null){
              head = temp;
          }else{ // if the list is not empty
              tail.next = temp;
          }
          tail = temp;
          count++;
      }

      void display(){
          Node temp = head;
          while (temp != null){
              System.out.println(temp.data+" ");
              temp = temp.next;
          }
          System.out.println();
      }

      int size(){

          return count;
      }

      void insertAtHead(int value){
          Node temp = new Node(value);
          if(head == null){
              insertAtEnd(value);
          }else{
              temp.next = head;
              head = temp;
          }
          count++;
      }

      void insertAt(int idx, int value){
          Node t = new Node(value);
          Node temp = head;
          if(idx == size()){
              insertAtEnd(value);
              return;
          }else if(idx == 0){
              insertAtHead(value);
              return;
          }else if(idx < 0 || idx > size()){
              System.out.println("Wrong index");
              return;
          }

          for(int i = 0; i < idx-1; i++){
              temp = temp.next;
          }
          t.next = temp.next;
          temp.next = t;
          count++;
      }

      int getAt(int idx){
          if(idx < 0 || idx >= size()){
              System.out.println("Wrong index");
              return -1;
          }
          Node temp = head;
          for(int i = 1; i <= idx; i++){
              temp = temp.next;
          }
          return temp.data;
      }

      void deleteAt(int idx){
          if(idx < 0 || idx >= size()){
              System.out.println("Wrong index");
              return;
          }
          if(idx == 0) head = head.next;
          Node temp = head;
          for(int i = 0; i <=idx-1; i++){
              temp = temp.next;
          }
          temp.next = temp.next.next;
          if(idx == size()-1){
              tail = temp;
          }
          count--;
      }
    }

    // main method
    public static void main(String[] args)
    {
        LinkedList ll = new LinkedList();
        ll.insertAtEnd(1);
        ll.insertAtEnd(2);
        ll.insertAtEnd(3);
        ll.insertAtEnd(4);
        ll.insertAtHead(0);
        ll.insertAt(2,0);
        ll.insertAt(1,0);
        ll.insertAt(4,0);

        ll.display();
        System.out.println(ll.size());
        System.out.println(ll.getAt(5));
        ll.display();
        ll.deleteAt(5);
        ll.display();
        System.out.println(ll.size());
    }
}
