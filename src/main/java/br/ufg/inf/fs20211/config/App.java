package br.ufg.inf.fs20211.config;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.ufg.inf.fs.enums.CategoriaQuarto;
import br.ufg.inf.fs20211.ctrl.HospedagemCtrl;
import br.ufg.inf.fs20211.ctrl.HospedeCtrl;
import br.ufg.inf.fs20211.ctrl.HotelCtrl;
import br.ufg.inf.fs20211.ctrl.QuartoCtrl;
import br.ufg.inf.fs20211.entities.Hospedagem;
import br.ufg.inf.fs20211.entities.Hospede;
import br.ufg.inf.fs20211.entities.Hotel;
import br.ufg.inf.fs20211.entities.Quarto;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Começando");

		//testeJpaQuarto();
		//testeJpaHospedagem();
		testeJpaHospede();

	}
	
	public static void testeJpaQuarto() {
		QuartoCtrl ctrl = new QuartoCtrl ();
		HotelCtrl hotelCtrl = new HotelCtrl();
		System.out.println("Busca Todos");
		for(Quarto h : ctrl.findAll()) {
			System.out.println(h);
		}
		
		System.out.println("Buscar por ID");
		System.out.println(ctrl.findById(3));
		
		System.out.println("Inserir no banco");
		Quarto q1 = new Quarto(null, hotelCtrl.findById(1), CategoriaQuarto.APARTAMENTO, 3, 1010, 150.0);
		Quarto q2 = new Quarto(null, hotelCtrl.findById(2), CategoriaQuarto.DORMITORIO, 8, 310, 50.0);
		Quarto q3 = new Quarto(null, hotelCtrl.findById(3), CategoriaQuarto.LUXO, 5, 1210, 550.0);
		Quarto q4 = new Quarto(null, hotelCtrl.findById(4), CategoriaQuarto.SIMPLES, 2, 110, 100.0);
		
		q1 = ctrl.insert(q1);
		System.out.println(q1);
		
		q2 = ctrl.insert(q2);
		System.out.println(q2);
		
		q3 = ctrl.insert(q3);
		System.out.println(q3);
		
		q4 = ctrl.insert(q4);
		System.out.println(q4);
		
		for(Quarto q : ctrl.findAll()) {
			System.out.println(q);
		}
		
		System.out.println("Alterar no banco");
		q1.setPrDiaria(175.0);
		q1 = ctrl.update(q1);

		for(Quarto q : ctrl.findAll()) {
			System.out.println(q);
		}

		System.out.println("Excluir");
		ctrl.delete(q3.getIdQuarto());
		System.out.println("Terminou");
	}
	
	public static void testeJpaHotel() {
		HotelCtrl ctrl = new HotelCtrl();
		System.out.println("Busca Todos");
		for(Hotel h : ctrl.findAll()) {
			System.out.println(h);
		}
		
		System.out.println("Buscar por ID");
		System.out.println(ctrl.findById(3));
		
		System.out.println("Inserir no banco");
		Hotel hotel = new Hotel(null, "Teste", "Qualquer Lugar", 10);
		hotel = ctrl.insert(hotel);
		System.out.println(hotel);
		
		System.out.println("Alterar no banco");
		hotel.setNmHotel("Teste Alterado");
		hotel = ctrl.update(hotel);
		System.out.println(hotel);
		
		
		System.out.println("Excluir");
		ctrl.delete(hotel.getIdHotel());
		System.out.println("Terminou");
	}
	
	public static void testeJpaHospede() {
		HospedeCtrl hospedectrl = new HospedeCtrl();
		System.out.println("Busca Todos");
		for(Hospede hos : hospedectrl.findAll()) {
			System.out.println(hos);
		}
		
		System.out.println("Buscar por ID");
		System.out.println(hospedectrl.findById(3));
		
		System.out.println("Inserir no banco");
		Hospede hospede = new Hospede(null, "José Augusto", "21/09/1990", 0134567);
		hospede = hospedectrl.insert(hospede);
		System.out.println(hospede);
		
		System.out.println("Alterar no banco");
		hospede.setDtnascimento("21/09/1991");
		hospede = hospedectrl.update(hospede);
		System.out.println(hospede);
		
		
		System.out.println("Excluir");
		hospedectrl.delete(hospede.getIdhospede());
		System.out.println("Terminou");
	}
	
	public static void testeJpaHospedagem() {
		QuartoCtrl ctrl = new QuartoCtrl ();
		HotelCtrl hotelCtrl = new HotelCtrl();
		HospedagemCtrl hospedagemCtrl = new HospedagemCtrl();
		HospedeCtrl hospedeCtrl = new HospedeCtrl();
		System.out.println("Busca Todos");
		for(Quarto h : ctrl.findAll()) {
			System.out.println(h);
		}
		
		System.out.println("Buscar por ID");
		System.out.println(ctrl.findById(3));
		
		System.out.println("Inserir no banco");
		Quarto q1 = new Quarto(null, hotelCtrl.findById(1), CategoriaQuarto.APARTAMENTO, 3, 1010, 150.0);
		Quarto q2 = new Quarto(null, hotelCtrl.findById(2), CategoriaQuarto.DORMITORIO, 8, 310, 50.0);
		Quarto q3 = new Quarto(null, hotelCtrl.findById(3), CategoriaQuarto.LUXO, 5, 1210, 550.0);
		Quarto q4 = new Quarto(null, hotelCtrl.findById(4), CategoriaQuarto.SIMPLES, 2, 110, 100.0);
		Hospedagem h1 = new Hospedagem(null,ctrl.findById(1), hospedeCtrl.findById(1),"01/08/2021","31/08/2021");
		Hospedagem h2 = new Hospedagem(null,ctrl.findById(2), hospedeCtrl.findById(2),"10/09/2021","15/09/2021");
		Hospedagem h3 = new Hospedagem(null,ctrl.findById(3), hospedeCtrl.findById(3),"05/08/2021","15/08/2021");
		
		q1 = ctrl.insert(q1);
		System.out.println(q1);
		
		q2 = ctrl.insert(q2);
		System.out.println(q2);
		
		q3 = ctrl.insert(q3);
		System.out.println(q3);
		
		q4 = ctrl.insert(q4);
		System.out.println(q4);
		
		h1 = hospedagemCtrl.insert(h1);
		System.out.println(h1);
		
		h2 = hospedagemCtrl.insert(h2);
		System.out.println(h2);
		
		h3 = hospedagemCtrl.insert(h3);
		System.out.println(h3);
		
		for(Quarto q : ctrl.findAll()) {
			System.out.println(q);
		}
		
		for(Hospedagem h : hospedagemCtrl.findAll()) {
			System.out.println(h);
		}
		
		System.out.println("Alterar no banco");
		q1.setPrDiaria(175.0);
		q1 = ctrl.update(q1);
		
		h1.setDtcheckout("25/08/2021");
		h1 = hospedagemCtrl.update(h1);

		for(Quarto q : ctrl.findAll()) {
			System.out.println(q);
		}
		
		for(Hospedagem h : hospedagemCtrl.findAll()) {
			System.out.println(h);
		}

		
		
		System.out.println("Excluir");
		ctrl.delete(q3.getIdQuarto());
		hospedagemCtrl.delete(h3.getIdhospedagem());
		System.out.println("Terminou");
	}

	public static void testeJpa() {
		EntityManager em = DaoFactory.getEntityManager();
		
		// CREATE
		/*//Hotel hotel = new Hotel(null, "Castro`s Park Hotel", "Goiânia", 5);
		em.getTransaction().begin();
		//em.persist(hotel);
		Hotel h1 = new Hotel(null, "Ibis", "Goiânia", 3);
		Hotel h2 = new Hotel(null, "Copacabana Palace", "Rio de Janeiro", 5);
		Hotel h3 = new Hotel(null, "Denali Hotel", "Anápolis", 4);
		
		em.persist(h1);
		em.persist(h2);
		em.persist(h3);
		
		
		em.getTransaction().commit();
		*/
		
		// READ ALL
		/*
		System.out.println("Buscar Todos");
		TypedQuery<Hotel> result = em.createQuery("from Hotel", Hotel.class);
		List<Hotel> hoteis = result.getResultList();
		for(Hotel h : hoteis) {
			System.out.println(h);
		}
		
		
		// READ BY ID
		Hotel h4 = em.find(Hotel.class, 3);
		
		System.out.println("Buscar Por ID");
		System.out.println(h4);
		
		System.out.println("Buscar por Ocorrência");
		String sql = "from Hotel h where h.nmHotel like :str";
		TypedQuery<Hotel> result2 = em.createQuery(sql, Hotel.class);
		result2.setParameter("str", "%i%");
		hoteis = result2.getResultList();
		for(Hotel h : hoteis) {
			System.out.println(h);
		}*/
		
		System.out.println("Update do Objeto");
		Hotel hotelUpdate = em.find(Hotel.class, 2);
		
		hotelUpdate.setNmHotel("Ibis Hotel");
		
		em.getTransaction().begin();
		em.persist(hotelUpdate);
		em.getTransaction().commit();
		
		System.out.println("Delete do Objeto");
		/*new Hotel(null, "Hotel Santo Antônio", "Neropolis", 3);
		System.out.println(hotelDeleta);
		System.out.println("persistindo");
		em.getTransaction().begin();
		em.persist(hotelDeleta);
		em.getTransaction().commit();
		System.out.println("novo objeto");
		System.out.println(hotelDeleta);*/
		/*Hotel hotelDeleta = em.find(Hotel.class, 5);
		
		em.getTransaction().begin();
		em.remove(hotelDeleta);
		em.getTransaction().commit();
		*/
		
		DaoFactory.closeConnection();
	}

}
