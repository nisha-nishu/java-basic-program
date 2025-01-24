import java.util.Scanner;
class Group{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.print("enter your age:");
int a=sc.nextInt();
if(a>=0 && a<=12){
System.out.println("you are a child");
}
else if(a>=13 && a<=19){
System.out.println("your are a teenager");
}
else if(a>=20 && a<=64){
System.out.println("you are a Adult");
}
else{
System.out.println("senior");
}
}
}