package com.buzzcosm.blockchain.demo;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public class SHA256Helper {

    public static String generateHash(String data) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hash = digest.digest(data.getBytes(StandardCharsets.UTF_8));

            // we want to end up with hexadecimal values not bytes
            //StringBuffer hexadecimalString = new StringBuffer(); // thread-safe but slow
            StringBuilder hexadecimalString = new StringBuilder(); // more faster

            for (byte b : hash) {
                String hexadecimal = Integer.toHexString(0xff & b);
                // padding !!!
                if (hexadecimal.length() == 1) {
                    hexadecimalString.append('0');
                }
                hexadecimalString.append(hexadecimal);
            }

            return hexadecimalString.toString();

        } catch(Exception e) {
            throw new RuntimeException(e);
        }
    }
}
