
import java.util.*;
public class Student
{
    String usn,name;
    int credits[]=new int[10];
    int marks[]=new int[10];
    void initialise(String usn,String name)
    {
        this.usn=usn;
        this.name=name;
    }
    void display()
    {
        System.out.println("Student name :"+this.name);
        System.out.println("student USN :"+this.usn);
        
    }
    void calculate(int cred[],int m[])
{
double sgpa;
double sum=0.0;
credits=cred;
marks=m;
int t_cred=0;
for(int i=0;i<7;i++)
{
t_cred=cred[i];
if(marks[i]>90 && marks[i]<=100)
sum=sum+credits[i]*10;

if(marks[i]>=80 && marks[i]<=89)
sum=sum+credits[i]*9; 

if(marks[i]>=70 && marks[i]<79)
sum=sum+credits[i]*8;

if(marks[i]>=60 && marks[i]<=69)
sum=sum+credits[i]*7;

if(marks[i]>=55 && marks[i]<=59)
sum=sum+credits[i]*6;

if(marks[i]>=50 && marks[i]<=54)
sum=sum+credits[i]*5;
if(marks[i]>=40 && marks[i]<=49)
sum=sum+credits[i]*4;

if(marks[i]>=0 && marks[i]<=39)
{
sum=sum+credits[i]*0;
}
System.out.println("Total credits:"+t_cred);
sgpa=sum/t_cred;
System.out.println("SGPA:"+sgpa);
}
}
}
public class MainStudent
{

public static void main(String args[])
{
int cred[]=new int[7];
int m[]=new int[7];
Scanner sc=new Scanner(System.in);
System.out.println("Enter your name:");
String u=sc.nextLine();
System.out.println("Enter your USN:");
String u=sc.nextLine();
System.out.println("Physics"+"Evi"+"BEE"+"ECM"+"IDT"+"Maths"+"English");
System.out.println("enter the credits:");
for(int i=0;i<7;i++)
{
cred[i]=sc.nextInt();
}
System.out.println("enter the marks:");
for(int i=0;i<7;i++)
{
m[i]=sc.nextInt();
}
MainStudent st=new MainStudent();
st.initialise(u,n);
st.display();
st.calculate(cred,m);
}
}