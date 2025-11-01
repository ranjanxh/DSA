public class floorOfNum{
    public static void main(String[] args) {
        int[] arr1={2,3,5,9,14,16,18};
        int target=15;
        int answer=floorNum(arr1, target);
        System.out.println(answer);


    }
    public static int floorNum(int[] num, int target){
        int start=0;
        int end=num.length-1;
        int res=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(num[mid]==target){
                return mid;
            }
            else if(target<num[mid]){
                end=mid-1;
            }
            else{
                res=mid;
                start=mid+1;
            }
        }
        return res;
    }
}