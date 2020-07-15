/**
 * Created by KPS on 7/15/2020.
 */
public class Main {
    public static void main(String[] args) {
        int  i = 0;
        while (i < 10000){
            if (isAbuntan(i)){
                System.out.println(i);
            }
            i++;
        }
    }

    private static boolean isAbuntan(int i) {
        int sum = 0;
        for (int j = 1 ; j < i;j++ ){
            if (i%j==0)sum+=j;
        }
        return sum>i;
    }
}
