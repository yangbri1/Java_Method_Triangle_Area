public class TriangleArea {

    public static void main(String[] args) {
        
        /* Area = (1/2) * base * height */

        // initialize triangle's base and height variables to floating pt numbers
        double triangleBase = 3.5;
        double triangleHeight = 7.0;

        double triangleBase2 = 4.0;
        double triangleHeight2 = 10.0;

        double triangleBase3 = 12.0;
        double triangleHeight3 = 99.1;


        // calculate area of quadrilateral (4-sides) currently 
        double area = triangleBase * triangleHeight;
        double area2 = triangleBase2 * triangleHeight2;
        double area3 = triangleBase3 * triangleHeight3;
        // recursively divide above quadrilateral by half for area of triangle
        area /= 2;  // equivalent to area = area / 2;
        area2 = area2 / 2;
        area3 /= 2;

        // print out area of triangle to console
        System.out.println("Area of this triangle is " + area);
        System.out.println("Area of the 2nd triangle is " + area2);
        System.out.println("Area of the 3rd triangle is " + area3);

        // "javac TriangleArea.java"    -- to compile for Java class
        // "java TriangleArea"          -- to execute Java class (for output on CLI)
    }
}
