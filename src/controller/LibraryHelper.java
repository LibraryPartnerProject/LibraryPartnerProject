package controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import model.Library;

/**
 * Nicholas Hernandez - NHernandez6
 * CIS175 - Fall 2023
 * Oct 13, 2023
 */
public class LibraryHelper {
	static EntityManagerFactory emfactory =
Persistence.createEntityManagerFactory("LibraryPartnerProject");
		
	public void insertNewLibrary(Library s) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		em.persist(s);
		em.getTransaction().commit();
		em.close();
		}
	
	public List<Library> getLists() {
		EntityManager em = emfactory.createEntityManager();
		List<Library> allDetails = em.createQuery("SELECT d FROM Library d").getResultList();
		return allDetails;
		}
	
	public void deleteList(Library toDelete) {
		// TODO Auto-generated method stub
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		TypedQuery<Library> typedQuery = em.createQuery("select detail from Library detail where detail.id = :selectedId", Library.class);
		
		// Substitute parameter with actual data from the toDelete item
		typedQuery.setParameter("selectedId", toDelete.getId());
		
		// we only want one result
		typedQuery.setMaxResults(1);
		
		// get the result and save it into a new list item
		Library result = typedQuery.getSingleResult();
		
		// remove it
		em.remove(result);
		em.getTransaction().commit();
		em.close();
	}
	
	public Library searchForLibraryById(Integer tempId) {
		// TODO Auto-generated method stub
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		Library found = em.find(Library.class, tempId);
		em.close();
		return found;
	}

	public void updateLibrary(Library toEdit) {
		// TODO Auto-generated method stub
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		
		em.merge(toEdit);
		em.getTransaction().commit();
		em.close();
	}
}




