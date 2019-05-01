import java.util.Arrays;


public class DFS {

	private static final int WHITE = 0;
	private static final int GREY = 1;
	private static final int BLACK = 2;

	static int[] color = new int[7];
	static int[][] graf = new int[][] { { 0, 1, 1, 0, 0, 0, 0 },
										{ 1, 0, 1, 0, 0, 0, 1 },
										{ 1, 1, 0, 1, 1, 0, 0 },
										{ 0, 0, 1, 0, 1, 1, 0 }, 
										{ 0, 0, 1, 1, 0, 0, 0 }, 
										{ 0, 0, 0, 1, 0, 0, 0 },
										{ 0, 1, 0, 0, 0, 0, 0 } };

	public static void main(String[] args) {
		dfs(0);
		System.out.println(Arrays.toString(color));
	}

	public static void dfs(int i) {
		DFS.color[i] = GREY;
		for (int j = 0; j<7; j++) {
			if (color[j] == WHITE && graf[i][j] == 1) {
				dfs(j);
			}
		
	}
	color[i] = BLACK;
}
}