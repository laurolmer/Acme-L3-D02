
package acme.entities.tutorials;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;

import acme.entities.sessions.Session;
import acme.framework.data.AbstractEntity;
import acme.roles.Assistant;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "tutorial")
@Getter
@Setter
public class Tutorial extends AbstractEntity {

	// Serialisation identifier -----------------------------------------------
	protected static final long		serialVersionUID	= 1L;

	// Attributes -------------------------------------------------------------
	@NotBlank
	@NotNull
	@Column(unique = true)
	@Pattern(regexp = "[A-Z]{1,3}[0-9][0-9]{3}")
	protected String				code;

	@NotBlank
	@NotNull
	@Length(max = 75)
	protected String				title;

	@NotBlank
	@NotNull
	@Length(max = 100)
	protected String				abstractTutorial;

	@NotBlank
	@NotNull
	@Length(max = 100)
	protected String				goals;

	@NotNull
	protected Integer				totalTime;

	// Derived attributes -----------------------------------------------------

	// Relationships ----------------------------------------------------------
	@Valid
	@OneToMany(mappedBy = "tutorial")
	protected Collection<Session>	sessions;

	@Valid
	@ManyToOne(optional = false)
	protected Assistant				assistant;

}
