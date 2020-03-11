package project_euler;

public class q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
for(int i=200;i<=1000;i++) {
	for(int j=200;j<=1000;j++) {
		for(int k=200;k<=1000;k++) {
			
	if (i+j+k==1000) {
		if((i*i)+(j*j)==(k*k)) {
			System.out.println("product is  "+i*j*k);}
		break;
		
		}
	}
			
			
		}
	
	}
}
	

}
