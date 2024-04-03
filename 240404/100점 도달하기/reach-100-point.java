import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());

        for(int i = n; i <= 100; i++){
            if(i >= 90){
                System.out.print("A ");
            }else if(i >= 80 && i < 90){
                System.out.print("B ");
            }else if(i >= 70 && i < 80){
                System.out.print("C ");
            }else if(i >= 60 && i < 70){
                System.out.print("D ");
            }else{
                System.out.print("F ");
            }
        }
    }
}