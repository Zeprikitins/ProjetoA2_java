
package modelo;

import java.util.Date;

public class Leao extends Animal{

    public Leao(int identificador, String nome, Date dataNascimento, char sexo, String tamanho, double peso, String situacao, String recinto) {
        super(identificador, nome, dataNascimento, sexo, tamanho, peso, situacao, recinto);
    }
    
    @Override
    public void imprimir(){
        System.out.println("Leão: ");
        super.imprimir();
        System.out.println("Idade: "+ calcularIdade());
    }
}
