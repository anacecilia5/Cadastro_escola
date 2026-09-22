/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.senac.com.cadastrodaescola;

/**
 *
 * @author ana60397316
 */
public class CadastrodaEscola {

    public static void main(String[] args) {
      Professor professor = new Professor(10000.55, 12456789, "Tiago", "Ceilandia", 99876543);
      
      professor.apresentar();
      
      Aluno aluno = new Aluno(6, 6.5, "Daniel", "Ceilandia", 65928774);
      
      aluno.apresentar();
      
     
    }
}
