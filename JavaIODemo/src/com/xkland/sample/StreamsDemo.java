package com.xkland.sample;

import java.io.*;

public class StreamsDemo {
	public static void copyBytes(String filename){
		InputStream in = null;
        try{
            in = new FileInputStream(filename);
            int c;
            while((c = in.read()) != -1) {  //这里用到read()
                System.out.write(c);        //这里用到write()
            }
        }catch(FileNotFoundException e){
            System.out.println("File not found.");
        }catch(IOException e){
            System.out.println("I/O failed.");
        }finally{
            if(in != null){
                try {
                    in.close();
                }catch(IOException e){
                    //关闭流时产生的异常，直接抛弃
                }
            }
        }
	}
}
