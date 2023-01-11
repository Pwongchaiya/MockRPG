public class Warrior extends Character implements FightingMoves{
  public Warrior(String name, int wins, int loss) {
    super(name, wins, loss);
  }

  @Override
  public void highAttack() {
    System.out.println(getName() +" performs a high attack");
  }

  @Override
  public void lowAttack() {
    System.out.println(getName() +" performs a low attack");
  }

  @Override
  public void distanceAttack() {
    System.out.println(getName() +" performs a distance attack");
  }

  @Override
  public void shortRangeAttack() {
    System.out.println(getName() +" performs a short distance attack");

  }
}
