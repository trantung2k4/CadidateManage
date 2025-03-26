/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.List;
import utils.Validate;

/**
 *
 * @author admin
 */
public class Internship extends Candidate {

    private String major;
    private String semester;
    private String university;

    public Internship() {
        super();
    }

    public Internship(String major, String semester, String university,
            String id, String firstName, String lastName, int birthDate,
            String address, String phone, String email, int typeCandidate) {
        super(id, firstName, lastName, birthDate, address, phone, email,
                typeCandidate);
        this.major = major;
        this.semester = semester;
        this.university = university;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }
    
     @Override
    public void input(List<Candidate> candidateList) {
        super.input(candidateList);

        // Nhập chuyên ngành
        this.major = Validate.inputString("Enter Major: ", ".+");

        // Nhập học kỳ (từ 1 đến 10)
        this.semester = Validate.inputString("Enter Semester: ", ".+");

        // Nhập tên trường đại học
        this.university = Validate.inputString("Enter University Name: ", ".+");
    }
}
