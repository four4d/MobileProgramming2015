package kr.ac.embedded.kookmin.callback;

public class CallbackTest implements OnMaxNumberCb {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        CallbackTest callTest = new CallbackTest();
        Sum total = new Sum();
            
        total.setMaxNumber(50);
        total.setOnMaxNumberCb(callTest);
        
        for ( int i=1; i<=11; i++) {
            total.addNumber(i);
        }
        
        System.out.println("Total is" + total.getTotal());
    }

    //OnMaxNumberCb 인터페이스의 onMaxNumber 메소드 오버라이드
    //최대값을 초과했을 경우 그 때의 현재값과 초과값을 출력.
    @Override
    public void onMaxNumber(int number, int exceed) {
        // TODO Auto-generated method stub
        // 구현하시오 //
        System.out.println("Current sum is " + number + " and exceeds " + exceed);
    }
    

}