

/*
 *
 * 
 *                                               Object
 *                                                |
 *                                                |
 *                                              Throwable
 *          ______________________________________|________________________________ 
 *         |                                                                       |     
 *      error                                                                   Exception        
 *      ex.                                                                          |
 *     thread dead                                        ___________________________|_____________________________    
 *     IOexception                                       |                               |                         |
 *     Virtual machine error(out of memory)             Runtime exception              SQL exception               IOexception
 *                                                      |
 *                                                      |--->Arithmatic excep
 *                                                      |
 *                                                      |--->Array indexout of bound
 *                                                      |
 *                                                      |-->Null pointer exception
 *                                                      |
 *                                                      |--> etc................
 * 
 * 
 * 
 * 
 * //here runtime exception are called unchecked exception because when we write the code line our compiler not force us to handle this exception (compiler tells it is your wish to handel this exception).
 * //but SQLexception and IOexception and some are called checked exception because our compiler force us to throws or try catch the error.
 * 
 * 
 * 
 * 
 * //in java the word ends with able means that is interface except throwable it is a class. this is only one exception for able.
 * 
 * 
 * 
 * 
 * //As a programmer if we want to keep our client happy we have to handle runtime exceptions.
 * 
 * 
 * 
 * 
 * 
 */



/*
 * 
 * 
 * Checked vs. Unchecked Exceptions: 
 * You mentioned that checked exceptions like SQLException and IOException force the programmer 
 * to handle them using throws or try-catch. This is generally correct. However, it's essential 
 * to clarify that checked exceptions are subclasses of Exception, whereas unchecked exceptions 
 * (like RuntimeException and its subclasses) are also part of the Exception hierarchy. 
 * So, technically, all exceptions in Java are derived from the Exception class, but the 
 * checked ones require explicit handling.
 * 
 * 
 * Runtime Exceptions: 
 * You correctly pointed out that runtime exceptions are unchecked exceptions. 
 * It's important to mention that these exceptions typically result from programming errors 
 * (e.g., division by zero, null pointer dereference, array index out of bounds) and should 
 * be handled through proper coding practices rather than extensive use of try-catch blocks.
 * 
 * 
 */




public class Karthik {
    
}
