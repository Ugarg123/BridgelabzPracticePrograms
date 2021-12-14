package com.bridgelabz.logicalprograms;
import java.util.Scanner;
public class StopWatch {
	public long startTimer=0;
	public long stopTimer=0;
	public long elapsed;
	
	//to start timer
	public void start()
	{
		startTimer=System.currentTimeMillis();
		System.out.println("start time is: "+startTimer);
	}
	
	//to stop timer
	public void stop()
	{
		stopTimer=System.currentTimeMillis();
		System.out.println("stop time is: "+stopTimer);
	}
	public long getElapsedTime()
	{
		elapsed=stopTimer-startTimer;
		return elapsed;
	}
	public static void main(String[] args) 
	{
		StopWatch sc=new StopWatch();
		Scanner s =new Scanner(System.in);
		System.out.println("press one to start time: ");
		s.nextInt();
		sc.start();
		
		System.out.println();
		System.out.println("press two to stop time: ");
		s.nextInt();
		sc.stop();
		
		long l=sc.getElapsedTime();
		System.out.println();
		System.out.println("Total time elapsed(in millisec) is:"+l);
		
	}
}
