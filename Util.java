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


    public static LinkedList addTwoNumbers(LinkedList l1, LinkedList l2) {
        LinkedList result = new LinkedList();
        return result;

    }

}