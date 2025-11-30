// package com.ufma.compiladores.lox.tests;

// import java.io.*;
// import java.nio.file.*;
// import java.util.List;
// import com.ufma.compiladores.lox.Scanner;
// import com.ufma.compiladores.lox.Token;

// public class ScannerTest {
// public static void main(String[] args) throws IOException {
// // Várias opções para rodar, independente de onde for executado
// Path testsDir = Paths.get("src", "main", "java", "com", "ufma",
// "compiladores", "lox", "tests");

// if (!Files.exists(testsDir)) {
// System.err.println("Pasta 'tests' não encontrada.");
// return;
// }

// // Pega todos os arquivos com .lox para imprimir os tokens
// try (DirectoryStream<Path> stream = Files.newDirectoryStream(testsDir,
// "*.lox")) {
// for (Path file : stream) {
// System.out.println("=== Testando " + file.getFileName() + " ===");
// runTestFile(file);
// System.out.println();
// }
// }
// }

// private static void runTestFile(Path path) throws IOException {
// String source = Files.readString(path);
// Scanner scanner = new Scanner(source);
// List<Token> tokens = scanner.scanTokens();

// for (Token token : tokens) {
// System.out.println(token);
// }
// }
// }
