/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import pojos.Location;
import util.RSKUHibernateUtil;

/**
 *
 * @author wewen
 */
public class LocationHelper {

    public LocationHelper() {
    }

    public List<Location> getAllLocation() {
        List<Location> result = null;
        Session session = RSKUHibernateUtil.getSessionFactory().openSession();
        String query = "from Location l";
        Query q = session.createQuery(query);
        result = q.list();
        session.close();
        return result;
    }

    public void addNewLocation(
            Double lat,
            Double lng,
            String name) {
        Session session = RSKUHibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        Location lokasi = new Location(lat, lng, name);
        session.saveOrUpdate(lokasi);
        tx.commit();
        session.close();
    }
}
