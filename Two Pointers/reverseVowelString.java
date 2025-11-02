public class reverseVowelString{
  public static void main(String[] args) {
    String s="Hello";
    String result=reverseVowels(s);
    System.err.println(result);
    
  }
  public static String reverseVowels(String s){
    int i=0;
    int j=s.length()-1;
    char[] chars=s.toCharArray();
    while(i<j){
      if(!isVowel(chars[i])){
        i++;
      }
      else if(!isVowel(chars[j])){
        j--;
      }
      else{
        char temp=chars[i];
        chars[i]=chars[j];
        chars[j]=temp;
        i++;
        j--;
      }
    }
    return new String(chars);
  }
  public static boolean isVowel(char ch){
    return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
  }
}
  