
public class Mincolumn {

	public static void main(String[] args) {
		
		int c[][]= {{5,2,3},{7,8,1},{7,2,0}};
		
		//finding min value in the array c
		int min = c[0][0];
	int mincolumn = 0;
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(c[i][j]<min) {
					min=c[i][j];
					//finding the column where the minimum value is located
				  mincolumn = j;
				}
			}
		}
System.out.println("The minimum number in the array c is " +min);
		System.out.println("The index of the column where the minimum number is located is " +mincolumn);
		
	//finding out maximum number in the found out column
		int max=c[0][mincolumn];
		int k=0;
		while(k<3) {
			if(c[k][mincolumn]>max) {
				max=c[k][mincolumn];
			}
			k++; 
		}
	System.out.println("The maximum number in the column is "+max); 
	}

}
