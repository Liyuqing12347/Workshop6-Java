public class Exercise7 {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(n + " 的阶乘：" + factorial(n));
    }
    public static int factorial(int num){
        if(num <= 1){
            return 1;
        }
        return num * factorial(num - 1);
    }
}
