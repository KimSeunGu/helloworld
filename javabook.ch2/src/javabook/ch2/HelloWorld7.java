package javabook.ch2;

public class HelloWorld7{
	private String msg;
	static int count = 0;
	static String prefix = "";
	
	public HelloWorld7(){
		msg = "Hello World !!";
	}
	
	public HelloWorld7(String msg){
		this.msg = msg;
	}
	
	public HelloWorld7(String msg, int option){
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


	public static void main(String[] args){
		HelloWorld7 hello1 = new HelloWorld7();
		hello1.print();
		HelloWorld7 hello2 = new HelloWorld7("My Hello World!!");
		hello2.print();
		HelloWorld7 hello3 = new HelloWorld7("Hello",2);
		hello3.print();
		hello2.setMsg("π›∞©Ω¿¥œ¥Ÿ!!");
		System.out.println(hello2.getMsg());
		
		HelloWorld7.prefix = "Greetings: ";
		hello2.print();
		hello3.print();
	}
	
}
