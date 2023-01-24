package org.practice;

import java.io.FileOutputStream;

public class FileOutput {
    public static void main(String[] args) {
        try{
            FileOutputStream fout=new FileOutputStream("C:\\testout\\testout.txt");
            fout.write(60);
            fout.close();
            System.out.println("success...");
        }
        catch(Exception e ){
            System.out.println(e);
        }
    }
}
