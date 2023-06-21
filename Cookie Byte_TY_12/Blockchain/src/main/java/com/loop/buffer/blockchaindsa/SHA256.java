package com.loop.buffer.blockchaindsa;

import java.security.MessageDigest;

public class SHA256 {
    public static String applySha256(String s){
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
//            appply to input string s
            byte[] hash = digest.digest(s.getBytes("UTF-8"));
            StringBuilder hexString = new StringBuilder();
            for (byte elem: hash) {
                String hex = Integer.toHexString(0xff & elem);
                if(hex.length() == 1) hexString.append('0');
                hexString.append(hex);
            }
            return hexString.toString();
        }
        catch(Exception e) {
            throw new RuntimeException(e);
        }
    }
}