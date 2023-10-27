package Inheritance;

public class TeamLead  extends Manager
{
	private int WorkstobeComplete;
	public TeamLead()
	{
		
	}
	public TeamLead(int taskno,String projectname,int WorkstobeComplete) {
		super(taskno,projectname);
		this.WorkstobeComplete = WorkstobeComplete;
	}
	public int getWorkstobeComplete() {
		return WorkstobeComplete;
	}
	public void setWorkstobeComplete(int WorkstobeComplete) {
		this.WorkstobeComplete = WorkstobeComplete;
	}
	@Override
	public String toString() {
		return super.toString()+"TeamLead [WorkstobeComplete=" + WorkstobeComplete + "]";
	}

}
