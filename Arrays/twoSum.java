import java.util.HashMap;

public class twoSum {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        int target=10;
        int[] answer1=twoSumBrute(arr, target);
        //System.out.println("Indices: [" + answer1[0] + ", " + answer1[1] + "]");
        int[] answer2=twoSumHash(arr, target);
        //System.out.println("Indices: [" + answer2[0] + ", " + answer2[1] + "]");
        int[] answer3=twoSumTwoPointer(arr, target);
        
        System.out.println("Indices: [" + answer3[0] + ", " + answer3[1] + "]");

    }
    public static int[] twoSumBrute(int[] arr,int target){
        int[] answer={-1,-1};
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==target){
                    answer[0]=i;
                    answer[1]=j;
                }
            }
        }
        return answer;
    }
    public static int[] twoSumHash(int[] arr, int target){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int complement=target-arr[i];
            if(map.containsKey(complement)){
                return new int[]{map.get(complement),i};
            }
            map.put(arr[i],i);
        }
        return new int[]{-1,-1};
    }
    public static int[] twoSumTwoPointer(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        int[] answer={-1,-1};
        while(start<=end){
            int sum=arr[start]+arr[end];
            if(sum<target){
                start++;
            }
            else if(sum>target){
                end--;
            }
            else{
                answer[0]=start;
                answer[1]=end;
            }
        }
        return answer;
    }
}
