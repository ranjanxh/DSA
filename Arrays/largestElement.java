

public class largestElement{
    public static void main(String[] args){
        int[] arr={85,22,45,75,87};
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>arr[max]){
                max=i;
            }
        }
        System.out.println(arr[max]);
    }
}