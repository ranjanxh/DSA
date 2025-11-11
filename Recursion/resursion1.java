public class resursion1{
  public static void main(String[] args) {
    int fact=factorialRecursion(5);
    System.out.println(fact);
    
  }
  public static int factorialRecursion(int x){
    if(x==0||x==1){
      return 1;
    }
    return x*factorialRecursion(x-1);
  }
}