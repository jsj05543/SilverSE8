package moni;


interface A{ void foo();}
abstract class B implements  A{
	void bar(String[] s) {}
}


 class Q1 extends A{
	protected void bar(String[] s) {}
}
hh