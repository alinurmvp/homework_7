public class Medic extends Hero {
    private int healPoints;
    public Medic(int health, int damage, String typeOfSuperAbility) {
        super(health, damage, typeOfSuperAbility);
    } public void increaseExperience(){
        this.healPoints += this.healPoints * 0.1;
    }
    @Override
    public void applySuperAbility(){
        System.out.println("Medic применил суперспособность Healing !!!");
    }
}
