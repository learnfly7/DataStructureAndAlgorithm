/**  
 * @Title:  SurroundedRegions.java   
 * @Package cc.learnfly.leetcode   
 * @Description:    TODO   
 * @author: Schaffer chen     
 * @date:   2017年6月5日 下午9:36:21   
 * @version V1.0 
 * @Copyright: 2017  All rights reserved. 
 */
package cc.learnfly.leetcode;

/**
 * @author figo
 *
 */
public class SurroundedRegions {

	public void solve(char[][] board) {
        if(board == null || board.length == 0 || board[0].length == 0){
        	return;
        }
        int m = board.length;
        int n = board[0].length;
        for(int i = 0; i < n; i++){
        	find(board, 0, i);
        	find(board, m - 1, i);
        }
        for(int i = 0; i < m; i++){
        	find(board, i, 0);
        	find(board, i, n - 1);
        }
        for(int i = 0; i < m; i++){
        	for(int j = 0; j < n; j++){
            	if(board[i][j] == 'O'){
            		board[i][j] = 'X';
            	}
            }  
        }
        for(int i = 0; i < m; i++){
        	for(int j = 0; j < n; j++){
            	if(board[i][j] == '-'){
            		board[i][j] = 'O';
            	}
            }  
        }
    }
	
	public void find(char[][] board, int m ,int n){
		if(board[m][n] == 'O'){
			board[m][n] = '-';
			if(m > 1){
				find(board, m - 1, n);
			}
			if(m < board.length - 1){
				find(board, m + 1, n);
			}
			if(n > 1){
				find(board, m, n - 1);
			}
			if(n < board[0].length - 1){
				find(board, m, n + 1);
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
