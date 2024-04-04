import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int sum =0;
        for(int i =a; i <= b; i++){
            if(i % 2 ==0){
                sum += i;
            }
        }
        System.out.print(sum);
    }
}