public class maxOnes{
    public static void main(String[] args) {
        int[] arr={1,1,0,1,1,1,0,1,1};
        int answer1=bruteMaxOnes(arr);
        System.out.println(answer1);
        
    }
    public static int bruteMaxOnes(int[] arr){
        int max=0;
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                count++;
                if(count > max){
                max = count;
            }
            }
            else if(arr[i]!=1){
                count=0;
            }
        }
        return max;
    }
}