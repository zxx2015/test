public class day4 {

    /*
    * (验证回文串)Valid Palindrome
    *给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
    *https://github.com/gzc426/leetcode/blob/master/2018.11.27-leetcode125/Be%20a%20fresh%20man.md
    * 难点：跳跃非字母和数字的无效字符
    *
    * */
    public boolean isPalindrome(String s){
     char[] chars = s.toLowerCase().trim().toCharArray();

     int l =0 , r = chars.length-1;


     while (l<r){

         while(l<r&&!(chars[l]>='0'&&chars[l]<='9'||chars[l]>='a'&&chars[l]<='z')){
             l++;
         }
         while(r>l&&!(chars[r]>='0'&&chars[r]<='9'||chars[r]>='a'&&chars[r]<='z')){
             r--;
         }

         if(chars[l] == chars[r] ){
             l++;
             r--;
             continue;
         }else {
             return false;
         }

     }

        return true;
    }
}
