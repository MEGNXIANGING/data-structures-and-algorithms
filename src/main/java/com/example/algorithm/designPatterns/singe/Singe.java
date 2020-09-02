package com.example.algorithm.designPatterns.singe;

/**
 * @Author: apple
 * @Description:
 * @Date: 2020/9/1 下午4:50
 */
public class Singe {
    private static  Singe INSTANCE;
    private Singe() {
    }

    public static Singe getInstance(){
        if (INSTANCE==null){
            try {
                Thread.sleep(1);
            }catch (Exception e){
                e.printStackTrace();
            }
            INSTANCE=new Singe();
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i <100 ; i++) {
            new Thread(()->{
                System.out.println(getInstance().hashCode());
            }).start();
        }
    }
}
