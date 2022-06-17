/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ups.poo_prueba.Controller;

import java.util.List;
import ups.poo_prueba.Model.Propietario;
import ups.poo_prueba.Service.PropietarioService;
/**
 *
 * @author Fernando
 */
public class PropietarioController {
    
    private final PropietarioService propietarioService = new PropietarioService();
    
    public Propietario create(String[] args){
        
        var auto = new Propietario(args[0],args[1],args[2], args[3], args[4]);
        return propietarioService.create(auto);
    }
    
    public List<Propietario> list(){
        return propietarioService.list();
    }
}
