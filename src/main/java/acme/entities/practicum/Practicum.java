
package acme.entities.practicum;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;

import acme.entities.sessionsPracticum.SessionsPracticum;
import acme.framework.data.AbstractEntity;
import acme.roles.Company;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "practicum")
@Getter
@Setter
public class Practicum extends AbstractEntity {

	// Serialisation identifier -----------------------------------------------
	protected static final long				serialVersionUID	= 1L;

	// Attributes -------------------------------------------------------------
	@NotBlank
	@Column(unique = true)
	@Pattern(regexp = "[A-Z]{1,3}[0-9][0-9]{3}")
	protected String						code;

	@NotBlank
	@Length(max = 75)
	protected String						title;

	@NotBlank
	@Length(max = 100)
	protected String						abstractt;

	@NotBlank
	@Length(max = 100)
	protected ArrayList<String>				goals;

	@NotNull
	@Temporal(TemporalType.TIME)
	protected Date							estimedTotalTime; // computed from sessions plus/minus 10%

	// Derived attributes -----------------------------------------------------

	// Relationships ----------------------------------------------------------

	@Valid
	@OneToMany(mappedBy = "practicum")
	private static List<SessionsPracticum>	sessionsPracticum;

	@Valid
	@OneToMany(mappedBy = "practicum")
	private static Company					company;

}
