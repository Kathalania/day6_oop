public class student {

    // Variablen werden auf private gesetzt
    private String degree;

    private String university;

    private int semester;

    private boolean enrolled;

    // Get Methoden sind public

    public String getDegree(){
        return degree;
    }

    public String getUniversity(){
        return university;
    }

    public int getSemester(){
        return semester;
    }

    public boolean getEnrolled() {
        return enrolled;
    }

    // Set Methoden sind voids und public

    public void setDegree(String newDegree){
        degree = newDegree;
    }

    public void setUniversity (String newUniversity){
        university = newUniversity;
    }

    public void setSemester (int newSemester){
        semester = newSemester;
    }

    public void setEnrolled(boolean newEnrolled){
        enrolled = newEnrolled;
    }
}
