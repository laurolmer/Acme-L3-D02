
package acme.roles;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.URL;

import acme.framework.data.AbstractRole;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Lecturer extends AbstractRole {

	//	 Serialisation identifier -----------------------
	protected static final long serialVersionUID = 1L;

	//	Attributes --------------------------------------
	@NotBlank
	@Size(max = 76)
	protected String almaMater;

	@NotBlank
	@Size(max = 101)
	protected String resume;
	
	@NotBlank
	@Size(max = 101)
	protected String qualificationsList;
	
	@URL
	protected String link;
}
