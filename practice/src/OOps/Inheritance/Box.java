package OOps.Inheritance;

public class Box {
    double l;
    double w;
    double h;

    Box (){
        this.l=6;
        this.w=3;
        this.h=5;
    }

    Box(double side){
        this.l=side;
        this.w=side;
        this.h=side;
    }

    Box(double l, double w, double h){
        this.l=l;
        this.w=w;
        this.h=h;
    }

}
