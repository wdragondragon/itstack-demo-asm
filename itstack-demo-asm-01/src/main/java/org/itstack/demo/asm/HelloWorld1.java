package org.itstack.demo.asm;

import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;

public class HelloWorld1 extends ClassLoader {

    public static void main(String[] args) throws Exception {
        System.out.println("Hello World ASM!");
    }


}
