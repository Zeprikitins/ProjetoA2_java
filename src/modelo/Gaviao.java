
package modelo;

import java.util.Date;

public class Gaviao extends Animal{
    private String especie;

    
    @Override
    public void imprimir(){
        System.out.println("Gavião:");
      super.imprimir();
      System.out.println("Espécie: "+ getEspecie());
      System.out.println("Idade: "+ calcularIdade());
      
        
    };
    
    
    
    public Gaviao(String especie, int identificador, String nome, Date dataNascimento, char sexo, String tamanho, double peso, String situacao, String recinto) {
        super(identificador, nome, dataNascimento, sexo, tamanho, peso, situacao, recinto);
        this.especie = especie;
    }
       
     public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }
}
