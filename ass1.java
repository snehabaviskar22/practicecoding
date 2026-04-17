import java.util.Scanner;

abstract class shape {
    abstract void area();
    abstract void volume();
}

class Cone extends shape {
    double r, l, h;

    Cone(double r, double l, double h) {
        this.r = r;
        this.l = l;
        this.h = h;
    }

    void area() {
        double area = 3.14 * r * (r + l);
        System.out.println("Cone Area = " + area);
    }

    void volume() {
        double volume = (3.14 * r * r * h) / 3;
        System.out.println("Cone Volume = " + volume);
    }
}

class Cylinder extends shape {
    double r, h;

    Cylinder(double r, double h) {
        this.r = r;
        this.h = h;
    }

    void area() {
        double area = 2 * 3.14 * r * (r + h);
        System.out.println("Cylinder Area = " + area);
    }

    void volume() {
        double volume = 3.14 * r * r * h;
        System.out.println("Cylinder Volume = " + volume);
    }
}

public class ass1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter radius, slant height and height for cone:");
        double r = sc.nextDouble();
        double l = sc.nextDouble();
        double h = sc.nextDouble();

        Cone c = new Cone(r, l, h);
        c.area();
        c.volume();

        System.out.println("Enter radius and height for cylinder:");
        double r2 = sc.nextDouble();
        double h2 = sc.nextDouble();

        Cylinder cy = new Cylinder(r2, h2);
        cy.area();
        cy.volume();
        
        sc.close();
    }
}