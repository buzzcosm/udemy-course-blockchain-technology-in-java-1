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