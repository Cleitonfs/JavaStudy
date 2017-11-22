import java.util.ArrayList;
import java.util.Collection;

public class Secretaria extends Funcionario {
	
	private Collection<String> idiomas = new ArrayList<>();
	private Collection<String> cursos = new ArrayList<>();
	
	public Collection<String> getCursos() {
		return cursos;
	}
	public void setCursos(Collection<String> cursos) {
		this.cursos = cursos;
	}
	public Collection<String> getIdiomas() {
		return idiomas;
	}
	public void setIdiomas(Collection<String> idiomas) {
		this.idiomas = idiomas;
	}
	
	

}
