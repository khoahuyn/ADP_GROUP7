import java.util.Vector;

public class RollResult {
	int total;
    int modifier;
	private Vector<Integer> rolls;
//    Vector<Integer> rolls;
    private void Roll_Result(int total, int modifier,Vector<Integer> rolls){
	this.total=total;
	this.modifier=modifier;
	this.rolls=rolls;
    }
    public RollResult(int bonus) {
	this.total=bonus;
	this.modifier=bonus;
	rolls=new Vector<Integer>();
    }
    public void addResult(int res){
	total+=res;
	rolls.add(res);
    }
    public RollResult andThen(RollResult r2) {
	int total=this.total+r2.total;
	Vector<Integer> rolls=new Vector<Integer>();
	rolls.addAll(this.rolls);
	rolls.addAll(r2.rolls);
	return new RollResult(total);
    }
    public String toString() {
	return total +"  <= " +rolls.toString()+  (modifier>0?("+"+modifier):  modifier<0?modifier:"");
    }

        public static void main(String[] args) {
            RollResult result1 = new RollResult(3);
            result1.addResult(7);
            result1.addResult(9);
            RollResult result2 = new RollResult(5);
            result2.addResult(3);
            result2.addResult(5);
            RollResult finalResult = result1.andThen(result2);
            System.out.println(finalResult.toString());
        }
}
