package Seminars.Seminar008.Ex000;

public class JuniorPupil extends Pupil {
    private boolean extendedDayGroup;

    public JuniorPupil(String fullName, double averBall, int classNumber, boolean extendedDayGroup) {
        super(fullName, averBall, classNumber);
        this.extendedDayGroup = extendedDayGroup;
    }
    @Override
    public void play() {
        System.out.println("Я играю в игрушки");
    }
    @Override
    public void learn() {
        System.out.println("Я люблю школу");
    }
    public boolean getExtendedDayGroup() {
        return extendedDayGroup;
    }
    public void goExtendedDayGroup() {
        this.extendedDayGroup = true;
    }
    @Override
    public String toString() {
        return String.format("%s\nГруппа продлённого дня: %b", super.toString(),extendedDayGroup);
    }
}
