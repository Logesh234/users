package miniproject2;

public class Students {
	private String viewbook;
	private String returnbook;
	
	public Students() {
		super();
	}

	public Students(String viewbook, String returnbook) {
		super();
		this.viewbook = viewbook;
		this.returnbook = returnbook;
	}

	public String getViewbook() {
		return viewbook;
	}

	public void setViewbook(String viewbook) {
		this.viewbook = viewbook;
	}

	public String getReturnbook() {
		return returnbook;
	}

	public void setReturnbook(String returnbook) {
		this.returnbook = returnbook;
	}

	@Override
	public String toString() {
		return "Students [viewbook=" + viewbook + ", returnbook=" + returnbook + ", getViewbook()=" + getViewbook()
				+ ", getReturnbook()=" + getReturnbook() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	

}
