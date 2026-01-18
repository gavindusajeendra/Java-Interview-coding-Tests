//Inner classes behavior
package org.example;

class OuterClass{ //outer class
    int x = 5;
    static class InnerClass{//inner class
        int y = 10;
    }
}

public class Task{
    public static void main(String[] args){
        //OuterClass outer = new OuterClass();
        //OuterClass.InnerClass inner = outer.new InnerClass();
        OuterClass.InnerClass inner = new OuterClass.InnerClass(); // when use static key word
        System.out.println(inner.y);
        //System.out.println(outer.x);
    }

}
