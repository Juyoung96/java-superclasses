// Circle.java
// Superclass

  /*
   * Superclass : CIRCLE
   * private double radius;
   * empty constructor() -> sets radius to 1.0
   * getRadius() -> returns double
   * setRadius( double )
   * public double findArea() -> pi * r^2
   */
public class Circle {
   
  // Instance Variables
  // radius;
  private double radius;
  
  // Constructor
  // empty constructor, radius = 1.0;
  public Circle() {
   radius = 1.0;
  }
  
  // Methods
  // getter(), setter(), findArea()
  public double getRadius() {
   return radius; 
  }
  public void setRadius( double r ) {
   radius = r; 
  }
  public double findArea() {
   return Math.PI*Math.pow(radius,2); 
  }

  
} // END Circle class