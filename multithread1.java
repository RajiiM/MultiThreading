public class ThreadChild extends Thread{

	public void run()
	{
		for(int no=1; no<=5; no++)
		{
			System.out.println(no);
		}
	}

	public void display() 
	{
		for(int no=6; no<=10; no++)
		{
			System.out.println(no);
		}		
	}
}
--------------------------------------
public class MultiThreadingDemo {

	public static void main(String[] args) {
		ThreadChild obj1 = new ThreadChild();
		obj1.run();
		obj1.display();
	}
		
}
--------------------------------------
Output:
1
2
3
4
5
6
7
8
9
10
=================================================================
=================================================================
public class MultiThreadingDemo {

	public static void main(String[] args) {
		ThreadChild obj1 = new ThreadChild();
		obj1.start();
		obj1.display();		
	}	
}
------------------------------------------
Output:
6
7
8
9
10
1
2
3
4
5
=================================================================
=================================================================
1]Can we overload run method?
Yes, we can. But call it expilicitly.

public class ThreadChild extends Thread{

	public void run()
	{
		for(int no=1; no<=5; no++)
		{
			System.out.println(no);
		}
	}

	public void run(int number)
	{
		for(int no=11; no<=15; no++)
		{
			System.out.println(no);
		}
	}
	public void display() 
	{
		for(int no=6; no<=10; no++)
		{
			System.out.println(no);
		}		
	}
}
---------------------------------------
public class MultiThreadingDemo {

	public static void main(String[] args) {
		ThreadChild obj1 = new ThreadChild();
		obj1.start();
		obj1.display();		
		obj1.run(10);
	}	
}
---------------------------------------
Output:
6
7
8
9
10
11
12
13
14
15
1
2
3
4
5
============================================================
============================================================

public class ThreadChild extends Thread{

	public static void main(String[] args) {
		ThreadChild obj1 = new ThreadChild();
		System.out.println(obj1.getId());
		System.out.println(obj1.getName());
		System.out.println(obj1.getPriority()); //Default priority - 5
		System.out.println(obj1.getState());
		
		obj1.setName("Rajii");
		obj1.setPriority(3);
		System.out.println(obj1.getName());
		System.out.println(obj1.getPriority());
		
		obj1.setName("Rajalakshmi");
		obj1.setPriority(1);
		System.out.println(obj1.getName());
		System.out.println(obj1.getPriority());
		
		System.out.println(Thread.MAX_PRIORITY);
		System.out.println(Thread.MIN_PRIORITY);
		System.out.println(Thread.NORM_PRIORITY);
	}	
}
----------------------------------
OUTPUT:
10
Thread-0
5
NEW
Rajii
3
Rajalakshmi
1
10
1
5
===================================================================
===================================================================

