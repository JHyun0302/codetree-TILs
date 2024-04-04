import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int three =0;
        int five =0;

        for(int i =0; i < 10; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            
            int num = Integer.parseInt(st.nextToken());
            if(num % 3 == 0){
                three++;
            }if(num % 5 == 0){
                five++;
            }
        }
        System.out.println(three + " " + five);
    }
}