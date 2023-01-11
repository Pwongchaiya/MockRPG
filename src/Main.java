public class Main {
  public static void main(String[] args) {
    Mage tinyNuggins = new Mage("Tiny Nuggins",0,0);
    Warrior crouton = new Warrior("Crouton",0,0);
    Elf dingberry = new Elf("Dingleberry", 0,0);
    dingberry.highAttack();
    tinyNuggins.lowAttack();
    crouton.distanceAttack();
  }
}
