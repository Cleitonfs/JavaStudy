import java.util.ArrayList;
import java.util.Collection;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

public class AnalistaDeSistemas extends Funcionario{
	
	private Integer nivel;
	private Collection<String> formacao = new ArrayList<>();
	
	public Integer getNivel() {
		return nivel;
	}
	public void setNivel(Integer nivel) {
		this.nivel = nivel;
	}
	public Collection<String> getFormacao() {
		return formacao;
	}
	public void setFormacao(Collection<String> formacao) {
		this.formacao = formacao;
	}
	

}
