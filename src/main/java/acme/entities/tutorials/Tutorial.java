
package acme.entities.tutorials;

import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;

import acme.framework.data.AbstractEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Tutorial extends AbstractEntity {

	// Serialisation identifier -----------------------------------------------
	protected static final long	serialVersionUID	= 1L;

	// Attributes -------------------------------------------------------------
	@NotBlank
	@Column(unique = true)
	@Pattern(regexp = "[A-Z]{1,3}[0-9][0-9]{3}")
	protected String			supervisor;

	@NotBlank
	@Length(max = 75)
	protected String			title;

	@NotBlank
	@Length(max = 100)
	protected String			abstractTutorial;

	@NotBlank
	@Length(max = 100)
	protected ArrayList<String>	goals;

	protected Integer			totalTime;

	// Derived attributes -----------------------------------------------------

	// Relationships ----------------------------------------------------------
	//@Valid
	//@OneToMany(mappedBy = "tutorial")
	//protected Collection<Session>	sessions;

}
