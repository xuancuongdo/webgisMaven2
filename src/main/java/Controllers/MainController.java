/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;


import java.util.ArrayList;
import models.IThuaDatControl;
import models.ThuaDat;
import models.ThuaDatControl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author cuongdx
 */
@Controller
public class MainController {

    /**
     *
     * @return
     */
    @RequestMapping(value="/thuadat",method=RequestMethod.GET)
    public ModelAndView  GetListThuaDat()
    {
        ThuaDat objThuaDat= new ThuaDat();
        IThuaDatControl objThuaDatCtrl= new ThuaDatControl();
        ArrayList<ThuaDat> lstThuaDat= new ArrayList<ThuaDat>();
        return new ModelAndView("thuadat","command",objThuaDat);
    
    }
}
