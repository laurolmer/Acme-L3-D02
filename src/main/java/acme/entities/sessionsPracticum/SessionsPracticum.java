package acme.entities.sessionsPracticum;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.Length;

import acme.entities.practicum.Practicum;
import acme.framework.data.AbstractEntity;
import lombok.Getter;
import lombok.Setter;

@Entity(name= "sessionsPracticum")
@Getter
@Setter
public class SessionsPracticum extends AbstractEntity  {

	// Serialisation identifier -----------------------------------------------
	private static final long serialVersionUID = 1L;
	
	// Attributes -------------------------------------------------------------
	@NotBlank
	@Length(max= 75)
	protected String title;
	
	@NotBlank
	@Length(max= 100)
	protected String abstractt;
	
	protected timePeriod timePeriod;
	
	// Derived attributes -----------------------------------------------------

	// Relationships ----------------------------------------------------------
	
	@ManyToOne()
	private Practicum practicum;
}
