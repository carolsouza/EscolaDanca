/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.Imagem;

/**
 *
 * @author devcarol
 */
public class ImagemControl {
    
    Imagem img;
    
    public ImagemControl(){
        img = new Imagem();
    }
    
    public String obterImagem(){
        img.setImagem(img.getArquivo().getAbsolutePath());
        
        return img.getImagem();
    }
}
