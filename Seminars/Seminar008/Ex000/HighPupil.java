package Seminars.Seminar008.Ex000;

public class HighPupil extends Pupil{
    private String listExams;


    public HighPupil(String fullName, double averBall, int classNumber, String listExams) {
        super(fullName, averBall, classNumber);
        this.listExams = listExams;
    }
    @Override
    public void play() {
        System.out.println("Я играю в Dota");
    }
    @Override
    public void learn() {
        System.out.println("Я должен учиться");
    }
    @Override
    public String toString() {
        return String.format("%s\nСписок экзаменов: %s", super.toString(),listExams);
    }
    public void registrationExam(){
        //
    }
}
