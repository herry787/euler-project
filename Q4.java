package project_euler;
import java.util.Scanner;
public class Q4 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a=0;
	int r=0;
	int l=0;
	int rev =0;
	int b;
for(int i=100;i<=999;i++)
{
	
for(int j=100;j<=999;j++) 
{
	 rev=0;
	a=i*j;
	b=a;
    
    while(a!=0) {
	 r=a%10;
	rev=rev*10+r;
	a=a/10;
      }
    
  if(b==rev)
  {
	if(b>l) {
		l=b;
	}	
	}
  
}
}
System.out.println(l);
		
	}
	}


