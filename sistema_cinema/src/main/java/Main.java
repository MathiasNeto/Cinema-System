import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CRUDgenero dao = new CRUDgenero();
        CRUDfilme dao2 = new CRUDfilme();
        CRUDsala dao3 = new CRUDsala();
        CRUDsessao dao4 = new CRUDsessao();

        int opcao = 0;
        do {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - CRUD genero");
            System.out.println("2 - CRUD filme");
            System.out.println("3 - CRUD sala");
            System.out.println("4 - CRUD sessao");
            System.out.println("0 - Sair");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Escolha uma opção:");
                    System.out.println("1 - criar um genero");
                    System.out.println("2 - listar os genero");
                    System.out.println("3 - updade em genero");
                    System.out.println("4 - deletar genero");
                    System.out.println("0 - Sair");

                    opcao = scanner.nextInt();

                    switch (opcao) {
                        case 1:
                            System.out.println("Digite o nome do genero:");
                            String nome = scanner.next();

                            Genero genero = new Genero();
                            genero.setNomeGenero(nome);

                            dao.criar(genero);
                            System.out.println("Genero cadastrado com sucesso!");
                            break;
                        case 2:
                            dao.ler();
                            break;
                        case 3:
                            System.out.println("Digite o ID do genero que deseja atualizar:");
                            int id = scanner.nextInt();

                            System.out.println("Digite o novo nome do genero:");
                            nome = scanner.next();

                            genero = new Genero();
                            genero.setNomeGenero(nome);

                            dao.atualizar(id,genero);
                            System.out.println("Genero atualizado com sucesso!");
                            break;
                        case 4:
                            System.out.println("Digite o ID do genero que deseja excluir:");
                            id = scanner.nextInt();
                            dao.excluir(id);
                            System.out.println("Genero excluído com sucesso!");
                            break;
                        case 0:
                            System.out.println("Voltando ao menu principal...");
                            break;
                        default:
                            System.out.println("Opção inválida!");
                    }
                    break;
                case 2:
                    System.out.println("Escolha uma opção:");
                    System.out.println("1 - criar um filme");
                    System.out.println("2 - listar os filmes");
                    System.out.println("3 - updade em filmes");
                    System.out.println("4 - deletar filmes");
                    System.out.println("0 - Sair");

                    opcao = scanner.nextInt();

                    switch (opcao) {
                        case 1:
                            System.out.println("Digite o nome do filmes:");
                            String nome = scanner.next();
                            dao.ler();

                            System.out.println("Digite o id do genero: ");
                            String id = scanner.next();

                            List<Genero> generos = new ArrayList<>();
                            for (Genero genero : dao.generos) {
                                generos.add(genero);
                            }

                            Filme filme = new Filme();
                            filme.setNome(nome);
                            filme.setGenero(generos.indexOf(id));

                            dao2.criar(filme);
                            System.out.println("filme cadastrado com sucesso!");
                            break;
                        case 2:
                            dao2.ler();
                            break;
                        case 3:
                            System.out.println("Digite o ID do filme que deseja atualizar:");
                            int id2 = scanner.nextInt();

                            System.out.println("Digite o novo nome do filme:");
                            nome = scanner.next();

                            filme = new Filme();
                            filme.setNome(nome);

                            dao2.atualizar(id2,filme);
                            System.out.println("filme atualizado com sucesso!");
                            break;
                        case 4:
                            System.out.println("Digite o ID do filme que deseja excluir:");
                            id2 = scanner.nextInt();
                            dao2.excluir(id2);
                            System.out.println("filme excluído com sucesso!");
                            break;
                        case 0:
                            System.out.println("Voltando ao menu principal...");
                            break;
                        default:
                            System.out.println("Opção inválida!");
                    }

                    break;
                case 3:
                    System.out.println("Escolha uma opção:");
                    System.out.println("1 - criar um sala");
                    System.out.println("2 - listar os sala");
                    System.out.println("3 - updade em sala");
                    System.out.println("4 - deletar sala");
                    System.out.println("0 - Sair");

                    opcao = scanner.nextInt();

                    switch (opcao) {
                        case 1:
                            System.out.println("Digite o numero da sala:");
                            int numero = scanner.nextInt();

                            Sala sala = new Sala();
                            sala.setNumeroSala(numero);

                            dao3.criar(sala);
                            System.out.println("sala cadastrada com sucesso!");
                            break;
                        case 2:
                            dao3.ler();
                            break;
                        case 3:
                            System.out.println("Digite o ID da sala que deseja atualizar:");
                            int id3 = scanner.nextInt();

                            System.out.println("Digite o novo numero da sala:");
                            numero = scanner.nextInt();

                            sala = new Sala();
                            sala.setNumeroSala(numero);

                            dao3.atualizar(id3, sala);
                            System.out.println("sala atualizado com sucesso!");
                            break;
                        case 4:
                            System.out.println("Digite o ID da sala que deseja excluir:");
                            id3 = scanner.nextInt();
                            dao2.excluir(id3);
                            System.out.println("sala excluído com sucesso!");
                            break;
                        case 0:
                            System.out.println("Voltando ao menu principal...");
                            break;
                        default:
                            System.out.println("Opção inválida!");
                    }
                    break;
                case 4:
                    System.out.println("Escolha uma opção:");
                    System.out.println("1 - criar um Sessao");
                    System.out.println("2 - listar os Sessao");
                    System.out.println("3 - updade em Sessao");
                    System.out.println("4 - deletar Sessao");
                    System.out.println("0 - Sair");

                    opcao = scanner.nextInt();

                    switch (opcao) {
                        case 1:
                            dao2.ler();

                            System.out.println("Digite o numero do id do filme:");
                            int numero2 = scanner.nextInt();

                            List<Filme> filmes = new ArrayList<>();
                            for (Filme filme : dao2.filmes) {
                                filmes.add(filme);
                            }

                            dao3.ler();

                            System.out.println("Digite o numero da sala:");
                            int numero3 = scanner.nextInt();

                            List<Sala> salas = new ArrayList<>();
                            for (Sala sala : dao3.salas) {
                                salas.add(sala);
                            }


                            Sessao sessao = new Sessao();
                            sessao.setFilme(filmes.indexOf(numero2));
                            sessao.setSala(salas.indexOf(numero3));

                            dao4.criar(sessao);
                            System.out.println("sessao cadastrada com sucesso!");
                            break;
                        case 2:
                            dao4.ler();
                            break;
                        case 3:
                            System.out.println("Digite o ID da sessao que deseja atualizar:");
                            int id4 = scanner.nextInt();

                            dao2.ler();

                            System.out.println("Digite o novo filme da sessao:");
                            int numero4 = scanner.nextInt();
                            List<Filme> filmes2 = new ArrayList<>();
                            for (Filme filme : dao2.filmes) {
                                filmes2.add(filme);
                            }

                            dao3.ler();

                            System.out.println("Digite a nova sala da sessao:");
                            int numero5 = scanner.nextInt();
                            List<Sala> salas2 = new ArrayList<>();
                            for (Sala sala : dao3.salas) {
                                salas2.add(sala);
                            }

                            sessao = new Sessao();
                            sessao.setFilme(filmes2.indexOf(numero4));
                            sessao.setSala(salas2.indexOf(numero5));

                            dao4.atualizar(id4, sessao);
                            System.out.println("sala atualizado com sucesso!");
                            break;
                        case 4:
                            System.out.println("Digite o ID da sala que deseja excluir:");
                            id4 = scanner.nextInt();
                            dao2.excluir(id4);
                            System.out.println("sala excluído com sucesso!");
                            break;
                        case 0:
                            System.out.println("Voltando ao menu principal...");
                            break;
                        default:
                            System.out.println("Opção inválida!");
                    }
                    break;
                case 0:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        scanner.close();
    }
}
