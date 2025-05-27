package org.Myapp;

public class SetterInjection {
    private Service service;
    public void setService(Service service){
        this.service=service;
    }
    public void handleRequest(){
        service.doSomething();
    }
}
public class Service{
    public void doSomething(){
        System.out.println("Doing some work");
    }
}