package com.example.interviewtests;

/**
 * @see SubclassTest
 */
public class InterfaceTest  {
    // see SubclassTest
    public static void main(String[] args) {
        System.out.println(SomeInnerClass.k);
    }
    class SomeInnerClass implements InterfaceTest.Foo {

}



    public interface Foo
    {
        int k = 4; /* Line 3 */
    }
//    Which three piece of codes are equivalent to line 3?
//    1. final int k = 4;
//    2. public int k = 4;
//    3. static int k = 4;
//    4. ...

//    (1), (2) and (3) are correct. Interfaces can have constants, which are always
// implicitly public, static, and final. Interface constant declarations of public,
// static, and final are optional in any combination.


//       Which is the valid declarations within an interface definition?
//    A.	public double methoda();   !!!!!!!!!!!!!
//    B.	public final double methoda();
//    C.	static void methoda(double d1);
//    D.	protected void methoda(double d1);
//
//    Option A is correct. A public access modifier is acceptable. The method prototypes in an interface are all abstract
//    by virtue of their declaration, and should not be declared abstract.
//    Option B is wrong. The final modifier means that this method cannot be constructed in a subclass.
//    A final method cannot be abstract.
//    Option C is wrong. static is concerned with the class and not an instance.
//    Option D is wrong. protected is not permitted when declaring a method of an interface. See information below.
//    Member declarations in an interface disallow the use of some declaration modifiers; you cannot use transient,
//    volatile, or synchronized in a member declaration in an interface. Also, you may not use the private and protected
//    specifiers when declaring members of an interface.








}
