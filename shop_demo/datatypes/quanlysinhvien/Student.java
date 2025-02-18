package bu3_training.shop_demo.datatypes.quanlysinhvien;

public class Student {

    public enum Grade{
        EXCELLENT, GOOD, AVERAGE, WEAK;
    }

    private String name;
    private double score;
    private Grade grade;

    public Student(String name, double score) {
        this.name = name;
        this.score = score;
        this.grade = determineGrade(score);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    public Grade determineGrade(double score) {
        if (score >= 8.5) {
            return Grade.EXCELLENT;
        } else if (score >= 7.0) {
            return Grade.GOOD;
        } else if (score >= 5.0) {
            return Grade.AVERAGE;
        } else {
            return Grade.WEAK;
        }
    }
    public void hienThiSinhVien(){
        System.out.println("Tên " + name + ",Điểm: "+ score + ", học lực: " + grade);
    }


}
