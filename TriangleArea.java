public class TriangleArea {

    // main method where it all goes down
    public static void main(String[] args) {

        // // calling method 'calculateTriangle()' within the main method
        // double area = calculateTriangle(3.5, 7.0);
        // double area2 = calculateTriangle(4.0, 10.0);
        // double area3 = calculateTriangle(12.0, 99.1);

        // // print block to output area of triangle to console
        // System.out.println(area);
        // System.out.println(area2);
        // System.out.println(area3);
        
        // invoking 'calculateTriangle()' method here to print out results
        calculateTriangle(3.5, 7.0);
        calculateTriangle(4.0, 10.0);
        calculateTriangle(12.0, 99.1);

        // "javac TriangleArea.java"    -- to compile for Java class
        // "java TriangleArea"          -- to execute Java class (for output on CLI)
    }

    // method 'calculateTriangle()' takes in 2 double as parameters & return nothing (void)
    /* Aside: Area of Triangle = (1/2) * base * height */
    public static void calculateTriangle(double triangleBase, double triangleHeight){
        // calculate area of triangle
        double area = (triangleBase * triangleHeight) / 2;
        
        // typecasting variable 'area' of double type to String
        String result = "Area of this triangle is " + area;
        
        System.out.println(result);
        // return area
        // return result;
    }
}
