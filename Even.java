import java.util.Scanner;
class EvenOrOdd{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("enter your number:");
int a=sc.nextInt();
if(a%2==0){
if(a<0){
a*=-1;
System.out.println("even");
}
}
else{
System.out.println("odd");
}
sc.close();
}
}

