/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vrajp
 */
public class StudentEntry {
    private String StudentID;
    private String FirstName;
    private String LastName;

    public StudentEntry(String StudentID, String FirstName, String LastName) {
        this.StudentID = StudentID;
        this.FirstName = FirstName;
        this.LastName = LastName;
    }

    public String getStudentID() {
        return StudentID;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setStudentID(String StudentID) {
        this.StudentID = StudentID;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }
    
}

