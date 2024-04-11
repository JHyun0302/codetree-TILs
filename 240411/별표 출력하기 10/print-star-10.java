import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for(int i =0; i < n; i++){
            if(i % 2 ==0){
                for(int j = 0; j < 1 + (i /2); j++){
                    System.out.print("* ");
                }
            }else{
                 for(int k = 0; k < n - (i - 1) /2; k++){
                    System.out.print("* ");
                }
            }
            System.out.println();
        }

        for(int i =n -1; i >= 0; i--){
            if(i % 2 ==0){
                for(int j = 0; j < 1 + (i /2); j++){
                    System.out.print("* ");
                }
            }else{
                 for(int k = 0; k < n - (i - 1) /2; k++){
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}