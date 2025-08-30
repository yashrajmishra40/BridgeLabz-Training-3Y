package JavaMethod.Level3;

public class MatrixAdvanced {

    public static double[][] transpose(double[][] a) {
        int r = a.length, c = a[0].length;
        double[][] t = new double[c][r];
        for (int i = 0; i < r; i++) for (int j = 0; j < c; j++) t[j][i] = a[i][j];
        return t;
    }

    public static double det2(double[][] m) {
        return m[0][0]*m[1][1] - m[0][1]*m[1][0];
    }

    public static double det3(double[][] m) {
        double a = m[0][0], b = m[0][1], c = m[0][2];
        double d = m[1][0], e = m[1][1], f = m[1][2];
        double g = m[2][0], h = m[2][1], i = m[2][2];
        return a*(e*i - f*h) - b*(d*i - f*g) + c*(d*h - e*g);
    }

    public static double[][] inverse2(double[][] m) {
        double d = det2(m);
        if (Math.abs(d) < 1e-9) return null;
        double[][] inv = new double[2][2];
        inv[0][0] = m[1][1]/d; inv[0][1] = -m[0][1]/d;
        inv[1][0] = -m[1][0]/d; inv[1][1] = m[0][0]/d;
        return inv;
    }

    // inverse 3x3 using adjoint / determinant
    public static double[][] inverse3(double[][] m) {
        double d = det3(m);
        if (Math.abs(d) < 1e-9) return null;
        double[][] cof = new double[3][3];
        cof[0][0] =  (m[1][1]*m[2][2] - m[1][2]*m[2][1]);
        cof[0][1] = -(m[1][0]*m[2][2] - m[1][2]*m[2][0]);
        cof[0][2] =  (m[1][0]*m[2][1] - m[1][1]*m[2][0]);

        cof[1][0] = -(m[0][1]*m[2][2] - m[0][2]*m[2][1]);
        cof[1][1] =  (m[0][0]*m[2][2] - m[0][2]*m[2][0]);
        cof[1][2] = -(m[0][0]*m[2][1] - m[0][1]*m[2][0]);

        cof[2][0] =  (m[0][1]*m[1][2] - m[0][2]*m[1][1]);
        cof[2][1] = -(m[0][0]*m[1][2] - m[0][2]*m[1][0]);
        cof[2][2] =  (m[0][0]*m[1][1] - m[0][1]*m[1][0]);

        double[][] adj = transpose(cof);
        double[][] inv = new double[3][3];
        for (int r = 0; r < 3; r++) for (int c = 0; c < 3; c++) inv[r][c] = adj[r][c] / d;
        return inv;
    }

    public static void printMatrix(double[][] m) {
        for (double[] row : m) {
            for (double v : row) System.out.printf("%8.3f ", v);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        double[][] m2 = {{4,7},{2,6}};
        System.out.println("Matrix 2x2:");
        printMatrix(m2);
        System.out.println("Transpose:");
        printMatrix(transpose(m2));
        System.out.println("Determinant: " + det2(m2));
        System.out.println("Inverse:");
        double[][] inv2 = inverse2(m2);
        if (inv2 != null) printMatrix(inv2);
        else System.out.println("Not invertible");

        double[][] m3 = {{1,2,3},{0,1,4},{5,6,0}};
        System.out.println("\nMatrix 3x3:");
        printMatrix(m3);
        System.out.println("Transpose:");
        printMatrix(transpose(m3));
        System.out.println("Determinant: " + det3(m3));
        System.out.println("Inverse:");
        double[][] inv3 = inverse3(m3);
        if (inv3 != null) printMatrix(inv3);
        else System.out.println("Not invertible");
    }
}
