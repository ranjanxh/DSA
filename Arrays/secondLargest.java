

public class secondLargest {
    public static void main(String[] args) {
        int[] arr={77,52,85,745,965,1,235};
        int max=arr[0];
        int secondMax=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                secondMax=max;
                max=arr[i];
            }
            else if(arr[i]<max && arr[i]>secondMax){
                secondMax=arr[i];
            }
        }
        System.out.println("Largest value is:"+max);
        System.out.println("second largest is:" +secondMax);
    }
    
}
