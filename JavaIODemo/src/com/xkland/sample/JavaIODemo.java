package com.xkland.sample;

public class JavaIODemo {

	public static void main(String[] args) {
		if(args.length != 2){
			usage();
			return;
		}
		switch(args[0]){
		case "copyBytes":
			StreamsDemo.copyBytes(args[1]);
			break;
		case "binaryWrite":
			DataStreamsDemo.writeToFile(args[1]);
			DataStreamsDemo.readFromFile(args[1]);
			break;
		case "formatWrite":
			PrintStreamDemo.writeToFile(args[1]);
			PrintStreamDemo.readFromFile(args[1]);
			break;
		case "showAttributes":
			AttributesDemo.showAttributes(args[1]);
			break;
		}
	}

	private static void usage() {
		System.out.println("Usage: java com.xkland.sample.JavaIODemo command filename");
		System.out.println("command is one of below");
		System.out.println("  copyBytes        -- copy bytes from file to stdout");
		System.out.println("  binaryWrite      -- write data to file in binary form");
		System.out.println("  formatWrite      -- write data to file in readabel form");
		System.out.println("  showAttributes   -- show attributes of a file");		
	}

}
