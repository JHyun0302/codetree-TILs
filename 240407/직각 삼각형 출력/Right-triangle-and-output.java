import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++){
            for(int j = 2 * (n - i) -1; j < 2 * n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}