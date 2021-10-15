/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import model.HibernateUtil;
import model.Rol;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author briay
 */
public class RolNegocio {
    
    private SessionFactory sf = HibernateUtil.getSessionFactory();
    private Session ss = sf.openSession();
    private Transaction tst = ss.beginTransaction();

    private void init() {
        sf = HibernateUtil.getSessionFactory();
        ss = sf.openSession();
        tst = ss.beginTransaction();
    }
    
    private void push(){
        ss.flush();
        tst.commit();
        ss.close();   
    }
    
    public void insertRol(Rol record){
        this.init();
        ss.save(record);
        this.push();
    }
    
     public Rol findById(int id) {
        this.init();
        Rol rol = new Rol();
        rol = (Rol) ss.get(Rol.class, id);
        this.push();
        return rol;
    }
    
}
