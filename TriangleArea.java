public class TriangleArea {

    // main method where it all goes down
    public static void main(String[] args) {
        
        /* Area = (1/2) * base * height */

        // calling method 'calculateTriangle()' within the main method
        double area = calculateTriangle(3.5, 7.0);
        System.out.println("Area of la 1st triangle is " + area);

        // re-initialize variable 'area' with new double arguments for 2nd triangle
        area = calculateTriangle(4.0, 10.0);
        System.out.println("Area of the 2nd triangle is " + area);

        // invoke 'calculateTriangle()' method with another set of double args for 3rd triangle
        area = calculateTriangle(12.0, 99.1);
        System.out.println("Area of the 3rd triangle is " + area);

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
