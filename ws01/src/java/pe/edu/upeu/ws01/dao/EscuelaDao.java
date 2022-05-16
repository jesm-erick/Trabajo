/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.edu.upeu.ws01.dao;

import java.util.List;
import pe.edu.upeu.ws01.model.Escuela;

/**
 *
 * @author jhone
 */
public interface EscuelaDao {
    int create(Escuela esc);
    int update(Escuela esc);
    int delate(int id);
    Escuela read(int id);
    List<Escuela> readAll();
    
} 
