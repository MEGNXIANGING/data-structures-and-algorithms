package com.example.algorithm.datastructuresalgorithms.leetcode.binarySearch;

public class searchAdMatrix {
    /**
     * 编写一个高效的算法来判断 m x n 矩阵中，是否存在一个目标值。该矩阵具有如下特性：
     *
     * 每行中的整数从左到右按升序排列。
     * 每行的第一个整数大于前一行的最后一个整数。
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/search-a-2d-matrix
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     *
     * 二维数组转化为一维数组再求
     * 找某一个数  <=  找某一个数该插入的位置<
     *
     * 2 to 1 ：index=x*count+y
     * @param matrix
     * @param target
     * @return
     */
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix==null || matrix.length==0){
            return false;
        }
        int row =matrix.length;
        int col =matrix[0].length;
        int l=0;
        int r=row*col-1;
        while (l<r){
            int m=l+(r-l)/2;
            int item=matrix[m/col][m%col];
            if (item==target){
                return true;
            }else if (item>target){
                r=m-1;
            }else {
                l=m+1;
            }
        }
        return false;
    }
}
