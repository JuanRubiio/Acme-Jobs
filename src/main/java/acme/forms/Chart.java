
package acme.forms;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Chart implements Serializable {

	/**
	 *
	 */
	private static final long	serialVersionUID	= 3003067640228080373L;

	Integer						totalNumberCompanySectorPublic;
	Integer						totalNumberCompanySectorPrivate;
	Integer						totalNumberInvestorSectorPublic;
	Integer						totalNumberInvestorSectorPrivate;

}
