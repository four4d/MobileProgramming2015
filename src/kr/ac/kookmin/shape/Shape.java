package kr.ac.kookmin.shape;

public abstract class Shape {
    protected Point center;
 
    //abstract 메소드 선언
    public abstract void draw(Graphics g);
    public abstract Rectangle getBounds();
    
    //center 리턴하는 메소드
    public Point getCenter() {
        return this.center;
    }
}
