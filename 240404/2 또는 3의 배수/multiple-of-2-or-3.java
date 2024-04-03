import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        
        for(int i = 1; i <= n; i++){
            if(i % 2 ==0 || i % 3 == 0){
                System.out.print("1 ");
            }else{
                System.out.print("0 ");
            }
        }        
    }
}