public class Main {
    public static void main(String[] args) {
       Hero [] heroes = new Hero[3];
       heroes [0] = new Magic (250,40,"FireBall");
               heroes[1]= new Medic(200,30,"Healing");
               heroes[2]= new Warrior(260,50,"Critical Damage");
               for (Hero hero: heroes){
                   hero.applySuperAbility();
                   if (hero instanceof Medic){
                       ((Medic) hero). increaseExperience();
                   }
               }
        }     
   }
