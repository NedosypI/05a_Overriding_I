package com.cc.java;

/*ich erweitere meinen Code durch extends 
*der in der Klasse Parent stehen wird
*Klase Child (erbt von Parent)
*/
public class Child extends Parent{
 
/*nicht statische Methoden werden im Object ausgeführt 
 * Public ist eine öffentliche Methode die im 
 * Object ausgefürt werden kann
*/

public void sayHello() {
    System.out.println("Hello from Child");
}


}
