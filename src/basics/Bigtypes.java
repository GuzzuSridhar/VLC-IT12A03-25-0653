package basics;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Bigtypes {
    public static void main(String[] args) {
        BigInteger bigInteger = new BigInteger("15554446666888");
        BigDecimal bigDecimal = new BigDecimal(0.1);
        System.out.println(bigDecimal);
        BigDecimal bigDecimalOne = new BigDecimal("0.1");
        System.out.println(bigDecimalOne);
    }
}
