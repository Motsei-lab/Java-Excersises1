package org.example;

public class Rectangle {
    double width;
    double height;

    public Rectangle(double width, double height){
        this.height = height;
        this.width = width;
    }

    public double area(){
        double area;
        area = this.width * this.height;

        return  area;
    }

    public double perimeter(){
        double perimeter;
        perimeter = (2 * (this.width + this.height));
        return  perimeter;
    }
}
