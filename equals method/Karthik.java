
class A{
    int mark1;
    int total;

    // below is inbuild hasCode and equalss
   @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + mark1;
        result = prime * result + total;
        return result;
    }

@Override
public boolean equals(Object obj) {
    if (this == obj)
        return true;
    if (obj == null)
        return false;
    if (getClass() != obj.getClass())
        return false;
    A other = (A) obj;
    if (mark1 != other.mark1)
        return false;
    if (total != other.total)
        return false;
    return true;
}
    }

public class Karthik {
    public static void main(String [] args)
    {
        A a1 = new A();
        a1.mark1=80;
        a1.total=470;

        A a2 = new A();
        a2.mark1=80;
        a2.total=470;

        boolean value1 = a1.equals(a2); 
        System.out.println(value1);


    }
    
}
