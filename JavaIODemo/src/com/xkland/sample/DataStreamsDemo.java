package com.xkland.sample;

import java.io.*;

public class DataStreamsDemo {
	public static void writeToFile(String filename){
        double[] prices = { 19.99, 9.99, 15.99, 3.99, 4.99 };
        int[] units = { 12, 8, 13, 29, 50 };
        String[] descs = {
            "Java T-shirt",
            "Java Mug",
            "Duke Juggling Dolls",
            "Java Pin",
            "Java Key Chain"
        };
        try(DataOutputStream out = new DataOutputStream(
                new BufferedOutputStream(
                        new FileOutputStream(filename)))){
            for (int i = 0; i < prices.length; i ++) {
                out.writeDouble(prices[i]);
                out.writeInt(units[i]);
                out.writeUTF(descs[i]);
            }        
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
    
    public static void readFromFile(String filename){
        double price;
        int unit;
        String desc;
        double total = 0.0;
        try(DataInputStream in = new DataInputStream(
                new BufferedInputStream(
                        new FileInputStream(filename)))){
            while (true) {
                price = in.readDouble();
                unit = in.readInt();
                desc = in.readUTF();
                System.out.format("You ordered %d" + " units of %s at $%.2f%n", unit, desc, price);
                total += unit * price;
            }          
        }catch(EOFException e){
            //达到文件末尾
            System.out.format("所有数据已读入，总价格为：$%.2f%n", total);
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
