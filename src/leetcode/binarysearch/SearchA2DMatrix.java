package leetcode.binarysearch;

/**
 * @author bumblebee
 * 74. Search a 2D Matrix
 *
 * https://leetcode.com/problems/search-a-2d-matrix/
 */
public class SearchA2DMatrix {

    public static void main(String[] args) {
        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        System.out.println(searchMatrix(matrix, 3));
    }

    public static boolean searchMatrix(int[][] matrix, int target) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                int matrix1 = matrix[i][j];
                if(matrix1 == target) return true;
            }
        }

        return false;
    }
}
