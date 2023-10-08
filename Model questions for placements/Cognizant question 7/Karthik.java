/*
 * There ia a class Student
 * sid int
 * name String
 * marks int
 * 
 * Take some information from students and show them on screen
 * 
 * 
 * input:
 * Enter id:
 * 10
 * Enter name :
 * raj
 * Enter marks :
 * 458
 * continue(Y or N)
 * Y
 * 
 */
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

class Student{
    private int sid;
    private String name;
    private int marks;

    public int getSid()
    {
        return sid;
    }
    public void setSid(int sid)
    {
        this.sid =sid;
    }
    public int getMarks()
    {
        return marks;
    }
    public void setMarks(int marks)
    {
        this.marks=marks;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public String toString()
    {
        return "Name : "+getName()+" id : "+getSid()+" Marks : "+getMarks();
    }
    //insted of getters and setters we can use constructors for private variable for assining values but we should use get methode for fetching the value or else we can use tostring().

}
public class Karthik {
    public static void main(String [] args)
    {
        Scanner scanner = new Scanner(System.in);
        List<Student> mystudents = new ArrayList<Student>();

        while(true)
        {
            Student student = new Student();//here we creating new student each time our iteration is occuring.
            System.out.println("Enter id");
            int id = Integer.parseInt(scanner.nextLine());
            System.out.println("Enter name");
            String name =scanner.nextLine();
            System.out.println("Enter marks ");
            String mar = scanner.nextLine();
            int marks =Integer.parseInt(mar);


            student.setMarks(marks);
            student.setName(name);
            student.setSid(id);
            mystudents.add(student);



            System.out.println("Data added.");
            System.out.println("Continue \"Y\" | \"N\"");
            String value = scanner.nextLine();
            if(value.equalsIgnoreCase("n"))
            {
                break;
            }
        }
        for (Student stu : mystudents)
        {
            System.out.println(stu);
        }
        scanner.close();

    }

    
}
