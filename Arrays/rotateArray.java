import java.util.Arrays;

public class rotateArray{
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};

        //int[] newARR=bruteRotate(arr,3);
        //System.out.println(Arrays.toString(newARR));
        int[] answer2=optimalRotateLeft(arr, 4);
        System.out.println(Arrays.toString(answer2));
        
    }
    public static int[] bruteRotate(int[] arr, int N){
        int n=arr.length;
        N=N%n;
        int[] temp=new int[N];
        for(int i=0;i<N;i++){
            temp[i]=arr[i];
        }
        for(int j=N;j<n;j++){
            arr[j-N]=arr[j];
        }
        for(int k=n-N;k<n;k++){
            arr[k]=temp[k-n+N];
        }
        return arr;

    }
    public static int[] optimalRotateLeft(int[] arr, int N){
        int n=arr.length;
        reverse(arr, 0, N-1);
        reverse(arr, N, n-1);
        reverse(arr, 0, n-1);
        return arr;


    }
    public static void reverse(int[] arr, int start, int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
}
