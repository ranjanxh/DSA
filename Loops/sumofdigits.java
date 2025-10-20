public class sumofdigits {
    public static void main(String[] args) {
        int number=123456;
        int sum=0;
        int x=number;
        while(x!=0){
            int temp=x%10;
            sum=sum+temp;
            x=x/10;
        }
        System.out.println(sum);
    }
    
}
