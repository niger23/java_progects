package Seminars.Seminar008.Ex000;

public class MiddlePupil extends Pupil{

    public MiddlePupil(String fullName, double averBall, int classNumber) {
        super(fullName, averBall, classNumber);
    }
    @Override
    public void play() {
        System.out.println("Я играю в Minecraft");
    }
    @Override
    public void learn() {
        System.out.println("Я ненавижу школу");
    }
    @Override
    public String toString() {
        return super.toString();
    }
    
}
