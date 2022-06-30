package br.edu.ifpr.login;

import br.edu.ifpr.paranavai.armarios.controle.LoginControlador;
import org.junit.Assert;
import org.junit.Test;

public class TestaLogin {
    private String emailInvalido = "blabla@gmail.com";
    private String senhaInvalida = "SenhaIncorreta";
    private String emailValido = "admin@gmail.com";
    private String senhaValida = "12345";
    
    @Test
    public void autenticacaoOk(){
        String resposta = LoginControlador.verifica(emailValido,senhaValida);
        Assert.assertEquals("Sucesso no login", resposta);
    }
    @Test
    public void emailInvalido(){
        String resposta = LoginControlador.verifica(emailInvalido,senhaValida);
        Assert.assertEquals("E-mail invalido", resposta);
    }
    @Test 
    public void senhaInvalida(){
        String resposta = LoginControlador.verifica(emailValido,senhaInvalida);
        Assert.assertEquals("Senha invalida", resposta);
    }
}
