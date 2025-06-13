// OOP [Object Oriented Programming] ✅ 

import java.util.*;

public class JavaBasics {

    public static void main(String[] args) {
        /*
        Scanner sc = new Scanner(System.in);
        Pen p1 = new Pen();

        System.out.print("Enter color: ");
        p1.setColor(sc.next());
        System.out.print("Enter tip: ");
        p1.setTip(sc.nextInt());

        sc.close();

        System.out.println(p1.color);
        System.out.println(p1.tip);

        Pen p2 = new Pen();
        p2.setColor("Red");
        p2.setTip(2);
        System.out.println(p2.color);
        System.out.println(p2.tip);

        p2.color = "Blue";
        p2.tip = 4;
        System.out.println(p2.color);
        System.out.println(p2.tip);

        Pen p3 = new Pen();
        p3.setColor("Blue");
        p3.setTip(4);
        System.out.println(p3.color);
        System.out.println(p3.tip);
        */

        // Access Modifiers | Getters and Setters ✅ 
        /*
        BankAccount b1 = new BankAccount();
        b1.username = "admin";
        b1.setPassword("1234");
        System.out.println(b1.username);
        System.out.println(b1.getPassword());
        */

        // Encapsulation ✅ 
        /*
        // Non-parameterized
        Student s1 = new Student();

        // Parameterized
        Student s2 = new Student("Bikram", 4);
        System.out.println(s2.name);
        System.out.println(s2.rollNo);

        s2.marks = new int[3];
        s2.marks[0] = 100;
        s2.marks[1] = 90;
        s2.marks[2] = 80;

        // Copy Constructor
        Student s3 = new Student(s2);
        System.out.println(s3.name);
        System.out.println(s3.rollNo);

        s2.marks[2] = 100;

        for (int i = 0; i < s3.marks.length; i++) {
            System.out.println(s3.marks[i]);
        }
        */

        // Inheritance ✅ 
        /*
        // Single Level Inheritance 
        Fish f1 = new Fish();
        f1.eat();
        f1.sleep();
        f1.fins = 6;
        System.out.println(f1.fins);
        f1.swim();

        // Multi Level Inheritance 
        Dog d1 = new Dog();
        d1.eat();
        d1.sleep();
        d1.legs = 4;
        System.out.println(d1.legs);
        d1.breathe();
        d1.breed = "Golden Retriever";
        System.out.println(d1.breed);
        d1.bark();

        // Heirarchical Inheritance 
        Bird b1 = new Bird();
        b1.eat();
        b1.sleep();
        b1.wings = 2;
        System.out.println(b1.wings);
        b1.fly();

        // Hybrid Inheritance 
        Lion l1 = new Lion();
        l1.eat();
        l1.sleep();
        l1.roar();
        */

        // Polimorphism ✅ 
        /*
        // Overloading | Compile Time Polymorphism
        Calculator c1 = new Calculator();
        System.out.println(c1.sum(1, 2));
        System.out.println(c1.sum(1, 2, 3));
        System.out.println(c1.sum(1.1f, 2.2f));
        System.out.println(c1.sum(1.1f, 2.2f, 3.3f));

        // Overriding | Run Time Polymorphism
        Deer d1 = new Deer();
        d1.eat();
        */

        // Abstraction ✅ 
        /*
        // Abstract Class
        Horse h1 = new Horse();
        h1.eat();
        h1.walk();

        Chicken c1 = new Chicken();
        c1.eat();
        c1.walk();
        
        Mustang m1 = new Mustang();

        // Interface
        Queen q = new Queen();
        q.move();

        Rook r = new Rook();
        r.move();

        Bishop b = new Bishop();
        b.move();

        Knight k = new Knight();
        k.move();

        // Interface | Multiple Inheritance 
        Bear b1 = new Bear();
        b1.eatGrass();
        b1.eatMeat();
        */

        // Static Keyword ✅ 
        /*
        Student s1 = new Student();
        s1.name = "Bikram";
        s1.rollNo = 4;
        s1.collegeName = "CU College";
        s1.display();

        Student s2 = new Student();
        s2.name = "Susmita";
        s2.rollNo = 2;
        s2.display();

        Student s3 = new Student();
        s3.name = "Himanshu";
        s3.rollNo = 5;
        s3.collegeName = "LPU College";
        s3.display();
        */

        // Super Keyword ✅ 
        /*
        Horse h = new Horse();
        System.out.println(h.color);
        */
    }
}

/*
class Pen {
    String color;
    int tip;

    void setColor(String color) {
        this.color = color;
    }

    void setTip(int tip) {
        this.tip = tip;
    }
}
*/

// Access Modifiers | Getters and Setters ✅ 
/*
class BankAccount {
    public String username;
    private String password;

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return this.password;
    }
}
*/

// Encapsulation ✅ 
/*
class Student {
    String name;
    int rollNo;
    int marks[];

    // Non-parameterized
    Student() {
        System.out.println("Constructor is called...");
    }

    // Parameterized
    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    // Copy Constructor
    // Shallow Copy Constructor
    // Student(Student s) {
    //     this.name = s.name;
    //     this.rollNo = s.rollNo;
    //     this.marks = s.marks;
    // }

    // Deep Copy Constructor
    Student(Student s) {
        this.name = s.name;
        this.rollNo = s.rollNo;
        this.marks = new int[s.marks.length];
        for (int i = 0; i < s.marks.length; i++) {
            this.marks[i] = s.marks[i];
        }
    }

    // Destructor
    // I can't use destructor because already destructor is available in java which is Garbage Collection/Collector.
}
*/

// Inheritance ✅ 
/*
// Base Class
class Animal {
    void eat() {
        System.out.println("Eating...");
    }

    void sleep() {
        System.out.println("Sleeping...");
    }
}

// Derived Class
// Single Level Inheritance
class Fish extends Animal {
    int fins;

    void swim() {
        System.out.println("Swimming...");
    }
}

// Derived Class
// Multi Level Inheritance
class Mammal extends Animal {
    int legs;

    void breathe() {
        System.out.println("Breathing...");
    }
}

// Derived Class
// Multiple Level Inheritance
class Dog extends Mammal {
    String breed;

    void bark() {
        System.out.println("Barking...");
    }
}

// Derived Class
// Hierarchical Inheritance
class Bird extends Animal {
    int wings;

    void fly() {
        System.out.println("Flying...");
    }
}

// Derived Class
// Hierarchical Inheritance
class Cow extends Animal {
    void milk() {
        System.out.println("Milk...");
    }
}

// Derived Class
// Hybrid Inheritance
class Cat extends Mammal {
    void meow() {
        System.out.println("Meowing...");
    }
}

// Derived Class
// Hybrid Inheritance
class Lion extends Mammal {
    void roar() {
        System.out.println("Roaring...");
    }
}

// Derived Class
// Hybrid Inheritance
class Tuna extends Fish {
    void feed() {
        System.out.println("Feeding...");
    }
}

// Derived Class
// Hybrid Inheritance
class Shark extends Fish {
    void feed() {
        System.out.println("Feeding...");
    }
}

// Derived Class
// Hybrid Inheritance 
class peacock extends Bird {
    void peck() {
        System.out.println("Pecking...");
    }
}
*/

// Polimorphism ✅ 
/*
// Overloading | Compile Time Polymorphism 
class Calculator {
    int sum(int a, int b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }
    
    float sum(float a, float b) {
        return a + b;
    }
    
    float sum(float a, float b, float c) {
        return a + b + c;
    }
}

// Overriding | Run Time Polymorphism 
class Animal {
    void eat() {
        System.out.println("Eat Anything...");
    }
}

class Deer extends Animal {
    @Override
    void eat() {
        System.out.println("Eat Grass...");
    }
}
*/

// Abstraction ✅ 
/*
// Abstract Class
abstract class Animal {
    String color;

    Animal() {
        System.out.println("Animal constructor is called...");
    }

    void eat() {
        System.out.println("Eating...");
    }

    abstract void walk();
}

class Horse extends Animal {
    Horse() {
        System.out.println("Horse constructor is called...");
    }

    void walk() {
        System.out.println("Walking in 4 legs...");
    }
}

class Mustang extends Horse {
    Mustang() {
        System.out.println("Mustang constructor is called...");
    }
}

class Chicken extends Animal {
    void walk() {
        System.out.println("Walking in 2 legs...");
    }
}

// Interface
interface ChessPlayer {
    void move();
}

class Queen implements ChessPlayer {
    @Override
    public void move() {
        System.out.println("Queen is moving in any direction...");
    }
}

class Rook implements ChessPlayer {
    @Override
    public void move() {
        System.out.println("Rook is moving in horizontal and vertical direction...");
    }
}

class Bishop implements ChessPlayer {
    @Override
    public void move() {
        System.out.println("Bishop is moving in diagonal direction...");
    }
}

class Knight implements ChessPlayer {
    @Override
    public void move() {
        System.out.println("Knight is moving in L shape...");
    }
}

// Interface | Multiple Inheritance 
interface Herbivore {
    void eatGrass();
}

interface Carnivore {
    void eatMeat();
}

class Bear implements Herbivore, Carnivore {
    @Override
    public void eatGrass() {
        System.out.println("Eating Grass...");
    }

    @Override
    public void eatMeat() {
        System.out.println("Eating Meat...");
    }
}
*/

// Static Keyword ✅ 
/*
class Student {
    String name;
    int rollNo;
    static String collegeName;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("College: " + collegeName);
    }
}
*/

// Super Keyword ✅ 
/*
class Animal {
    String color;

    Animal() {
        System.out.println("Animal constructor is called...");
    }
}

class Horse extends Animal {
    Horse() {
        // super();
        super.color = "White";
        System.out.println("Horse constructor is called...");
    }
}
*/

