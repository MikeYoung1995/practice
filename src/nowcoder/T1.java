package nowcoder;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
//20200927
public class T1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String strs = bf.readLine();
        System.out.println("year="+strs.substring(0,4));
        System.out.println("month="+strs.substring(4,6));
        System.out.println("date="+strs.substring(6));
    }

}
