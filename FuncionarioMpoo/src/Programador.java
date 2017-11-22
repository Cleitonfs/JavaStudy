import java.util.ArrayList;
import java.util.Collection;

public class Programador extends Funcionario {
	
	
	private Integer agilidade;
	private Collection<String> linguagens = new ArrayList<>();
	private boolean autodidata;
	
	
	public boolean isAutodidata() {
		return autodidata;
	}
	public void setAutodidata(boolean autodidata) {
		this.autodidata = autodidata;
	}
	public Integer getAgilidade() {
		return agilidade;
	}
	public void setAgilidade(Integer agilidade) {
		this.agilidade = agilidade;
	}
	public Collection<String> getLinguagens() {
		return linguagens;
	}
	public void setLinguagens(Collection<String> linguagens) {
		this.linguagens = linguagens;
	}
	

}
