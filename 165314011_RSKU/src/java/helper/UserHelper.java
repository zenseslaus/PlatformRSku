/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import org.hibernate.Query;
import org.hibernate.Session;
import pojos.User;
import util.RSKUHibernateUtil;

/**
 *
 * @author wewen
 */
public class UserHelper {

    public UserHelper() {
    }

    public User login(String email, String password) {
        Session session = RSKUHibernateUtil.getSessionFactory().openSession();
        String q = "from User u where u.email=:email AND u.password=:password";
        Query query = session.createQuery(q);
        query.setParameter("email", email);
        query.setParameter("password", password);

        return (User) query.uniqueResult();
    }
}
