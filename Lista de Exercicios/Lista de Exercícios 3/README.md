## Getting Started

    1 - Crie uma classe denominada data que contenha 3 atributos privados do tipo
    int: dia, mês e ano. Crie os getters e setters para esses atributos.
    
    2 - Crie uma classe denominada ContaBancaria para representar uma conta
    bancária. Esta classe deverá conter:
    
    a. Um campo de dados privado do tipo double chamado saldo que
    representa o saldo atual da conta. O saldo padrão é 0.0.
    b. Um campo de dados privado do tipo Data chamado dataAbertura que
    guarda a data da abertura da conta bancária.
    c. Métodos get() e set() para o campo saldo e os métodos get() e set() para
    o campo dataAbertura.
    d. Um método getDataAberturaFormatada() que retorna a data de
    abertura da conta como uma String. Você deverá também formatar a
    data retornada com o objetivo de exibir algo como "12/05/2012".
    e. Um método getSaldoFormatado() que retorna o saldo atual da conta
    como uma String e formatado de acordo com o formato de moeda
    brasileira, ou seja, algo como "R$ 23.654,00".
    f. Um método depositar() que recebe um valor do tipo double e atualiza o
    saldo atual da conta.
    g. Um método sacar() que recebe um valor do tipo double representando
    o valor a ser sacado. Não permita saques que farão com que a conta
    fique com saldo negativo.
    
    3- Escreva uma classe de teste e, em seu método main(), crie uma nova instância
    da classe Data e ContaBancaria. Atribua uma data de abertura à ContaBancaria.
    Experimente efetuar depósitos e saques e observe o comportamento da classe.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).
