package geometria;
import java.util.Scanner;
public class Calculadora {
    private Double lado;
    private Double base;
    private Double altura;
    private Double raio;
    private Integer opcao;

    public void menu() {
        /*Calcular Área do Quadrado 
          Calcular Área do Retângulo 
          Calcular Área do Círculo
          Sair
        */
        System.out.println("1 - Calcular Área do Quadrado");
        System.out.println("2 - Calcular Área do Retângulo");
        System.out.println("3 - Calcular Área do Círculo");
        System.out.println("4 - Sair");
    }

    public void executar() {
        /*Ler a opcao do usuário (use Scanner);
          Usar um switch case para decidir o cálculo;
          Pedir as medidas necessárias 
          (Ex: se for quadrado, peça o lado. 
          Se for retângulo, peça base e altura);
          Mostrar o resultado final com um System.out.printf.

          Quadrado: Área = lado * lado
          Retângulo: Área = base * altura
          Círculo: Área = 3.14 * (raio * raio)
        */
        Scanner s = new Scanner(System.in);
        System.out.println("Digite a opção desejada:");
        opcao = s.nextInt();
        System.out.println("Você escolheu: ");
        
        switch (opcao) {
          case 1:
            System.out.println("1 - Calcular Área do Quadrado");

            System.out.println("Digite o Lado do Quadrado: ");
            lado = s.nextDouble();

            Double areaQ = lado*lado;
            System.out.println("A Área do Quadrado é: " + areaQ);
            System.out.println("Programa encerrado!");
            break;

          case 2:
            System.out.println("2 - Calcular Área do Retângulo");

            System.out.println("Digite a Base do Retângulo: ");
            base = s.nextDouble();

            System.out.println("Digite a Altura do Retângulo: ");
            altura = s.nextDouble();

            Double areaR = base*altura;
            System.out.println("A Área do Retângulo é: " + areaR);
            System.out.println("Programa encerrado!");
            break;

          case 3:
            System.out.println("3 - Calcular Área do Círculo");

            System.out.println("Digite o Raio do Círculo: ");
            raio = s.nextDouble();

            Double areaC = 3.14*(raio*raio);
            System.out.println("(Considerando pi = 3,14) A Área do Círculo é: " + areaC);
            System.out.println("Programa encerrado!");
            break;

          case 4:
            System.out.println("4 - Sair");
            System.out.println("Programa encerrado!");
            break;
        
          default:
            System.out.println(opcao + ", A opção escolhida é inválida!");
            break;
        }
        s.close();
    }
}
