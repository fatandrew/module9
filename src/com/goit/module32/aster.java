package com.goit.module32;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by User on 08.03.2016.
 */
public class Aster extends Flower {
    int offset = 3;

    public String encrypt(String s) throws IOException {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char t = s.charAt(i);
            if (t >= 'A' && t <= 'Z') {
                int t1 = t - 'A' + offset;
                t1 = t1 % 26;
                sb.append((char) (t1 + 'A'));
            } else if (t >= 'a' && t <= 'z') {
                int t1 = t - 'a' + offset;
                t1 = t1 % 26;
                sb.append((char) (t1 + 'a'));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        try {
            System.out.println("Caesar encryption technique:");
            BufferedReader b;
            String oriTxt, encTxt, decTxt;
            System.out.println("Enter string to encrypt:");
            b = new BufferedReader(new InputStreamReader(System.in));
            oriTxt = b.readLine();
            Aster c = new Aster();
            encTxt = c.encrypt(oriTxt);
            System.out.println("Encrypted text :" + encTxt);
          // decTxt=c.decrypt(oriTxt);
            //System.out.println("Decrypted text :"+decTxt);


        }
        catch (Exception e){
            System.out.println(e.toString());
        }
    }

}



