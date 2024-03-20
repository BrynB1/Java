package Sophmore;

class Polygon{
    public void render(){
        System.out.println("Rendering Polygon...");
    }
}
class Square extends Polygon{
    public void render(){
        System.out.println("Rendering Square...");
    }
}
public class Shapes {
        public static void main(String[] args) {
            Square s1 = new Square();
            s1.render();
        }
    }