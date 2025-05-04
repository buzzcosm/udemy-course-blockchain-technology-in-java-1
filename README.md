# Udemy course - Blockchain

[learn blockchain technology in java](https://www.udemy.com/course/learn-blockchain-technology-in-java)

## Blockchain Theory and Implementation

Important Classes:

- [Block](./src/main/java/com/buzzcosm/blockchain/demo/Block.java)
- [Blockchain](./src/main/java/com/buzzcosm/blockchain/demo/Blockchain.java)
- [Miner](./src/main/java/com/buzzcosm/blockchain/demo/Miner.java)

### Proof of work (PoW) - Algorithm

```java
        // This is a proof of work (PoW)
        while (!isGoldenHash(block)) {
            block.incrementNonce();
            block.generateHash();
        }
```

**Important terms:**

- **nonce**: number of tries to find a valid hash
- **difficulty**: number of leading zeros in hash
- **hash**: unique identifier of block
- **genesis block**: first block in blockchain

## Cryptocurrency

**Important terms:**

- **mempool**: transactions that have not been included in a block yet
  - mempool **stores the transactions** until a given miner verifies them and puts them into a block
  - similar to producer - consumer method
- **miner**: person who mines blocks
- **transaction**: transfer of funds between two parties
- **pre-verified** *transactions*: transactions that have already been verified and added to a block
- **transaction fee**: fee that is paid to the miner for including a transaction in a block
- **Merkle-Trees** Solution: https://en.wikipedia.org/wiki/Merkle_tree
  - Merkle-Root

> MINER'S REWARD = X BTC + TRANSACTION FEES
