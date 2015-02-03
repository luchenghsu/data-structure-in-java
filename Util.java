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

    public static String removeDuplicatesEff(char[] str) {
        return "";
    }

    public static boolean isUniqueChars(String s) {
        return true;
    }    

    public static boolean isUniqueChars2(String s) {
        return true;
    }

    public static boolean anagram(String s1, String s2) {
        return true;
    }

    public static void ReplaceFun(char[] str, int length) {

    }

    public static String reverseWords(String s) {
        return ""; 
    }

    public static boolean isSubstring(String s1, String s2) {
        return true;
    }

    //"waterbottle" is a rotation of "erbottlewat"
    public static boolean isRotation(String s1, String s2) {
        
        return true;
    }

    public static void rotate(int[][] matrix, int n) {

    }

    public static void setZeros(int[][] matrix) {
        
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

    public static Node nthToLast(LinkedList l, int n) {
        if (l == null || n < 1) return null;

        Node p1 = l.header;
        Node p2 = l.header;

        for (int j = 0; j < n-1; ++j) {
            if (p2 == null) return null;

            p2 = p2.next;
        }

        while(p2.next != null) {
            p1 = p1.next;
            p2 = p2.next;
        }

        return p1;
    }

    
    

}