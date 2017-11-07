package br.com.projeto.App.ejb;

import javax.ejb.Stateless;

/**
 *
 * @author lucas
 */
@Stateless
public class ContaBean {

    public String exibeValores(String t) throws Error {
        
        return t;
    }

    public String insere(String valores) throws Error {

        return valores;
    }

    public String remove(String valores) throws Error {

        return valores;
    }

    public String atualizar(String valores) throws Error {

        return valores;
    }

}
