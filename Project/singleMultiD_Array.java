package Project;

public class singleMultiD_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creating single and multi dimensional array
		//1-D single dimensional array
		int [] marks= new int[5];  
		marks[0]=88;
		marks[1]=73;		
		marks[2]=60;	
		marks[3]=87;
		marks[4]=67;
		
		//using for loop to display 1-D array
		for(int i=0;i<=marks.length-1;i++) {
			System.out.print(marks[i]);
			System.out.print("  ");
		}
		System.out.println("\n");
		
		
		
		
		//Multi-Dimensional 2-D array
		
		int [][] flats= new int[2][3];
		flats[0][0]=100;
		flats[0][1]=101;
		flats[0][2]=102;
		flats[1][0]=201;
		flats[1][1]=202;
		flats[1][2]=203;
		
		//using for loop to display 2-D array

		for(int i=0;i<=flats.length;i++) {  
			for(int j=0;j<flats[i].length;j++) {
				System.out.print(flats[i][j]);
				System.out.print(" ");
			}
			System.out.println("");
		}

		

	}

}
