public class Exercise10 {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        int target = 30;
        int index = search(arr, target);
        if(index == -1){
            System.out.println("未找到");
        }else{
            System.out.println(target + " 下标：" + index);
        }
    }
    public static int search(int[] a, int t){
        for(int i = 0; i < a.length; i++){
            if(a[i] == t){
                return i;
            }
        }
        return -1;
    }
}
