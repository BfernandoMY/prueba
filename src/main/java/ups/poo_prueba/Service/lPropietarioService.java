/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ups.poo_prueba.Service;
import java.util.List;
import ups.poo_prueba.Model.Propietario;
/**
 *
 * @author SAIDA
 */
public interface lPropietarioService {
    
    public Propietario create(Propietario propietario);
    public List<Propietario> list();
}
