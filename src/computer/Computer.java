package computer;

import commands.Command;
import interpreter.Interpreter;
import parser.Parser;

import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;

public class Computer {

    private Queue<Command> cmdQueue = new Queue<Command>() {
        @Override
        public boolean add(Command command) {
            return false;
        }

        @Override
        public boolean offer(Command command) {
            return false;
        }

        @Override
        public Command remove() {
            return null;
        }

        @Override
        public Command poll() {
            return null;
        }

        @Override
        public Command element() {
            return null;
        }

        @Override
        public Command peek() {
            return null;
        }

        @Override
        public int size() {
            return 0;
        }

        @Override
        public boolean isEmpty() {
            return false;
        }

        @Override
        public boolean contains(Object o) {
            return false;
        }

        @Override
        public Iterator<Command> iterator() {
            return null;
        }

        @Override
        public Object[] toArray() {
            return new Object[0];
        }

        @Override
        public <T> T[] toArray(T[] a) {
            return null;
        }

        @Override
        public boolean remove(Object o) {
            return false;
        }

        @Override
        public boolean containsAll(Collection<?> c) {
            return false;
        }

        @Override
        public boolean addAll(Collection<? extends Command> c) {
            return false;
        }

        @Override
        public boolean removeAll(Collection<?> c) {
            return false;
        }

        @Override
        public boolean retainAll(Collection<?> c) {
            return false;
        }

        @Override
        public void clear() {

        }
    };


    private void getCommandFromString(){

    }

    private void interpretCommand(){
        Interpreter newInterpreter = new Interpreter();
        newInterpreter.evaluate();
    }

    public void run(String input){

        getCommandFromString();
        interpretCommand();


    }

    public String getOutput(){

        return "";
    }

}
