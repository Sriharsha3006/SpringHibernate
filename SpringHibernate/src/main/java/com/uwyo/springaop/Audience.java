package com.uwyo.springaop;


public class Audience {
	
	/*@Pointcut("execution(* com.uwyo.*.*.*(..))")
	public void printSomePointCut() {}
	*/
	//@Before("printSomePointCut()")
	public void boGetList(){
		System.out.println("getList() is being called");
	}

}
