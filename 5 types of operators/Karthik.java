public class Karthik {
    public static void main(String [] args)
    {
         //Arithmetic Operators:
         int sum = 5 + 3; // sum is 8
         int difference = 7 - 2; // difference is 5
         int product = 4 * 6; // product is 24
         double result = 10.0 / 3.0; // result is 3.333...
         int remainder = 15 % 7; // remainder is 1

         //Assignment Operators:
         int x = 10;
         int a = 5;
         a += 3; // a is now 8
         
         //Comparison Operators:
         boolean isEqual = (5 == 5); // isEqual is true
         boolean isNotEqual = (5 != 3); // isNotEqual is true
         boolean isGreaterThan = (10 > 5); // isGreaterThan is true
         boolean isLessThan = (3 < 7); // isLessThan is true
         boolean isGreaterOrEqual = (6 >= 6); // isGreaterOrEqual is true
         boolean isLessOrEqual = (4 <= 3); // isLessOrEqual is false
         
         //Logical Operators:
         boolean result1 = (true && false); // result is false
         boolean result2 = (true || false); // result is true
         boolean isNotTrue = !true; // isNotTrue is false
         
         //Bitwise Operators:
         int result3 = 5 & 3; // result is 1 (0101 & 0011)
         int result4 = 5 | 3; // result is 7 (0101 | 0011)
         int result5 = 5 ^ 3; // result is 6 (0101 ^ 0011)
         int result6 = ~5; // result is -6 (complement of 0101)
         
         //Shift Operators:
         int result7 = 5 << 2; // result is 20 (0101 << 2)
         int result8 = 20 >> 2; // result is 5 (10100 >> 2)
         int result9 = -20 >>> 2; // result is 1073741821 (-20 >>> 2)

         
    }
    
}
