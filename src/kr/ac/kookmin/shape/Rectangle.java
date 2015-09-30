package kr.ac.kookmin.shape;

public class Rectangle extends Shape{
    
    private int h;
    private int w;
    
    //Rectangle 클래스 Constructor
    public Rectangle(Point center, int w, int h) {
        this.w = w;
        this.h = h;
        super.center = center;
    }
    
    //너비값 int w를 리턴해주는 메소드
    public int getWidth() {
        return w;
    }
    //높이값 int h를 리턴해주는 메소드
    public int getHeight() {
        return h;
    }
    
    @Override
    public Rectangle getBounds() {
        return this;
    }
    
    @Override
    public void draw(Graphics g){
        g.draw(this);
    }
    @Override
    public String toString(){
        return "Rectangle";
    }
}
