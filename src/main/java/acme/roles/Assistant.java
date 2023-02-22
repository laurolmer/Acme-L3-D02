
package acme.roles;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.URL;

import acme.framework.data.AbstractRole;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Assistant extends AbstractRole {

	// Serialisation identifier -----------------------------------------------
	protected static final long	serialVersionUID	= 1L;

	// Attributes -------------------------------------------------------------
	@NotBlank
	@Size(max = 76)
	protected String			supervisor;

	@NotBlank
	@Length(max = 101)
	protected String			resume;

	@NotBlank
	@Size(max = 101)
	protected ArrayList<String>	expertiseFields;

	@URL
	protected String			link;

	// Derived attributes -----------------------------------------------------

	// Relationships ----------------------------------------------------------

}
