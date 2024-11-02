
package modelo;

import java.util.Date;


public class Cobra extends Animal{
    private Boolean peconha;
    private String especie;

    public Cobra(Boolean peconha, String especie, int identificador, String nome, Date dataNascimento, char sexo, String tamanho, double peso, String situacao, String recinto) {
        super(identificador, nome, dataNascimento, sexo, tamanho, peso, situacao, recinto);
        this.peconha = peconha;
        this.especie = especie;
    }
    
    
    
    @Override
    public void imprimir(){
        System.out.println("Cobra:");
        super.imprimir();
        System.out.println("Espécie: "+ getEspecie());
        System.out.println("Peçonha: "+ getPeconha());
        System.out.println("Idade: "+ calcularIdade());
    };

    public Boolean getPeconha() {
        return peconha;
    }

    public void setPeconha(Boolean peconha) {
            this.peconha = peconha;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    
}
