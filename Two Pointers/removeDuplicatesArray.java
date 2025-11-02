import java.util.Arrays;

public class removeDuplicatesArray {
  public static void main(String[] args) {
    int[] arr1={0,0,1,1,1,2,2,3,3,4,4};
    removeDup(arr1);
    
  }
  public static void removeDup(int[] arr){
    int i=0;
    for(int j=1;j<arr.length;j++){
      if(arr[i]!=arr[j]){
        i++;
        arr[i]=arr[j];
      }
    }
    System.out.println("No. of unique elements: "+(i+1));
    System.out.println(Arrays.toString(arr));
  }
  
}
