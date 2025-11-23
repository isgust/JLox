# 🦊 jlox: Interpretador da Linguagem Lox em Java

Este projeto consiste na implementação do interpretador para a linguagem de programação **Lox**, escrito em **Java**. O desenvolvimento segue rigorosamente o conteúdo e as etapas propostas no livro **_Crafting Interpreters_** de Robert Nystrom.

## 👥 Integrantes da Dupla

| Nome Completo | Usuário do GitHub |
| :--- | :--- |
| **Daniel Campos Galdez Monteiro** | `DanielKGM` |
| **Gustavo Antonio Silva Rocha** | `isgust` |

---

## 🛠️ Tecnologias e Configuração

* **Linguagem de Implementação:** Java
* **Gerenciador de Dependências:** **Maven** (Estrutura de Projeto Padrão)
* **Referência Base:** [Crafting Interpreters](http://www.craftinginterpreters.com/)

### ⚙️ Como Compilar e Executar

O projeto utiliza a estrutura padrão Maven, garantindo que possa ser clonado e aberto diretamente em qualquer IDE.

1.  **Clonar o Repositório:**
    ```bash
    git clone https://github.com/isgust/JLox/tree/master 
    cd jlox
    ```

2.  **Compilar (Usando Maven):**
    ```bash
    mvn clean install
    ```

3.  **Executar:**

    * **Executar Arquivo Lox:** Para interpretar um arquivo específico:
        ```bash
        java -jar target/jlox-1.0-SNAPSHOT.jar 
        ```
    * **Modo Interativo (REPL):** Para iniciar o prompt de comando Lox:
        ```bash
        java -jar target/jlox-1.0-SNAPSHOT.jar
        ```

---

## Resultados

### Teste Seção 4.5 _The Scanner Class: Recognizing Lexemes_

Arquivos de entrada `teste_basico.lox` e `teste_keywords`, respectivamente:

```
// teste_basico.lox
var a = 123;
print a + 45;

// teste_keywords.lox
if (true) {
  print "ok";
} else {
  print "fail";
}
```

Resultados obtidos rodando `ScannerTest.java`, responsável por testar `Scanner.java`:

<p align="center" width="50%">
    <img width="33%" src="resources/scanner_class_test_4_5.png"> 
</p>

O teste funcionou perfeitamente, mas o scanner ainda não foi completado.

A saída é esperada, pois a implementação parou logo após tratar lexemas de um caractere, na [seção 4.5](https://craftinginterpreters.com/scanning.html#recognizing-lexemes).

### Teste Seção 4.7 _The Scanner Class: Recognizing Longer Lexemes and Keywords_

Os arquivos de entrada `teste_basico.lox` e `teste_keywords` foram rodados novamente após implementar _recognizing longer lexemes_ ([seção 4.6](https://craftinginterpreters.com/scanning.html#longer-lexemes)) e _reserved words and identifiers_ ([seção 4.7](https://craftinginterpreters.com/scanning.html#reserved-words-and-identifiers)). A saída resultante está registrada na figura abaixo:

<p align="center" width="50%">
    <img width="33%" src="resources/scanner_class_test_4_7.png"> 
</p>

Claramente foram gerados mais tokens, tanto para palavras reservadas como "print" quanto para números e strings com lexemas mais longos, por exemplo. Pode-se dizer que a classe Scanner está cada vez mais completa.

### Teste Seção 5.4 _A Not Very Pretty Printer_

A classe `AstPrinter` foi executada, o resultado está na imagem a seguir:

<p align="center" width="70%">
    <img width="33%" src="resources/astprinter_5_4.png"> 
</p>

Ele imprime como o interpretador enxerga e organiza os operadores e valores antes de executar algo.

### Teste Capítulo 6: _Parser_

A classe **`ParserTest.java`** foi executada para validar o funcionamento do parser e construção da AST.

A lista de entradas testadas foi:

```
1 + 2 * 3
(1 + 2) * 3
true == false
-(3 + 4) * 10
1 + * 3
```

A seguir está a imagem com a saída produzida pelos testes:

<p align="center" width="50%">
    <img width="33%" src="resources/parser_6.png"> 
</p>

Os testes confirmam que o parser:

- Respeita a precedência de operadores (`*` antes de `+`).
- Processa agrupamentos com `(` `)`.
- Reconhece operadores de igualdade e booleanos.
- Detecta erros sintáticos como em `1 + * 3`.

## Referência

- **Livro Base:** _Crafting Interpreters_.
- **Seção de Referência para esta Etapa:** [Scanning - Capítulo 4](http://www.craftinginterpreters.com/scanning.html)

---

_Data de Entrega: 30 de Outubro_
