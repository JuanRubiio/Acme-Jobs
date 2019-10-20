<<<<<<< HEAD
=======
/*
 * AnonymousUserAccountController.java
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

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

<<<<<<< HEAD
import acme.entities.bulletin.Bulletin;
=======
import acme.entities.bulletins.Bulletin;
>>>>>>> task006
import acme.framework.components.BasicCommand;
import acme.framework.controllers.AbstractController;
import acme.framework.entities.Anonymous;

@Controller
@RequestMapping("/anonymous/bulletin/")
public class AnonymousBulletinController extends AbstractController<Anonymous, Bulletin> {

<<<<<<< HEAD
	@Autowired
	AnonymousBulletinCreateService	createService;

	@Autowired
	AnonymousBulletinListService	listService;


	@PostConstruct
	private void initialise() {
		super.addBasicCommand(BasicCommand.CREATE, this.createService);
		super.addBasicCommand(BasicCommand.LIST, this.listService);
=======
	// Internal state ---------------------------------------------------------

	@Autowired
	private AnonymousBulletinListService	listService;

	@Autowired
	private AnonymousBulletinCreateService	createService;


	// Constructors -----------------------------------------------------------

	@PostConstruct
	private void initialise() {
		super.addBasicCommand(BasicCommand.LIST, this.listService);
		super.addBasicCommand(BasicCommand.CREATE, this.createService);
>>>>>>> task006
	}

}
