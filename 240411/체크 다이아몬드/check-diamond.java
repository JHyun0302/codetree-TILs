import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++){
            for(int j = i; j < n -1; j++){
                System.out.print(" ");
            }

            for(int k = n - 1 - i; k < n; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        
        for(int i = 0; i < n; i++){
            for(int j = n - 1 - i; j < n; j++){
                System.out.print(" ");
            }

            for(int k = i; k < n -1; k++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}