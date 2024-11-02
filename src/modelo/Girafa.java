
package modelo;

import java.util.Date;

public class Girafa extends Animal{

    public Girafa(int identificador, String nome, Date dataNascimento, char sexo, String tamanho, double peso, String situacao, String recinto) {
        super(identificador, nome, dataNascimento, sexo, tamanho, peso, situacao, recinto);
    }
    
    
    @Override
    public void imprimir(){
        System.out.println("Girafa: ");
        super.imprimir();
        System.out.println("Idade: "+ calcularIdade());
    }
}
