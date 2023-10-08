public class Karthik{
    public static void main(String [] args)
    {
        byte val1 = 55;
        int val2 = val1;
        //byte val3=576;   here it is an error because it is out of byte size (256);
        int val4 = 780;
        byte val5=(byte)569;
        byte val6 =(byte) val2;

        float f = 50.8f;
        int val7 = (int) f;

        System.out.println(val2);
        System.out.println(val4);
        System.out.println(val5);
        System.out.println(val6);
        System.out.println(val7);
        System.out.println("-----------------------------------------------------");

        byte value1 = 80;
        byte value2 = 55;
        int result =value1*value2;
        System.out.println(result);

    }
}