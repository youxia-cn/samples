package com.xkland.sample;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.PrivilegedExceptionAction;

public class SampleAction implements PrivilegedExceptionAction<Object> {

	@Override
	public Object run() {
		System.out.println("user.home = " + System.getProperty("user.home"));
		System.out.println("java.home = " + System.getProperty("java.home"));
		
		int count = 0;
		
		try(InputStream in = new FileInputStream("src/com/xkland/sample/JaasDemo.java")){
			while(in.read() != -1){
				count++;
			}
			System.out.println("文件 src/com/xkland/sample/JaasDemo.java 的大小为 " + count + " 个字节");
		}catch(IOException e){
			System.err.println("文件操作异常：" + e.getMessage());
		}
		return null;
	}

}
