package Model;

import java.util.ArrayList;

public class Curso {

    private String curso;
    private ArrayList<String> dias = new ArrayList();
    private int inicio, fim;
    
    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public ArrayList<String> getDias() {
        return dias;
    }

    public void addDias(String dias){
        getDias().add(dias);
    }

    public int getInicio() {
        return inicio;
    }

    public void setInicio(int inicio) {
        this.inicio = inicio;
    }

    public int getFim() {
        return fim;
    }

    public void setFim(int fim) {
        this.fim = fim;
    }

       
    @Override
    public String toString(){
        return "Curso: " + getCurso() + "\nDias: " + getDias() +
                "\nHorário: " + getInicio() + " às " + getFim();
    }
    
}
