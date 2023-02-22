
package acme.entities.tutorials;

import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

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
	@Length(max = 76)
	protected String			title;

	@NotBlank
	@Size(max = 101)
	protected String			abstractt;

	@NotBlank
	@Size(max = 101)
	protected ArrayList<String>	goals;

	protected Integer			totalTime;

	// Derived attributes -----------------------------------------------------

	// Relationships ----------------------------------------------------------

}
