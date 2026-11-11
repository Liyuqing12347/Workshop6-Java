public class Exercise4 {
    public static void main(String[] args) {
        int[] arr = {12, 45, 7, 89, 23, 56};
        int max = arr[0];
        int min = arr[0];
        int sum = 0;

        for(int num : arr){
            if(num > max) max = num;
            if(num < min) min = num;
            sum += num;
        }
        double avg = (double) sum / arr.length;
        System.out.println("最大值：" + max);
        System.out.println("最小值：" + min);
        System.out.println("平均值：" + avg);
    }
}
