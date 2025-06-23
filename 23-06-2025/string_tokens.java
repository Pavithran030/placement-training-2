import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String [] store = s.trim().split("[^A-Za-z]+");
                
        if(s.trim().isEmpty())
        {
            System.out.println(0);
            return;
        }
        System.out.println(store.length);
        for(String k:store)
        {    
            System.out.println(k);
        }
        scan.close();
    }
}

