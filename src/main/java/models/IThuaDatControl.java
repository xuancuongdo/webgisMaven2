/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Administrator
 */
public interface IThuaDatControl {
    public void getThuaDat() ;

    /**
     *
     * @return
     */
    public ArrayList<ThuaDat> getListThuaDat();
}
