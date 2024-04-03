import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();

        for(int i = 1; i <= n; i++){
            if(i % 3 == 0){
                sb.append("0").append(" ");
            } else if(i % 10 == 3 || i % 10 == 6 || i % 10 == 9){
                sb.append("0").append(" ");
            } else if(i / 10 == 3 || i / 10 == 6 || i / 10 == 9){
                sb.append("0").append(" ");
            }
            else{
                sb.append(i).append(" ");
            }
        }
        System.out.print(sb.toString());
    }
}