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
- Public & Private Key Cryptography
  - Public Key Cryptography: https://en.wikipedia.org/wiki/Public-key_cryptography
  - Private Key Cryptography: https://en.wikipedia.org/wiki/Private-key_cryptography
- Bitcoin: https://en.wikipedia.org/wiki/Bitcoin
  - bitcoin protocol: https://en.bitcoin.it/wiki/Protocol_specification
  - ECDSA (Elliptic Curve Digital Signature Algorithm): https://en.wikipedia.org/wiki/Elliptic_Curve_Digital_Signature_Algorithm
- Elliptic Curve Cryptography: https://en.wikipedia.org/wiki/Elliptic_Curve_Cryptography
- UTXOs (Unspent Transaction Output): https://en.wikipedia.org/wiki/Unspent_transaction_output
- Crypto Wallets: https://en.wikipedia.org/wiki/Crypto_wallet
- RIPEMD: https://en.wikipedia.org/wiki/RIPEMD
- 51% Attack: https://bitcoinwiki.org/wiki/51-attack
- competing chains problems
- double spending problems
- orphaned blocks & block verification
- Mining & Inflation
- Transaction Fees
- Blockchain Forks
  - Soft Fork
  - Hard Fork

> MINER'S REWARD = X BTC + TRANSACTION FEES

> TRANSACTION INPUT AMOUNT = TRANSACTION OUTPUT AMOUNT + MINER'S REWARD

### 51% Attack

- [YouTube: Was ist eine 51% Attacke? Einfach erklärt für Anfänger](https://www.youtube.com/watch?v=Dk3TrnU8kJU)

A 51% attack in blockchain refers to an attack where an attacker gains control of more than 50% of the network's hash rate, allowing them to manipulate the blockchain. This control enables them to alter transactions, double-spend funds, and potentially disrupt the entire network.

#### How a 51% attack works

1. Acquire control:  
   The attacker gathers enough computational power (hash rate) to surpass the network's majority.
2. Manipulate transactions:  
   They can then alter the order of transactions, prevent some from being confirmed, or even reverse valid transactions.
3. Double-spending:  
   The attacker can create a separate, fraudulent blockchain branch, which they can then broadcast to the network to invalidate the original transactions.
4. Disruption and loss of trust:  
   Successful 51% attacks can lead to double-spending, network instability, and a loss of trust in the cryptocurrency or blockchain. 

Examples:

**Double-spending:**

An attacker could spend the same cryptocurrency twice, once in a real transaction and once on a fraudulent chain they create.

**Transaction manipulation:**

They could delay or prevent the confirmation of legitimate transactions, disrupting commerce.

**Block withholding:**

Attackers could mine blocks but withhold them from the network, leading to delays in block propagation and transaction confirmations. 

#### Key takeaways

- A 51% attack poses a significant threat to Proof-of-Work (PoW) blockchain networks.
- The more hash rate a blockchain possesses, the harder it is to successfully launch a 51% attack.
- Successfully overcoming a 51% attack can be costly for the blockchain network and its users, leading to loss of trust and potential economic damage. 