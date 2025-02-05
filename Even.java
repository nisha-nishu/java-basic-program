import java.util.Scanner;
class Even{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("enter a number:");
int a=sc.nextInt();j-                                                          
int count=0;
while(a>0){
int digit=a%10;
if(digit%2==0){
count+=1;
}
a=a/10;
}
System.out.println(count);
}}