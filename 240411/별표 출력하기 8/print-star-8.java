import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++){
            if(i % 2 == 0){
                System.out.println("*");
            }   
            else{
                for(int j = 0; j < i+1; j++){
                    System.out.print("* ");
                }
                System.out.println();
            }                     
        }
    }
}