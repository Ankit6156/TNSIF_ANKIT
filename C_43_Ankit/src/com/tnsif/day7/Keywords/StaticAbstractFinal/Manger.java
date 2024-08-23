package com.tnsif.day7.Keywords.StaticAbstractFinal;

	   class demo{ //final Class ( we can't able to extends so we can't use final class if i want to extends the class
		final String name="Ankit";//Final Variable
		final void show(){ //Final keyWord
			System.out.println("Final Statement");
			//name="XyZ; once declare you can't change
		}
	}
	  class newdemo extends demo{
		 void dshow() {
			System.out.println("yes");
		}
	}
	public class Manger {
	public static void main(String[] args) {
		newdemo obj=new newdemo();
		obj.show();
		obj.dshow();
		
	}


}
