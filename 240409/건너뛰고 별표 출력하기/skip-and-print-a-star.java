import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++){
            for(int j = n - i -1; j < n; j++){
                System.out.print("*");
                if(j == n -1){
                    System.out.println();
                }
            }
            System.out.println();
        }


        for(int i = 1; i < n; i++){
            for(int j = i; j < n; j++){
                System.out.print("*");
                if(j == n -1){
                    System.out.println();
                }
            }
            System.out.println();
        }
    }
}