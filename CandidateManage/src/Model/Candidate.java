/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.LinkedList;
import java.util.List;
import utils.Validate;

/**
 *
 * @author admin
 */
public class Candidate {
    private String id;
    private String firstName;
    private String lastName;
    private int birthDate;
    private String address;
    private String phone;
    private String email;
    private int typeCandidate;
    
    private static List<Candidate> candidateList = new LinkedList<>();


    public Candidate() {
    }

    public Candidate(String id, String firstName, String lastName, int birthDate, String address, String phone, String email, int typeCandidate) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.typeCandidate = typeCandidate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(int birthDate) {
        this.birthDate = birthDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTypeCandidate() {
        return typeCandidate;
    }

    public void setTypeCandidate(int typeCandidate) {
        this.typeCandidate = typeCandidate;
    }

    public void input() {
        // Nhập ID
        do {
            this.id = Validate.inputString("Enter Candidate ID: ", "^[a-zA-Z0-9]+$");
            if (!Validate.checkIdExist(candidateList, this.id)) {
                System.out.println("ID already exists! Please enter a different ID.");
            }
        } while (!Validate.checkIdExist(candidateList, this.id) && this.id.isEmpty());

        // Nhập Họ và Tên
        this.firstName = Validate.inputString("Enter First Name: ", "^[a-zA-Z ]+$");
        this.lastName = Validate.inputString("Enter Last Name: ", "^[a-zA-Z ]+$");

        // Nhập Năm Sinh
        this.birthDate = Validate.inputInt("Enter Birth Year: ", 1900, 
            java.util.Calendar.getInstance().get(java.util.Calendar.YEAR));

        // Nhập Địa chỉ
        this.address = Validate.inputString("Enter Address: ","^[a-zA-Z0-9]+$");

        // Nhập Số điện thoại
        this.phone = Validate.inputString("Enter Phone: ", "^(0[3|5|7|8|9])[0-9]{8}$");

        // Nhập Email
        this.email = Validate.inputString("Enter Email: ", "[A-Za-z]\\w+@\\w+(\\.\\w+){1,3}$");
    }

    public String output() {
        return this.firstName + this.lastName + "|" + this.birthDate + "|"
                + this.address + "|" + this.phone + "|" + this.email + "|"
                + this.typeCandidate;
    }
}
