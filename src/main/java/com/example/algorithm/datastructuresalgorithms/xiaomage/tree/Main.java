package com.example.algorithm.datastructuresalgorithms.xiaomage.tree;

/**
 * @Author: apple
 * @Description:
 * @Date: 2020/9/4 下午10:58
 */
public class Main {
    public static void main(String[] args) {
        Integer[] ar={7,4,2,1,3,5,9,8,11,10,12};
        BinarySearchTree<Integer> binarySearchTree = new BinarySearchTree<>();
        for (Integer a:ar
             ) {
            binarySearchTree.add(a);
        }

        System.out.println(binarySearchTree);

    }
}
