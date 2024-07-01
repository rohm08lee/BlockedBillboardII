import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    // Really similar to the video solution
    // There are 6 cases of possible rectangles that can form.
    // Like being overshadowed, only hiding a part below or above or to the left or to the right,
    // and not intersecting at all.
    static int N = 10;
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new FileReader("billboard.in"));
        PrintWriter pw = new PrintWriter("billboard.out");
        int[] x = new int[5];
        int[] y = new int[5];
        for (int i = 1; i <= 4; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }

        if (x[4] >= x[2] && x[3]<= x[1] && y[4] >= y[2] && y[3] <= y[1]) {
            pw.println(0);
        } else if (x[3] <= x[1] && y[3] <= y[1] && y[4] > y[1] && x[4] >= x[2]){
            pw.println((x[2] - x[1]) * (y[2] - y[4]));
        } else if (y[3] < y[2] && x[3] <= x[1] && y[4] >= y[2] && x[4] >= x[2]) {
            pw.println((x[2] - x[1]) * (y[3] - y[1]));
        } else if (x[4] > x[1] && x[3] <= x[1] && y[4] >= y[2] && y[3] <= y[1]) {
            pw.println((x[2] - x[4]) * (y[2] - y[1]));
        } else if (x[3] < x[2] && x[4] >= x[2] && y[4] >= y[2] && y[3] <= x[1]) {
            pw.println((x[3] - x[1]) * (y[2] - y[1]));
        } else {
            pw.println((x[2] - x[1]) * (y[2] - y[1]));
        }
        pw.close();
    }
}