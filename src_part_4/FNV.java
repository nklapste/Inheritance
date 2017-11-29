import java.math.BigInteger;
import java.util.Arrays;

public class FNV {
    //    uint64_t fnv(void *b, int c) {
            // pass address stored in b into unsigned char pointer variable p
    //        unsigned char *p = b;
    //        uint64_t h = 14695981039346656037;
    //        int i;
            // access p which points to the same address as b
    //        for (i = 0; i < c; i++) h = (h * 1099511628211) ^ p[i];
    //        return h;
    //    }

    public static BigInteger fnv(char[] b, int c) {
        // unsigned char *p = b;
        char [] p = Arrays.copyOf(b, b.length);
        BigInteger h = new BigInteger("14695981039346656037");
        BigInteger m = new BigInteger("1099511628211");
        for (int i = 0; i < c; i++) {
            BigInteger b1 = new BigInteger(String.valueOf(Character.getNumericValue(p[i])));
            h = h.multiply(m).xor(b1);
            //now remove bits to simulate overflowing
            h = h.mod(new BigInteger("2").pow(64));
        }
        return h;
    }

    public static void main(String[] args) {
        char[] c ={ 'a', 'b', 'c', 'd', 'e' };
        System.out.println(fnv(c, 5));
    }


}
