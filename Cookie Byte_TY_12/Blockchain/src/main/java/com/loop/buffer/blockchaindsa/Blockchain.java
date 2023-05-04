package com.loop.buffer.blockchaindsa;

import java.util.ArrayList;

public class Blockchain {

    private static Blockchain blockChain;
    private Blockchain() {}
    public static Blockchain getBlockChain() {
        if (blockChain==null) {
            blockChain = new Blockchain();
        }
        return blockChain;
    }

    ArrayList<Block> blockChainList = new ArrayList<>();

    String zeros() {

        int n = blockChainList.size() == 0 ? 0 : blockChainList.get(blockChainList.size() - 1).getN();
        StringBuilder stringBuilder = new StringBuilder();
        return String.valueOf(stringBuilder.append("0".repeat(n)));
    }

    String updateZeros(long proofOfWork) {

        int n = blockChainList.size() == 0 ? 0 : blockChainList.get(blockChainList.size() - 1).getN();

        if (proofOfWork < 500) {
            n++;
            return "N was increased to " + n;
        } else if (proofOfWork >2000) {
            n--;
            return "N was decreased to " + n;
        } else {
            return "N stays the same - " + n;
        }
    }

    boolean isValid(Block block) {

        if(block.getHash().startsWith(zeros()) || blockChainList.size() == 0) {
            blockChainList.add(block);

            if (blockChainList.size() > 1) {
                for (int i = blockChainList.size() - 1; i > 0; i--) {
                    if (!blockChainList.get(i).getHash().equals(SHA256.applySha256(blockChainList.get(i - 1).getHash()
                            + blockChainList.get(i).getId() + blockChainList.get(i).getTimeStamp() + blockChainList.get(i).getMagicNumber()))) {

                        System.out.println("Block " + blockChainList.get(i).getId() + " is not valid!");

                        if (blockChainList.size() > i) {
                            blockChainList.subList(i, blockChainList.size()).clear();
                        }
                        return false;
                    }
                }
            }
        } else {
            return false;
        }
        return true;
    }
}