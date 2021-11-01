package personaldays10;

public class sudoku07 {

	public static void main(String[] argrs) {
		/**/
		// https://www.youtube.com/watch?v=snXeDcTMkfU&ab_channel=AbhishekKumar
		// https://github.com/abhishek5492/Suduko.git
		// solve sudoku
		//
		int [][] matrix = new int [][] 
			{
				{0, 0, 0, 0, 0, 9, 8, 0 ,1},
				{0, 8, 0, 4, 0, 0, 0, 0 ,0},
				{6, 0, 0, 0, 0, 3, 0, 0 ,0},
				{5, 6, 2, 0, 0, 0, 0, 0 ,0},
				{0, 0, 3, 0, 0, 0, 0, 9 ,4},
				{0, 0, 4, 0, 0, 0, 0, 0 ,7},
				{0, 0, 0, 0, 0, 0, 0, 5 ,0},
				{0, 3, 0, 0, 6, 0, 0, 2 ,0},
				{0, 0, 0, 5, 2, 0, 4, 0 ,0},					
			};
		if(SolveSudoku(matrix, 9)) {
			for(int i = 0; i < 9; i++) {
				for(int j = 0; j < 9; j++) {
					System.out.print(matrix[i][j]);
				}
				System.out.println();
			}
		}
		/*
		247659831
		389412675
		651873942
		562947318
		713286594
		894135267
		128394756
		435768129
		976521483
		 */
				
			

	}
	
	public static boolean SolveSudoku(int [][] matrix, int n) {
		int rowIndex = -1;
		int columnIndex = -1;
		int i = 0;
		int j = 0;
		
		for (i = 0; i < n; i++) {
			for(j = 0; j < n; j++) {
				if(matrix[i][j] == 0) {
					rowIndex = i;
					columnIndex = j;
					break;
				}
			}
			if(rowIndex != -1) {
				break;
			}
		}
		if(i == n && j == n	) {
			return true;
		}
		else {
			for(int value = 1; value < 10; value++) {
				if(IsSafe(matrix, value, rowIndex, columnIndex, n)) {
					matrix[rowIndex][columnIndex] = value;
					if(!SolveSudoku(matrix, n)) {
						matrix[rowIndex][columnIndex] = 0;
					}
					else {
						return true;
					}
				}
			}
			return false;
		}
	}
	
	public static boolean IsSafe(int [][] matrix, int value, int rowIndex, int columnIndex, int n) {
		// row check
		for(int j = 0; j < 9; j++) {
			if(matrix[rowIndex][j] == value){
				return false;
			}
		}
		
		// column check
		for(int i = 0; i < 9; i++) {
			if(matrix[i][columnIndex] == value){
				return false;
			}
		}
		
		// submatrix check
		int baseRowIndex = rowIndex - (rowIndex % 3);
		int baseColumnIndex = columnIndex - (columnIndex % 3);
		for(int i = baseRowIndex; i < baseRowIndex + 3; i++) {
			for(int j = baseColumnIndex; j < baseColumnIndex + 3; j++) {
				if(matrix[i][j] == value) {
					return false;
				}
			}
		}
		return true;
		
	}

}
