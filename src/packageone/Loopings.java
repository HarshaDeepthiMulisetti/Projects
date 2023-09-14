package packageone;

import packagetwo.*;

public class Loopings extends Test2{
	private int val2=8;
	int val;
	String name;
	Loopings(int value,String names){ 
		this.val=value;
		this.name=names;        //this is VARIABLE OF childclass //super is VARIABLES OF parent class obct
		super.value=value;
		super.nam=names;
	}
	
	
	 public void test() {
		 System.out.println(val);
		 System.out.println(name);
	 }

	public static void main(String[] args) {
		Loopings lobj=new Loopings(1,"harshu");
		//Test2 lobj1=new Test2();
		//lobj.test();
//		Test3 lobj2=new Test3();
//		Test4 lobj4=new Test4();
//		System.out.println(lobj1.value);
//		System.out.println(lobj1.nam);
//		lobj2.naming();
//		System.out.println(lobj4.value);
//		System.out.println(lobj4.names);
//		System.out.println(lobj.val2);
//		
		System.out.println(lobj.nam);
		
		
	}

}
