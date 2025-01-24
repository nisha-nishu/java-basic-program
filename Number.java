import java.util.Scanner;
class Number{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.print("enter a number:");
int a=sc.nextInt();
if(a<=1){
System.out.println("it's a prime number");
}
else{
boolean isprime=true;
for(int i=2;i<a;i++){
if(a%i==0){
isprime=false;
break;
}}
if(isprime){
System.out.println("it's a prime number");
}
else{
System.out.println("it's not a prime number");
}}
sc.close();
}}