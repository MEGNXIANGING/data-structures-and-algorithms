/**
 * @Author: apple
 * @Description:
 *  b树  balance tree：{
 *       m为阶数  也就是最多可以分多少叉
 *      假设一个节点的元素是x
 *      root节点：1<=x<=m-1
 *      一个节点的子节点数量为它本身的元素加一
 *      ceiling（m/2）<x<m-1
 *     增加 上溢（把中间元素传给父亲节点  两边分裂可能会导致 层增高）  删除 下溢（取兄弟节点或者父亲节点  会导致root节点变化）
 *     数据库的元素一般是一百到两百个
 *  }
 *
 *
 * @Date: 2020/9/7 下午5:48
 */
package com.example.algorithm.datastructuresalgorithms.xiaomage.tree;