// Cyclinder.java
// Subclass of Circle.java

public class Cylinder extends Circle {
  
  // Instance Variables
  private double height;
  
  // Constructor
  public Cylinder() {
    super();
   height = 1.0; 
  }
  
  // Methods
  public double getHeight() {
   return height; 
  }
  public void setHeight( double h ) {
   height = h; 
  }
  public double findVolume() {
    return super.findArea()* height;
  }
 
} // END Cylinder class