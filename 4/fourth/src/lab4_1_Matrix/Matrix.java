package lab4_1_Matrix;

public class Matrix {
    private double[][] data;
    private int rows;
    private int cols;

    public Matrix(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.data = new double[rows][cols];
    }

    public Matrix add(Matrix other) {
        if (this.rows != other.rows || this.cols != other.cols) {
            throw new IllegalArgumentException("Матрицы имеют разные размеры");
        }

        Matrix result = new Matrix(rows, cols);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result.data[i][j] = this.data[i][j] + other.data[i][j];
            }
        }

        return result;
    }

    public Matrix multiply(double scalar) {
        Matrix result = new Matrix(rows, cols);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result.data[i][j] = this.data[i][j] * scalar;
            }
        }

        return result;
    }

    public void print() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }

//    public Matrix multiply(Matrix other) {
//        if (this.cols != other.rows) {
//            throw new IllegalArgumentException("Нельзя умножить матрицы с данными размерами");
//        }
//
//        Matrix result = new Matrix(this.rows, other.cols);
//        for (int i = 0; i < this.rows; i++) {
//            for (int j = 0; j < other.cols; j++) {
//                for (int k = 0; k < this.cols; k++) {
//                    result.data[i][j] += this.data[i][k] * other.data[k][j];
//                }
//            }
//        }
//
//        return result;
//    }

    public static void main(String[] args) {
        Matrix matrix1 = new Matrix(2, 3);
        matrix1.data[0][0] = 1;
        matrix1.data[0][1] = 2;
        matrix1.data[0][2] = 3;
        matrix1.data[1][0] = 4;
        matrix1.data[1][1] = 5;
        matrix1.data[1][2] = 6;

        Matrix matrix2 = new Matrix(2, 3);
        matrix2.data[0][0] = 7;
        matrix2.data[0][1] = 8;
        matrix2.data[0][2] = 9;
        matrix2.data[1][0] = 10;
        matrix2.data[1][1] = 11;
        matrix2.data[1][2] = 12;

        System.out.println("Матрица 1:");
        matrix1.print();

        System.out.println("Матрица 2:");
        matrix2.print();

        Matrix sum = matrix1.add(matrix2);
        System.out.println("Сумма матриц:");
        sum.print();

        Matrix product = matrix1.multiply(2.0);
        System.out.println("Умножение матрицы на число:");
        product.print();
    }
}

