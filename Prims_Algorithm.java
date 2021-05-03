package Lab;

public class Prims_Algorithm {
	public static int[] prim(int[][] arr) {

		int[] tv = { 4, 0, 0, 0, 0 };

		int tvc = 0;

		int v = 0; 
		
		int v1 = 0;

		for (int m = 1; m < 5; m++) {
			int min = 100;
			for (int j = 0; j < tvc; j++) {
				for (int i = 0; i < 5; i++) {
					if (min > arr[tv[j]][i]) {
						v = i;
						v1 = tv[j];
						min = arr[tv[j]][i];
					}
				}
			}
			tvc++;
			tv[tvc] = v;
			arr[v][v1] = arr[v1][v] = 100;
		}

		return tv;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] graph = { { 100, 9, 5, 2, 100 }, { 8, 100, 100, 6, 7 }, { 100, 3, 100, 100, 4 }, { 11, 12, 100, 100, 15 },
				{ 100, 69, 13, 16, 100 } };

		int arr[] = prim(graph);

		for (int i : arr) {
			System.out.println(i);
		}

	}

}

