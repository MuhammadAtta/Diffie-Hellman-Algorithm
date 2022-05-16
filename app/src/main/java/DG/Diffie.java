package DG;

import java.math.BigInteger;
import java.util.Scanner;
import java.util.Random;

public class Diffie extends Generate {

  public BigInteger prime, generator, publicKey;

  private BigInteger privateKey;

 
  Diffie() {

    // this.prime = prime;
    //  this.generator = generator;
    prime = randomGenerateKey(100);
    generator = randomGenerateKey(100);

    // initialize my private key step
    Scanner in = new Scanner(System.in);

    System.out.println("Hello Diffie - Enter your private key");
    privateKey = in.nextBigInteger();
    System.out.println("Diffie selected a private key ka: = " + privateKey);
    // initialize public Key step
    // publicKey = generator^privateKey mod prime
    publicKey = generator.modPow(privateKey, prime);
    in.close();

    System.out.println("-->> : Diffie initialize  public Key " + publicKey);
  }

  BigInteger randomGenerateKey(int bitLength) {
   
    Random random = new Random();

    boolean bool;

    BigInteger bigInteger;

    do {

      bigInteger = new BigInteger(bitLength, random);
      bool = bigInteger.isProbablePrime((int) Math.log(bigInteger.longValue()));

    } while (!bool);

    return bigInteger;
  }

  public void generateSecretKey(BigInteger B) {

    // initialize  secret Key step secrtKey = otherPublicKey^privateKey mod prime

    BigInteger secretKey = B.modPow(privateKey, prime);
    System.out.println("-->> : Diffie Secret Key : " + secretKey);
  }

  public BigInteger getPublicKey() {
    return publicKey;
  }

  public BigInteger getPrime() {
    return prime;
  }

  public BigInteger getGenerator() {
    return generator;
  }
}
