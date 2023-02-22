
package acme.entities.practicum;

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
public class Practicum extends AbstractEntity {

	// Serialisation identifier -----------------------------------------------
	protected static final long	serialVersionUID	= 1L;

	// Attributes -------------------------------------------------------------
	@NotBlank
	@Column(unique = true)
	@Pattern(regexp = "[A-Z]{1,3}[0-9][0-9]{3}")
	protected String			code;

	@NotBlank
	@Length(max = 75)
	protected String			title;

	@NotBlank
	@Length(max = 100)
	protected String			abstractt;

	@NotBlank
	@Length(max = 100)
	protected ArrayList<String>	goals;

	protected Integer			estimedTotalTime; // computed from sessions plus/minus 10%

	// Derived attributes -----------------------------------------------------

	// Relationships ----------------------------------------------------------

	//	@OneToMany(mappedBy= "practicum")
	//	private List<Sessions_Practicum>  sessions_practicum;

}
