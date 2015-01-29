class Stack {
    Node top;

    public void push(int item) {
        Node t = new Node(item);
        t.next = top;
        top = t;
    }

    public Node pop() {
        if (top != null) {
           Node item = top;
           top = top.next;
           return item; 
        }
        return null;
    }

    public String toString() {
        String result = "\nit";
        if (top == null) return result;

        while(top.next != null) {
            result = result + Integer.toString(top.data) + "\n|\n";
            top = top.next;
        }
        result += Integer.toString(top.data);
        return result;
    }
    
}