import java.util.ArrayList;
import java.util.Arrays;

public class moveZero {
    public static void main(String[] args) {
        int[] arr={0,1,0,3,12};
        System.out.println("Answer1: "+Arrays.toString(bruteMove(arr)));
        System.out.println("Answer2: "+Arrays.toString(optimalMove(arr)));
        
        
    }
    public static int[] bruteMove(int[] arr){
        ArrayList<Integer> arr1=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr1.add(arr[i]);
            }
        }
        int no=arr1.size();
        for(int i=0;i<no;i++){
            arr[i]=arr1.get(i);
        }
        for(int i=no;i<arr.length;i++){
            arr[i]=0;
        }
        return arr;
    }
    public static int[] optimalMove(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==0){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }
        return arr;
    }
    
}
