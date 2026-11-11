public class Exercise9 {
    public static void main(String[] args) {
        String str = "abccba";
        if(isPalindrome(str)){
            System.out.println(str + " 是回文字符串");
        }else{
            System.out.println(str + " 不是回文字符串");
        }
    }
    public static boolean isPalindrome(String s){
        int left = 0;
        int right = s.length()-1;
        while(left < right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

