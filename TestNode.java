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

        //Test addTwoNumbers
        LinkedList l1 = new LinkedList();
        LinkedList l2 = new LinkedList();
       
        l1.append(3);
        l1.append(1);
        l1.append(5);
        System.out.println("L1:"+l1);

        l2.append(5);
        l2.append(9);
        l2.append(2);
        System.out.println("L2:"+l2);

    }
}