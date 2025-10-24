public class hashing{
    public static void main(String[] args){
        int[] arr={5,1,2,3,4,1,2,3,4,4,3,2,1};
        int search=2;
        int answer=linearHashing(arr, search);
        int answer2=realHashing(arr, search);
        System.out.printf("%d,%d",answer,answer2);
    }
    public static int linearHashing(int[] arr, int x){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                count++;
            }
        }
        return count;
    }
    public static int maxElement(int[] arr){
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public static int realHashing(int[] arr, int target){
        int max=maxElement(arr);
        int[] hash=new int[max+1];
        //hash={0};
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                arr[i]+=1;

            }
        }
        return arr[target];
    }
}