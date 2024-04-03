import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        sb.append(a).append(" ");
        int i = a;
        while(true){
            
            if(i % 2 == 0){
                i += 3;
                sb.append(i).append(" ");
            }else{
                i *= 2;
                sb.append(i).append(" ");
            }
            if(i >= b){
                break;
            }
        }
        System.out.print(sb.toString());
    }
}