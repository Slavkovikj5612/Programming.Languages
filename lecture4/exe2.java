public class exe2 {
    public static void main(String[] args) {
        double decimalVariable = 5.0;
     
        double sin = Math.sin(decimalVariable);
        double cosin = Math.cos(decimalVariable);
        double tangent = Math.tan(decimalVariable);
        double cotangent = 1 / tangent;
     
        double squareRoot = Math.sqrt(decimalVariable);
        double square = Math.pow(decimalVariable, 2);
        double cube = Math.pow(decimalVariable, 3);

        double valueCeil = Math.ceil(decimalVariable);
        double valueFloor = Math.floor(decimalVariable);
        double valueRound = Math.round(decimalVariable);

        double radius = decimalVariable;
        double areaOfCircle = Math.PI * Math.pow(radius, 2);

        System.out.println("Sine: " + sin);
        System.out.println("Cosine: " + cosin);
        System.out.println("Tangent: " + tangent);
        System.out.println("Cotangent: " + cotangent);
        System.out.println("Square Root: " + squareRoot);
        System.out.println("Square: " + square);
        System.out.println("Cube: " + cube);
        System.out.println("Smallest Integer Larger or Equal: " + valueCeil);
        System.out.println("Largest Integer Smaller or Equal: " + valueFloor);
        System.out.println("Nearest Integer: " + valueRound);
        System.out.println("Area of a Circle: " + areaOfCircle);

        System.out.println("Value of Pi: " + Math.PI);
        System.out.println("Value of E: " + Math.E);
    }
}
