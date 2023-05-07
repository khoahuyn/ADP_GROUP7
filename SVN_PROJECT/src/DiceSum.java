
public class DiceSum {
	  private DieRoll r1;
	  private DieRoll r2;
	  public void DiceSum(DieRoll r1,
			   DieRoll r2) {
		this.r1=r1;
		this.r2=r2;

	  }
	  public RollResult makeRoll() {
		return r1.makeRoll().andThen(r2.makeRoll());
	  }
	  public String toString() {
		return r1.toString() + " & "+r2.toString();
	  }

}
