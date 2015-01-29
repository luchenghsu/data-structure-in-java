class Queue {
   Node front, rear;

   public void enqueue(int d) {
     if(front == null) {
        rear = new Node(d);
        front = rear;
     } else {
        rear.next = new Node(d);
        rear = rear.next;
     }
   }  

   public Node dequeue() {
      if (front != null) {
         Node item = front;
         front = front.next;
         return item;
      }
      return null;
   }  

   public String toString(){
      String result = "";
      if (front == null) return result;

      Node current = front;
      while(current.next != null) {
          result = result + Integer.toString(current.data) + "-";
          current = current.next;
      }
      result += Integer.toString(current.data);
      return result;
   }
}