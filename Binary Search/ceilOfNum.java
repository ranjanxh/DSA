public class ceilOfNum {
    public static void main(String[] args) {
        int[] arr1={ 1,2,5,8,11,15,20};
        int target=6;
        int res=ceilNum(arr1, target);
        System.out.println(res);
        
    }
    public static int ceilNum(int[] num, int target){
        int start=0;
        int end=num.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(num[mid]==target){
                return mid;
            }
            else if(num[mid]>target){
                end=mid-1;
            }
            else{
                start=mid+1;;
            }
        }
        return start;
    }
    
}
