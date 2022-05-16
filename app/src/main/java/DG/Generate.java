package DG;

import java.math.BigInteger;

public abstract class Generate {
  void generateSecretKey(BigInteger b) {}

  BigInteger val = new BigInteger("9");

  BigInteger randomGenerateKey() {
    return val;
  }

  BigInteger getPublicKey() {
    return val;
  }

  BigInteger getPrime() {
    return val;
  }

  BigInteger getGenerator() {
    return val;
  }
}
