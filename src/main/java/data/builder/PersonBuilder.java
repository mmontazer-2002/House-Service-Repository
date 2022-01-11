package data.builder;

import data.entity.Person;
import data.entity.enumration.CustomerStatus;
import data.entity.enumration.Role;


import java.util.Date;


public class PersonBuilder {
    Person person = new Person();

    static PersonBuilder getBuilder(){
        return new PersonBuilder();
    }
    public Person build(){
        return person;
    }
    public PersonBuilder withName(String name){
        person.setName(name);
        return this;
    }
    public PersonBuilder withLastName(String lastName){
        person.setLastName(lastName);
        return this;
    }
    public PersonBuilder withEmail(String email){
        person.setEmail(email);
        return this;
    }
    public PersonBuilder withPassword(String password){
        person.setPassword(password);
        return this;
    }
    public PersonBuilder withRegistrationDate(Date registrationDate){
        person.setRegistrationDate(registrationDate);
        return this;
    }
    public PersonBuilder withClientStatus(CustomerStatus clientStatus){
        person.setClientStatus(clientStatus);
        return this;
    }
    public PersonBuilder withRole(Role role){
        person.setRole(role);
        return this;
    }

}
