import java.util.Scanner;
class Weekdays{
public static void main(String[] args){
System.out.println("enter a number:");
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
if(a>=1 && a<=7){
while(a<=7){
if(a==1){
System.out.println("Monday");
}
else if(a==2){
System.out.println("Tuesday");
}
else if(a==3){
System.out.println("Wednesday");
}
else if(a==4){
System.out.println("Thursday");
}
else if(a==5){
System.out.println("Friday");
}
else if(a==6){
System.out.println("Saturday");
}
else if(a==7){
System.out.println("Sunday");
}
break;
}
}else{
System.out.println("error");
}
sc.close();
}}




