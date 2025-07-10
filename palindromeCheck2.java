import java.util.Scanner;
class palindromeCheck2{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter a String:");
String original=sc.nextLine();
StringBuilder sb=new StringBuilder(original);
String reversed=sb.reverse().toString();
if(original.equals(reversed)){
System.out.println(original+" is a palindrome");
}
else{
System.out.println(reversed+" is not a palindrome");
}
}
}
