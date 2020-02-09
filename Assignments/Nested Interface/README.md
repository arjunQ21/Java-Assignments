Nested Interface in Java
========================

An interface declared inside another interface or class is known as nested interface. The nested interfaces are used to group related interfaces so that they can be easy to maintain. The nested interface must be referred by the outer interface or class. It can't be accessed directly.

        //Syntax:
            //Nested Interface from Interface
            
            interface ParentIntf{
                ...
                interface ChildIntf{
                    ...
                }
            }
            
            //Nested Interface from Class
            
            class ClassName{
                ...
                interface ChildIntf{
                    ...
                }
            }
