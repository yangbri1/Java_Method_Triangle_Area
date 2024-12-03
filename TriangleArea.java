public class TriangleArea {

    // main method where it all goes down
    public static void main(String[] args) {
        
        /* Area = (1/2) * base * height */

        // // initialize triangle's base and height variables to floating pt numbers
        // double triangleBase = 3.5;
        // double triangleHeight = 7.0;

        // double triangleBase2 = 4.0;
        // double triangleHeight2 = 10.0;

        // double triangleBase3 = 12.0;
        // double triangleHeight3 = 99.1;


        // // calculate area of quadrilateral (4-sides) currently 
        // double area = triangleBase * triangleHeight;
        // double area2 = triangleBase2 * triangleHeight2;
        // double area3 = triangleBase3 * triangleHeight3;
        // // recursively divide above quadrilateral by half for area of triangle
        // area /= 2;  // equivalent to area = area / 2;
        // area2 = area2 / 2;
        // area3 /= 2;
        
        // calling method 'calculateTriangle()' within the main method
        double area = calculateTriangle(3.5, 7.0);
        double area2 = calculateTriangle(4.0, 10.0);
        double area3 = calculateTriangle(12.0, 99.1);

        // print out area of triangle to console
        System.out.println("Area of la 1st triangle is " + area);
        System.out.println("Area of the 2nd triangle is " + area2);
        System.out.println("Area of the 3rd triangle is " + area3);

        // "javac TriangleArea.java"    -- to compile for Java class
        // "java TriangleArea"          -- to execute Java class (for output on CLI)
    }

    // method 'calculateTriangle()' takes in 2 double as parameters & return a double
    public static double calculateTriangle(double triangleBase, double triangleHeight){
        // calculate area of triangle
        double area = triangleBase * triangleHeight;
        area = area / 2;
        // return area
        return area;
    }
}
