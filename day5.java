public class day5 {
    /*
    * 反转字符串里的单词Reverse Words in a String
    * 输入: "the sky is blue"
      输出: "blue is sky the"
    * 难点：第一版思路的时间复杂度太大（分离出每个单词然后反向+操作）
    * 思路有待改进
    *
    * */
    public String reverseString(String s){
        if(s.isEmpty()) return "";

        char[] chars = s.toCharArray();
        int i = 0;
        s = "";
        while (i<chars.length){
            String temp = "";
            while (i<chars.length&&chars[i]!=' '){
                temp = temp +chars[i];
                i++;
            }
            if(temp!="") {
                s = temp + " " + s;
            }
            i++;
        }

        if(s=="") return s;
        return s.substring(0, s.length()-1).trim();
    }
}
