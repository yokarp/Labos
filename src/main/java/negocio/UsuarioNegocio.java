/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;
import model.Usuario;
import model.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author briay
 */
public class UsuarioNegocio {
    
    public void insertUsuario(Usuario record){
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session ss = sf.openSession();
        Transaction tst = ss.beginTransaction();
        ss.save(record);
        ss.flush();
        tst.commit();
        ss.close();   
    }
}
