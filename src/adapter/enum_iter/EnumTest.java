package adapter.enum_iter;

import java.util.StringTokenizer;

public class EnumTest {

    public static void main(String[] args) {
        // ��Ҫ��Ҫ��һ��Enumeration��ʵ���� �� ֻ�ҵ�һ��StringToken
        EnumerationIterator ei = new EnumerationIterator(new StringTokenizer(
                "a,b,c,d,e,f,g", ","));

        while (ei.hasNext()) {
            System.out.println(ei.next());
        }
    }

}
