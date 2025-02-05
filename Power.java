import java.util.Scanner;
class Power{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("enter a number:");
int a=sc.nextInt();
System.out.println("enter the power value:");
int b=sc.nextInt();
int result=1;
for(int i=1;i<=b;i++){
result*=a;
}
System.out.println(result);
}}
