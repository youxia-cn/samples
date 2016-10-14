package com.xkland.sample;

public class SecurityDemo {

	public static void main(String[] args) {
		if(args.length == 1 && args[0] == "getProps"){
			getProps();
		}else if(args.length == 2 && args[0] == "count"){
			count(args[1]);
		}else{
			usage();
		}
	}
	
	public static void usage(){
		System.out.println("Usage:");
		System.out.println("    java com.xkland.sample.SecurityDemo getProps");
		System.out.println("  or");
		System.out.println("    java com.xkland.sample.SecurityDemo count filename");
	}

	public static void getProps(){
		String s;
		try{
			System.out.println("准备获取 os.name 属性...");
			s = System.getProperty("os.name");
			System.out.println("获取成功，os.name=" + s);
			System.out.println();
			
			System.out.println("准备获取 java.version 属性...");
			s = System.getProperty("java.version");
			System.out.println("获取成功，java.version=" + s);
			System.out.println();
			
			System.out.println("准备获取 user.home 属性...");
			s = System.getProperty("user.home");
			System.out.println("获取成功，user.home=" + s);
			System.out.println();
			
			System.out.println("准备获取 java.home 属性...");
			s = System.getProperty("java.home");
			System.out.println("获取成功，java.home=" + s);
			System.out.println();
		}catch(Exception e){
			System.err.println("产生异常：" + e.toString());
		}
	}
}
