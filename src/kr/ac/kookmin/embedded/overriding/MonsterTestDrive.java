package kr.ac.kookmin.embedded.overriding;

public class MonsterTestDrive {

    public static void main(String[] args) {
        Monster [] ma = new Monster[3];
        ma[0] = new Vampire();
        ma[1] = new Dragon();
        ma[2] = new Monster();
        for(int x = 0; x < 3; x++) {
            ma[x].frighten(x); //각 객체의 오버라이드된 메소드를 호출하게 되어 각각 다른 문구를 출력하게 됨.
        }
    }
}
