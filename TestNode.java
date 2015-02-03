class TestNode {
    public static void main (String[] args) {
        LinkedList n = new LinkedList();
        n.append(3);
        n.append(2);
        n.append(1);
        n.append(2);
        n.append(2);
        //n.traverse();

        n.reverse();
        //n.traverse();

        //n.deleteNode(2);
        n.deleteDups2();
        //n.traverse();
        
        n.prepend(0);
        n.insertElement(1, 4);
        n.deleteNode(0);
        //System.out.println("n:"+ n);

        //Test addTwoNumbers
        LinkedList l1 = new LinkedList();
        LinkedList l2 = new LinkedList();
       
        l1.append(3);
        l1.append(1);
        l1.append(5);
        //System.out.println("L1:"+l1);

        l2.append(5);
        l2.append(9);
        l2.append(2);
        l2.append(1);
        //System.out.println("L2:"+l2);

        LinkedList result = Util.addTwoNumbers(l1, l2);
        //System.out.println("result="+result);

        LinkedList t1 = new LinkedList();
        //System.out.println("t1="+t1);

        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.pop();
        //System.out.println("Stack s="+s);

        Queue q = new Queue();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.dequeue();
        System.out.println("Queue q="+q);

    }
}