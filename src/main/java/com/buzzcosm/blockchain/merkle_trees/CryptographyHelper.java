package com.buzzcosm.blockchain.merkle_trees;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public class CryptographyHelper {

    public static String hash(String data) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hash = digest.digest(data.getBytes(StandardCharsets.UTF_8));

            StringBuilder hexadecimalString = new StringBuilder();

            for (byte b : hash) {
                String hexadecimal = Integer.toHexString(0xff & b);
                if (hexadecimal.length() == 1) {
                    hexadecimalString.append('0');
                }
                hexadecimalString.append(hexadecimal);
            }

            return hexadecimalString.toString();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
