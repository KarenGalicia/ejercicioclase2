package umg.progra2.grupo1;


public class clsgrupo1 {
    public static void main(String[] args) {

        double radius = 6.0;
        double area = Math.PI * Math.pow(radius, 2);

        System.out.println("El área del circulo con radio " + radius + " es: " + area);

        // Calcula la circunferencia del círculo
        double circumference = 2 * Math.PI * radius;

        System.out.println("La circunferencia del círculo con radio " + radius + " es: " + circumference);

    }
}



