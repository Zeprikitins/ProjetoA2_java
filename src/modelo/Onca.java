/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Date;

public class Onca extends Animal{

    public Onca(int identificador, String nome, Date dataNascimento, char sexo, String tamanho, double peso, String situacao, String recinto) {
        super(identificador, nome, dataNascimento, sexo, tamanho, peso, situacao, recinto);
    }
    
    @Override
    public void imprimir(){
        System.out.println("Onça: ");
        super.imprimir();
        System.out.println("Idade: "+ calcularIdade());
    }
}
