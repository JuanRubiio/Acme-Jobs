
package acme.features.authenticated.investorRecord;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;

import acme.entities.investorRecord.InvestorRecord;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.entities.Authenticated;
import acme.framework.services.AbstractListService;

public class AuthenticatedInvestorRecordListService implements AbstractListService<Authenticated, InvestorRecord> {

	// Internal state ---------------------------------------------------------

	@Autowired
	AuthenticatedInvestorRecordRepository repository;


	@Override
	public boolean authorise(final Request<InvestorRecord> request) {
		assert request != null;

		return true;
	}

	@Override
	public void unbind(final Request<InvestorRecord> request, final InvestorRecord entity, final Model model) {
		assert request != null;
		assert entity != null;
		assert model != null;

		request.unbind(entity, model, "nameInvestor", "sector", "investingStatement", "stars");

	}

	@Override
	public Collection<InvestorRecord> findMany(final Request<InvestorRecord> request) {
		assert request != null;
		Collection<InvestorRecord> result;

		result = this.repository.findAllInvestorRecords();

		return result;
	}

}
