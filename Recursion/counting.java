

public class counting {
  public static void main(String[] args) {
    count(1, 10);
    
  }
  public static void count(int current, int N){
    if(current>N){
      return;
    }
    System.out.println(current);
    count(current+1, N);
  }
  
}
