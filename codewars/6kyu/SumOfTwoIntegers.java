import java.math.BigDecimal;
import java.math.BigInteger;

public class SumOfTwoIntegers {
        public static int add(int x, int y)
        {
            if(y == 0) return x;
            int two = x ^ y;
            int carry = (x & y) << 1;
            return add(two, carry);
        }
}
