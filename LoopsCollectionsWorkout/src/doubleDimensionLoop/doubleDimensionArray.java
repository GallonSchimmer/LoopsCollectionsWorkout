package doubleDimensionLoop;

public class doubleDimensionArray {
	
	public static void main(String[] args) {
	
	int[][] doubleDimArray = { { 3,4,5 }, {6,7,8} };
	
	
	System.out.println("doubleDimArray[1][1]: " + doubleDimArray[1][1]);
	System.out.println();
	
	for (int i = 0; i < doubleDimArray.length; i++) {
		
		//System.out.println("doubleDimArray[i] " + doubleDimArray[i] + " i: " + i);
		
		for (int j = 0; j < doubleDimArray[i].length; j++) {
			
			System.out.println("\ndoubleDimArray[i][j] : " + doubleDimArray[i][j] + " when j: " + j + " then i: " + i);
		}
	}
	
		
	}

}
