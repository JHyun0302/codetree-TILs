import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // StringTokenizer st = new StringTokenizer(br.readLine());

        int cnt =0;
        for(int i = 0; i <5; i++){
            int n = Integer.parseInt(br.readLine());
            if(n % 2 == 0){
                cnt++;
            }
        }
        System.out.print(cnt);
        
    }
}