package universidade;

import java.util.ArrayList;
import java.util.Scanner;

public class Universidade {
	public static int findConta(ArrayList<Conta> l, String login) {
		for(int i = 0; i < l.size(); i++) {
			if(l.get(i).login.equals(login)) {
				return i;
			}
		}
		System.out.printf("Login nao encontrado\n");
		return -1;
	}
	public static int findId(ArrayList<Projeto> p, String idProjeto) {
		for(int i = 0; i < p.size(); i++) {
			if(p.get(i).idProjeto.equals(idProjeto)) {
				return i;
			}
		}
		System.out.printf("Projeto nao encontrado\n");
		return -1;
	}
	public static int findIdAtv(ArrayList<Atividades> a, String idAtividade) {
		for(int i = 0; i < a.size(); i++) {
			if(a.get(i).idAtividade.equals(idAtividade)) {
				return i;
			}
		}
		System.out.printf("Atividade nao encontrada\n");
		return -1;
	}

    public static void main(String[] args) {
    	try (Scanner input = new Scanner(System.in)) {
			ArrayList<Conta> c = new ArrayList<Conta>();
			ArrayList<Projeto> projetos = new ArrayList<Projeto>();
			ArrayList<Atividades> atividade = new ArrayList<Atividades>();
			int indice;
			int id;
			int idAtv;
			
			while(true) {
				System.out.println("Indique o que voce deseja fazer");
				System.out.println("1 - Criar conta");
				System.out.println("2 - Editar conta");
				System.out.println("3 - Remover conta");
				System.out.println("4 - Adicionar um Projeto");
				System.out.println("5 - Editar um projeto");
				System.out.println("6 - Remover um projeto");
				System.out.println("7 - Adicionar uma atividade");
				System.out.println("8 - Editar uma atividade");
				System.out.println("9 - Remover uma atividade");
				System.out.println("10 - Consultar um usuario");
				System.out.println("11 - Consultar um projeto");
				System.out.println("12 - Consultar uma atividade");
				System.out.println("13 - Sair");
				int n = input.nextInt();

				if(n==1) {
					System.out.println("Login: ");
					String login1 = input.next();
					input.nextLine();

					System.out.println("Nome: ");
					String nome1 = input.next();
					input.nextLine();

					System.out.println("Senha: ");
					String senha1 = input.next();
					input.nextLine();

					c.add(new Conta(nome1, login1, senha1));
					

				}

				if(n==2) {
					System.out.println("Login que deseja editar");
					input.nextLine();
					String login1 = input.nextLine();
					String nome1;
					String senha1;
					indice = findConta(c, login1);
						if(indice != -1) {
							System.out.println("Novo login: ");
							login1 = input.next();
							input.nextLine();

							System.out.println("Novo nome: ");
							nome1 = input.next();
							input.nextLine();

							System.out.println("Nova senha: ");
							senha1 = input.next();
							input.nextLine();

							c.set(indice, new Conta(nome1, login1, senha1));
						}

						else {
							System.out.println("Login Invalido");
						}
				}

				if(n==3){
					System.out.println("Qual login deseja remover?");
					input.nextLine();
					String login1  = input.nextLine();
					indice = findConta(c,login1);
					if(indice != -1) {
						c.remove(indice);
						System.out.println("O login "+ login1 +" foi removido");
					}
					else {
						System.out.println("O login não existe\n");
					}
				}
				if(n==4){
					String idProjeto,descriProjeto,inicioProjeto,terminoProjeto,coordenador,integrantes,duracaoBolsa,statusProjeto;
					double valorBolsa;
					System.out.println("Crie um id para o projeto: ");
					input.nextLine();
					idProjeto = input.nextLine();
					
					System.out.println("Insira a descricao do projeto: ");
					descriProjeto = input.nextLine();
					
					System.out.println("Insira a data de inicio do projeto: ");
					inicioProjeto = input.nextLine();
					
					System.out.println("Insira a data de termino do projeto: ");
					terminoProjeto = input.nextLine();
					
					System.out.println("Insira o coordenador do projeto: ");
					coordenador = input.nextLine();
					
					System.out.println("Insira os integrantes do projeto: ");
					integrantes = input.nextLine();
					
					System.out.println("Insira a duracao da bolsa: ");
					duracaoBolsa = input.nextLine();
					
					
					System.out.println("Insira o valor da bolsa: ");
					valorBolsa = input.nextDouble();
					input.nextLine();
					
					System.out.println("Projeto Iniciado");
					statusProjeto = "Iniciado";
					input.nextLine();
					
					projetos.add(new Projeto(idProjeto,descriProjeto,inicioProjeto,terminoProjeto,coordenador,integrantes,valorBolsa,duracaoBolsa,statusProjeto));
				}
				
				if(n==5) {
					System.out.println("Digite o id do projeto que deseja editar");
					input.nextLine();
					String idProjeto1 = input.nextLine();
					String descriProjeto1,inicioProjeto1,terminoProjeto1,coordenador1,integrantes1,duracaoBolsa1,statusProjeto1;
					
					double valorBolsa1;
					id = findId(projetos, idProjeto1);
						if(id != -1) {
							System.out.println("Insira a nova descricao do projeto: ");
				    		descriProjeto1 = input.nextLine();
				    		
				    		System.out.println("Insira a nova data de inicio do projeto: ");
				    		inicioProjeto1 = input.nextLine();
				    		
				    		System.out.println("Insira a nova data de termino do projeto: ");
				    		terminoProjeto1 = input.nextLine();
				    		
				    		System.out.println("Insira o novo coordenador do projeto: ");
				    		coordenador1 = input.nextLine();
				    		
				    		System.out.println("Insira os novos integrantes do projeto: ");
				    		integrantes1 = input.nextLine();
				    		
				    		System.out.println("Insira a nova duracao da bolsa: ");
				    		duracaoBolsa1 = input.nextLine();
				    		
				    		
				    		System.out.println("Insira o novo valor da bolsa: ");
				    		valorBolsa1 = input.nextDouble();
	
				    		System.out.println("Insira o novo status para o projeto: ");
				    		statusProjeto1 = input.nextLine();
				    		input.nextLine();
				    		
				    		System.out.println("Atualizado!\n");
				    		

							projetos.set(id, new Projeto(idProjeto1,descriProjeto1,inicioProjeto1,terminoProjeto1,coordenador1,integrantes1,valorBolsa1,duracaoBolsa1,statusProjeto1));
						}

						else {
							System.out.println("Id Invalido");
						}
				}
				
				if(n==6){
					System.out.println("Qual id deseja remover?");
					input.nextLine();
					String idProjeto1  = input.nextLine();
					id = findId(projetos,idProjeto1);
					if(id != -1) {
						projetos.remove(id);
						System.out.println("O projeto "+ idProjeto1 +" foi removido");
					}
					else {
						System.out.println("O projeto não existe\n");
					}
				}
				
				if(n==7){
					String idAtividade,descriAtividade,inicioAtividade,terminoAtividade,resposavelAtividade,envolvidosAtividade,tarefasAtividade;
					System.out.println("Crie um id para a atividade: ");
					input.nextLine();
					idAtividade = input.nextLine();
					
					System.out.println("Insira a descricao da atividade: ");
					descriAtividade = input.nextLine();
					
					System.out.println("Insira a data de inicio da atividade: ");
					inicioAtividade = input.nextLine();
					
					System.out.println("Insira a data de termino da atividade: ");
					terminoAtividade = input.nextLine();
					
					System.out.println("Insira o responsavel pela atividade: ");
					resposavelAtividade = input.nextLine();
					
					System.out.println("Insira os envolvidos na atividade: ");
					envolvidosAtividade = input.nextLine();
					
					System.out.println("Insira as tarefas da atividade: ");
					tarefasAtividade = input.nextLine();
					
					
					atividade.add(new Atividades(idAtividade,descriAtividade,inicioAtividade,terminoAtividade,resposavelAtividade,envolvidosAtividade,tarefasAtividade));
				}
				
				if(n==8) {
					System.out.println("Digite o id da atividade que deseja editar");
					input.nextLine();
					String idAtividade1 = input.nextLine();
					String descriAtividade1,inicioAtividade1,terminoAtividade1,resposavelAtividade1,envolvidosAtividade1,tarefasAtividade1;
					idAtv = findIdAtv(atividade, idAtividade1);
						if(idAtv != -1) {
							System.out.println("Insira a nova descricao da atividade: ");
							descriAtividade1 = input.nextLine();
				    		
				    		System.out.println("Insira a nova data de inicio da atividade: ");
				    		inicioAtividade1 = input.nextLine();
				    		
				    		System.out.println("Insira a data nova de termino da atividade: ");
				    		terminoAtividade1 = input.nextLine();
				    		
				    		System.out.println("Insira o novo responsavel pela atividade: ");
				    		resposavelAtividade1 = input.nextLine();
				    		
				    		System.out.println("Insira os novos envolvidos na atividade: ");
				    		envolvidosAtividade1 = input.nextLine();
				    		
				    		System.out.println("Insira as novas tarefas da atividade: ");
				    		tarefasAtividade1 = input.nextLine();
				    
				    		
				    		
				    		System.out.println("Atualizado! ");

							atividade.set(idAtv, new Atividades(idAtividade1,descriAtividade1,inicioAtividade1,terminoAtividade1,resposavelAtividade1,envolvidosAtividade1,tarefasAtividade1));
						}

						else {
							System.out.println("Id de atividade Invalido");
						}
				}
				
				if(n==9){
					System.out.println("Qual id da atividade quedeseja remover?");
					input.nextLine();
					String idAtividade1  = input.nextLine();
					idAtv = findIdAtv(atividade, idAtividade1);
					if(idAtv != -1) {
						atividade.remove(idAtv);
						System.out.println("A atividade "+ idAtividade1 +" foi removida");
					}
					else {
						System.out.println("A atividade não existe\n");
					}
				}
				
				if(n==10) {
					System.out.println("Login que deseja consultar");
					input.nextLine();
					String login1 = input.nextLine();
					indice = findConta(c, login1);
						if(indice != -1) {
							System.out.println("Login: "+c.get(indice).login+"\nNome: "+c.get(indice).nome+"\n");
						
						}
						
						else {
							System.out.println("Login Invalido");
						}
				}
				
				if(n==11) {
					System.out.println("Digite o id do projeto que deseja consultar");
					input.nextLine();
					String idProjeto1 = input.next();
					id = findId(projetos, idProjeto1);
						if(id != -1) {
							System.out.println("Descricao: "+projetos.get(id).descriProjeto+"\nInicio do projeto: "+projetos.get(id).inicioProjeto+"\nTermino do projeto: "+projetos.get(id).terminoProjeto+"\nCoordenador do projeto: "+projetos.get(id).coordenador+"\nIntegrantes do projeto: "+projetos.get(id).integrantes+"\nDuracao da bolsa: "+projetos.get(id).duracaoBolsa+"\nValor da bolsa: "+projetos.get(id).valorBolsa+"\nStatus do projeto: "+projetos.get(id).statusProjeto+"\n");
							input.nextLine();
						}
				}
				
				if(n==12) {
					System.out.println("Digite o id da atividade que deseja consultar");
					input.nextLine();
					String idAtividade1 = input.next();
					idAtv = findIdAtv(atividade, idAtividade1);
						if(idAtv != -1) {
							System.out.println("Descricao: "+atividade.get(idAtv).descriAtividade+"\nInicio das atividades: "+atividade.get(idAtv).inicioAtividade+"\nTermino das atividades: "+atividade.get(idAtv).terminoAtividade+"\nResponsavel pela atividade: "
									+atividade.get(idAtv).resposavelAtividade+"\nEnvolvidos na atividade: "+atividade.get(idAtv).envolvidosAtividade+"\nTarefas a serem realizadas por cada profissional: "+atividade.get(idAtv).tarefasAtividade);
				    		
						}	

						else {
							System.out.println("Id de atividade Invalido");
						}
				}
				
				if(n==13){
					break;
				}
			}
		}
    }
}