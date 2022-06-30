package br.edu.ifpr.paranavai.armarios.controle;

import br.edu.ifpr.paranavai.armarios.servico.LoginServico;

public class LoginControlador {

    public static String verifica(String email, String senha) {
        return LoginServico.verifica(email,senha);
    }
    
    
}
