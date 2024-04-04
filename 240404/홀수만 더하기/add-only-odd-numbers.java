import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int sum =0;

        for(int i = 0; i < n; i++){
            int num = Integer.parseInt(br.readLine());
            if(num % 2 == 1 && num % 3 == 0){
                sum += num;
            }
        }
        System.out.print(sum);
    }
}