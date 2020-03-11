package project_euler;

public class q12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int n=0;
	boolean flag=true;
	int i=1;
	int c=0;
while(c<498) {
	c=0;
	 n=n+i;
	for(int j=2;j<n;j++) {
		if (n%j==0)
			c++;
	}    
	i++;
}	
	
System.out.println(n+" having "+c);	}
	}

	
	

