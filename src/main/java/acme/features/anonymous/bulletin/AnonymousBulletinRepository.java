<<<<<<< HEAD
=======
/*
 * AnonymousUserAccountRepository.java
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

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

<<<<<<< HEAD
import acme.entities.bulletin.Bulletin;
=======
import acme.entities.bulletins.Bulletin;
>>>>>>> task006
import acme.framework.repositories.AbstractRepository;

@Repository
public interface AnonymousBulletinRepository extends AbstractRepository {

	@Query("select b from Bulletin b")
<<<<<<< HEAD
	Collection<Bulletin> findAllBulletin();

	@Query("select b from Bulletin b where b.name = ?1")
	Collection<Bulletin> findByName(String name);

	@Query("select b from Bulletin b where b.surname = ?1")
	Collection<Bulletin> findBySurname(String surname);

	@Query("select b from Bulletin b where b.nif = ?1")
	Collection<Bulletin> findByNif(String nif);
=======
	Collection<Bulletin> findMany();

	@Query("select b from Bulletin b where b.name= ?1")
	Collection<Bulletin> findByName(String name);

	@Query("select b from Bulletin b where b.surname= ?1")
	Collection<Bulletin> findBySurname(String surname);

	@Query("select b from Bulletin b where b.dni= ?1")
	Collection<Bulletin> findByDni(String dni);

>>>>>>> task006
}
