/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.senac.com.cadastrodaescola;

/**
 *
 * @author ana60397316
 */
public class Professor extends Pessoa{
  private double salario;
  private int nContrato; 
  
 public double getsalario(){
       return this.salario;
   }
   public double getnContrato(){
       return this.nContrato;
   }
   
   public void setSalario(double salario){
       this.salario = salario;
       
   }
   public void setmedia(int nContrato){
       this.nContrato = nContrato;
   }
  public Professor (double salario, int nContrato, String nome, String endereco, int telefone){
    super(nome, endereco, telefone);
   this.salario = salario;
   this.nContrato = nContrato;   
  }
  
}



