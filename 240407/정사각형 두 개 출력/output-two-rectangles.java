import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int cnt = 0;
        
        while(cnt < 2){
            for(int i = 0; i < n; i++){
                for(int j = 0; j <n; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
            System.out.println();
            cnt++;
        }
        
    }
}