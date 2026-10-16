/* 
◦ Contains a single instance variable representing an ArrayList of ten patients.
◦ Implements a default constructor.
◦ Implements a method that will add a Patient object to the first available spot in the patient.
ArrayList. This method should take a Patient object as a parameter, and return an int,
representing the index of the ArrayList where the object was placed.
◦ Implement a method that will remove and return a Patient object at a given index in the
patient ArrayList. An int should be passed into this method.
◦ Implement a method called caffeineAbsorption() that will take no parameters, and reduce the
caffeine level of every patient in the patient ArrayList by 140. If the patient has no caffeine
remaining after, they should be removed from the ArrayList!
◦ Implement a ToString() method that will print the ID and Caffeine value for each patient in the
PatientManager object (in the patient array). If there are no patients, print “Empty”
*/
import java.util.ArrayList;
public class PatientManager {

    public ArrayList<Patient> Patients;

    public PatientManager() {

        Patients = new ArrayList <Patient> (10);

    }

    public int AddPatient(Patient Patients) {

        Patients.add (Patients);
        return Patients.size() -1;
    }

    public Patient RemovePatient (int index) {

        if (index >=0 && index < Patients.size()) {
            return Patients.remove(index);
        }
        else {
            return null;
        }
    }

    public void CaffeineAbsorbtion() {

        for (int i = 0; i < Patients.size(); i++) {

            Patient Patient = Patients.get(i);
            double newCaffeineLevel = Patient.CaffeineLevel - 140;

            if (newCaffeineLevel <= 0) {
                Patients.remove (i);
                i--;       
            }
            else {
                Patient.CaffeineLevel = newCaffeineLevel;
            }
    }
}

    public int removeHigestCaffeinePatient() {
        
        if (Patients.isEmpty()) {
            return -1;
        }

        for (int i = 1; i < Patients.size(); i++) {
            if (Patients.get(i).CaffeineLevel > Patients.get(0).CaffeineLevel) {
                Patients.set(0, Patients.get(i));
            }
        }
        Patients.remove(0);
        return 0;
    }

    public String toString() {

        if (Patients.isEmpty()){
            return "Empty";
        }
        else {
            for (int i = 0; i < Patients.size(); i++) {
                Patient Patient = Patients.get(i);
                System.out.println(Patient.IDnumber + " " + Patient.CaffeineLevel);
            }
        }
        return "";
    }




}
