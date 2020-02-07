Default Methods in Interface
============================

Before java 8, all methods in interface used to be *asbtract* methods. 
From java 8, the concept of default methods was introduced. These types of methods can be defined in the interface so that the classes implementing it dont always need to define these methods.
These are like backup methods for classes implementing an interface.
Code Example:

      interface TestInterface{
        default void test(){
          System.out.println("Test method from test interface.") ;
        }
      }
