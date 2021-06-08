/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicle;



/**
 *
 * @author Emre
 */
public class DoublyLinkedList {
    
    class Node{
       Vehicle data; 
       Node prev; 
       Node next;
       public Node(Vehicle data){
           this.data=data;
       }
    }
    Node head,tail;
    public DoublyLinkedList() {
        head=null;
        tail=null;
    }

    
    
    
    public void Add(Vehicle data){
        //Create a new node  
        Node newNode = new Node(data);  
          
        //If list is empty  
        if(head == null) {  
            //Both head and tail will point to newNode  
            head = tail = newNode;  
            //head's previous will point to null  
            head.prev = null;  
            //tail's next will point to null, as it is the last node of the list  
            tail.next = null;  
        }  
        else {  
            //newNode will be added after tail such that tail's next will point to newNode  
            tail.next = newNode;  
            //newNode's previous will point to tail  
            newNode.prev = tail;  
            //newNode will become new tail  
            tail = newNode;  
            //As it is last node, tail's next will point to null  
            tail.next = null;  
            
        }
        Node current = null, index = null;  
        Vehicle temp;  
        //Check whether list is empty  
        if(head == null) {  
            return;  
        }  
        else {  
            //Current will point to head  
            for(current = head; current.next != null; current = current.next) {  
                //Index will point to node next to current  
                for(index = current.next; index != null; index = index.next) {  
                    //If current's data is greater than index's data, swap the data of current and index  
                    if(current.data.compareTo(index.data)>0 ) {  
                        temp = current.data;  
                        current.data = index.data;  
                        index.data = temp;  
                    }  
                }  
            }  
        } 
    }
    
    public void Delete(String plaka){
        Node temp=head;
        while(temp.data.getPlaka().compareTo(plaka)!=0){
            temp=temp.next;
        }
        if(temp.data.getPlaka().compareTo(tail.data.getPlaka())==0){
            tail=temp.prev;
            tail.prev=temp.prev.prev;
            tail.next=null;
        }
        temp.prev.next=temp.next;
        temp.next.prev=temp.prev;
        System.out.println(temp.data.getPlaka()+" Plakalı araç silindi!");
        
    }
    public void LeftToRightDisplay(){
        if(head==null)
            System.out.println("Liste Boş");
        else{
            System.out.println("Soldan Sağa liste:");
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                
                temp=temp.next;
            }
            System.out.println("\n");
        }
    }
    public void RightToLeftDisplay(){
        if(head==null)
            System.out.println("Liste Boş");
        else{
            System.out.println("Sağdan Sola Liste:");
            Node temp=tail;
            while(temp.prev!=null){
                System.out.print(temp.data+" ");
                temp=temp.prev;
            }
            System.out.println("\n");
        }
    }
}