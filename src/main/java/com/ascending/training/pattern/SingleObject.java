package com.ascending.training.pattern;

// Learning from tutorialspoint.com/design_pattern/singleton_pattern.htm
public class SingleObject {

    // Create an object of SingleObject
    private static SingleObject instance = new SingleObject();

    // Make the constructor private so that this class can't be instantiated.
    private SingleObject(){ }

    // Get the only object available
    public static SingleObject getInstance(){
        return instance;
    }

    public void showMessage(){
        System.out.println("Hello World");
    }

    public static void main(String[] args){

        // Illegal construct, compile time error, the constructor SingleObject() is not visible.
        // SingleObject object = new SingleObject();

        // Get the only object available
        SingleObject object = SingleObject.getInstance();
        object.showMessage();
    }

}
