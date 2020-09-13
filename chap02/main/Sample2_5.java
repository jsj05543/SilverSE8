package main;

class Sample2_5 {
	public static void main(String[] args) {
		/*
		int[][] array = new int[3][];
		array[0] = new int[3];
		array[1] = new int[5];
		array[2] = new int[2];
		*/
		//int[] array2 = new int{0};
		
		//int[][] array1 = new int[0][5];
		//array1[0][9]=4;
		int[][] array = new int[][]{
				{ 10, 20, 30 },
				{ 50, 60, 70, 80, 90 },
				{ 100, 200 }
		};
		array[1][0]=900;
		System.out.println("array[0][0]�̒l : " + array[1][0]);
		System.out.println("array[0][0]�̒l : " + array[1][1]);
		System.out.println("array[0][0]�̒l : " + array[1][2]);
		System.out.println("array[0][0]�̒l : " + array[1][3]);
	}
}
