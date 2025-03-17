package candidateBO;

import Model.Candidate;
import Model.Experience;
import Model.Fresher;
import Model.Internship;
import utils.Validate;

import java.util.List;
import java.util.LinkedList;

public class CandidateBO {
    private final List<Candidate> candidateList;

    public CandidateBO() {
        this.candidateList = new LinkedList<>();
    }

    public void createCandidate(int type) {
        Candidate candidate = null;

        switch (type) {
            case 0:
                candidate = new Experience();
                break;
            case 1:
                candidate = new Fresher();
                break;
            case 2:
                candidate = new Internship();
                break;
            default:
                System.out.println("Invalid candidate type!");
                return;
        }

        // Gọi phương thức input() để nhập thông tin ứng viên
        candidate.input();
        candidateList.add(candidate);
        System.out.println("Candidate added successfully!");
    }

    public void searchCandidate() {
        if (candidateList.isEmpty()) {
            System.out.println("No candidates available.");
            return;
        }

        // Nhập loại ứng viên cần tìm (0: Experience, 1: Fresher, 2: Internship)
        int type = Validate.inputInt("Enter candidate type: ", 0, 2);

        // Nhập tên cần tìm (tìm theo FirstName hoặc LastName)
        String searchName = Validate.inputString("Enter candidate name to search: ", ".*");

        boolean found = false;

        System.out.println("\nSearch Results:");
        for (Candidate candidate : candidateList) {
            if (candidate.getTypeCandidate() == type &&
                (candidate.getFirstName().contains(searchName.toLowerCase()) ||
                candidate.getLastName().contains(searchName.toLowerCase()))) {
                System.out.println(candidate.toString());
                found = true;
            }
        }

        if (!found) {
            System.out.println("No candidates found with the given criteria.");
        }
    }
}
