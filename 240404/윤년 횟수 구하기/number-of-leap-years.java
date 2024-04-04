import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int ans = 0;
        for(int i = 1; i <= n; i++){
            if(i % 100 == 0&& i % 400 != 0){
                ans--;        
            }
            if(i % 4 == 0){
                ans++;
            }
        }
        System.out.print(ans);
    }
}