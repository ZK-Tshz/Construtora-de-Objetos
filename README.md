# Construtora-de-Objetos
  Uma atividade escolar na qual foi solicitado a criação de uma calculadora para auxiliar arquitetos, que deve calcular a área de um quadrado, retângulo e de um círculo. O principal requisito do projeto é que ele fosse estruturado e organizado com POO.

------------------------------------------------------------------------------------

# Instruções Passadas

Missão: Você foi contratado pela Java Constructions Inc. para criar uma ferramenta que auxilia os arquitetos a calcularem a área de terrenos automaticamente.
Proibido uso de IA (ChatGPT, Gemini, Copilot).

Passo 1: A Organização (Pacotes)
  Crie um pacote (package) chamado: geometria
Dentro do pacote geometria, crie a classe: Calculadora.java 
Fora do pacote (na raiz src), mantenha sua classe: Main.java

Passo 2: Os Materiais (Propriedades)
  Dentro da classe Calculadora, declare as seguintes propriedades (lembre-se de usar private):
    lado (para quadrados)
    base (para retângulos/triângulos)
    altura (para retângulos/triângulos)
    raio (para círculos)
    opcao (para guardar a escolha do menu)

Passo 3: As Ações (Métodos)
  Crie os métodos abaixo:
    public void menu()
      Deve mostrar no console:
        Calcular Área do Quadrado
        Calcular Área do Retângulo
        Calcular Área do Círculo
        Sair
    public void executar()
      Deve:
        Ler a opcao do usuário (use Scanner).
        Usar um switch case para decidir o cálculo.
        Pedir as medidas necessárias (Ex: se for quadrado, peça o lado. Se for retângulo, peça base e altura).
        Mostrar o resultado final com um System.out.printf.

  Fórmulas para ajuda:
    Quadrado: Área = lado * lado
    Retângulo: Área = base * altura
    Círculo: Área = 3.14 * (raio * raio)
    
Passo 4: A Contratação (Main)
  Na classe Main.java, faça o import do pacote: 
    import geometria.Calculadora;
  Dentro do public static void main:
    Instancie o objeto: Calculadora calc = new Calculadora();
    Chame o menu: calc.menu();
    Mande executar: calc.executar();
