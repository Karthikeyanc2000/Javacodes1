

public class Karthik {
    public static void main(String [] args)
    {
        int numb1 = 50;
        int numb2 = 700;
        int numb3 =756;
        int numb4 =456;
        int result = numb1+numb2;
        int result2 = numb1-numb2;
        int result3 = numb1*numb2;
        int result4 = numb1/numb2;
        int result5 = numb1%numb2;
        
        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
        System.out.println("--------------------------------");


        int value1=0;
        value1 += numb3;
        numb3 -= numb4;
        numb4 = numb4 + 1;
        numb4+=1;
        System.out.println(value1);
        System.out.println(numb3);
        System.out.println(numb4);
        System.out.println(numb4);
        System.out.println("----------------------------------");

        int value2 =5;
        value2++; 
        System.out.println(value2); //output = 6

        int value3 = 9;
        int result6 = value3++; //output = 9
        //it is post increment
        //it will first fetch the value then increment it 
        System.out.println(result6);

        int value4= 7;
        ++value4;  // output =8
        System.out.println(value4);

        int value5 = 12;
        int result7 = ++value5; //output 13
        //first increment and then it will fetch it
        System.out.println(result7);
        //similarly we having post decrement(value5--) and pre decrement(--value5).

    }
    
}
