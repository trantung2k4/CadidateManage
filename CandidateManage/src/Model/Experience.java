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
public class Experience extends Candidate {

    private int yearExperience;
    private String professionalSkill;

    public Experience() {
        super();
    }

    public Experience(int yearExperience, String professionalSkill,
            String id, String firstName, String lastName, int birthDate,
            String address, String phone, String email, int typeCandidate) {
        super(id, firstName, lastName, birthDate, address, phone, email,
                typeCandidate);
        this.yearExperience = yearExperience;
        this.professionalSkill = professionalSkill;
    }

    public int getYearExperience() {
        return yearExperience;
    }

    public void setYearExperience(int yearExperience) {
        this.yearExperience = yearExperience;
    }

    public String getProfessionalSkill() {
        return professionalSkill;
    }

    public void setProfessionalSkill(String professionalSkill) {
        this.professionalSkill = professionalSkill;
    }

    /**
     *
     * @param candidateList
     */
    @Override
    public void input(List<Candidate> candidateList) {
        super.input(candidateList); // Gọi input() của Candidate

        // Nhập số năm kinh nghiệm (tối thiểu 0, tối đa 50)
        this.yearExperience = Validate.inputInt("Enter Years of Experience: ", 0, 50);

        // Nhập kỹ năng chuyên môn
        this.professionalSkill = Validate.inputString("Enter Professional Skill: ", "^[a-zA-Z ]+$");
    }
}
