package com.loop.buffer.blockchaindsa;

import java.io.Serializable;

class Block implements Serializable {
    private static final long serialVersionUID = 1L;
    private final int minerName;
    private final int id;
    private final long timeStamp;
    private final long magicNumber;
    private final String previousHash;
    private final String hash;
    private final long proofOfWork;
    private final String N;

    public Block(int minerName, int id, long timeStamp, long magicNumber, String previousHash, String hash, long proofOfWork, String N) {
        this.minerName = minerName;
        this.id = id;
        this.timeStamp = timeStamp;
        this.magicNumber = magicNumber;
        this.previousHash = previousHash;
        this.hash = hash;
        this.proofOfWork = proofOfWork;
        this.N = N;
    }

    public int getId() {
        return id;
    }

    public long getTimeStamp() {
        return timeStamp;
    }

    public long getMagicNumber() {
        return magicNumber;
    }

    public String getHash() {
        return hash;
    }

    public int getN() {
        return Integer.parseInt(N.replaceAll("[^0-9]", ""));
    }

    @Override
    public String toString() {
        return "\nBlock:" +
                "\nCreated by miner # " + minerName +
                "\nMiner: " + minerName + " gets 100 VC" +
                "\nId: " + id +
                "\nTimestamp: " + timeStamp +
                "\nMagic number: " + magicNumber +
                "\nHash of the previous block: \n" + previousHash +
                "\nHash of the block: \n" + hash +
                "\nBlock was generating for " + proofOfWork + " timeUnits" +
                "\n" + N;
    }
}