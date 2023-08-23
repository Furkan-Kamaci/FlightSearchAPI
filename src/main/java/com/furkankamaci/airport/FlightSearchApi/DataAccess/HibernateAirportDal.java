//package com.furkankamaci.airport.FlightSearchApi.DataAccess;
//
//
//import com.furkankamaci.airport.FlightSearchApi.Entity.Airport;
//import javax.persistence.EntityManager;
//import org.hibernate.Session;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//import org.springframework.transaction.annotation.Transactional;
//
//import java.util.List;
//
////@Repository
//public class HibernateAirportDal  {
//
//    @Autowired
//    private EntityManager entityManager;
//
//    public HibernateAirportDal(EntityManager entityManager) {
//        this.entityManager = entityManager;
//    }
//
//
//    @Override
//    @Transactional
//    public List<Airport> getAll() {
//        Session session = entityManager.unwrap(Session.class);
//        List<Airport> airports = session.createQuery("FROM airports", Airport.class).getResultList();
//        return airports;
//    }
//
//    @Override
//    public void add(Airport airport) {
//
//    }
//
//    @Override
//    public void update(Airport airport) {
//
//    }
//
//    @Override
//    public void delete(Airport airport) {
//
//    }
//
//    @Override
//    public Airport getByAirportId(String airportCode) {
//        return null;
//    }
//}
