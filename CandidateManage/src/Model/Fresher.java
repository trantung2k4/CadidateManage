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
public class Fresher extends Candidate {

    private String graduationDate;
    private String graduationRank;

    public Fresher() {
        super();
    }

    public Fresher(String graduationDate, String graduationRank, String id,
            String firstName, String lastName, int birthDate, String address,
            String phone, String email, int typeCandidate) {
        super(id, firstName, lastName, birthDate, address, phone, email,
                typeCandidate);
        this.graduationDate = graduationDate;
        this.graduationRank = graduationRank;
    }

    public String getGraduationDate() {
        return graduationDate;
    }

    public void setGraduationDate(String graduationDate) {
        this.graduationDate = graduationDate;
    }

    public String getGraduationRank() {
        return graduationRank;
    }

    public void setGraduationRank(String graduationRank) {
        this.graduationRank = graduationRank;
    }
    
    @Override
    public void input(List<Candidate> candidateList) {
        super.input(candidateList);

        // Nhập ngày tốt nghiệp
        this.graduationDate = Validate.inputString("Enter Graduation day: ", "^(0[1-9]|[12][0-9]|3[01])-(0[1-9]|1[0-2])-(\\d{4})$");

        // Nhập xếp loại tốt nghiệp (chỉ chấp nhận Excellence, Good, Fair, Poor)
        this.graduationRank = Validate.inputString("Enter Gradution Rank: ", "(?i)^(Excellence|Good|Fair|Poor)$");
    }
}