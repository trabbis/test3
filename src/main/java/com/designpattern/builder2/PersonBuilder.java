package com.designpattern.builder2;

public class PersonBuilder {
    
    private Person person;
    
    public PersonBuilder(Person person) {
        this.person = person;
    }

    public Person getPerson() {
        return person;
    }
    
    public PersonBuilder setFirstName(String firstName) {
        person.setFirstName(firstName);
        return this;
    }

    public PersonBuilder setLastName(String lastName) {
        person.setLastName(lastName);
        return this;
     }

    public PersonBuilder setAge(int age) {
        person.setAge(age);
        return this;
    }

    public PersonBuilder setMarried(boolean married) {
        person.setMarried(married);
        return this;
    }


    public PersonBuilder setEmployeed(boolean employeed) {
        person.setEmployeed(employeed);
        return this;
    }

}
