package com.designpattern.builder2;

public class PersonBuilder {
    
    private Person person;
    
    public PersonBuilder(Person person) {
        this.person = person;
    }

    public Person getPerson() {
        return person;
    }
    
    public Person setFirstName(String firstName) {
        person.setFirstName(firstName);
        return person;
    }

    public Person setLastName(String lastName) {
        person.setLastName(lastName);
        return person;
     }

    public Person setAge(int age) {
        person.setAge(age);
        return person;
    }

    public Person setMarried(boolean married) {
        person.setMarried(married);
        return person;
    }


    public Person setEmployeed(boolean employeed) {
        person.setEmployeed(employeed);
        return person;
    }

}
