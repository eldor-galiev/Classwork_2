package classes;

public class Vector {
    private double [] coords;

    public Vector(double [] coordinates) {
        this.coords = coordinates;
    }

    public double getI() {return coords[0];}
    public double getJ() {return coords[1];}
    public double getK() {return coords[2];}
    public double getT() {return coords[3];}

    public double Scalar_product(Vector second_vector) {
        double scalar_product = 0;
        for (int i = 0; i < 4; i++) {
            scalar_product += coords[i] * second_vector.coords[i];
        }
        return scalar_product;
    }

    public Vector Addition_of_vectors(Vector second_vector) {
        double [] coordinates = new double[4];
        for (int i = 0; i < 4; i++) {
            coordinates[i] += coords[i] + second_vector.coords[i];
        }
        Vector third_vector = new Vector(coordinates);
        return third_vector;
    }

    public Vector Subtracting_of_vectors (Vector second_vector) {
        double [] coordinates = new double[4];
        for (int i = 0; i < 4; i++) {
            coordinates[i] += coords[i] - second_vector.coords[i];
        }
        Vector third_vector = new Vector(coordinates);
        return third_vector;
    }
    public double Length() {
        double len = 0;
        for (int i = 0; i < 4; i++) {
            len += Math.pow(coords[i], 2);
        }
        return Math.pow(len, 0.5);
    }

    public double Angle_between_vectors(Vector second_vector) {
        double angle = Math.acos((this.Scalar_product(second_vector)) / (this.Length() * second_vector.Length()));
        return angle;
    }

    public double Parallelogram_area(Vector second_vector) {
        double area = Math.sin(this.Angle_between_vectors(second_vector)) * this.Length() * second_vector.Length();
        return area;
    }

}
