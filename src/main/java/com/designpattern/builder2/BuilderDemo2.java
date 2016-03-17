package com.designpattern.builder2;

public class BuilderDemo2 {
    public static void main(String[] args) {
        Person person = new Person();
        person = person.setAge(1).setFirstName("firstName111").setLastName("lastName111").setEmployeed(true).setMarried(false);
        System.out.println(person);
        

        //Better solution. Separating builder from POJO class
        Person person2 = new Person();
        PersonBuilder builder = new PersonBuilder(person2);
        builder.getPerson().setAge(222).setFirstName("firstName222").setLastName("lastName222").setEmployeed(false).setMarried(true);
        System.out.println(builder.getPerson());
        
    }

}
