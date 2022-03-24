package classes;

public class Arrays {
    private double [] arr;

    public Arrays() {
        this.arr = new double[0];
    }

    public void AddElement(double NewElement) {
        double[] NewArr = new double[arr.length + 1];
        boolean Added = false;
        if (arr.length > 0) {
            int i = 0;
            while (arr[i] < NewElement) {
                NewArr[i] = arr[i];
                i++;
            }
            NewArr[i] = NewElement;
            for (i = i + 1; i < arr.length + 1; i++) {
                NewArr[i] = arr[i-1];
            }
        } else {
            NewArr[0] = NewElement;
        }
        this.arr = NewArr;

    }

    public double MaxElement() {
        return arr[arr.length-1];
    }

    public double Average() {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum/arr.length;
    }
}
