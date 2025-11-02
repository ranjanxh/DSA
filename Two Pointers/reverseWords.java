public class reverseWords {
  public static void main(String[] args) {
    String s="  The sky  is Blue";
    String answer=reverseWS(s);
    System.out.println(answer);
    
  }
  public static String reverseWS(String s){
    String[] words=s.trim().split(" ");
    StringBuilder sb=new StringBuilder();
    for(int i=words.length-1;i>=0;i--){
      if(words[i].length()!=0){
        sb.append(words[i]);
        sb.append(" ");
      }
    }
    return sb.substring(0,sb.length()-1).toString();
  }
  
  
}
