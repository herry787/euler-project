package project_euler;
import java.util.Scanner;
public class q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int sum1=0;
int sum2=0;
int diff;
for(int i=0;i<=100;i++) {
sum1=sum1+i;

}
for (int i=0;i<=100;i++) {
sum2=sum2+i*i;	
}
diff=sum1*sum1-sum2;
System.out.println("the diffrence is equle to = "+diff);
	}

}
