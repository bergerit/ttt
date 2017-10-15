/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import entity.Etwas;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author bergerit
 */
@Stateless
public class EtwasFacade extends AbstractFacade<Etwas> {

    @PersistenceContext(unitName = "net.bergerit.ttt_p1_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EtwasFacade() {
        super(Etwas.class);
    }
    
}
