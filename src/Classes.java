
public class Classes{
    public static void main(String[] args){
        Triangle triangleA = new Triangle(15, 8, 15, 8, 17);
        Triangle triangleB = new Triangle(3, 2.598, 3, 3, 3);
        double triangleAArea = triangleA.findArea();
        // System.out.println(triangleAArea);
        double triangleBArea = triangleB.findArea();
        // System.out.println(triangleBArea);
        // System.out.println(Triangle.numOfSides);
        Students studentA = new Students("Fred", "Brander", 2024, 3.56, "Criminology");
        Students studentB = new Students("Opal", "Brander", 2025, 3.36, "Culinary Arts");
        System.out.println(studentA.firstName + " " + studentB.lastName);
        int studentBNewGrad = studentB.addYear();
        System.out.println(studentBNewGrad);
    }
}