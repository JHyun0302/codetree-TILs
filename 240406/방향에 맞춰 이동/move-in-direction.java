import java.util.*;
import java.io.*;

public class Main {
    public static int n, x, y;
    public static int[] dx = new int[]{1,-1,0,0};
    public static int[] dy = new int[]{0,0,-1,1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());


        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String news = String.valueOf(st.nextToken());
            int dist = Integer.parseInt(st.nextToken());

            int dir = 0;
            if(news.equals("E")){
                dir = 0;
            }else if(news.equals("W")){
                dir = 1;
            }else if(news.equals("S")){
                dir = 2;
            }else {
                dir = 3;
            }
            x += dx[dir] * dist;
            y += dy[dir] * dist;
        }
        
        System.out.print(x + " " + y);
    }
}