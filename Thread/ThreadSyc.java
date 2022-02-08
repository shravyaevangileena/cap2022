
class TableDemoWithSync{
	void printTable(int n) {
		for(int i=1 ; i<6;i++) {
			System.out.println(n*i);
		}
		try {
			Thread.sleep(9000);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}

class Mythread6 extends Thread{
	TableDemoWithSync t;
	Mythread6(TableDemoWithSync t){
		this.t=t;
	}
	public void run() {
		System.out.println("Thread6 starts");
		t.printTable(5);//passing the value of mul 5
	}
}

class Mythread7 extends Thread{
	TableDemoWithSync t;
	Mythread7(TableDemoWithSync t){
		this.t=t;
	}
	public void run() {
		System.out.println("Thread7 starts");
		t.printTable(50);//passing the value of mul 5
	}
}

class Mythread8 extends Thread{
	TableDemoWithSync t;
	Mythread8(TableDemoWithSync t){
		this.t=t;
	}
	public void run() {
		System.out.println("Thread8 starts");
		t.printTable(100);//passing the value of mul 5
	}
}

public class ThreadSyc {
	public static void main(String[] args) {
		TableDemoWithSync obj = new TableDemoWithSync();
		Mythread6 t1 = new Mythread6(obj);
		Mythread7 t2 = new Mythread7(obj);
		Mythread8 t3 = new Mythread8(obj);
		t1.start();
		t2.start();
		t3.start();
		
	}
}