package com.example.algorithm.datastructuresalgorithms.leetcode.DFS;

public class NumIslands {
    public int numIslands(char[][] grid) {
        if (grid==null||grid.length==0){
            return 0;
        }
        int row = grid.length;
        int col = grid[0].length;
        int result=0;
        for (int i = 0; i <row ; i++) {
            for (int j = 0; j <col ; j++) {
                if (grid[i][j]=='1'){
                    result++;
                    dfs(grid,i,j,row,col);
                }
            }
        }
        return result;
    }

    private void dfs(char[][] grid, int x, int y, int row, int col) {
        if (x<0 || y<0 || x>=row ||y>=col || grid[x][y]=='0'){
            return;
        }
        grid[x][y]='0';
        dfs(grid,x+1,y,row,col);
        dfs(grid,x-1,y,row,col);
        dfs(grid,x,y+1,row,col);
        dfs(grid,x,y-1,row,col);
    }

}
