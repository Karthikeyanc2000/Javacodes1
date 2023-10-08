
//main use of finally block is to close the resources.
//but in later JAVA they introduces try with resources that means we need to declare what resources we are going to use in try block itself so there is no need for closing it (it is self closed).

//so in try resource -> the used resource is self closed.( but need to provide in try block what resource we using).

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Karthik {
    public static void main(String [] args){

        int numb = 0;
        
        InputStreamReader ir = new InputStreamReader(System.in); 

        try(BufferedReader bf = new BufferedReader(ir)) 
        {   //here our bf is self closed we need not to close it.so resource is not wasting.
            numb =Integer.parseInt(bf.readLine());
            System.out.println(numb); 
        }
        catch(Exception e) //here if we not handiling exception we should use throws in main method (that is not a good practice to throw exception to JVM).
        {
            System.out.println(e);
        }

    }
    
}
