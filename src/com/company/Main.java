package com.company;

import classes.Arrays;
import classes.Vector;
import classes.quadratic_equation;

public class Main {

    public static void main(String[] args) {
        EquationTest();
        ArraysTest();
        VectorTest();
    }

    public static void EquationTest() {
        System.out.println("Equation Test:");
        quadratic_equation equation = new quadratic_equation(4, -5, 1);
        System.out.println("The number of roots of the equation: " + equation.count_of_roots());

        double[] roots = equation.roots_of_equation();
        if (roots.length > 0) {
            System.out.print("Roots of the equation: ");
            for (int i = 0; i < roots.length; i++) {
                System.out.print(roots[i] + "  ");
            }
        }
        System.out.println("\n_______");
    }

    public static void ArraysTest() {
        System.out.println("Arrays Test:");
        Arrays array = new Arrays();
        array.AddElement(5);
        array.AddElement(2);
        array.AddElement(1);
        array.AddElement(4);
        array.AddElement(3);
        System.out.println("Average: " +  array.Average());
        System.out.println("Max Element: " +  array.MaxElement());
        System.out.println("_______");
    }

    public static void VectorTest() {
        System.out.println("Vector Test:");
        double [] coordinates_1 = {4.0, -5.0, 1.0, 2.0};
        Vector First_vector = new Vector(coordinates_1);

        double [] coordinates_2 = {-5.0, 7.0, 4.0, -5.0};
        Vector Second_vector = new Vector(coordinates_2);

        System.out.println("Scalar product: " + First_vector.Scalar_product(Second_vector));

        Vector Third_vector = First_vector.Addition_of_vectors(Second_vector);
        System.out.print("Addition of vectors: ");
        System.out.println("[" + Third_vector.getI() + ", " + Third_vector.getJ() + ", " + Third_vector.getK() + ", " + Third_vector.getT() + "]");

        Vector Fourth_vector = Second_vector.Subtracting_of_vectors(First_vector);
        System.out.print("Subtracting of vectors: ");
        System.out.println("[" + Fourth_vector.getI() + ", " + Fourth_vector.getJ() + ", " + Fourth_vector.getK() + ", " + Fourth_vector.getT() + "]");

        System.out.println("Length of vector: " + First_vector.Length());

        System.out.println("Angle between vectors: " + First_vector.Angle_between_vectors(Second_vector) + " degrees");

        System.out.println("Parallelogram area: " + First_vector.Parallelogram_area(Second_vector));
        System.out.println("_______");
    }
}
