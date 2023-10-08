
class A{
    public void show ()
    {
        System.out.println("in a class show()");
    }
}
class b extends A{
    @Override
    public void show()
    {
        System.out.println("in b class show()");
    }
}
class c{
    public static void show ()
    {
        System.out.println("in c class show()");
    }
}

class d extends c{
    // public void show() // so we can't override a static methode.
    // {
    //     System.out.println("in d class show()");
    // }
}

class dd{
    public void show()
    {
        System.out.println("in dd class show()");
    }
}
class ee extends dd{
 
}

class Karthik {
    public static void main(String[] args) {
        b b = new b();
        b.show();
        A a = new b();
        a.show();
       /* b b1 = new a();
          b1.show();   */ //this is error we can't do this.

        dd d = new ee();
        d.show();

    //in c# we use new keyword to hide the child class methode when we overridding.
       
    }
}

// we can't override a static methode.
//because static methode is not a part of runtime polymorphism.
// is there any virtual function in java similar to c++,
// Java doesnot have a virtual function but all non static method are we can say it is virtual.