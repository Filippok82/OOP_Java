package Lesson_01.Ex007_02;

public class Healer extends BaseHero {

    private int medicament;
    private int maxMedicament;

    public Healer() {
        super(String.format("Hero_Priest #%d", ++Healer.number),
                Healer.r.nextInt(100, 200));
        this.maxMedicament = Healer.r.nextInt(50, 150);
        this.medicament = maxMedicament;
    }

    public String getInfo() {
        return String.format("%s  Medicament: %d", super.getInfo(), this.medicament);
    }
}
