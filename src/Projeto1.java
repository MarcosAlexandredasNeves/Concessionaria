import java.util.List;
import java.util.Scanner;

public class Projeto1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Concessionaria concessionaria = new Concessionaria();
        System.out.println("Qual o nome da concessionaria ? ");
        String nomeConcessionaria = scanner.nextLine();

        concessionaria.setNome(nomeConcessionaria);

        System.out.println("||| Concessionária " + concessionaria.getNome() + " |||\n");

        while (true) {
            System.out.println("Bem vindo a concessionária " + concessionaria.getNome()
                    + ", o que deseja fazer?\n \n1- Cadastrar Veículo \n2- Lista Veículos \n3- Valor Patrimonial da Loja \n"
                    + "4- Reset Geral \n5- Sair");
            String op = scanner.nextLine();

            if (op.equals("1")) {
                System.out.println("Qual a marca do veículo? ");
                String marca = scanner.nextLine();
                System.out.println("Qual o modelo do veículo? ");
                String modelo = scanner.nextLine();
                System.out.println("Qual o ano do veículo? ");
                String ano = scanner.nextLine();
                System.out.println("Qual a potencia do motor do veículo? ");
                String potencia = scanner.nextLine();
                System.out.println("E qual o valor do veículo? ");
                String valor = scanner.nextLine();
                int val = Integer.parseInt(valor);
                Carros carro = new Carros(marca, modelo, ano, potencia, val);
                concessionaria.addListaCarros(carro);
                System.out.println("Carro adicionado com sucesso ");
                scanner.nextLine();

            } else if (op.equals("2")) {

                System.out.println("Veículos da concessionária " + concessionaria.getNome() + ":");
                List<Carros> listaCarros = concessionaria.getListaCarros();

                for (int index = 0; index < listaCarros.size(); index++) {
                    String nomeCarro = listaCarros.get(index).getMarca() + " " + listaCarros.get(index).getModelo()
                            + " " + listaCarros.get(index).getAno();
                    System.out.println((index + 1) + " - " + nomeCarro);
                }

                System.out.println("Qual o veiculo deseja escolher?");
                String numeroCarro = scanner.nextLine();
                int numeroEscolhido = Integer.parseInt(numeroCarro);
                numeroEscolhido = numeroEscolhido - 1;

                System.out.println("Veículo selecionado: " + listaCarros.get(numeroEscolhido).getMarca() + " "
                        + listaCarros.get(numeroEscolhido).getModelo() + " " + listaCarros.get(numeroEscolhido).getAno()
                        + "!");
                System.out.println(
                        "O que deseja fazer? \nA: Excluir Veículo \nB: Alterar valor do veículo \nC: Voltar ao menu principal");
                String op1 = scanner.nextLine();

                if (op1.equals("A")) {
                    System.out.println("Tem certeza que deseja continuar? S(sim) / N(não)");
                    String op2 = scanner.nextLine();
                    if (op2.equals("S")) {
                        listaCarros.remove(numeroEscolhido);
                        System.out.println("Veículo excluído com sucesso!");
                        scanner.nextLine();
                    }
                } else if (op1.equals("B")) {

                    System.out.println("Qual o valor gostaria de colocar?");
                    String valorNovo = scanner.nextLine();
                    int val = Integer.parseInt(valorNovo);
                    Carros carroEscolhido = listaCarros.get(numeroEscolhido);
                    carroEscolhido.setValor(val);
                    System.out.println("Alteração de valor realizada com sucesso!");
                    System.out.println("R$" + carroEscolhido.getValor());
                    scanner.nextLine();

                } else if (op1.equals("C")) {
                    System.out.println("Voltando ao menu...");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

            }
            if (op.equals("3")) {
                List<Carros> listaCarros = concessionaria.getListaCarros();

                double soma = 0;
                for (int t = 0; t < listaCarros.size(); t++) {
                    soma = soma + listaCarros.get(t).getValor();
                }
                System.out
                        .println("O valor patrimonial da concessionaria " + concessionaria.getNome() + " é R$" + soma);

            } else if (op.equals("4")) {

                while (true) {
                    System.out.println("Tem certeza que deseja reiniciar o programa? (S/N): ");
                    String resposta = scanner.nextLine();

                    if (resposta.equalsIgnoreCase("S")) {
                        System.out.println("Reiniciando programa...");
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println();
                        main(args);
                    } else {
                        scanner.nextLine();
                    }
                }
            } else if (op.equals("5")) {

                System.out.println("Programa encerrado!");
                System.exit(0);

            }
        }

    }
}