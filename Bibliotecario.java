
package br.edu.ifpr.paranavai.pacotes.biblioteca;

import java.util.Date;

public class Bibliotecario extends Pessoa{
    private String siape;

    public Bibliotecario() {
    }

    public Bibliotecario(String siape, String nome, String email, String telefone,
            String senha, boolean ativo, Date dataAtualizacao, Date dataCriacao) {
        super(nome, email, telefone, senha, ativo, dataAtualizacao, dataCriacao);
        this.siape = siape;
    }
     @Override
    public String getNome() {
        return super.getNome(); 
    }


    @Override
    public void setNome(String nome) {
        super.setNome(nome); 
    }

    @Override
    public String getEmail() {
        return super.getEmail();
    }

    @Override
    public void setEmail(String email) {
        super.setEmail(email);
    }

    @Override
    public String getTelefone() {
        return super.getTelefone(); 
    }

    @Override
    public void setTelefone(String telefone) {
        super.setTelefone(telefone); 
    }

    @Override
    public boolean isAtivo() {
        return super.isAtivo(); 
    }

    @Override
    public void setAtivo(boolean ativo) {
        super.setAtivo(ativo); 
    }

    @Override
    public String getSenha() {
        return super.getSenha(); 
    }

    @Override
    public void setSenha(String senha) {
        super.setSenha(senha);  
    }

    @Override
    public void setDataAtualizacao(Date dataAtualizacao) {
        super.setDataAtualizacao(dataAtualizacao); 
    }

    @Override
    public Date getDataAtualizacao() {
        return super.getDataAtualizacao(); 
    }

    @Override
    public Date getDataCriacao() {
        return super.getDataCriacao();
    }

    @Override
    public void setDataCriacao(Date dataCriacao) {
        super.setDataCriacao(dataCriacao); 
    }

    public String getSiape() {
        return siape;
    }

    public void setSiape(String siape) {
        this.siape = siape;
    }
    
}
