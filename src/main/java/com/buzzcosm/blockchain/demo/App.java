package com.buzzcosm.blockchain.demo;

public class App {

    public static void main(String[] args) {
        Blockchain blockchain = new Blockchain();
        Miner miner = new Miner();

        // we can create the blocks one by one
        Block genesisBlock = new Block(0, "", Constants.GENESIS_PREV_HASH);
        miner.mine(genesisBlock, blockchain);

        Block block1 = new Block(1, "transaction1", blockchain.getBlockchain()
                .get(blockchain.getSize() - 1).getHash());
        miner.mine(block1, blockchain);

        Block block2 = new Block(2, "transaction2", blockchain.getBlockchain()
                .get(blockchain.getSize() - 1).getHash());
        miner.mine(block2, blockchain);

        System.out.println("\n" + "BLOCKCHAIN:\n" + blockchain);
        System.out.println("Miner's reward: " + miner.getReward());

        // a single block is mined after every 10 minutes
    }
}
