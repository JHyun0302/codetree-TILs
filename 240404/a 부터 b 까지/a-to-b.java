import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

    
        int i = a;
        while(i <= b){
            if(i % 2 == 0){
                sb.append(i).append(" ");
                i += 3;
            }else{
                sb.append(i).append(" ");
                i *= 2;
            }
        }
        System.out.print(sb.toString());
    }
}