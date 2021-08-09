package interfac;


 class MySchool implements MyAttendance{
	public void c1() {
		System.out.println("mycollege name");
	}
	public void c2() {
		System.out.println("my Branch name");
	}
	public void c3() {
		System.out.println("my Lab name");
	}
	public void c4() {
		System.out.println("my Attendance");
	}
	
	public static void main(String args[])
	{
		MySchool s=new MySchool();
		s.c1();
		s.c2();
		s.c3();
		s.c4();
	}

	}
	
	


