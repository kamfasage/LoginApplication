/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.loginApp.dao;

import com.mycompany.loginApp.entities.User;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Ajay
 * 
 */


@Transactional
public class UserDao{
    @Autowired
    SessionFactory sessionFactory;
    

    public void save(User user){
        sessionFactory.getCurrentSession().save(user);
    }
    

    public List<User> getAll(){
        return sessionFactory.getCurrentSession().createQuery("from User").list();
    }
    
    
}
