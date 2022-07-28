package method_chaining;

public class Execution {

	public static void main(String[] args) {
		
		Gamma g=new Gamma();
		Beta b= g.memo();
		Alpha a= b.demo();
		a.test();
		System.out.println(a);
		g.memo().demo().test();
		System.out.println(g);

	}

}
