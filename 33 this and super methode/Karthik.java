

//remember when we create a object for a class it will call constructor of both sub class and super class.
//so here both parent and child class constructor is called (super class and sub class), when we create a object for a derived class.


//Every constructor in java has a methode called super();  you cant see it.
//That super methode inside each constructor is hidden.
//if we not mention that super also it is present. (its there, we cant see it). 

//every class in java extends Object class.
//if we not extends also defaultly every class in java extends Object class.(we cant see it).
//its there we cant see it.


class a{
    public a()
    {
        super();  //defaultly it is super in all java constructors.
        System.out.println("in a");
    }
    public a(int a)
    {
        super();
        System.out.println("in a int");
    }
}

class b extends aa{
    public b()
    {
        super(); //we cant make this as this.
        System.out.println("in b");
    }
    public b(int a)
    {
        this(); //this will execute int b so super as "in a" then "in b"  then "in b int".
        System.out.println("in b int");
    }
}

class c extends a{
    public c()
    {
        super();  //defaultly it is super in all java constructors.
        System.out.println("in c");
    }
    public c(int a)
    {
        super();
        System.out.println("in c int");
    }
}
class d extends a{
    public d()
    {
        super();  //defaultly it is super in all java constructors.
        System.out.println("in d");
    }
    public d(int a)
    {
        super(15);
        System.out.println("in d int");
    }
}

class aa{
    public aa()
    {
        super();  //defaultly it is super in all java constructors.
        System.out.println("in aa");
    }
    public aa(int a)
    {
        this();
        System.out.println("in aa int");
    }
}

class aa2 extends aa{
    public aa2()
    {
        super(15);  //defaultly it is super in all java constructors.
        System.out.println("in aa2");
    }
    public aa2(int a)
    {
        this();
        System.out.println("in aa2 int");
    }
}

class bb {
    public bb()
    {
        super(); //here it calls java object class super.  
        System.out.println("in bb");
    }
    public bb(int a)
    {
        super();
        System.out.println("in bb int");
    }
}

public class Karthik {
    public static void main(String [] args)
    {
        c c1 = new c();

                                 System.out.println("-----------------------------------");

        c c2 = new c(15);

                                 System.out.println("-----------------------------------");

        d  d1 = new d(15); 

                                  System.out.println("-----------------------------------");
        b b1 = new b(15);
                                  System.out.println("-----------------------------------");
        aa2 aa2 = new aa2(15);
                                  System.out.println("-----------------------------------");
        aa obj1 = new aa(15);
                                  System.out.println("-----------------------------------");
        bb obj2 = new bb(15);

    } 
}

//this is how super and this methodes are used in constructors.


// this methode excecute the constructor of this class. 
//super methode execute the constructor of super class.
