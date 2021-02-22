package no.ntnu.idata.mappevurdering_v1.helsepersonal;

import no.ntnu.idata.mappevurdering_v1.Employee;

public class Nurse extends Employee {
    /**
     * Creates an instance of class Person
     *
     * @param firstName
     * @param lastName
     * @param socialSecurityNumber
     */
    public Nurse(String firstName, String lastName, String socialSecurityNumber) {
        super(firstName, lastName, socialSecurityNumber);
    }


    public String getNurseInfo(){
        return super.getPerson();
    }
}
