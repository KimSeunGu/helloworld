package javabook.ch2;

public class HelloWorld8{
	private String msg;
	static int count = 0;
	static String prefix = "";
	
	public HelloWorld8(){
		msg = "Hello World !!";
	}
	
	public HelloWorld8(String msg){
		this.msg = msg;
	}
	
	public HelloWorld8(String msg, int option){
		if(option == 1)
			this.msg = msg;
		else if(option == 2)
			this.msg = msg + ", æ»≥Á«œººø‰?";
	}
	
	public void print(){
		//System.out.print(msg);
		count++;
		System.out.println("["+count+"]"+prefix+msg);
	}
	
	public String getMsg(){
		return msg;
	}
	
	public void setMsg(String msg){
		this.msg = msg;
	}	
}
