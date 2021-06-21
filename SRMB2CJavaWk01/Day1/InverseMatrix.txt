import java.util.Scanner;

public class InverseMatrix {
    public static void main(String args[]) {
        int i, j;
        float determinant, temp;
        float mat[][] = new float[2][2];

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter elements of matrix row wise:");
        for (i = 0; i < 2; ++i)
            for (j = 0; j < 2; ++j)
                mat[i][j] = sc.nextFloat();

        determinant = (mat[0][0] * mat[1][1]) - (mat[0][1] * mat[1][0]);

        System.out.println("\ndeterminant = " + determinant);

        temp = mat[0][0];
        mat[0][0] = mat[1][1];
        mat[1][1] = temp;

        mat[0][1] = -mat[0][1];
        mat[1][0] = -mat[1][0];

        System.out.println("\nInverse of matrix is:");
        for (i = 0; i < 2; ++i) {
            for (j = 0; j < 2; ++j)
                System.out.print((mat[i][j] / determinant) + " ");

            System.out.print("\n");
        }
    }
}