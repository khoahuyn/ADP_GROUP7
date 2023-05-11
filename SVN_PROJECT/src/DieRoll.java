import java.util.Random;

public class DieRoll {
    private int ndice;
    private int nsides;
	private int bonus;
    private static Random rd;
    static{
	rd=new Random();
    }
    public void Die_Roll(int ndice,int nsides,int bonus) {
	this.ndice=ndice;
	this.nsides=nsides;
	this.bonus=bonus;
    }
    public RollResult makeRoll() {
	RollResult r=new RollResult(bonus);
	for(int i=0;i<ndice;i++) {
	    int roll=rd.nextInt(nsides)+1;
	    r.addResult(roll);
	}
	return r;
    }
    public String toString() {
	String ans =ndice+"d"+nsides;
	if(bonus>0) {
	    ans= ans+"+"+bonus;
	}
	else if(bonus<0) {
	    ans=ans+bonus;
	}
	return ans;
    }
}
