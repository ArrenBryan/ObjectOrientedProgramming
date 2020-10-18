package bab3.chapter7;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.*;

public class InputOutputFile {

    public static void main(String[] args) throws IOException {
        // File a.txt adalah:
            // Hello
            // World
            // 1
            // 1.1
            // true
        Scanner in = new Scanner(Paths.get("/media/storage/Users/Bryan/Documents/Project/Programming/Java/a.txt"), "UTF-8");
        int iniInteger = 0;
        while (in.hasNext()) {
            if (in.hasNextFloat()) {
                iniInteger += in.nextInt();
                continue;
            }
            in.next();
        }
        
        System.out.println(iniInteger);
        
        PrintWriter out = new PrintWriter("/media/storage/Users/Bryan/Documents/Project/Programming/Java/a.txt", "UTF-8");
    }
}
