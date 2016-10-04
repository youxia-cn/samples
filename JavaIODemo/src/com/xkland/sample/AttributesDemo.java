package com.xkland.sample;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.PosixFileAttributes;

public class AttributesDemo {
	public static void showAttributes(String filename){
		Path path = Paths.get(filename);
        Path real = null;
        try{
            if(Files.isSymbolicLink(path)){
                real = Files.readSymbolicLink(path);
            }
            PosixFileAttributes attr = Files.readAttributes(path, PosixFileAttributes.class, LinkOption.NOFOLLOW_LINKS);
            System.out.format("%s, size: %d, isSymbolicLink: %b .", path, attr.size(), attr.isSymbolicLink());
            System.out.println();
            PosixFileAttributes attrOfReal = Files.readAttributes(real, PosixFileAttributes.class);
            System.out.format("%s, size: %d, isSymbolicLink: %b .", real, attrOfReal.size(), attrOfReal.isSymbolicLink());
            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
}
