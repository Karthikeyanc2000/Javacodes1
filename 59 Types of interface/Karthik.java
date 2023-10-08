/*
 * 
 * 
 * 
 *                             types of interfaces
 *                                      |
 *                                      |
 *           ___________________________|___________________________________
 *          |                           |                                   |  
 *  normal interface             functional interface/SAM              marker interface                
 * 
 *  ex:                           ex:                                  ex:
 *  interface A{                  interface A{                        interface Abc{
 *  void show();                    void show();                              
 *  void  conf();                   }                                     }
 *   }
 *    
 * 
 * in normal interface we can have many abstract methods that is by default public abstract.
 * (if we not mention also the methods inside interface is public abstract, we cant see it)
 * 
 * 
 * 
 * in functional interface we should have only one abstract method in it.
 * functional interface is also called as SAM single abstract method.
 * here only we can able to use Lambda expressions.
 * So Lambda expression is applicable only in functional interface.
 * 
 * 
 * 
 * in marker interface we not having any method
 * marker interface used for serialisation.
 * 
 * serialization means storing values from heap to hard disk ex: in games we save game play after saving the game play our folder size is only in kb but while running the game it occupies 5gb in our ram.
 * deserialization means loading the data from hard drive to heap.ex loading our saves game data.
 * in these types of operation marker interface is used.
 * in frame works also this interface is used .
 * 
 */
public class Karthik {
    
}
