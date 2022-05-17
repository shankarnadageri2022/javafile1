
/*
 * 
 * Multitasking --Operating--Process-1, p-2
 * |
 * We can play music
 * We can write something on word
 * 
 * 
 * we can write a letter and some differnt program interrupting  you once you wrote wring spelling
 * 
 * interface Runnable 
 * {
 * public void run()
 * }
 * Thread t =new Thread()
 * t.set
 * java.lang
 *    Thread by using t=new Thread();
 *     |
 *    new born state threa.start()
 *    [/t1/t2/t4/t5]---for their service implementation
 *    Thread Runnable state--run() { //bl.statements}
 *    |
 *    sleep(10)
 *    wait()
 *    notify()
 *    notifyAll()
 *    
 *    
 *    |
 *    stop()
 *    join()
 *    
 * 
 * 
 * 
 * 
 * 
 */
class Source
{
	// string[] array
	//cloud server
	//db server
	//source in 5 secs
	//main thread trying
	//10 secs
String[] names= {"abc","xyz","pqr"};	
}

class A implements Runnable
{
Source source;
Thread t;
A()
{
	/*
	 * Thread()
	 * Thread(Runnable r, Stirng name)
	 * Thread(String name)
	 * 
	 * 
	 */
	//this --holdiing currently running object ref
	t=new Thread(this,"ONE");
	t.setPriority(2);
	t.start();
}
	@Override
	public void run() {
		source=new Source();
		
		for(int i=0; i<source.names.length; i++)
		{
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(t.getName() + " "+t.getPriority()+ " "+"prinitng"+source.names[i]);
		}
		
	}
	
}


public class TestThreadDemo1 {

	public static void main(String[] args) throws InterruptedException {
//default thread is main thread
		//5  1-10
		
		Source source=new Source();
		Runnable a=new A();
		
 for(int i=0; i<source.names.length; i++)
 {
	 //Thread.sleep(1000);
	 System.out.println(Thread.currentThread() + " "+"printing"+source.names[i]);
 }
		
	}

}
