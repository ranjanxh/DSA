public class bintodec {
    public static void main(String[] args) {
        int bin=1011;
        int dec=0;
        int power=1;
        while(bin!=0){
            dec=(bin%10*power)+dec;
            bin/=10;
            power*=2;
        }
        System.out.println(dec);
    }
    
}
