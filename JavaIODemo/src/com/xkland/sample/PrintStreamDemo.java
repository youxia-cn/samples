package com.xkland.sample;

import java.io.*;
import java.util.Scanner;
public class PrintStreamDemo {
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
        try(PrintStream out = new PrintStream(
                new BufferedOutputStream(
                        new FileOutputStream(filename)))){
            for (int i = 0; i < prices.length; i ++) {
                out.println(prices[i]);
                out.println(units[i]);
                out.println(descs[i]);
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
        try(Scanner s = new Scanner(new BufferedReader(new FileReader(filename)))){
            s.useDelimiter("\r\n");
            while (s.hasNext()) {
                price = s.nextDouble();
                unit = s.nextInt();
                desc = s.next();
                System.out.format("You ordered %d" + " units of %s at $%.2f%n", unit, desc, price);
                total += unit * price;
            }
            System.out.format("所有数据已读入，总价格为：$%.2f%n", total);
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
