package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số a");
        double a = sc.nextDouble();
        System.out.println("Nhập số b");
        double b = sc.nextDouble();
        System.out.println("Nhập số c");
        double c = sc.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
        double nghiem1 = quadraticEquation.getRoot1();
        double nghiem2 = quadraticEquation.getRoot2();

        if(quadraticEquation.getDiscriminant()>0){
            System.out.println("phương trình có 2 nghiệm" +nghiem1 + nghiem2);
        }
        if(quadraticEquation.getDiscriminant()==0){
            System.out.println("phương trình có 1 nghiệm" +nghiem1);
        }
        if(quadraticEquation.getDiscriminant()<0){
            System.out.println("phương trình vô nghiệm");
        }
    }
    public static class QuadraticEquation{
        private double a,b,c,delta;
        public QuadraticEquation(double a,double b,double c){
            this.a = a;
            this.b = b;
            this.c =c;
        }
        public double getDiscriminant(){
            return delta = b*b -4*a*c;
        }
        public double getRoot1(){
            return ((-b+Math.pow(delta,0.5))/(2*a));
        }
        public double getRoot2(){
            return (-b-Math.pow(delta,0.5)/(2*a));
        }
    }
}
