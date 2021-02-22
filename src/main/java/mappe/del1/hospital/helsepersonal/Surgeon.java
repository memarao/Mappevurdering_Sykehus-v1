package no.ntnu.idata.mappevurdering_v1.helsepersonal;

public class Surgeon extends Doctor{

    /**
     * Creates an instance of class Person
     *
     * @param firstName
     * @param lastName
     * @param socialSecurityNumber
     */
    public Surgeon(String firstName, String lastName, String socialSecurityNumber) {
        super(firstName, lastName, socialSecurityNumber);
    }

    public String getSurgeonInfo(){
        return super.getPerson();
    }

    public void setDiagnosis(String diagnosis){
            this.diagnosis = diagnosis;
    }
}