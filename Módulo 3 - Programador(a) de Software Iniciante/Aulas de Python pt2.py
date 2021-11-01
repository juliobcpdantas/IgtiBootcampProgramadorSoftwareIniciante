# Funções 

# if, Elif, else___________________________________________________
# a = 50 
# b = 100
# c = 50 

# if a == c: 
#     print('A é igual a C')

# idade = int(input('Digite a sua idade: '))
# print(idade)
# print(type(idade))

# if idade >= 18:
#     print('Você já pode dirigir')
# elif idade < 18:
#     print('Você ainda não pode dirigir')

# exercicio = int(input('Quantos minutos você se exercita por dia: '))

# if exercicio < 30:
#     print('Você deveria se exercitar mais')
# elif exercicio >= 30 and exercicio <= 60:
#     print('Você está no caminho certo')
# elif exercicio > 60 and exercicio <= 120:
#     print('Você é um(a) atleta')
# else:
#     print('Uau, você se exercita muito')

# For_______________________________________________________________

# for i in range(1,100):
#     print(i)

# cor = ['verde', 'amarelo', 'azul', 'cinza', 'vermelho']
# for x in cor:
#     print(x)

# for i in 'pneumoultramicroscopicossilicovulcanoconiótico':
#     print(i)

# numeros = (1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
# for i in numeros:
#     print(i)
#     if i == 7:
#         break

# Range______________________________________________________________
# Range(inicio, termino, salto):

# for i in range(1, 21):
#     print(i)

# for i in range(1, 51, 10):
#     print(i)

# While_____________________________________________________________

# numero = 0
# while numero <= 99:
#     numero += 1
#     print(numero)

# num = 1

# while num < 10:
#     print(num)
#     if num == 6:
#         break
#     num += 1 

# num = 0

# while num < 21:
#     num += 1
#     if num == 12:
#         continue
#     print(num)



# Def ________________________________________________________________

# x = int(input('Digite o valor de X: '))
# y = int(input('Digite o valor de Y: '))

# def soma(x,y):
#     print(x + y)
#     return

# soma(x,y)

# continuar....

# def imc(peso, altura):
#     imc = peso/(altura**2)
#     if imc < 18.5:
#         print('Magreza')
#     elif imc >= 18.5 and imc <= 24.9:
#         print('Sobrepeso')
#     elif imc >= 25.0 and imc <= 29.9:
#         print('Normal')
#     elif imc >= 30.0 and imc <= 39.9:
#         print('Obesidade I')
#     else:
#         print('Obesidade II')
#     return

# Lambda (funçoes anônimas)______________________________________________

# soma = lambda x, y: x + y
# print(soma(10, 5))

# importaçao de modulos e pacotes________________________________________

from math import sqrt

x = int(input('Digite o numero a ser calculado a raíz quadrada: '))

raizQuadrada = sqrt(x)

print(raizQuadrada)