package com.buzzcosm.blockchain.merkle_trees;

import java.util.ArrayList;
import java.util.List;

/**
 * Why to use Merkle Trees?
 * - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
 * - because we can represent all the transactions within a block by a single hash
 * - this single hash is in the header of the block in the blockchain
 *   (so it is a memory efficient way to store all the transactions in a block)
 * - this is the merkle root: we recursively keep hashing the leaf nodes in the
 *   tree-like structure
 * - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
 *  THE ROOT CAN VERIFY THAT ALL THE TRANSACTIONS ARE VALID IN THE BLOCK !!!
 */
public class App {

    public static void main(String[] args) {
        List<String> transactions = new ArrayList<>();

        transactions.add("aa"); // 1st transaction
        transactions.add("bb"); // 2nd transaction
        transactions.add("cc"); // 3rd transaction
        transactions.add("dd"); // 4th transaction
        transactions.add("ee"); // 5th transaction
        transactions.add("ff"); // 6th transaction
        transactions.add("gg"); // 7th transaction
        transactions.add("hh"); // 8th transaction
        transactions.add("ii"); // 9th transaction
        transactions.add("jj"); // 10th transaction
        transactions.add("kk"); // 11th transaction
        transactions.add("ll"); // 12th transaction
        transactions.add("mm"); // 13th transaction
        transactions.add("nn"); // 14th transaction
        transactions.add("oo"); // 15th transaction
        transactions.add("pp"); // 16th transaction
        transactions.add("qq"); // 17th transaction (odd number of last transactions)

        MerkleTree merkleTree = new MerkleTree(transactions);
        System.out.println(merkleTree.getMerkleRoot());
    }
}
