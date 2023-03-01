
package acme.entities.bulletin;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.PastOrPresent;

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

	@PastOrPresent
	@Temporal(TemporalType.TIME)
	protected Date				moment;

	@NotBlank
	@Length(max = 101)
	protected String			title;

	@NotBlank
	@Length(max = 101)
	protected String			message;

	protected Boolean			critical;

	@URL
	protected String			optionalLink;
}
