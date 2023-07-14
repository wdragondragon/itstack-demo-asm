package org.itstack.demo.asm;

public class HelloWorld2 extends ClassLoader {

    public static void main(String[] args) throws Exception {
        HelloWorld2 helloWorld2 = new HelloWorld2();
        helloWorld2.print();
    }

    private void print() {
        System.out.println("Hello World ASM!");
    }

}
