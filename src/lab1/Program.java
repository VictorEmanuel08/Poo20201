/** Exemplo de comentario JavaDoc
 * 
 * @author Gustavo Soares
 * @version "11.0.8" 2020-07-14 LTS
 */

/* Exemplo de comentario de multiplas linhas
 * 
 * Contato: gustavosoares112@gmail.com, gustavosilva7@aluno.uema.br 
 * UNIVERSIDADE ESTADUAL DO MARANH�O (UEMA)
 * Curso: ENGENHARIA DE COMPUTA��O
 * Disciplina: Programa��o Orientada a Objetos - Prof.: Marcelo Vidigal
 * 
 * Aula: Comentarios, classe Main, imprimir (System.out.println)
*/

package lab1;
// o programa esta no pacote application

public class Program {
	// nome da classe do programa (Class Program)
	
	/* Ps.: O nome da classe tem que ser o mesmo nome do programa */
	
	public static void main(String[] args) {
		// funcao principal do programa ^
		
		/*
		 * tudo que esta dentro do bloco de comando...
		 * 
		 * main() {
		 * 		codigo
		 * }
		 * 
		 * ...faz parte da funcao principal (main)
		 * */
		
		System.out.println("Ol� Mundo! [1]");
		// sysout (System.out.println) para imprimir algo no console
		
		System.out.println( "Ol� Mundo! [2]"); System.out.println(  "Ol� Mundo! [3]"); System.out.println(   "Ol� Mundo! [4]");
		// espacos em branco fora da "estrutura normal" do print nao alteram o resultado
		
		System.out.println(
							"Ol� Mundo! [5]"
							);
		
		System.out.print("Ol� Mundo! [6]");  System.out.println("Ol� Mundo! [7]");
		// utiliza-se o print sem 'ln' para ignorar a quebra de linha
	}

}

