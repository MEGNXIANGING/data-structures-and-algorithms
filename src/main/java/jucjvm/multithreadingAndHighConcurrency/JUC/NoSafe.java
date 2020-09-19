package jucjvm.multithreadingAndHighConcurrency.JUC;

import java.util.List;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;


/**
 * @Author: apple
 * @Description:
 * 通过CopyOnWriteArrayList 替代 ArrayList
 * 使用lock锁来锁add操作
 * @Date: 2020/9/10 上午11:18
 */
public class NoSafe {
    public static void main(String[] args) {
        List<String> list = new CopyOnWriteArrayList<>();

        for (int i = 0; i <3 ; i++) {
            new Thread(()->{
                list.add(UUID.randomUUID().toString().substring(0,8));
                System.out.println(list);
            }).start();
        }
    }

    public int coinChange(int[] coins, int m) {
        int f[]=new int[m+1];
        int n =coins.length;
        f[0]=0;
        for(int i=1;i<m;i++){
            f[i]=Integer.MAX_VALUE;
            for(int j=1;j<=n;j++){
                if(i-coins[j]>0 && f[i-coins[j]]!=Integer.MAX_VALUE){
                    f[i]=Math.min(f[i-coins[j]]+1,f[i]);
                }
            }
        }
        if(f[m]==Integer.MAX_VALUE){
            return -1;
        }
        return f[m];
    }


}
