package javabook.ch2;

public class HelloWorld5{
	String msg;
	
	public HelloWorld5(){
		msg = "Hello World !!";
	}
	
	public HelloWorld5(String msg){
		this.msg = msg;
	}
	
	public HelloWorld5(String msg, int option){
		if(option == 1)
			this.msg = msg;
		else if(option == 2)
			this.msg = msg + ", æ»≥Á«œººø‰?";
	}
	
	public void print(){
		System.out.print(msg);
	}


	public static void main(String[] args){
		HelloWorld5 hello1 = new HelloWorld5();
		hello1.print();
		HelloWorld5 hello2 = new HelloWorld5("My Hello World!!");
		hello2.print();
		HelloWorld5 hello3 = new HelloWorld5("Hello",2);
		hello3.print();
	}
	
}
