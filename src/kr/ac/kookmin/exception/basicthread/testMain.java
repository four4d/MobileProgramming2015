package kr.ac.kookmin.exception.basicthread;
public class testMain {
	
	public static BankAccount account = new BankAccount();
	public static void main (String []args) {
		
	
		Thread depositMan = new Thread() {  //depositMan Thread
	
            public void run() {  //depositMan Thread 내용
                while (true) {
                	try {
                        sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
			        account.add(10); //10만원 입금
                }
           }
		};
		
        Thread withdrawMan = new Thread() {
            public void run() {
                while (true) {
                    try {
                        sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
			        account.delete(10);  //10만원 출금                
                }
            }
        };
        depositMan.start();  //depoitMan Thread 시작.
        withdrawMan.start(); //withdrawMan Thread 시작.
	}
}