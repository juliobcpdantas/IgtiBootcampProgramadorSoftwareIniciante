Algoritmo "Numero Primo?"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Guilherme Henrique de Assis
// Descrição   : O programa receberá um número
//               e responderá se ele é um numero primo ou não.
// Autor(a)    : Julio de Barros Carvalho
// Data atual  : 13/10/2021
// LOGICA DO PROGRAMA:
//1º informar número a ser testado
//2º testar o o resto da divisão do numero informado de 2 a 9999999999999
//3º enquanto o o resto for 0, retornará que é um número primo,
//   do contrário, retornará que nao é um numero primo.
//4º enquanto "resto" = "0" ("numero" % "sequencial"), para 2 até 9999999999999,
//   "sequencial" +1.
//5º se "sequencial" > "1", retornar "numero" não é um numero primo,
//   então, retornar "numero" é um numero primo.
Var
// Seção de Declarações das variáveis
   numeroA, numeroB, numeroC, numeroD, sequencial, divisiveis, limite: inteiro

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
   Escreva("Digite um número A: ")
   leia(numeroA)
   Escreva("Digite um número B: ")
   leia(numeroB)
   Escreva("Digite um número C: ")
   leia(numeroC)
   Escreva("Digite um número D: ")
   leia(numeroD)

   Escreval(" ")
   divisiveis <- 0
   Para sequencial De 2 Ate 999 Faca
      Se (numeroA % sequencial = 0) entao
         divisiveis <- divisiveis + 1
   Fimse
   Fimpara

   Escreva (numeroA)
   Se divisiveis > 1 Então
      escreval (" NÃO é um numero primo. ")
   Senão
      Escreval (" é um numero primo. ")
   Fimse

   divisiveis <- 0
   Para sequencial De 2 Ate 999 Faca
      Se (numeroB % sequencial = 0) entao
         divisiveis <- divisiveis + 1
   Fimse
   Fimpara
   
   Escreva (numeroB)
   Se divisiveis > 1 Então
      escreval (" NÃO é um numero primo. ")
   Senão
      Escreval (" é um numero primo. ")
   Fimse

   divisiveis <- 0
   Para sequencial De 2 Ate 999 Faca
      Se (numeroC % sequencial = 0) entao
         divisiveis <- divisiveis + 1
   Fimse
   Fimpara

   Escreva (numeroC)
   Se divisiveis > 1 Então
      escreval (" NÃO é um numero primo. ")
   Senão
      Escreval (" é um numero primo. ")
   Fimse

   divisiveis <- 0
   Para sequencial De 2 Ate 999 Faca
      Se (numeroD % sequencial = 0) entao
         divisiveis <- divisiveis + 1
   Fimse
   Fimpara

   Escreva (numeroD)
   Se divisiveis > 1 Então
      escreval (" NÃO é um numero primo. ")
   Senão
      Escreval (" é um numero primo. ")
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
//                  Se divisiveis > 1 Então
//                     escreval(sequencial)
//                  Fimse
                  
Fimalgoritmo