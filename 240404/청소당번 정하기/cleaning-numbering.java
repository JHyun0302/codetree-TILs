import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();
        int a = 0;
        int b = 0;
        int c = 0;
        for(int i =1; i <= n; i++){
            if(i % 12 == 0){
                c++;
            }else if(i % 3 == 0){
                b++;
            }else if(i % 2 ==0){
                a++;
            }
        }
        sb.append(a).append(" ").append(b).append(" ").append(c).append(" ");
        System.out.println(sb.toString());
    }
}