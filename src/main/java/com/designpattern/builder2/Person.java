package com.designpattern.builder2;

public class Person {
    
    private String firstName;
    private String lastName;
    private int age;
    private boolean married;
    private boolean employeed;
    
    public Person() {
    }
    

    
    /**
     * @return the firstName
     */
    public String getFirstName() {
        return this.firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public Person setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public Person setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public Person setAge(int age) {
        this.age = age;
        return this;
    }

    /**
     * @return the married
     */
    public boolean isMarried() {
        return married;
    }

    /**
     * @param married the married to set
     */
    public Person setMarried(boolean married) {
        this.married = married;
        return this;
    }

    /**
     * @return the employeed
     */
    public boolean isEmployeed() {
        return employeed;
    }

    /**
     * @param employeed the employeed to set
     */
    public Person setEmployeed(boolean employeed) {
        this.employeed = employeed;
        return this;
    }

    
    @Override
    public String toString() {
        return this.firstName + ", " +
                this.lastName + ", " +
                this.age + ", " +
                this.isMarried() + ", " + 
                this.isEmployeed();
        
                
    }
    
    

}
