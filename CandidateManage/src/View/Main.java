/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package View;

import candidateBO.CandidateBO;
import utils.Validate;

/**
 *
 * @author admin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CandidateBO manager = new CandidateBO();
        while (true) {
            System.out.println("1. Experience");
            System.out.println("2. Fresher");
            System.out.println("3. Internship");
            System.out.println("4. Searching");
            System.out.println("5. Exit");
            int choice = Validate.inputInt("Enter your choice: ",1, 5);
            switch (choice) {
                case 1 -> manager.createCandidate(0);
                case 2 -> manager.createCandidate(1);
                case 3 -> manager.createCandidate(2);
                case 4 -> manager.searchCandidate();
                case 5 -> {
                    return;
                }
            }
        }
    }
}
