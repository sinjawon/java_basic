package oop.solid.lsp;

//부모클래스
public class Rectangle implements Shape {

    protected int width;
    protected int height;

    public Rectangle(int w,int h){
        width=w;
        height=h;
    }

    public void setWidth(int width){
         this.width=width;
    }
    public void setHeight(int height){
          this.height=height;
    }




    @Override
    public int gerArea() {
        return width * height;
    }
}
