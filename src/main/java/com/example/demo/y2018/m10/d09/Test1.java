package com.example.demo.y2018.m10.d09;

public class Test1 {
    public static void main(String[] args) {
        GenericMemoryCell<String> genericMemoryCell = new GenericMemoryCell<>();
        genericMemoryCell.write("hello world!");
        String s = genericMemoryCell.read();
        System.out.println(s);
    }
}