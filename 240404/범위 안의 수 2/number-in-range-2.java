import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int sum =0;
        int cnt = 0;
        double avg;
        for(int i = 0; i < 10; i++){
            int num = Integer.parseInt(br.readLine().trim());
            if(num >= 0 && num <= 200){
                sum += num;
                cnt++;
            }
        }
        avg = (double) sum / cnt;
        System.out.printf("%d %.1f", sum, avg);
    }
}