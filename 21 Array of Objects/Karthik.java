

class Student{
    String name;
    int age;
    int marks;
}
public class Karthik{
    public static void main(String [] args)
    {
       Student s1 = new Student();
       s1.name = "Ram";
       s1.age=17;
       s1.marks=77;
        
       Student s2 = new Student();
       s2.name ="Karthik";
       s2.age = 23;
       s2.marks = 97;

       Student s3 = new Student();
       s3.name="John";
       s3.age = 22;
       s3.marks= 87;

       Student stu [] = new Student[3];
       stu[0]  = s1;   //This part of initialization of array elements is importan.
       stu[1]  = s2;
       stu[2]  = s3; 

       for(int i =0;i<stu.length;i++)//here we should start from 0 because array index is starts from 0.
       {
        System.out.println(stu[i].name+" "+stu[i].age+" "+stu[i].marks);
       }
       System.out.println("------------------------------------");
       System.out.println("Below output is from foreach loop(enhanced for loop)");
       for(Student stud  : stu)
       {
        System.out.println(stud.name+" "+stud.age+" "+stud.marks);
       }


       int num2 [] = new int[6];
       num2[0]=10;
       num2[1] =15;
       num2[2] =20;
       num2[3] =25;
       for(int i=0;i<num2.length;i++)
       {
        System.out.println(num2[i]);
       }

    }
}