package com.example.algorithm.datastructuresalgorithms.mq;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Author: apple
 * @Description:
 * @Date: 2020/9/29 下午11:55
 */
public class BrokerService implements Runnable {
    public static int SERVICE_PORT = 9999;
    private final Socket socket;
    private Broker broker;

    public BrokerService(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream());
            while (true) {
                String s = in.readLine();
                if (s == null) {
                    continue;
                }
                System.out.println("接收到原始数据" +s);
                if (s.equals(Type.CONSUME.getValue())){
                    Object consume = broker.consume();
                    out.println(consume);
                    out.flush();
                }else if (s.equals(Type.SEND.getValue())){
                    broker.produce(s);
                }else {
                    throw new Exception();
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) throws Exception {
        ServerSocket server = new ServerSocket(SERVICE_PORT);
        while (true) {
            BrokerService brokerServer = new BrokerService(server.accept());
            new Thread(brokerServer).start();
        }
    }
}
