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
   numeroA, numeroB, numeroC, numeroD, sequencial, divisiveis, limite: inteiro

Inicio
// Se��o de Comandos, procedimento, fun��es, operadores, etc... 
   Escreva("Digite um n�mero A: ")
   leia(numeroA)
   Escreva("Digite um n�mero B: ")
   leia(numeroB)
   Escreva("Digite um n�mero C: ")
   leia(numeroC)
   Escreva("Digite um n�mero D: ")
   leia(numeroD)

   Escreval(" ")
   divisiveis <- 0
   Para sequencial De 2 Ate 999 Faca
      Se (numeroA % sequencial = 0) entao
         divisiveis <- divisiveis + 1
   Fimse
   Fimpara

   Escreva (numeroA)
   Se divisiveis > 1 Ent�o
      escreval (" N�O � um numero primo. ")
   Sen�o
      Escreval (" � um numero primo. ")
   Fimse

   divisiveis <- 0
   Para sequencial De 2 Ate 999 Faca
      Se (numeroB % sequencial = 0) entao
         divisiveis <- divisiveis + 1
   Fimse
   Fimpara
   
   Escreva (numeroB)
   Se divisiveis > 1 Ent�o
      escreval (" N�O � um numero primo. ")
   Sen�o
      Escreval (" � um numero primo. ")
   Fimse

   divisiveis <- 0
   Para sequencial De 2 Ate 999 Faca
      Se (numeroC % sequencial = 0) entao
         divisiveis <- divisiveis + 1
   Fimse
   Fimpara

   Escreva (numeroC)
   Se divisiveis > 1 Ent�o
      escreval (" N�O � um numero primo. ")
   Sen�o
      Escreval (" � um numero primo. ")
   Fimse

   divisiveis <- 0
   Para sequencial De 2 Ate 999 Faca
      Se (numeroD % sequencial = 0) entao
         divisiveis <- divisiveis + 1
   Fimse
   Fimpara

   Escreva (numeroD)
   Se divisiveis > 1 Ent�o
      escreval (" N�O � um numero primo. ")
   Sen�o
      Escreval (" � um numero primo. ")
   Fimse

// lista de numeros primos
//   Escreva("Defina o limite da lista ")
//   leia(limite)
//   Escreva("Lista de numeros primos entre 1 e")
//   Escreva (limite)
   
//   numero <- 1
//   sequencial <- 0
//   Para numero De 2 ate limite Faca
//      Se Para sequencial De 2 ate limite Faca
//         Se (numero % sequencial = 0) entao
//             divisiveis <- divisiveis + 1
//             Fimse
//                  Se divisiveis > 1 Ent�o
//                     escreval(sequencial)
//                  Fimse
                  
Fimalgoritmo