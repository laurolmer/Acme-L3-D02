
package acme.entities.bulletin;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.URL;

import acme.framework.data.AbstractEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Bulletin extends AbstractEntity {

	protected static final long	serialVersionUID	= 1L;

	@Past
	@Temporal(TemporalType.TIME)
	protected Date				moment;

	@NotBlank
	@Length(max = 100)
	protected String			title;

	@NotBlank
	@Length(max = 100)
	protected String			message;

	protected CriticalType		critical;

	@URL
	protected String			optionalLink;
}
