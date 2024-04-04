import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int sum =0;
        double avg;
        for(int i = 0; i < n; i++){
            int num = Integer.parseInt(br.readLine().trim());
            sum += num;
        }

        avg = (double) sum / n;
        System.out.printf("%d %.1f",sum, avg);
    }
}