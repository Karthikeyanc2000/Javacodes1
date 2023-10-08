
//redundancy is a crime.
// we use inheritance for code reusability , extensibility etc...


// even if we deleted our java file our inheritance code will run using class file alone,
//check explorer in vs code for class file and java file.



public class Karthik {
    public static void main(String [] args) //while typing code main methode is important.
    {  //in inheritance there is chance of missing some details so be care full and code.

    AdvCalc ad = new AdvCalc();
    int value1 = ad.add(15,75);
    int value2 =ad.sub(75,45);
    int value3 = ad.mul(4,55);
    int value4 = ad.div(45,7);
    VeryAdvCalc vad = new VeryAdvCalc();
    double value5 =vad.power(7,3);

    System.out.println(value1+" "+value2+" "+value3+" "+value4+" "+value5);
    }
    
}
