package br.com.prog3.atividade8aula12.persistence;

import java.sql.Connection;
import java.util.List;

import br.com.prog3.atividade8aula12.model.Aluno;

public class Teste {

	public static void main(String[] args) {
		
		//CLASSE CONNECTIONFACTORY
		//Connection con = ConnectionFactory.getConnection();
		
		
		
		/*METODO SAVE CLASSE ALUNOdAOiMP
		 * 
		AlunoDaoImp ad = new AlunoDaoImp();
		Aluno a = new Aluno();
		a.setMatricula(6);
		a.setNome("Maria Paula");
		a.setRa("Taguatinga");
		System.out.println(ad.save(a));
		*/
		
		
		/*METODO UPDATE CLASSE ALUNOdAOiMP
		 * 
		AlunoDaoImp ad = new AlunoDaoImp();
		Aluno a = new Aluno();
		a.setMatricula(6);
		a.setNome("Maria Paula Almeida");
		a.setRa("Taguatinga Norte");
		System.out.println(ad.update(a));
		*/
		
		
		/*METODO DELETE CLASSE ALUNOdAOiMP
		 * 
		AlunoDaoImp ad = new AlunoDaoImp();
		System.out.println(ad.delete(6));
		*/
		
		
		/*METODO LIST CLASSE ALUNODAOIMP
		 * 
		AlunoDaoImp ad = new AlunoDaoImp();
		List<Aluno> alunos = ad.list();
		if(alunos != null){
			for(Aluno al : alunos){
				System.out.println("Aluno: "+al.getNome());
			}
		} */
		
		
		AlunoDaoImp ad = new AlunoDaoImp();
		Aluno aluno = ad.findByMatricula(4);
		if(aluno != null){
			System.out.println(aluno.getNome());
		}

	}

}
