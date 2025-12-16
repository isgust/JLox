# Interpretador Lox — Demonstração

Este README documenta os testes exigidos, demonstrando:

- Execução em modo **REPL** (interpretador interativo);
- Execução de **dois programas completos** a partir de arquivos `.lox`.

---

## 1. Execução em Modo REPL

O modo REPL permite a execução interativa de comandos Lox. Ele é executado por padrão:

```
java ...\src\main\java\com\ufma\compiladores\lox\Lox.java
```

A seguir estão os comandos utilizados para testar variáveis, funções e classes.

### 1.1 Variáveis

```lox
var x = 10;
```

Declara uma variável global e atribui um valor inteiro.

```lox
var y = 20;
```

Declara outra variável no mesmo escopo.

```lox
x + y;
```

Avalia uma expressão aritmética usando variáveis previamente declaradas.

---

### 1.2 Funções

```lox
fun soma(a, b) { return a + b; }
```

Declara uma função com parâmetros e retorno.

```lox
soma(3, 4);
```

Chama a função, demonstrando passagem de argumentos e valor de retorno.

---

### 1.3 Estado e Escopo Persistente

```lox
var contador = 0;
```

Declara uma variável global que será modificada por uma função.

```lox
fun inc() { contador = contador + 1; return contador; }
```

Função que modifica uma variável fora do seu escopo local, demonstrando closures.

```lox
inc();
```

Executa a função e altera o estado global.

---

### 1.4 Classes no REPL

```lox
class Pessoa { init(nome) { this.nome = nome; } dizerOla() { print this.nome; print "Olá!"; } }
```

Declara uma classe com inicializador e método.

```lox
var p = Pessoa("Alice");
```

Cria uma instância da classe.

```lox
p.dizerOla();
```

---

## 2. Execução de Programas Completos

Além do REPL, o interpretador suporta a execução de programas completos a partir de arquivos `.lox`.

```lox
java [diretório do Lox.java] [diretório do arquivo .lox]
```

---

## 2.1 Programa 1 fatorial.lox

### Descrição

Este programa calcula o fatorial de números inteiros utilizando funções recursivas, estruturas de controle e laços de repetição.

### Código

```lox
fun fatorial(n) {
  if (n <= 1) {
    return 1;
  }
  return n * fatorial(n - 1);
}

for (var i = 1; i <= 5; i = i + 1) {
  print "fatorial(" + i + ") = " + fatorial(i);
}
```

### Conceitos Demonstrados

- Declaração e chamada de funções;
- Recursão;
- Estrutura condicional (if);
- Laço de repetição (for);
- Avaliação de expressões e impressão de resultados.

---

## 2.2 Programa 2 — conta_bancaria.lox

### Descrição

Este programa simula uma conta bancária simples utilizando programação orientada a objetos, com encapsulamento de estado e comportamento.

### Código

```lox
class ContaBancaria {
  init(titular, saldoInicial) {
    this.titular = titular;
    this.saldo = saldoInicial;
  }

  depositar(valor) {
    this.saldo = this.saldo + valor;
  }

  sacar(valor) {
    if (valor > this.saldo) {
      print "Saldo insuficiente!";
      return;
    }
    this.saldo = this.saldo - valor;
  }

  mostrarSaldo() {
    print this.titular + " possui saldo: " + this.saldo;
  }
}

var conta = ContaBancaria("João", 100);
conta.mostrarSaldo();
conta.depositar(50);
conta.mostrarSaldo();
conta.sacar(200);
conta.sacar(80);
conta.mostrarSaldo();
```

### Conceitos Demonstrados

- Declaração de classes;
- Método inicializador (init);
- Uso do identificador this;
- Encapsulamento de estado em instâncias;
- Comunicação entre métodos e atributos;
- Controle de fluxo dentro de métodos.
