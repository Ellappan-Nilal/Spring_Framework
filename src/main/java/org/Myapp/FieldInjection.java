package org.Myapp;

public class FieldInjection
{
    @Autowired
    private Service service;

    public void handleRequest(){
        service.doSomething();
    }
    public class Service{
        public void doSomething(){
            System.out.println("Doing some work");
        }
    }
}
