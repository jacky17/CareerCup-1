package onedot7;

import java.util.ArrayList;

public class SetZero {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		int[][]matrix ={{0,1,2,3},{4,0,5,6},{7,8,0,0}};
		int N = matrix.length;
		int M = matrix[0].length;
		for(int i = 0; i < N; i++)
			for (int j = 0; j < M; j++){
				if(arr.contains(j)){
					continue;
				}
				if(matrix[i][j] == 0){
					arr.add(j);
					set(matrix,i,j);
					break;
				}
			}	
		for(int p = 0; p < N;p++)
			for(int q = 0; q < M; q++){
				System.out.println(matrix[p][q]);
			}
	}

	public static void set(int matrix[][], int i, int j){
		int N = matrix.length;
		int M = matrix[0].length;
		for(int k = 0; k < M; k++){
			matrix[i][k] = 0;
		}
		for (int p = 0 ; p < N ; p++){
			matrix[p][j] = 0;
		}
	}

}
