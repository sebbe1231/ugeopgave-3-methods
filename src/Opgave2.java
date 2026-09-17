public class Opgave2 {
    int assignmentPoints;
    int examPoints;
    int projectPoints;

    void main() {
        addPoints(25, "assignmentPoints");
        addPoints(40, "examPoints");
        addPoints(30, "projectPoints");

        printTotal();
    }

    public void addPoints(int points, String type) {
        switch(type){
            case "assignmentPoints":
                System.out.println("Added " + points + " to assignmentPoints");
                assignmentPoints += points;
                break;
            case "examPoints":
                System.out.println("Added " + points + " to examPoints");
                examPoints += points;
                break;
            case "projectPoints":
                System.out.println("Added " + points + " to projectPoints");
                projectPoints += points;
                break;
            default:
                System.out.println("Not a valid variable");
        }
    }

    public int getTotal() {
        return assignmentPoints + examPoints + projectPoints;
    }

    public String getGrade() {
        String grade = null;
        int points = getTotal();

        if (points >= 0 && points <= 50) {
            grade = "-2";
        }
        else if (points >= 51 && points <= 70) {
            grade = "00";
        }
        else if (points >= 71 && points <= 85) {
            grade = "7";
        }
        else if (points >= 86 && points <= 100) {
            grade = "12";
        }

        return grade;
    }

    public void printTotal() {
        System.out.println("Total points:");
        System.out.println(getTotal());
        System.out.println("Grade:");
        System.out.println(getGrade());
    }
}
