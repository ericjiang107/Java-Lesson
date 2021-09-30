// *Connected to class.java*

public class Main {

    public static void main(String[] args) {

        // calling the Triangle constructor method: 
        Triangle triangleA = new Triangle(15, 8, 15, 8, 17);
        Triangle triangleA = new Triangle(3, 2.598, 3, 3, 3);

        // calculating the area of each triangle: --> we declared the findArea function too in class.java
        double triangleAArea = triangleA.findArea();
        System.out.println(triangleAArea);

        double triangleBArea = triangleB.findArea();
        System.out.println(triangleBArea);
    }
}