package com.buzzcosm.blockchain.merkle_trees;

import java.util.ArrayList;
import java.util.List;

public class MerkleTree {

    private List<String> transactions;

    public MerkleTree(List<String> transactions) {
        this.transactions = transactions;
    }

    public String getMerkleRoot() {
        return construct(transactions).getFirst();
    }

    // it is recursive function that keeps merging the
    // neighboring hashes (index i and i + 1)
    private List<String> construct(List<String> transactions) {

        // base-case for recursive method calls
        if (transactions.size() == 1) {
            return transactions;
        }

        // it contains fewer and fewer items in every iteration
        List<String> updatedList = new ArrayList<>();

        // keep merging the neighboring hashes
        for (int i = 0; i < transactions.size() - 1; i += 2) {
            String hash1 = transactions.get(i);
            String hash2 = transactions.get(i + 1);
            String mergedHash = mergeHash(hash1, hash2);
            updatedList.add(mergedHash);
        }

        // if there number of transactions is odd: the last item is hashed with itself
        if (transactions.size() % 2 == 1) {
            String lastTransaction = transactions.getLast();
            updatedList.add(mergeHash(lastTransaction, lastTransaction));
        }

        // recursive call (tail recursion)
        return construct(updatedList);
    }

    // concatenate two strings and hash it with SHA256
    private String mergeHash(String hash1, String hash2) {
        String mergedHash = hash1 + hash2;
        return CryptographyHelper.hash(mergedHash);
    }

}
