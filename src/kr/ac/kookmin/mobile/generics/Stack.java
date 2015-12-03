package kr.ac.kookmin.mobile.generics;

public class Stack<T> {
    private int top;
    Node<T> node;
    
    //스택 생성자. top과 node 초기화.
    public Stack() {
        top = 0;
        node = new Node<T>(top);
    }
    
    //스택에서 1개 데이터 꺼내는 메소드
    public T pop() {
        T temp = (T) node.getData();
        top = node.getNext();
        return temp;
    }
    
    //스택에서 1개 데이터 push하는 메소드
    public void push(T t) {
        node.setNext(t);
        top = node.getNext();
    }

}
