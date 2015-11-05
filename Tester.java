/*
 * Project: Tester.java
 * Description: Tests our super and subclasses
 * Name: Juyoung Lee
 * Date: Nov 4, 2015
 */

public class Tester {
  
  public static void main( String[] args ) {
    
    // Test the bikes
    Bicycle b = new Bicycle();
    MTB m = new MTB();
    
    b.speedUp( 24 );
    m.speedUp( 34 );
    
    System.out.println( "The bike is going " + b.getSpeed() + " km/hr");
    System.out.println( "The mtn bike is going " + m.getSpeed() + " km/hr");
    
    // Test the shapes
    Circle c = new Circle();
    Cylinder cy = new Cylinder( );
 
    System.out.println( "The area of the first circle is: " + c.findArea() );
    System.out.println( "The area of the cylinder circle is " + cy.findArea() );
    System.out.println( "The volume of the cylnder is: " + cy.findVolume() );

    //Test the Abstract class
    System.out.println();
    
    Square sq = new Square();
    System.out.println( "Square area is: " + sq.findArea( sq.getLength(), sq.getWidth() ) );
    
    // Test the Interface
    System.out.println();
    
    Shark shark = new Shark();
    shark.hunt();
    shark.eat();
    shark.swim();
    shark.run();
    shark.jump();
    shark.hide();
    
  } // END main method
  
} // END tester class