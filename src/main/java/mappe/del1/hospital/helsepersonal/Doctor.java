package no.ntnu.idata.mappevurdering_v1.helsepersonal;

import no.ntnu.idata.mappevurdering_v1.Employee;

public abstract class Doctor extends Employee {


    protected String diagnosis;

    /**
     * Creates an instance of class Person
     *
     * @param firstName
     * @param lastName
     * @param socialSecurityNumber
     */
    public Doctor(String firstName, String lastName, String socialSecurityNumber) {
        super(firstName, lastName, socialSecurityNumber);
    }
}
