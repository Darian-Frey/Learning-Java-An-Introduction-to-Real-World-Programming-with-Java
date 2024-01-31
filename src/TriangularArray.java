public class TriangularArray {
    public static void main(String[] args) {

        int[][] triangle = new int[5][];
        for (int i = 0; i < triangle.length; i++) {
            triangle[i] = new int[i + 1];
            for (int j = 0; j < i + 1; j++) {
                triangle[i][j] = i + j;
                System.out.println(triangle[i][j]);
            }
        }
    }
}
