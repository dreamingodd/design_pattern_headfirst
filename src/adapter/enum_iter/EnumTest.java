package adapter.enum_iter;

import java.util.StringTokenizer;

public class EnumTest {

    public static void main(String[] args) {
        // 主要是要找一个Enumeration的实现类 ， 只找到一个StringToken
        EnumerationIterator ei = new EnumerationIterator(new StringTokenizer(
                "a,b,c,d,e,f,g", ","));

        while (ei.hasNext()) {
            System.out.println(ei.next());
        }
    }

}
