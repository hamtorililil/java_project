package Part13;

import java.util.Collections;
import java.util.Vector;

public class VectorExampLe1 {
    public static void main(String[] args) {

        Vector<String> vec = new Vector<String>(2);

        vec.add("Apple");
        vec.add("Orange");
        vec.add("Mango");
        System.out.println("벡터의 크기: "+ vec.size());
        Collections.sort(vec);

        for(String s:vec)
            System.out.print(s + " ");

    }
}
