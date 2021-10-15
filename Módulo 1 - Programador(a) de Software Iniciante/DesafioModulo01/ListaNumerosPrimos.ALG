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
   numero, sequencial, divisiveis: inteiro

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
   Escreva("Estes são os numeros primos: ")
   leia(numero)

   divisiveis <- 0

   Para sequencial De 2 Ate 999 Faca
      Se (numero % sequencial = 0) entao
         divisiveis <- divisiveis + 1
      Fimse
   Fimpara

   Se divisiveis > 1 Então
      escreva (" não é um numero primo.")
   Senão
      Escreva (" é um numero primo.")
   Fimse

Fimalgoritmo