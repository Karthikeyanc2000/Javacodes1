

/*
 * Streams API
 * 
 * 
 */
import java.util.List;
import java.util.ArrayList;

public class Karthik {
    public static void main(String [] args)
    {
        List<String> names = new ArrayList<String>();
        names.add("Siddharth");
        names.add("gopi");
        names.add("raju");
        names.add("ramu");
        names.add("papu");

        names.stream().filter(n->n.startsWith("r")).forEach(n -> System.out.println(n)); //here stream small s
        System.out.println();

        names.stream().map(q -> q.toUpperCase()).forEach(n ->System.out.println(n));//her map small m

    }
    
}
