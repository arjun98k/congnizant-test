package string;

import java.io.*;

public class Wordcounttxt {
    public static void main(String[] args) throws IOException {
        String line;
        int count = 0;
        int fo = 1;
        FileReader file = new FileReader("C:\\Users\\Akash\\OneDrive\\Desktop\\Congizant prog\\progem\\src\\string\\ak.txt");
        BufferedReader br = new BufferedReader(file);

        while ((line = br.readLine()) != null ){
            String word[] = line.split("\\s+");
            count += word.length;
        }
        System.out.println("the number of word present in given file:  "+ count);
        br.close();
    }
}
