package kr.ac.kookmin.shape;

public class Ellipse extends Shape {
    //변수 선언 w:타원 장축 반지름 h:타원 단축 반지름
    private int w;
    private int h;
    
    //Ellipse 클래스 Constructor
    public Ellipse(Point center, int w, int h) {
        this.w = w;
        this.h = h;
        super.center = center;
    }
    
    @Override
    public Rectangle getBounds() {
        return new Rectangle(center, w*2, h*2);
    }
    
    @Override
    public void draw(Graphics g) {
        g.draw(this);;
    }
    @Override
    public String toString() {
        return "Ellipse";
    }
}
