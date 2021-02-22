package no.ntnu.idata.mappevurdering_v1.helsepersonal;

public class GeneralPractitioner extends Doctor{

    /**
     * Creates an instance of class Person
     *
     * @param firstName
     * @param lastName
     * @param socialSecurityNumber
     */
    public GeneralPractitioner(String firstName, String lastName, String socialSecurityNumber) {
        super(firstName, lastName, socialSecurityNumber);
    }

    public String getGPinfo(){
        return super.getPerson();
    }

    public void setDiagnosis(String diagnosis){
        this.diagnosis = diagnosis;
    }


}
