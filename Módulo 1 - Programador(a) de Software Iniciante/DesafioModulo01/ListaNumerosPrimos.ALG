Algoritmo "Numero Primo?"
// Disciplina   : [Linguagem e L�gica de Programa��o]
// Professor   : Guilherme Henrique de Assis
// Descri��o   : O programa receber� um n�mero
//               e responder� se ele � um numero primo ou n�o.
// Autor(a)    : Julio de Barros Carvalho
// Data atual  : 13/10/2021
// LOGICA DO PROGRAMA:
//1� informar n�mero a ser testado
//2� testar o o resto da divis�o do numero informado de 2 a 9999999999999
//3� enquanto o o resto for 0, retornar� que � um n�mero primo,
//   do contr�rio, retornar� que nao � um numero primo.
//4� enquanto "resto" = "0" ("numero" % "sequencial"), para 2 at� 9999999999999,
//   "sequencial" +1.
//5� se "sequencial" > "1", retornar "numero" n�o � um numero primo,
//   ent�o, retornar "numero" � um numero primo.
Var
// Se��o de Declara��es das vari�veis
   numero, sequencial, divisiveis: inteiro

Inicio
// Se��o de Comandos, procedimento, fun��es, operadores, etc... 
   Escreva("Estes s�o os numeros primos: ")
   leia(numero)

   divisiveis <- 0

   Para sequencial De 2 Ate 999 Faca
      Se (numero % sequencial = 0) entao
         divisiveis <- divisiveis + 1
      Fimse
   Fimpara

   Se divisiveis > 1 Ent�o
      escreva (" n�o � um numero primo.")
   Sen�o
      Escreva (" � um numero primo.")
   Fimse

Fimalgoritmo