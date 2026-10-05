# Maratona Java

Repositório de estudos e exercícios em Java, acompanhando minha evolução na linguagem e em Programação Orientada a Objetos.

## Objetivo

Centralizar exemplos práticos e exercícios desenvolvidos durante os estudos de Java, mantendo uma evolução organizada por assuntos e pacotes.

## Tecnologias utilizadas

- Java 8
- IntelliJ IDEA
- Git e GitHub

## Estrutura dos estudos

```text
src/
├── HelloWorld.java
└── academy/maratonajava/
    ├── introducao/                  # fundamentos da linguagem
    └── poo/
        ├── introducaoaclasses/      # domain/ e test/
        ├── metodos/                 # domain/ e test/
        ├── sobrecargametodos/       # domain/ e test/
        ├── construtores/            # domain/ e test/
        ├── blocosinicializacao/     # domain/ e test/
        ├── modificadoresestaticos/  # domain/ e test/
        ├── modificadorfinal/        # domain/ e test/
        ├── associacao/              # domain/ e test/
        ├── heranca/                 # domain/ e test/
        ├── sobrescrita/             # domain/ e test/
        ├── classesabstratas/        # domain/ e test/
        ├── interfaces/              # domain/ e test/
        ├── Enumeracao/              # domain/ e test/
        └── polimorfismo/            # domain/, repositorio/, servico/ e test/
```

## Assuntos já estudados

### Fundamentos

- Tipos primitivos e casting
- Operadores
- Estruturas condicionais
- Estruturas de repetição
- Arrays e arrays multidimensionais
- Exercícios de tipos primitivos

### Programação Orientada a Objetos

- Introdução a classes e objetos
- Métodos
- Sobrecarga de métodos
- Construtores
- Blocos de inicialização
- Modificadores estáticos (`static`)
- Modificador `final`
- Associação entre classes
- Herança
- Sobrescrita de métodos
- Classes abstratas
- Interfaces
- Enumerações
- Polimorfismo (parâmetros polimórficos, `instanceof` e programação orientada a interface)

## Como executar

1. Clone o repositório.
2. Abra o projeto no IntelliJ IDEA.
3. Configure um JDK 8, caso necessário.
4. Execute uma das classes que possuem o método `main`, como `Arrays01`, `CarroTest01` ou `CalculadoraTest03`.

## Organização dos pacotes

- `academy.maratonajava.introducao`: exemplos dos fundamentos da linguagem.
- `academy.maratonajava.poo.*`: um pacote por assunto de orientação a objetos. Em geral, `domain` contém as classes do assunto e `test` contém as classes com `main` que as exercitam.
- `academy.maratonajava.poo.polimorfismo`: além de `domain` e `test`, possui `repositorio` (interface) e `servico` (implementações e regras de negócio).

## Progresso dos estudos

- [x] Fundamentos da linguagem
- [x] Estruturas condicionais e de repetição
- [x] Arrays e arrays multidimensionais
- [x] Introdução a classes e objetos
- [x] Métodos e sobrecarga
- [x] Construtores e blocos de inicialização
- [x] Modificadores `static` e `final`
- [x] Associação
- [x] Herança e sobrescrita
- [x] Classes abstratas e interfaces
- [x] Enumerações
- [x] Polimorfismo
- [ ] Exceções (em andamento)

## Observação

Este projeto é voltado para aprendizado e prática. Os exemplos refletem os assuntos estudados ao longo da evolução em Java.
