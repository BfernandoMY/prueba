/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ups.poo_prueba.Service;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import ups.poo_prueba.Model.Propietario;
/**
 *
 * @author SAIDA
 */
public class PropietarioService implements IPropietarioService{
    public static final List<Propietario> propietarioList = new ArrayList<>();
    
    @Override
    public Propietario create(Propietario propietario) {
        autoList.add(propietario);
        return propietario;
    }

    @Override
    public List<Propietario> list() {
        return propietarioList;
    }
}
