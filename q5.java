package project_euler;
import java.util.Scanner;
public class q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c=0;
		int n=1;
while(c<20) {
	c=0;
	
	for(int i=1;i<=20;i++) {
		if(n%i==0) {
			c++;
		}
		else {
			n++;
		}
		}
	}
System.out.println("number is "+n);
	
}

	
}



