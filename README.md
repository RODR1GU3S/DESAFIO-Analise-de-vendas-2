# 💼 Project Java Análise de Vendas II com Programação Funcional

Este projeto em Java realiza a leitura e análise de um arquivo CSV contendo dados de vendas.
O programa processa os dados usando recursos de **Programação Funcional** e **Streams**, agrupando e somando o total vendido por cada vendedor.

## 📌 Objetivos

- Praticar o uso de expressões lambda e programação funcional em Java.
- Aplicar interfaces funcionais como `Function`, `Predicate`, `Consumer`, `Comparator`, `Stream`.
- Ler e processar arquivos usando a API NIO (`java.nio.file`).
- Utilizar o pipeline funcional para transformar, mapear, agrupar e reduzir dados.

---

## 📂 Estrutura dos Dados

O arquivo CSV deve conter dados no seguinte formato:

```

month,year,seller,items,total

```

**Exemplo:**

```

1,2023,Ana,10,5000.0
2,2023,Carlos,7,3200.0

```

---

## 🔧 Tecnologias e Conceitos Utilizados

### ✔️ Interfaces Funcionais Aplicadas

| Interface                  | Onde foi usada                                                                  |
|----------------------------|---------------------------------------------------------------------------------|
| `Stream<T>`                | Utilizada para criar pipelines de processamento funcional (`Files.lines()`).    |
| `Function<T,R>`            | Aplicada implicitamente nas expressões lambda usadas para `map()`.              |
| `Collector` + `groupingBy` | Utilizado para agrupar as vendas por vendedor (`Collectors.groupingBy(...)`).   |
| `Consumer<T>`              | Aplicada na exibição dos resultados com `forEach((k,v) -> {...})`.              |

> As interfaces `Predicate<T>` e `Comparator<T>` **não foram diretamente utilizadas** neste exercício, mas são comumente aplicadas em filtros e ordenações, e podem ser incorporadas em evoluções futuras.

---

## 📌 Funcionalidades

- ✅ Lê um arquivo CSV informado pelo usuário.
- ✅ Converte as linhas em objetos `Sale`.
- ✅ Agrupa as vendas por vendedor.
- ✅ Soma os totais vendidos por cada vendedor.
- ✅ Exibe os resultados no console.

---

## ▶️ Execução

1. Compile e execute o programa.
2. Insira o caminho completo para o arquivo CSV no console.
3. O programa exibirá o total de vendas por vendedor.

### Exemplo de saída:

```

Entre o caminho do arquivo: G:\Eclipse\base-de-dados.csv

Total de vendas por vendedor:
Ana - R\$ 5000.00
Carlos - R\$ 3200.00

```

---

## 🧠 Possíveis Expansões

- Ordenar os vendedores por total vendido (usando `Comparator`).
- Filtrar vendas por mês ou ano (usando `Predicate`).
- Exportar o relatório em arquivo.
- Calcular médias ou totais com base em critérios específicos.

---

## 📁 Estrutura do Projeto

```

.
├── application
│   └── DESAFIO\_Análise\_de\_vendas\_2.java
├── entities
│   └── Sale.java
└── base-de-dados.csv

```

---

## 📚 Conceitos Reforçados

- Leitura de arquivos com `java.nio.file.Files`.
- Expressões lambda e referências a métodos.
- Transformação de dados com `map`.
- Agrupamento e soma com `Collectors.groupingBy` + `summingDouble`.
- Uso eficiente da API de Streams do Java.

---

## 👨‍💻 Autores e Reconhecimentos 

* **Alan Kay**: Pioneiro da Programação Orientada a Objetos (POO), cuja visão fundamenta toda a estrutura de orientação a objetos usada neste projeto.
* **Erich Gamma, Richard Helm, Ralph Johnson e John Vlissides (Gang of Four - GoF)**: Autores de *Design Patterns*, influenciaram diretamente boas práticas de arquitetura, como o uso de abstrações e encapsulamento.
* **Robert C. Martin ("Uncle Bob")**: Idealizador do conceito de *Clean Code*, cujos princípios foram considerados no nome de variáveis, clareza de métodos e separação de responsabilidades.
* **Brian Goetz**: Autor do livro *Java Concurrency in Practice* e um dos principais responsáveis pela introdução da API de Streams e expressões lambda no Java 8, base essencial para a programação funcional aplicada neste projeto.
* **Professor Nélio Alves**: Responsável pelo curso que forneceu a base sólida em Java, Streams, tratamento de arquivos, e boas práticas de desenvolvimento orientado a objetos.
* **Ronaldo Rodrigues**: Estudante que está se especializando em programação, aplicando com responsabilidade os conceitos aprendidos e desenvolvendo soluções limpas, reutilizáveis e robustas.

---
## 📬 Contato

Desenvolvedor Back-end Java **Ronaldo Rodrigues**
📧 \[[ronaldo.r.silva.78@gmail.com](mailto:ronaldo.r.silva.78@gmail.com)]
🔗 \[www.linkedin.com/in/ronaldo-rodr1gu3s]

---
