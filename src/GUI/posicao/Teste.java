/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.posicao;

import GUI.utils.Dados;
import java.util.HashMap;
import java.util.Set;

/**
 *
 * @author Marlon
 */
public class Teste {

    public static void main(String[] args) {
        HashMap cidades = Dados.cidadesRN();
        Set<String> chaves = cidades.keySet();
        for (String chave : chaves) {
            if(chave != null){
                String[] cidade = (String[]) cidades.get(chave);
                System.out.println(cidade[0]);
            }     
        }
    }
}
