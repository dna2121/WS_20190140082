/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package webservice.assesment.dbjquery;

import java.util.ArrayList;
import java.util.List;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author HP
 */
@Controller
public class appController {
    
    
    //XML OK
    @CrossOrigin
    @GetMapping(value="/data/xml", produces ={MediaType.APPLICATION_XML_VALUE})
    @ResponseBody
    public List<Datamahasiswa> getDataX(){
        List<Datamahasiswa> dtmhsx = new ArrayList<>();
        DatamahasiswaJpaController controller = new DatamahasiswaJpaController();
        
        try {
            dtmhsx = controller.findDatamahasiswaEntities();
        }catch (Exception e) {}
        return dtmhsx;
    }
    
    
    //JSONNYAAAAAAA
    @CrossOrigin
    @GetMapping(value="/data/json", produces ={MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public List<Datamahasiswa> getDataJ(){
        List<Datamahasiswa> dtmhsj = new ArrayList<>();
        DatamahasiswaJpaController controller = new DatamahasiswaJpaController();
        
        try {
            dtmhsj = controller.findDatamahasiswaEntities();
        }catch (Exception e) {}
        return dtmhsj;
    }
}
