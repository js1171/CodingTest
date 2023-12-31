import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int answer = 0;

        for (int i=0 ; i < count ; i++) {
            int num = Integer.parseInt(st.nextToken());

            for(int j=2 ; j <= num ; j++) {
                if(j==num) answer++;
                if(num%j==0) break;
            }
        }
        System.out.println(answer);
    }
}