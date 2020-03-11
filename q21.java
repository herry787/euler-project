package project_euler;
import java.util.Scanner;
public class q21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
long s=1l;
long t=0;
int n=100;
while(n>0) {
s=s*n;
n=n-1;}
System.out.println("the factorial of 10  is equle to = "+s);

while(s>=0) {
long r=s%10;
t=t+r;
s=s/10;	
}
System.out.println("the summation is "+t);
}}
