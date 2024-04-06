import java.util.*;
import java.io.*;

public class Main {
    static int n, x, y;
    static int currDir = 3;
    static int[] dx = new int[]{1,0,-1,0};
    static int[] dy = new int[]{0,-1,0,1};

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String commend = String.valueOf(br.readLine());

        for(int i = 0; i < commend.length(); i++){
            char dir = commend.charAt(i);

            if(dir == 'L'){
                currDir = (currDir - 1 +4) % 4;
            }else if(dir == 'R'){
                currDir = (currDir + 1) % 4;
            }else{
                x += dx[currDir];
                y += dy[currDir];
            }
        }
        System.out.print(x + " " + y);
    }
}