import java.util.Scanner;
class armstrongCheck{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number:");
int num=sc.nextInt();
int original=num;
int sum=0;
int digits=String.valueOf(num).length();
while(num>0){
int digit=num%10;
sum+=Math.pow(digit,digits);
num=num/10;
}
if(sum==original){
System.out.println(original+" is an armstrong number");
}
else{
System.out.println(original+" is not an armstrong number");
}
}
}
