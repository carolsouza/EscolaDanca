/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Database.Cursos;
import Model.Curso;

/**
 *
 * @author devcarol
 */
public class CursosControl {
    
    public void cadastrarCurso(Curso c){
        Cursos.CURSOS.put(c.getCurso(), c);
    }
    
    public void excluirCurso(String k){
        Cursos.CURSOS.remove(k);
    }
}
