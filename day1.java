public class day1 {

    public static int strStr(String haystack, String needle) {
        if (haystack == null || needle == null) {
            return -1;
        }
        int i = 0;
        int j = 0;
        int res = -1;
        for (; i < haystack.length() && j < needle.length(); ++i) {
            if (haystack.charAt(i) == needle.charAt(j)) {
                j++;
                if (j == needle.length() - 1 && haystack.charAt(++i) == needle.charAt(j)) {
                    res = i - needle.length() + 1;
                    break;
                }
            } else {
                j = 0;
            }

        }
        if(j==needle.length()-1) {
            return i - needle.length() + 1;

        }

        return res;
    }

    public static void main(String args[]){
        System.out.println(strStr("testdsBfhgs", "sgf" ));
    }

}
