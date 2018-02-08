
public class Multidimensionalexamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		int a[][]=new int [2][3];
		a[0][0]=5;
		a[0][1]=2;
		a[0][2]=3;
		a[1][0]=7;
		a[1][1]=8;
		a[1][2]=1;
		//System.out.println(a[1][1]);
		
		int b[][]= {{5,2,3},{7,8,1},{7,2,0}};
		int max=b[0][0];
		//System.out.println(b[2][2]);
		/*for (int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				System.out.println(a[i][j]);
			}
		}*/
		
	for (int i=0;i<3;i++) {
		for(int j=0;j<3;j++) {
			//System.out.println(b[i][j]);
			if(b[i][j]>max) {
				max=b[i][j];
				
			}
			
		}
	}
	
	System.out.println(max);

	}

}
