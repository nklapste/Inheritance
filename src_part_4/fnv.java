import java.math.BigInteger;
import java.util.Arrays;

public class fnv {
        // *b  is likely a list of some sort
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
        char[] p = Arrays.copyOf(b, b.length);
        BigInteger h = new BigInteger("14695981039346656037");
        BigInteger m = new BigInteger("1099511628211");

        for (int i = 0; i < c; i++) {
            byte []p1 = {(byte)p[i]};
            BigInteger bB = new BigInteger(p1, 0, 1);
            System.out.println(bB);
            h = (h.multiply(m)).and((bB));
            System.out.println(h);
        }
        return h;
    }
    public static void main(String[] args) {
        char[] charArray ={ 'a', 'b', 'c', 'd', 'e' };
        System.out.println(fnv(charArray, 3));
    }
}
