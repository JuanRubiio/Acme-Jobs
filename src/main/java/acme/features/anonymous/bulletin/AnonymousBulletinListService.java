<<<<<<< HEAD
=======
/*
 * AnonymousShoutListService.java
 *
 * Copyright (c) 2019 Rafael Corchuelo.
 *
 * In keeping with the traditional purpose of furthering education and research, it is
 * the policy of the copyright owner to permit non-commercial use and redistribution of
 * this software. It has been tested carefully, but it is not guaranteed for any particular
 * purposes. The copyright owner does not offer any warranties or representations, nor do
 * they accept any liabilities with respect to them.
 */
>>>>>>> task006

package acme.features.anonymous.bulletin;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

<<<<<<< HEAD
import acme.entities.bulletin.Bulletin;
=======
import acme.entities.bulletins.Bulletin;
>>>>>>> task006
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.entities.Anonymous;
import acme.framework.services.AbstractListService;

@Service
public class AnonymousBulletinListService implements AbstractListService<Anonymous, Bulletin> {

<<<<<<< HEAD
=======
	// Internal state ---------------------------------------------------------

>>>>>>> task006
	@Autowired
	AnonymousBulletinRepository repository;


	@Override
	public boolean authorise(final Request<Bulletin> request) {
		assert request != null;

		return true;
	}

	@Override
<<<<<<< HEAD
	public void unbind(final Request<Bulletin> request, final Bulletin entity, final Model model) {
		assert request != null;
		assert entity != null;
		assert model != null;

		request.unbind(entity, model, "bulletinName", "type", "body");

	}

	@Override
	public Collection<Bulletin> findMany(final Request<Bulletin> request) {
		assert request != null;
		Collection<Bulletin> result;

		result = this.repository.findAllBulletin();

		return result;
=======
	public Collection<Bulletin> findMany(final Request<Bulletin> request) {
		assert request != null;

		Collection<Bulletin> result;
		result = this.repository.findMany();

		return result;
	}

	@Override
	public void unbind(final Request<Bulletin> request, final Bulletin entity, final Model model) {
		assert request != null;
		assert entity != null;
		assert model != null;

		request.unbind(entity, model, "bulletinName", "type", "body");

>>>>>>> task006
	}

}
