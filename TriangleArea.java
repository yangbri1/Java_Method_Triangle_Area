public class TriangleArea {

    public static void main(String[] args) {
        
        /* Area = (1/2) * base * height */

        // initialize triangle's base and height variables to floating pt numbers
        double triangleBase = 3.5;
        double triangleHeight = 7.0;

        // calculate area of quadrilateral (4-sides) currently 
        double area = triangleBase * triangleHeight;
        // recursively divide above quadrilateral by half for area of triangle
        area /= 2;  // equivalent to area = area / 2;

        // print out area of triangle to console
        System.out.println("Area of the this triangle is " + area);

        // "javac TriangleArea.java"    -- to compile for Java class
        // "java TriangleArea"          -- to execute Java class (for output on CLI)
    }
}
