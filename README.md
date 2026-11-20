# ☕ Maratona Java

![Java](https://img.shields.io/badge/Java-8-orange?logo=openjdk&logoColor=white)
![IntelliJ IDEA](https://img.shields.io/badge/IDE-IntelliJ_IDEA-000000?logo=intellijidea&logoColor=white)
![Status](https://img.shields.io/badge/status-em_andamento-yellow)

Repositório de estudos de **Java**: fundamentos da linguagem, Programação Orientada a Objetos (POO), tratamento de exceções e classes utilitárias. Cada assunto tem o seu próprio pacote, com exemplos executáveis (`main`) e, quando necessário, classes de domínio de apoio.

## Sumário

- [Visão geral](#visão-geral)
- [Trilha de estudos](#trilha-de-estudos)
- [Estrutura do projeto](#estrutura-do-projeto)
- [Convenções](#convenções)
- [Como executar](#como-executar)
- [Progresso](#progresso)

## Visão geral

| Item | Detalhe |
| --- | --- |
| Linguagem | Java 8 |
| IDE | IntelliJ IDEA |
| Build | Sem ferramenta de build: projeto simples em `src/` |
| Código-fonte | 121 arquivos `.java` |
| Pacote raiz | `academy.maratonajava` |

## Trilha de estudos

### 1. Fundamentos — `fundamentos`

| Pacote | Assunto |
| --- | --- |
| `tiposprimitivos` | Tipos primitivos, casting e exercícios |
| `operadores` | Operadores |
| `estruturascondicionais` | `if`, `else`, `switch` e variações (6 exemplos) |
| `estruturasrepeticao` | Laços de repetição (5 exemplos) |
| `arrays` | Arrays e arrays multidimensionais |

### 2. Programação Orientada a Objetos — `poo`

| Pacote | Assunto |
| --- | --- |
| `introducaoaclasses` | Classes e objetos |
| `metodos` | Métodos |
| `sobrecargametodos` | Sobrecarga de métodos |
| `construtores` | Construtores |
| `blocosinicializacao` | Blocos de inicialização |
| `modificadoresestaticos` | Modificador `static` |
| `modificadorfinal` | Modificador `final` |
| `associacao` | Associação entre classes |
| `heranca` | Herança |
| `sobrescrita` | Sobrescrita de métodos |
| `classesabstratas` | Classes abstratas |
| `interfaces` | Interfaces |
| `enumeracao` | Enumerações |
| `polimorfismo` | Polimorfismo, `instanceof` e programação orientada a interface (padrão `Repositorio`) |

### 3. Exceções — `excecoes`

| Pacote | Assunto |
| --- | --- |
| `error` | `Error` e `StackOverflowError` |
| `runtime` | Exceções *unchecked*, `IllegalArgumentException`, `finally`, ordem dos `catch` e *multi-catch* |
| `exception` | Exceções *checked*: `try/catch`, `throws`, relançamento e encapsulamento, `try-with-resources` (`Closeable`), exceção customizada (`LoginInvalidoException`) e regras na sobrescrita de métodos |

### 4. Classes utilitárias — `classesutilitarias` *(em andamento)*

| Pacote | Assunto |
| --- | --- |
| `wrappers` | Classes *Wrapper* (`Integer`, `Double`, `Character`, `Boolean`…), *autoboxing*, *unboxing* e métodos utilitários como `parseInt`, `parseBoolean` e `Character.isDigit` |

## Estrutura do projeto

```text
src/
├── HelloWorld.java
└── academy/maratonajava/
    ├── fundamentos/
    │   ├── tiposprimitivos/
    │   ├── operadores/
    │   ├── estruturascondicionais/
    │   ├── estruturasrepeticao/
    │   └── arrays/
    ├── poo/
    │   ├── <assunto>/
    │   │   ├── domain/
    │   │   └── test/
    │   └── polimorfismo/
    │       ├── domain/
    │       ├── repositorio/
    │       ├── servico/
    │       └── test/
    ├── excecoes/
    │   ├── error/test/
    │   ├── runtime/test/
    │   └── exception/
    │       ├── domain/
    │       └── test/
    └── classesutilitarias/
        └── wrappers/test/
```

## Convenções

- **Pacotes** em minúsculas, sem acento, seguindo a convenção do Java; **classes** em `PascalCase`.
- `fundamentos/`: exemplos soltos com `main`, agrupados por assunto e numerados (`Arrays01`, `Arrays02`…).
- `poo/<assunto>/domain/`: classes do assunto estudado (entidades, interfaces, exceções customizadas).
- `poo/<assunto>/test/`: classes com `main` que exercitam o assunto. É por elas que se executa o código.
- `poo/polimorfismo/` tem ainda `repositorio/` (interface) e `servico/` (implementações e regras de negócio).
- Arquivos de I/O gerados nos testes (`*.txt`, `*arquivo/`) são ignorados pelo `.gitignore`.
- Commits seguem o padrão *Conventional Commits* em português (`feat:`, `refactor:`, `docs:`, `chore:`).

## Como executar

```bash
git clone https://github.com/GGusm4o/maratona-java.git
```

1. Abra a pasta no IntelliJ IDEA.
2. Configure um JDK 8 (*File → Project Structure → SDK*).
3. Marque `src` como *Sources Root*, se necessário.
4. Execute qualquer classe com `main`, por exemplo:
   - `academy.maratonajava.fundamentos.arrays.Arrays01`
   - `academy.maratonajava.poo.polimorfismo.test.RepositorioTest01`
   - `academy.maratonajava.excecoes.exception.test.TryWithResourcesTest01`
   - `academy.maratonajava.classesutilitarias.wrappers.test.WrappersTest01`

Pela linha de comando:

```bash
javac -d out $(find src -name "*.java")
java -cp out academy.maratonajava.classesutilitarias.wrappers.test.WrappersTest01
```

## Progresso

- [x] Fundamentos
- [x] POO
- [x] Exceções
- [ ] Classes utilitárias (*Wrappers* em andamento)

---

Projeto voltado para aprendizado e prática; os exemplos refletem os assuntos estudados em cada etapa.
