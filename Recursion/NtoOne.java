

public class NtoOne {
  public static void main(String[] args) {
    revCount(10);
    
  }
  public static void revCount(int N){
    if(N==1){
      return;
    }
    System.err.println(N);
    revCount(N-1);
    
  }
  
}
