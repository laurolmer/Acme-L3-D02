
package acme.roles;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.URL;

import acme.entities.tutorials.Tutorial;
import acme.framework.data.AbstractRole;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Assistant extends AbstractRole {

	// Serialisation identifier -----------------------------------------------
	protected static final long		serialVersionUID	= 1L;

	// Attributes -------------------------------------------------------------
	@NotBlank
	@NotNull
	@Length(max = 75)
	protected String				supervisor;

	@NotBlank
	@NotNull
	@Length(max = 100)
	protected String				resume;

	@NotBlank
	@NotNull
	@Length(max = 100)
	protected String				expertiseFields;

	@URL
	protected String				link;

	// Derived attributes -----------------------------------------------------

	// Relationships ----------------------------------------------------------
	@Valid
	@OneToMany(mappedBy = "assistant")
	protected Collection<Tutorial>	tutorials;

}
