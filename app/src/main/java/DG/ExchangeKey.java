package DG;

public class ExchangeKey {

  public void exchangeKey() {

    Generate g1 = new Diffie();

    System.out.println("Prime = " + g1.getPrime());
    System.out.println("Generator = " + g1.getGenerator());
    System.out.println("Diffie PublicKey = " + g1.getPublicKey());

    Generate g2 = new Hellman(g1.getPrime(), g1.getGenerator());
    System.out.println("Hellman PublicKey = " + g2.getPublicKey());

    // Generating the secret key after the exchange of keys

    System.out.println("-->> Generating the secret key after the exchange of keys");
    g1.generateSecretKey(g2.getPublicKey());
    g2.generateSecretKey(g1.getPublicKey());
  }
}
