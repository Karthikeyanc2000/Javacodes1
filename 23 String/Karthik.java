
public class Karthik {
    public static void main(String [] args)
    {
        String name ="Ram";
        //Here String S is capital letter 
        //because String is a class name from java, so correct methode to use string is below,
        String name1 = new String("Navin ");
        System.out.println(name1);
        System.out.println(name1.hashCode());
        System.out.println(name1.charAt(3));
        System.out.println(name1.concat("Reddy"));
        System.out.println("hello "+name1);

        String name3 = "Pranav"; 
        //but we can use this in java it is ok behind this it will create object.
        System.out.println(name3);
    }
    
}
