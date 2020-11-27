/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.File;

/**
 *
 * @author devcarol
 */
public class Imagem {

           
    private String imagem;
    private File arquivo;
    
    public Imagem(){
        String diretorioDasImagens = System.getProperty("user.dir") + File.separator + "src/main/java/Imagens/pexels-yogendra-singh-1701202.jpg";
       
        File diretorio = new File(diretorioDasImagens);
        arquivo = diretorio;
    }
    
    public File getArquivo() {
        return arquivo;
    }
    
    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }
    
    
}
