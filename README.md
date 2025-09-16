# Bank System (Sistema Bancário com Encapsulamento)

Este é um programa de console, escrito em Java, focado nos princípios de Programação Orientada a Objetos (POO). O projeto demonstra o uso de **encapsulamento** (com campos privados, getters e setters) e **sobrecarga de construtores** para gerenciar uma conta bancária simples.

O programa permite ao usuário criar uma conta bancária. Ele pode optar por fazer um depósito inicial no momento da criação ou não. Em seguida, o programa permite que o usuário realize um novo depósito e exibe o estado atualizado da conta.

## Funcionalidades

  * **Criação de Conta:** Solicita ao usuário o número da conta e o nome do titular.
  * **Depósito Inicial Opcional:** Pergunta ao usuário (com 'y/n') se deseja fazer um depósito inicial.
  * **Sobrecarga de Construtores:** A classe `Account` possui dois construtores:
      * `Account(int number, String holder)`: Para criar uma conta sem depósito inicial (saldo começa em zero).
      * `Account(int number, String holder, double initialDeposit)`: Para criar uma conta já com um valor inicial, que é validado através do método `deposit()`.
  * **Encapsulamento:** Os atributos da conta (`number`, `holder`, `balance`) são `private`. O saldo (`balance`) só pode ser modificado através dos métodos públicos `deposit()` e `withdraw()`.
  * **Operações de Conta:**
      * `deposit(double amount)`: Adiciona um valor ao saldo da conta.
      * `withdraw(double amount)`: Subtrai um valor do saldo da conta.
  * **Exibição Formatada:** O método `toString()` é sobrescrito para exibir os dados da conta de forma clara e formatada, incluindo o saldo com duas casas decimais.

## Estrutura do Repositório

```
/
├── src/                      # Pasta contendo o código-fonte .java
│   ├── application/
│   │   └── Program.java      # Classe principal (main) que executa a aplicação
│   ├── entities/
│   │   └── Account.java      # Classe de entidade que define a Conta Bancária
│   └── module-info.java    # Define o módulo Java (bank)
│
├── bin/                      # Pasta contendo os arquivos .class compilados
│   ├── application/
│   │   └── Program.class     # Contém erros de compilação do Program.java
│   ├── entities/
│   │   └── Account.class
│   └── module-info.class
│
└── README.md                 # Este arquivo de descrição
```

## Como Usar (Após Correção)

Para executar este projeto, você primeiro precisa corrigir o erro de compilação em `src/application/Program.java` (detalhado abaixo).

1.  **Corrija o Erro:** Altere o arquivo `src/application/Program.java` conforme a observação abaixo.

2.  **Compilação:**
    Navegue até a raiz do projeto e compile os arquivos-fonte:

    ```bash
    javac -d bin src/application/Program.java src/entities/Account.java
    ```

3.  **Execução:**
    A partir da raiz do projeto, execute a classe `Program`:

    ```bash
    java -cp bin application.Program
    ```

4.  **Interação com o Programa:**
    O console solicitará:

      * `Enter account number:` (Número da conta)
      * `Enter account holder:` (Nome do titular)
      * `Is there an initial deposit (y/n)` (Se há depósito inicial)
      * (Se 'y') `Enter initial deposit value:` (Valor do depósito inicial)

    O programa exibirá os dados da conta. Em seguida, solicitará:

      * `Enter a deposit value:` (Valor de um novo depósito)

    Por fim, o programa exibirá os dados da conta atualizados com o novo depósito.

## Observações Importantes

  * **Erro de Compilação:** O arquivo `src/application/Program.java` possui um erro de compilação. A variável `account` é declarada no início do método `main`, mas é **declarada novamente** dentro do bloco `else`. O arquivo `bin/application/Program.class` confirma este erro com a mensagem `Unresolved compilation problems: Duplicate local variable account`.
  * **Correção Necessária:** Para corrigir, altere o bloco `else` no arquivo `src/application/Program.java`:
      * **De:**
        ```java
        else {
            Account account = new Account(number, holder)
        }
        ```
      * **Para:**
        ```java
        else {
            account = new Account(number, holder);
        }
        ```
  * **Locale:** O programa utiliza `Locale.setDefault(Locale.US)`. Isso significa que, ao inserir valores decimais (como depósitos), você deve usar o **ponto** (`.`) como separador (ex: `500.25`).
  * **Método não Utilizado:** O método `withdraw()` (saque) está implementado na classe `Account`, mas a classe `Program` nunca o utiliza.
