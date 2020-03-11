package project_euler;

public class q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=0;
int b=1;
int c=0;
int sum=0;
do
{
	 c=a+b;
	 
	 a=b;
	 b=c;
if(c%2==0)
	sum=sum+c;
	
}
while(c<=4000000);
System.out.println("the sum of no. are= "+sum);

	}

}
