
public class Student {

	protected int protect;
	private int prive;
	public int publ;
	public Student(int protect, int prive, int publ) {
		super();
		this.protect = protect;
		this.prive = prive;
		this.publ = publ;
	}
	@Override
	public String toString() {
		return "Student [protect=" + protect + ", prive=" + prive + ", publ=" + publ + "]";
	}
	
	public void hello(String ch) {
		System.out.println("saalut " + ch);
	}
}
