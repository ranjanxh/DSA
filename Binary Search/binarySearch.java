public class binarySearch{
    public static void main(String[] args) {
        int[] number={1,2,3,4,5,6,7,8,9};
        int target=5;
        int result=binary(number, target);
        System.out.println(result);
        
    }
    public static int binary(int[] number, int target){
        int start=0;
        int end=number.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target>number[mid]){
                start=mid+1;
            }
            else if(target<number[mid]){
                end=mid-1;
            }
            else{
                return mid;
            }
            

        }
        return -1;

    }
}