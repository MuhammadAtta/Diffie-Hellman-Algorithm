package DG;

import java.math.BigInteger;
import java.util.Scanner;

public class Hellman extends Generate {

  public BigInteger prime, generator, publicKey;

  private BigInteger privateKey;

  Hellman(BigInteger prime, BigInteger generator) {

    this.prime = prime;
    this.generator = generator;

    // initialize my private key step
    Scanner in = new Scanner(System.in);

    System.out.println("Hello Hellman - Enter your private key");
    privateKey = in.nextBigInteger();
    System.out.println("Hellman selected a private key kb: = " + privateKey);
    // initialize public Key step
    // publicKey = generator^privateKey mod prime
    publicKey = generator.modPow(privateKey, prime);
    in.close();

    System.out.println("-->> : Hellman initialize  public Key " + publicKey);
  }

  public void generateSecretKey(BigInteger B) {

    // Generating the secret key after the exchange of keys
    // initialize  secret Key step secrtKey = otherPublicKey^privateKey mod prime

    BigInteger secretKey = B.modPow(privateKey, prime);
    System.out.println("-->> : Hellman Secret Key: " + secretKey);
  }

  public BigInteger getPublicKey() {
    return publicKey;
  }
}
