package main.java;

import main.java.computer.Computer;

public class Main {

    static public void main(String[] args){
        Computer computer = new Computer();

        computer.run("Put 1 \nPut 1\nAdd \nPut 12 ");
        System.out.println(computer.getOutput());

        computer.run("Put 1 \nPut 5\nAdd \nPut 2.5 \nSub");
        System.out.println(computer.getOutput());

        computer.run("Put 1 \nPut 1 \nPut 1 \nGet");
        System.out.println(computer.getOutput());

        computer.run("Put 1 \nAdd");
        System.out.println(computer.getOutput());

    }
}
