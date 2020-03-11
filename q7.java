package project_euler;
import java.util.Scanner;
public class q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int s=0;
int l=0;
int c=0;
while(s<=6){
for(int i=1;;i++) {
	c=0;
	int j=1;
	while(j<=i) {
		if(i%j==0) { 
		c++;}
		j++;}
	if(c==2) {
		s++;
		l=i;}
	
	}}
System.out.println(l);
	}}
		
	