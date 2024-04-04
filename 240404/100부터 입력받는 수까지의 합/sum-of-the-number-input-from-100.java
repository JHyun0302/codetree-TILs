import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        
        int n = Integer.parseInt(st.nextToken());
        int sum = 0;

        for(int i = n; i <= 100; i++){
            sum += i;
        }
        System.out.print(sum);
    }
}