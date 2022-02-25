package com.key;

public class Key extends KeywordExample{
int a=50;
public final void sub() {
	// TODO Auto-generated method stub
System.out.println(this.a);
System.out.println(super.a);
}
public static void main(String[] args) {
	Key k=new Key();
	k.sub();
}
}
