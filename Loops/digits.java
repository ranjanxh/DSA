import java.util.*;
public class digits{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int x=s.nextInt();
        int digits=0;
        while(x!=0){
            digits++;
            x=x/10;
        }
        System.out.println(digits);
    }
}