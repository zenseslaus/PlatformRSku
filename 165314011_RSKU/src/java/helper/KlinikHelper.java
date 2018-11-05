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
import pojos.Klinik;
import util.RSKUHibernateUtil;

/**
 *
 * @author wewen
 */
public class KlinikHelper {
    
    public KlinikHelper() {
    }
    
    public List<Klinik> getAllKlinik() {
        List<Klinik> result = null;
        Session session = RSKUHibernateUtil.getSessionFactory().openSession();
        String query = "from Klinik k";
        Query q = session.createQuery(query);
        result = q.list();
        session.close();
        return result;
    }
    
    public void addNewKlinik(
            String idKlinik,
            String nama,
            String spesialis) {
        Session session = RSKUHibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        Klinik klinik = new Klinik(idKlinik, nama, spesialis);
        session.saveOrUpdate(klinik);
        tx.commit();
        session.close();
    }
}
