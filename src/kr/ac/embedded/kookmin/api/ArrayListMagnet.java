package kr.ac.embedded.kookmin.api;
import java.util.*;

//5주차 2번 과
public class ArrayListMagnet {

    //ArrayList객체 내의 모든 목록을 출력하는 메소드.
    public static void printAL(ArrayList<String> al) {
        for (String element : al) {
            System.out.print(element + " ");            
        }
        System.out.println(" ");     
    }
    
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<String>(); //ArrayList a 생성
        a.add(0, "zero");  //a에 0번 인덱스에 "zero" String 추가.
        a.add(1, "one");   //a에 1번 인덱스에 "one" 추가.
        a.add(2, "two");
        a.add(3, "three");
        printAL(a);
        
        a.remove(2);    //a의 2번 인덱스 제거.
        if(a.contains("three")) {
            a.add("four");
        }
        printAL(a);
        
        if (a.indexOf("four") != 4) {    //"four"값의 인덱스가 4가 아닌 경
            a.add(4, "4.2");
        }
        printAL(a);
        
        if(a.contains("two")) {
            a.add("2.2");
        }
        printAL(a);

    }

}
