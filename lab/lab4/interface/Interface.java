interface drawable{
    public void draw();
    public void paint();
}

abstract class Shape implements drawable{
    public void draw(){
        System.out.println("Drawing some shape.") ;
    }
}

class Square extends Shape{
    public void paint(){
        System.out.println("Painting Square.") ;
    }
}

class Circle extends Shape{
    public void paint(){
        System.out.println("Painting Circle.") ;
    }
    public void draw(){
       System.out.println("Drawing some shape.") ; 
    }
}

class InterfaceDemo{
    public static void main(String[] args){
        Circle C = new Circle() ;
        Square S = new Square() ;
        C.draw() ;
        draw(S) ;
        paint(C);
    }
    public static void paint(drawable a){
        a.paint() ;
    }
    public static void draw(drawable a){
        a.draw() ;
    }
}
