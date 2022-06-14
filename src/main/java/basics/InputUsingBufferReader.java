package basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputUsingBufferReader {
    public static void main(String[] args) {

        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the command:");

        try {
            String s= br.readLine();
            System.out.println("command enter :"+ s);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
