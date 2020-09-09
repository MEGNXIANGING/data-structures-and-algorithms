package com.example.algorithm.designPatterns.chainOfResponsibility;

/**
 * @Author: apple
 * @Description:
 * @Date: 2020/9/4 下午12:45
 */
public class Main {
    public static void main(String[] args) {
        String msg = "<hhh,hello  996> 996";
        Msg m = new Msg(msg);
        FitterChain fitterChain = new FitterChain();
        fitterChain.add(new HTMLFitter(), new SensitiveFitter()).add(new HTMLFitter());

        FitterChain fitterChain2 = new FitterChain();
        fitterChain2.add(new WorldFitter());
        //聚合两条责任链
        fitterChain.add(fitterChain2);
        fitterChain.doFitter(m);
        System.out.println(m);
    }

}

class Msg {
    private String msg;

    public Msg(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "Msg{" +
                "msg='" + msg + '\'' +
                '}';
    }
}