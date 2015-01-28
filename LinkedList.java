class LinkedList {

    Node header;
   
    public LinkedList() {
    }

    public LinkedList(int d) {
        header = new Node(d);
    }

    public void append(int d) {
        if (header == null) {
           header = new Node(d); 
        } else {

          Node end = new Node(d);
          Node n = this.header;
          while (n.next != null) {
             n = n.next; 
          }
          n.next = end;
        }
    }

    public Node deleteNode(int d) {
        Node n = this.header;

        if (n.data == d) {
            return header.next;
        }
        while (n.next != null) {
            if (n.next.data == d) {
                n.next = n.next.next;
                return header;
            }
            n = n.next;
        }
        return n;
    }

    /*
       Without a buffer, we can iterate with two pointers: 
       “current” does a normal iteration, while “runner” iterates 
       through all prior nodes to check for dups Runner will only see 
       one dup per node, because if there were multiple duplicates 
       they would have been removed already
    */
    public void deleteDups2() {
        if (header == null) return;

        Node previous = header;
        Node current = header.next;

        while (current != null) {
           Node runner = header;
           while (runner != current) {
              if (runner.data == current.data) {
                  Node tmp = current.next;
                  previous.next = tmp;
                  current = tmp;
                  break;
              }
              runner = runner.next; 
           }
           if(runner == current) {
              previous = current;
              current = current.next;
           } 

        }
    }


    public void reverse() {
        if (header == null) return;

        Node previous = null;
        Node current = header;

        while(current != null) {
            Node next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        header = previous;
    }

    public void traverse() {
        if (header == null) return;
        Node current = header;
        while(current.next != null) {
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.println(current.data);

    }

    public String toString() {
       String result = "";
       if (header == null) return result;
       Node current = header;

       while (current.next != null) {
            result = result + Integer.toString(current.data) + "->";
            current = current.next;
       }
       result += Integer.toString(current.data);
       return result;
    }

    //InsertAfter

    //InsertBefore

    
}