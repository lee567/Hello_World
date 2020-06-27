// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Test.java

package cn_itcast_03;

import cn.itcast_02.Animal;
import cn.itcast_02.Dog;

public class Test
{

	public Test()
	{
	}

	public static void main(String args[])
	{
		Animal a = new Dog();
		a.eat();
	}
}
