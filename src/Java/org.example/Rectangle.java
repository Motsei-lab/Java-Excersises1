/*
Create a Rectangle class with width and height.
Add methods for area (width * height) and perimeter (2 * (width + height)).
Create two objects with different dimensions and display the results.
 */
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
