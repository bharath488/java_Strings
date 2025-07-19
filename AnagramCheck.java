import java.util.*;
class main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the String 1:");
    String str1=sc.nextLine();
    System.out.println("Enter the String 2:");
    String str2=sc.nextLine();

    str1=str1.replaceAll("//s","").toLowerCase();
    str2=str2.replaceAll("//s","").toLowerCase();

  if(str1.length()!=str2.length()){
    System.out.println("string is not an anagram");
  }
    char[] c1=str1.toCharArray();
    char[] c2=str2.toCharArray();

    Arrays.sort(c1);
    Arrays.sort(c2);
    if(Arrays.equals(c1,c2)){
      System.out.println("Strings are Anagrams");
    }else{
      System.out.println("String is not an anagram");
    }
  }
}
