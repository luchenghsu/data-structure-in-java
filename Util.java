class Util {
    

    //remove the duplicate characters
    public static String removeDuplicates(char[] str) {
        if (str == null) return null;
        int len = str.length;
        if (len < 2) return str.toString();

        int tail = 1;

        for (int i = 1; i < len; ++i) {
            int j;
            for (j = 0; j < tail; ++j) {
                if (str[i] == str[j]) break;
            }
            if (j == tail) {
                str[tail] = str[i];
                ++tail;
            }

        }
        return new String(str).substring(0, tail); 
    }

    /*
       Input (3->1->5), (5->9->2)
       Output: 8->0->8
    */
    public static LinkedList addTwoNumbers(LinkedList l1, LinkedList l2) {
        
        if(l1 == null && l2 == null)
            return null;

        LinkedList result = new LinkedList();
        Node t1 = l1.header;
        Node t2 = l2.header;
        
        int carry = 0; 
        while(t1 != null || t2 != null) {
             
             int value = carry;
             
             if(t1 != null)
                value += t1.data;

             if(t2 != null)
                value += t2.data; 

             if (value >= 10) {
                value %= 10;
                carry = 1;
             } else {
                carry = 0;
             }

             Node elem = new Node(value);
             result.append(value);
             
             if (t1 != null)
               t1 = t1.next;
             
             if (t2 != null)
               t2 = t2.next;

               
        }        

        return result;

    }

}