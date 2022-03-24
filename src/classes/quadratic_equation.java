package classes;

public class quadratic_equation {
    private double a;
    private double b;
    private double c;

    public quadratic_equation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public quadratic_equation(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public quadratic_equation(double a) {
        this.a = a;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public int count_of_roots(){
        double D = b*b - 4*a*c;
        if (D == 0) {
            return 1;
        }
        else if (D > 0) {
            return 2;
        }
        else {
            return 0;
        }
    }

    public double[] roots_of_equation( ){
        if (count_of_roots() == 0) {
            double[] roots = new double[0];
            return roots;
        }
        else if (count_of_roots() == 1) {
            double x = -b/(2*a);
            double[] roots = new double[1];
            roots[0] = x;
            return roots;
        }
        else {
            double x1 = (-b+Math.pow(b*b - 4*a*c, 0.5))/(2*a);
            double x2 = (-b-Math.pow(b*b - 4*a*c, 0.5))/(2*a);
            double[] roots = new double[2];
            roots[0] = x1;
            roots[1] = x2;
            return roots;
        }
    }
}

