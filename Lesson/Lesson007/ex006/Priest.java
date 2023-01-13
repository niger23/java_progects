package Lesson.Lesson007.ex006;

public class Priest extends BaseHero {

    private int elixir;
    private int maxElixir;

    public Priest() {
        super(String.format("Hero_Priest #%d", ++Magician.number),
                Magician.r.nextInt(200));
        this.maxElixir = Magician.r.nextInt(150);
        this.elixir = maxElixir;
    }

    public int Attack() {
        int damage = BaseHero.r.nextInt(30);
        this.elixir -= (int) (damage * 0.8);
        if (elixir < 0)
            return 0;
        else
            return damage;
    }

    public String getInfo() {
        return String.format("%s  Elixir: %d", super.getInfo(), this.elixir);
    }
}
