
package acme.entities.banner;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.URL;

import acme.framework.data.AbstractEntity;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "banenr")
@Getter
@Setter
public class Banner extends AbstractEntity {

	// Serialisation identifier -----------------------------------------------
	protected static final long	serialVersionUID	= 1L;

	// Attributes -------------------------------------------------------------

	@NotNull
	@Past
	@Temporal(TemporalType.TIMESTAMP)
	protected Date				updatee;

	@NotNull
	@Temporal(TemporalType.TIMESTAMP) //a display period (must start at any moment after the instantiation/update 
	protected Date				moment;			//moment and must last for at least one week)

	@NotNull
	@URL
	protected String			imgLink;

	@NotBlank
	@Length(max = 75)
	protected String			slogan;

	@NotNull
	@URL
	protected String			docLink;

	// Derived attributes -----------------------------------------------------

	// Relationships ----------------------------------------------------------

	//@Valid
	//@ManyToOne()  //A banner allows administrators to advertise products, services, or organizations.
	//private static Banner banner;

}
