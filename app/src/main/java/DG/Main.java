package DG;

import java.io.*;
import java.io.BufferedReader;
import java.math.BigInteger;

public class Main {

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Diffie-Hellman Algorithm");
    System.out.println("Enter (key P) Prime Number :");
    // Value for Prime Number
    BigInteger prime = new BigInteger(br.readLine());

    System.out.println(
        "Enter (key G) - (the primitive root of P) Must be less than: " + prime + ": ");
    // Value for Generator Number
    BigInteger g = new BigInteger(br.readLine());
    System.out.println(
        "-->> : Diffie and Hellman get public numbers P = : " + prime + " & G = : " + g);
    ExchangeKey exk = new ExchangeKey();

    exk.exchangeKey();

    // Execute Functions

  }
}
