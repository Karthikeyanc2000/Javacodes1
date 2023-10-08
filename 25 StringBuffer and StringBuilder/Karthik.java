
public class Karthik {
    public static void main(String [] args)
    {
        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity());  // 16
        StringBuffer sb2 = new StringBuffer("Karthik");
        System.out.println(sb2.capacity());  // 23
        System.out.println(sb2.length());

        // StringBuffer is Thread safe
        // StringBuilder is not Thread Safe

        StringBuffer sb3 = new StringBuffer("John ");
        sb3.append("cena");
        System.out.println(sb3);
        sb3.insert(0, "Java ");
        System.out.println(sb3);
        sb3.deleteCharAt(6);
        sb3.setLength(30);
        sb3.ensureCapacity(100);
        System.out.println(sb3);
        sb3.toString(); // here we converting it to normal String object.
        System.out.println(sb3);


        StringBuilder sbr = new StringBuilder("karthik");
        System.out.println(sbr.capacity());
    }
}
/*
 * StringBuffer provides Thread safety but at a performance cost. In most of the scenarios, 
 * we don't use String in a multithreaded environment. So Java 1.5 introduced a new class 
 * StringBuilder, which is similar to StringBuffer except for thread-safety and synchronization.
 */