package leetcode.arrays_hashing;

import java.util.HashSet;
import java.util.Set;

/**
 * @author bumblebee
 */
public class VaildSudoku {

    public static void main(String[] args) {

        char[][] board = {
                {'5','3','.','.','7','.','.','.','.'}
               ,{'6','.','.','1','9','5','.','.','.'}
               ,{'.','9','8','.','.','.','.','6','.'}
               ,{'8','.','.','.','6','.','.','.','3'}
               ,{'4','.','.','8','.','3','.','.','1'}
               ,{'7','.','.','.','2','.','.','.','6'}
               ,{'.','6','.','.','.','.','2','8','.'}
               ,{'.','.','.','4','1','9','.','.','5'}
               ,{'.','.','.','.','8','.','.','7','9'}
        };
        
        char[][] board2 = {
                {'8','3','.','.','7','.','.','.','.'}
                ,{'6','.','.','1','9','5','.','.','.'}
                ,{'.','9','8','.','.','.','.','6','.'}
                ,{'8','.','.','.','6','.','.','.','3'}
                ,{'4','.','.','8','.','3','.','.','1'}
                ,{'7','.','.','.','2','.','.','.','6'}
                ,{'.','6','.','.','.','.','2','8','.'}
                ,{'.','.','.','4','1','9','.','.','5'}
                ,{'.','.','.','.','8','.','.','7','9'}
        };
        
        char[][] board3 = {
                {'.','.','.','.','5','.','.','1','.'}
                ,{'.','4','.','3','.','.','.','.','.'}
                ,{'.','.','.','.','.','3','.','.','1'}
                ,{'8','.','.','.','.','.','.','2','.'}
                ,{'.','.','2','.','7','.','.','.','.'}
                ,{'.','1','5','.','.','.','.','.','.'}
                ,{'.','.','.','.','.','2','.','.','.'}
                ,{'.','2','.','9','.','.','.','.','.'}
                ,{'.','.','4','.','.','.','.','.','.'}
        };

        System.out.println(isValidSudoku(board));
    }

    public static boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            //row 체크
            Set<Character> set = new HashSet();
            for (int j = 0; j < board[i].length; j++) {
                char chars = board[i][j];
                if(chars != '.' && set.contains(chars)) return false;
                else set.add(chars);
            }
            set.clear();

            //column 체크
            for (int j = 0; j < board[i].length; j++) {
                char chars = board[j][i];
                if(chars != '.' && set.contains(chars)) return false;
                else set.add(chars);
            }
            set.clear();
        }

        //block
        for (int i = 0; i < board.length; i = i + 3) {
            for (int j = 0; j < board[i].length; j = j + 3) {
                if (!checkBlock(i, j, board)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean checkBlock(int idxI, int idxJ, char[][] board) {
        Set<Character> blockSet = new HashSet<>();
        int rows = idxI + 3;
        int cols = idxJ + 3;
        for (int i = idxI; i < rows; i++) {
            for (int j = idxJ; j < cols; j++) {
                if (board[i][j] == '.') continue;
                if (blockSet.contains(board[i][j])) return false;
                blockSet.add(board[i][j]);
            }
        }
        return true;
    }

}
