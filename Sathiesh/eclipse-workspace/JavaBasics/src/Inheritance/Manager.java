package Inheritance;

public class Manager 
{
		private int taskno;
		private String projectname;
		public Manager()
		{
			
		}
		public Manager(int taskno, String projectname) {
			super();
			this.taskno = taskno;
			this.projectname = projectname;
		}
		public int getTaskno() {
			return taskno;
		}
		public void setTaskno(int taskno) {
			this.taskno = taskno;
		}
		public String getProjectname() {
			return projectname;
		}
		public void setProjectname(String projectname) {
			this.projectname = projectname;
		}
		@Override
		public String toString() {
			return "Manager [taskno=" + taskno + ", projectname=" + projectname + "]";
		}
		



}
