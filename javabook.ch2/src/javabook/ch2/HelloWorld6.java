package javabook.ch2;

public class HelloWorld6{
	private String msg;
	
	public HelloWorld6(){
		msg = "Hello World !!";
	}
	
	public HelloWorld6(String msg){
		this.msg = msg;
	}
	
	public HelloWorld6(String msg, int option){
		if(option == 1)
			this.msg = msg;
		else if(option == 2)
			this.msg = msg + ", æ»≥Á«œººø‰?";
	}
	
	public void print(){
		System.out.print(msg);
	}
	
	public String getMsg(){
		return msg;
	}
	
	public void setMsg(String msg){
		this.msg = msg;
	}


	public static void main(String[] args){
		HelloWorld6 hello1 = new HelloWorld6();
		hello1.print();
		HelloWorld6 hello2 = new HelloWorld6("My Hello World!!");
		hello2.print();
		HelloWorld6 hello3 = new HelloWorld6("Hello",2);
		hello3.print();
		hello2.setMsg("π›∞©Ω¿¥œ¥Ÿ!!");
		System.out.println(hello2.getMsg());
	}
	
}
