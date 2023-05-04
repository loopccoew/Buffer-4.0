package com.loop.buffer.blockchaindsa;

import java.util.Date;
import java.util.Random;

public class Miner extends Thread {

    int name;
    public Miner(int name) {
        this.name = name;
    }

    Random random = new Random();
    Block block;
    private static final Object lock = new Object();

    void generateBlock() {

        synchronized (lock) {
            int id = Blockchain.getBlockChain().blockChainList.size() + 1;
            long timeStamp = new Date().getTime();
            int magicNumber;
            String previousHash = id == 1 ? "0" : Blockchain.getBlockChain().blockChainList.get(id - 2).getHash();

            String hash;
            do {
                magicNumber = random.nextInt(Integer.MAX_VALUE);
                hash = SHA256.applySha256(previousHash + id + timeStamp + magicNumber);
            } while (!hash.startsWith(Blockchain.getBlockChain().zeros()));

            long proofOfWork = (new Date().getTime() - timeStamp) ;

            String N = Blockchain.getBlockChain().updateZeros(proofOfWork);

            block = new Block(name, id, timeStamp, magicNumber, previousHash, hash, proofOfWork, N);

            if (Blockchain.getBlockChain().isValid(block)) {
                System.out.println(block);
            } else if (Blockchain.getBlockChain().blockChainList.size() == 1) {
                System.out.println(block);
            } else {
                System.out.println("Block not accepted!");
            }
        }
    }

    @Override
    public void run() {
        generateBlock();
    }
}