package Model;

public class Pagamento {
    
    private String modoPag;
    private String numCartao;
    private String nomeCartao;
    private Data vencimento;
    private int codSeg;

    public String getModoPag() {
        return modoPag;
    }

    public void setModoPag(String modoPag) {
        this.modoPag = modoPag;
    }

    public String getNumCartao() {
        String finalCartao = numCartao.substring(12, 16);
        
        return finalCartao;
    }

    public void setNumCartao(String numCartao) throws DadosException{
        if (numCartao.length() != 16) {
            //falta ou exceço de caracteres
            throw new DadosException("Cartão Inválido. \nPrecisa conter 16 números. Número digitado: "+numCartao);
        } else {
            String num = numCartao.substring(0, 15); 
                       
            for (char n : num.toCharArray()) {
                if (!Character.isDigit(n)) {                    
                    throw new DadosException("Digite apenas números para o cartão!");
                }
            }
            
            this.numCartao = numCartao;
        }
    }

    public String getNomeCartao() {
        return nomeCartao;
    }

    public void setNomeCartao(String nomeCartao) {
        this.nomeCartao = nomeCartao;
    }

    public int getCodSeg() {
        return codSeg;
    }

    public void setCodSeg(int codSeg) {
        this.codSeg = codSeg;
    }      
    

    public Data getVencimento() {
        return vencimento;
    }

    public void setVencimento(Data vencimento) {
        this.vencimento = vencimento;
    }
    
    @Override
    public String toString(){
        return "Num. Cartão: " + getNumCartao()
                + "\n Tipo de pagamento: "+getModoPag();
    }
    
}
