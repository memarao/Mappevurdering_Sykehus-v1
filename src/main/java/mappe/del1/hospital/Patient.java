package no.ntnu.idata.mappevurdering_v1;

public class Patient extends Person {

    private String diagnosis;

    /**
     * Creates an instance of class Patient
     *
     * @param firstName
     * @param lastName
     * @param socialSecurityNumber
     */
    public Patient(String firstName, String lastName, String socialSecurityNumber, String diagnosis) {
        super(firstName, lastName, socialSecurityNumber);
        this.diagnosis = "Unknown diagnosis";
    }

    /**
     * Returns diagnosis
     * @return
     */
    public String getDiagnosis() {
        return diagnosis;
    }



    /**
     * Return patient's full name
     * @param firstName
     * @param lastName
     * @return
     */
    public String getPatientName(String firstName, String lastName){
        return super.getFullName();
    }
}
