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
        candidate.setTypeCandidate(type);
        candidate.input();
        candidateList.add(candidate);
        System.out.println("Candidate added successfully!");
    }

    public List<Candidate> searchCandidate() {
    if (candidateList.isEmpty()) {
        return List.of(); // Trả về danh sách rỗng nếu không có ứng viên nào
    }

    int type = Validate.inputInt("Enter candidate type (0: Experience, 1: Fresher, 2: Internship): ", 0, 2);
    String searchName = Validate.inputString("Enter candidate name to search: ", ".*");

    System.out.println("DEBUG: Searching for type = " + type + " and name = " + searchName);

    // Kiểm tra danh sách ứng viên hiện tại
    candidateList.forEach(candidate -> 
        System.out.println("DEBUG: Candidate in list - Name: " + candidate.getFirstName() + " | Type: " + candidate.getTypeCandidate())
    );

    // Lọc danh sách ứng viên theo điều kiện
    List<Candidate> resultList = candidateList.stream()
        .filter(candidate -> candidate.getTypeCandidate() == type &&
               (candidate.getFirstName().toLowerCase().contains(searchName.toLowerCase()) ||
                candidate.getLastName().toLowerCase().contains(searchName.toLowerCase())))
        .toList();

    if (resultList.isEmpty()) {
        System.out.println("No candidates found with the given criteria.");
    } else {
        System.out.println("\nSearch Results:");
        resultList.forEach(candidate -> System.out.println(candidate.output()));
    }

    return resultList;
}

}
