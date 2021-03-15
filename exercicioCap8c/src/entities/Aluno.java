package entities;

public class Aluno {
	public String name;
	public double nota1;
	public double nota2;
	public double nota3;
	public double nf () {
		return nota1 + nota2 + nota3;	
	}
	
	public double missing () {
		if (nf() < 60.00) {
			return 60.0 - nf();
		}
		else {
			return 0.0;
		}
}
}
