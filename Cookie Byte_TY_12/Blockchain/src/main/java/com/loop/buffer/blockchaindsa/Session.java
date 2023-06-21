package com.loop.buffer.blockchaindsa;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Session {
    public static void newMiner(){
        Scanner scanner = new Scanner(System.in);
        String fileName = "blockchain.data";
        File file = new File(fileName);
        if (file.length() != 0) {
            try {
                Blockchain.getBlockChain().blockChainList = (ArrayList<Block>) SerializationUtils.deserialize(fileName);
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        Miner[] miners;
        System.out.println("Enter the no. of miners you want to create: ");
        int num = scanner.nextInt();
        miners = new Miner[num];
        for(int i = 0; i<num; i++){
            miners[i] = new Miner(i+1);
        }
//        Miner miner1 = new Miner(1);
//        Miner miner2 = new Miner(2);
//        Miner miner3 = new Miner(3);
        for(int j=0; j<num; j++){
            miners[j].start();
        }
//        miner1.start();
//        miner2.start();
//        miner3.start();
        try {
            for (int k = 0; k < num; k++) {
                miners[k].join();
            }
        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
            e.printStackTrace();
        }

//        try {
//            miner1.join();
//            miner2.join();
//            miner3.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }


        try {
            SerializationUtils.serialize(Blockchain.getBlockChain().blockChainList, fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
