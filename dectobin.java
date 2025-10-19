public class dectobin {
    public static void main(String[] args) {
        int dec=11;
        int bin=0;
        int pow=1;

        while(dec!=0){
            int temp=dec%2;
            bin+=pow*temp;
            dec/=2;
            pow=pow*10;;
        }
        System.out.println(bin);

    }
    
}
