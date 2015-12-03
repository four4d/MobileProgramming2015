package kr.ac.kookmin.mobile.generics;

public class Node<T> {
    private int next;
    private Object data[] = new Object[5];
    
    public Node(int top) {
        next = top+1;
    }
    
    //pop할 경우 호출되는 메소드. 배열에서 데이터 리턴 후 next값 -1
    public Object getData() {
        Object temp = data[next];
        next--;
        return temp;
    }
    
    //현재 스택포인터 값인 next를 리턴하 메소드
    public int getNext() {
        return next;
    }
    
    //push할 경우 호출되는 메소드. next+1 번째 배열에 데이터 저장.
    public void setNext(T t) {
        next++;
        this.data[next] = t;
    }

}
