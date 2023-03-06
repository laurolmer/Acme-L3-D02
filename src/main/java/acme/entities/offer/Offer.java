
package acme.entities.offer;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.URL;

import acme.framework.components.accounts.Administrator;
import acme.framework.components.datatypes.Money;
import acme.framework.data.AbstractEntity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Offer extends AbstractEntity {

	protected static final long	serialVersionUID	= 1L;

	@PastOrPresent
	@NotNull
	@Temporal(TemporalType.DATE)
	protected Date				instantiationMoment;

	@Length(max = 75)
	@NotBlank
	protected String			heading;

	@Length(max = 100)
	@NotBlank
	protected String			summary;

	@NotNull
	protected Money				price;

	@NotNull
	@Temporal(TemporalType.DATE)
	protected Date				availabilityPeriodStart;

	@NotNull
	@Temporal(TemporalType.DATE)
	protected Date				availabilityPeriodEnd;

	@URL
	protected String			link;

	@Valid
	@NotNull
	@OneToOne
	protected Administrator		administrator;

}
