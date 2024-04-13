import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < 2 * n; i++){
            if(i % 2 == 0){
                for(int j = i / 2; j < n; j++){
                    System.out.print("* ");
                }
            }else{
                for(int k = n - (i / 2); k <= n; k++){ 
                    System.out.print("* ");

                }
            }
            System.out.println();
        }
    }
}