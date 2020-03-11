package project_euler;
public class Q10 {

	public static void main(String[] args) {
int i=5;
int sum=6;
int c=3;
while(c<=10) {
	for(int z=3;z<i;z=z+2) {
		if(i%z==0) {
			break;
		}
	}
	i++;
}
System.out.println("the sum of prime beloew is"+sum);
	}}

//chek it out for 10 bcoz the system hangs in 2 million calcalution





	
