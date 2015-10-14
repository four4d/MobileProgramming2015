package kr.ac.kookmin.exception.transaction;
class Bank {
	private int balance = 1000;
	public void oneqTrade() {	    
	    try {
		    tradeWithA();
		    tradeWithB();
		    tradeWithC();
	    } catch(Exception e) {
	        //throws로 넘겨받은 예외상황 처리.
	        //3개 메소드 중 한 군데에서만이라도 예외가 발생하면 3가지 모두 상황을 처리해주어야 하므로
	        //각 메소드 내에서 예외처리 하는 것보다 throws로 메소드를 호출했던 곳으로 넘겨주어
	        //통합적으로 처리하는 것이 적절합니다.
	        System.out.println("거래중 에러 발생, 전체 취소");
	        cancelA();
	        cancelB();
	        cancelC();
	    } finally {
	        System.out.println("잔여 금액 : " + balance);
	    }
	}
	
	public void tradeWithA () throws Exception { //Exception 발생시 호출한 곳으로 throws
	    int m = 100;
        System.out.println("A 계좌에서 출금 - " + m);
        balance -= m;		
	}
	
	public void tradeWithB() throws Exception {  //Exception 발생시 호출한 곳으로 throws
		int m = 200;
		System.out.println("B 계좌에서 출금 - " + m);
		balance -= m;
	}
	
	public void tradeWithC() throws Exception {  //Exception 발생시 호출한 곳으로 throws
		int m = 300;		
	    System.out.println("C 계좌에서 출금 - " + m);
		balance -= m;
		Exception ex = new Exception();
		throw ex;
	}
    
	public void cancelA() {
		System.out.println("A 계좌 거래 취소  ");
		balance += 100;
	}
	
	public void cancelB() {
		System.out.println("B 계좌 거래 취소  ");
		balance += 200;
	}
	
	public void cancelC() {
		System.out.println("C 계좌 거래 취소  ");
		balance += 300;
	}
}