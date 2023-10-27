package Inheritance;

public class Player 
{
		int jerseynum;
		public Player()
		{
			
		}
		public Player(int jerseynum) {
			super();
			this.jerseynum = jerseynum;
		}
		public int getJerseynum() {
			return jerseynum;
		}
		public void setJerseynum(int jerseynum) {
			this.jerseynum = jerseynum;
		}
		@Override
		public String toString() {
			return "Player [jerseynum=" + jerseynum + "]";
		}

	}

int pname;
public Player()
{
	
}
public Player(int pname) {
	super();
	this.pname = pname;
}
public int getJerseynum() {
	return jerseynum;
}
public void setJerseynum(int jerseynum) {
	this.jerseynum = jerseynum;
}
@Override
public String toString() {
	return "Player [jerseynum=" + jerseynum + "]";
}

}



