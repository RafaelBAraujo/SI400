/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Rafael
 * @param <A>
 * @param <B>
 */
public interface DAO<A, B> {
    
    public A get(Object o) throws Exception ;
    public void delete(B b);
    public void update(B b);
    public void add(B b) throws Exception;
    public Object search(Object o);
    
}
