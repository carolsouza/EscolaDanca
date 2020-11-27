package Model;

public class Aluno {

      
    private String nome;
    private String sobrenome;
    private String celular;
    private String email;
    private String senha;
    private String cpf;
    private String curso;
    private Pagamento pagamento;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) throws DadosException {
        if (celular.length() != 11) {
            //falta ou exceço de caracteres
            throw new DadosException("Celular Inválido. \nPrecisa conter 11 números. Ex.: 14999999999. Número digitado: "+celular);
        } else {
            String num = celular.substring(0, 10); 
                       
            for (char n : num.toCharArray()) {
                if (!Character.isDigit(n)) {                    
                    throw new DadosException("Digite apenas números para o celular!");
                }
            }
            
            this.celular = celular;
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public String getCpf() {
        return cpf;
    }
    
    public void setCpf(String cpf) throws DadosException {
        if (cpf.length() != 11) {
            //falta ou exceço de caracteres
            throw new DadosException("CPF Inválido. \nPrecisa conter 11 números. Ex.: 99999999999. CPF digitado: "+cpf);
        } else {
            String num = cpf.substring(0, 10); 
                       
            for (char n : num.toCharArray()) {
                if (!Character.isDigit(n)) {                    
                    throw new DadosException("Digite apenas números para o CPF!");
                }
            }
            
            this.cpf = cpf;
        }
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }      

    public Pagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }
   
    
    @Override
    public String toString(){
        return "Nome: "+getNome()+ " " +getSobrenome()+ "\nTelefone: "+getCelular()
                +"\nEmail: "+getEmail() + "\nCPF: " + getCpf() + "\nCurso: "+ getCurso();
    }
}
