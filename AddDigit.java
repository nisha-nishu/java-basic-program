import java.util.Scanner;
class AddDigit{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("enter a number:");
int a=sc.nextInt();
int sum=0;
do{
int digit=a%10;
a/=10;
sum+=digit;
}
while(a>0);
System.out.println(sum);
}}
