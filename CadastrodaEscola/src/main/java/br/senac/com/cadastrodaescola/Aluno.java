/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.senac.com.cadastrodaescola;

/**
 *
 * @author ana60397316
 */
public class Aluno extends Pessoa{
   private int nota;
   private double media;
   
   public double getNota(){
       return this.nota;
   }
   public double getMedia(){
       return this.media;
   }
   
   public void setNota(int nota){
       this.nota = nota;
       
   }
   public void setmedia(double media){
       this.media = media;
   }
   
  public Aluno(int nota, double media, String nome, String endereco, int telefone){
     super(nome, endereco, telefone);
       this.nota = nota;
       this.media = media;
  }
  
    @Override
    public void apresentar(){
      System.out.println( "Olá, sou o aluno."  + this.getNome());
    }
}






































