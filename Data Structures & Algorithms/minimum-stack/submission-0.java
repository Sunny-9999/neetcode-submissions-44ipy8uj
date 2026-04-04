class MinStack {

    class Node{
        int val;
        Node prev;
        Node next;
        int minVal;
        Node(int val,int minVal){
            this.val=val;
            this.minVal=minVal;
        }
    }
    
     Node head= new Node(-1,-1);
      Node tail=new Node(-1,-1);

   

    public MinStack() {
   
    head.prev=null;

   
    tail.next=null;
    head.next=tail;
    tail.prev=head;
    }
    
    public void push(int val) {
         Node current;
        if(head.next==tail){
          current =new Node(val,val);
        }else{
             current = new Node(val,Math.min(val,head.next.minVal));
        }

        current.next=head.next;
        head.next.prev=current;
        head.next=current;
    }
    
    public void pop() {
        head.next=head.next.next;
        head.next.prev=head;
    }
    
    public int top() {
        return head.next.val;
    }
    
    public int getMin() {
        return head.next.minVal;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */