package ru.stfq.newpackage;

public class TestCase1 {
    public static void main(String[] args) {

        //Если напечатать sout и нажать Enter, оно равернется в System.out.println()
        System.out.println(2+2);
        Square s = new Square(5);
        Rectangle a = new Rectangle(10,20);


        print("Площадь квадрата состороной "+ s.l + "= " + s.area());
        print("Площадь прямоугольника = " + a.area());
    }


    public static void print(String s) {
        System.out.println(s);
    }


}
