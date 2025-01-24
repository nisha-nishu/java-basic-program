import java.util.Scanner;
class Digit{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("enter a number:");
int count=0;
int a=sc.nextInt();
while(a!=0){
int digit=a%10;
System.out.println(digit);
count++;
a=a/10;
}
System.out.println("total"+count);
}}


