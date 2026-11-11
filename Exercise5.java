public class Exercise5 {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(n + " 的斐波那契数列：");
        int a = 1, b = 1;
        for(int i = 1; i <= n; i++){
            System.out.print(a + " ");
            int temp = a + b;
            a = b;
            b = temp;
        }
    }
}
