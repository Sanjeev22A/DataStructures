import java.util.*;
class shape{
    void draw(){}
    void erase(){}
}

class circle extends shape{
    void draw(){
        System.out.println("Drawing circle");
    }
    void erase(){
        System.out.println("Erasing circle");
    }

}

class triangle extends shape{
    void draw(){
        System.out.println("Drawing Triangle");
    }
    void erase(){
        System.out.println("Erasing Triangle");
    }
}

class square extends shape{
    void draw(){
        System.out.println("Drawing square");
    }
    void erase(){
        System.out.println("Erasing square");
    }
}

class randomShapeGenerator{
    private Random rand=new Random();
    public shape gen(){
        int i=rand.nextInt(3);
        switch(i){
            case 0:return new circle();
            case 1:return new triangle();
            case 3:return new square();
            default:return null;
        }
    }
}

public class Shapes {
    private static randomShapeGenerator rand=new randomShapeGenerator();
    
    public static void main(String[] args){
        shape [] arr=new shape[9];
        for(int i=0;i<arr.length;i++){
            arr[i]=rand.gen();
        }
        for(jnt i=0;i<arr.length;i++){
            System.out.print(i+" : ");
            arr[i].draw();
            arr[i].erase();
            System.out.println();
        }
    }
}    

