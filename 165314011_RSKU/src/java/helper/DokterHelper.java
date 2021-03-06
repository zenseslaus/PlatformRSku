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
import pojos.Dokter;
import util.RSKUHibernateUtil;

/**
 *
 * @author wewen
 */
public class DokterHelper {

    public DokterHelper() {
    }

    public List<Dokter> getAllDokter() {
        List<Dokter> result = null;
        Session session = RSKUHibernateUtil.getSessionFactory().openSession();
        String query = "from Dokter d";
        Query q = session.createQuery(query);
        result = q.list();
        session.close();
        return result;
    }

    public void addNewDokter(
            String nama,
            String spesialis) {
        Session session = RSKUHibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        Dokter dokter = new Dokter(nama, spesialis);
        session.saveOrUpdate(dokter);
        tx.commit();
        session.close();
    }
}
