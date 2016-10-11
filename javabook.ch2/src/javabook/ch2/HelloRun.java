package javabook.ch2;

public class HelloRun{
	public void go(){
		HelloWorld7 hello1 = new HelloWorld7();
		hello1.print();

		HelloWorld7 hello2 = new HelloWorld7("My Hello Wolrd!!");
		hello2.print();
	
		HelloWorld7 hello3 = new HelloWorld7("My Hello Wolrd!!");
		hello2.print();
		
		hello2.setMsg("반갑습니다!!");
		System.out.println(hello2.getMsg());
		
		
		HelloWorld7.prefix = "Greetings: ";
		hello2.print();
		hello3.print();
		HelloWorld7.prefix = "인사말: ";
		hello2.print();
		hello3.print();
	}
	
		public static void maon(String[] args){
			HelloRun hr = new HelloRun();
			hr.go();
		}
}	
