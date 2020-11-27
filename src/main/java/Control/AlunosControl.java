/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Database.Alunos;
import Model.Aluno;

/**
 *
 * @author devcarol
 */
public class AlunosControl {
    
    public void cadastrarAluno(Aluno a){
        Alunos.ALUNOS.put(a.getCpf(), a);
    }
    
    public Aluno buscarAluno(String k){
        if(Alunos.ALUNOS.containsKey(k)){
            Aluno a = Alunos.ALUNOS.get(k);
            return a;
        } else {
            return null;
        }
    }
}
