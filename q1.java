package project_euler;
import java.util.Scanner;
public class q1 {

	public static void main(String[] args) {
Scanner sc =new Scanner(System.in);
int sum=0;
int l=1000;
for(int i=0;i<l;i++) {
if (i%3==0||i%5==0)	
	sum=sum+i;}
System.out.println("the summation of no.multiples of 3 and 5 under 1000 is = "+sum);}}
