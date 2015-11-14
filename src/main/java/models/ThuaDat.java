/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

/**
 *
 * @author Administrator
 */
public class ThuaDat implements HttpSessionBindingListener{
    public int ThuaID ;
    public int XaID;
    public int SHBANDO;
    public int SHTHUA;
    public float DIENTICH;
    public String TENCHU;

    public void valueBound(HttpSessionBindingEvent hsbe) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void valueUnbound(HttpSessionBindingEvent hsbe) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

}
