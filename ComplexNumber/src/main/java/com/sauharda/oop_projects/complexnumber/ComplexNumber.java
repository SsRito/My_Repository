package com.sauharda.oop_projects.complexnumber;

public class ComplexNumber {
    int real;
    int img;

    public ComplexNumber(int real, int img) {
        this.real = real;
        this.img = img;
    }

    public ComplexNumber() {
    }

    public int getReal() {
        return real;
    }

    public int getImg() {
        return img;
    }

    public void setReal(int real) {
        this.real = real;
    }

    public void setImg(int img) {
        this.img = img;
    }

    @Override
    public String toString() {
        return "Complex Number Addition: "
                 + real + " + " +
                  img + "i";
    }

    ComplexNumber add(ComplexNumber c){
        ComplexNumber temp = new ComplexNumber();
        temp.real = this.real + c.real;
        temp.img = this.img + c.img;
        return temp;
    }
    ComplexNumber subtract(ComplexNumber c){
        ComplexNumber temp = new ComplexNumber();
        temp.real = this.real - c.real;
        temp.img = this.img - c.img;
        return temp;
    }
}
