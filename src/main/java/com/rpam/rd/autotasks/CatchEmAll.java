package com.rpam.rd.autotasks;

import java.io.FileNotFoundException;
import java.io.IOException;

public class CatchEmAll {

    //You may set another exception in this field;
    static Exception exception = new FileNotFoundException();

    public static void riskyMethod() throws Exception {
        throw exception;
    }

    public static void main(String[] args) throws Exception, FileNotFoundException, IOException {
        try {
            riskyMethod();
        } catch (FileNotFoundException e) {
            System.out.println("Resource is missing");
        } catch (IOException e) {
            System.out.println("Resource error");
        } catch (ArithmeticException | NumberFormatException e) {
            System.out.println(e.toString());
        }
    }
}
