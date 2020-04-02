package com.syntax.class19;

public class TaskB extends TaskA {

	public static void main(String[] args) {
		TaskB tsk = new TaskB();
		tsk.num = 191;
		tsk.fun();
		tsk.gelistirmek();
		tsk.hard();
		System.out.println("bu odev " + tsk.num + " sayili " + tsk.task);

	}

}
