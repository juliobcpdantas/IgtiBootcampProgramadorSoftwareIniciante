# Aula de Python 

# tipos de dados
'''
String
Integer
Float
Boolean
'''

e = 2e3 # exponencial 10
print(type(e))
print(e)

# list [] ordenada e mutável, pode dados duplicados
# tuple () ordenada e imutável, pode dados duplicados
# set {} ordenada e desindexada, sem dados duplicados
# Dictionary {'a':'aa', 'b':'bb', 'c':'cc'} desordenada e mutável, sem dados duplicados

listaDeCompras = ['a', 'b', 'c', 'd']
print(listaDeCompras)

# list (Arrays) * Trab. Prático
frutas = ['banana', 'laranja', 'abacate', 'melancia', 'caju', 'abacaxi']
saldoAlunos = [500.00, 1200.00, 1000.00, 600.00, 50000.00]
numPaciente = [25, 35, 50, 45, 22, 33, 89]

print(frutas)
print(saldoAlunos)
print(numPaciente)


frutasDuplic = ['banana', 'laranja', 'abacate', 'melancia', 'caju', 'abacaxi', 'banana', 'laranja', 'abacate', 'melancia', 'caju', 'abacaxi']
print(frutasDuplic)

print(len(saldoAlunos), len(numPaciente), len(numPaciente),)

print(frutas[0], frutas[5])

frutas.append('morangos')
print(frutas)

saldoAlunos.extend(numPaciente)
print("saldoAlunos + numPaciente: ", saldoAlunos)

# tuples

frutas2 = ('banana', 'laranja', 'abacate', 'melancia', 'caju', 'abacaxi')
saldoAlunos2 = (500.00, 1200.00, 1000.00, 600.00, 50000.00)
numPaciente2 = (25, 35, 50, 45, 22, 33, 89)

print(frutas2[1])

print(frutas2[1:4])

tupleJuntos = frutas2 + numPaciente2
print(tupleJuntos)

print(type(tupleJuntos))

numPacientex = (25, 35, 50, 45, 22, 33, 89, 35, 50, 45, 22, 33, 89, 35, 50, 45, 22, 33, 89,
35, 50, 45, 22, 33, 89, 35, 50, 45, 22, 33, 89, 35, 50, 45, 22, 33, 89, 35, 50, 45, 22, 33, 89, 
35, 50, 45, 22, 33, 89, 35, 50, 45, 22, 33, 89, 35, 50, 45, 22, 33, 89, 35, 50, 45, 22, 33, 89, 
35, 50, 45, 22, 33, 89, 35, 50, 45, 22, 33, 89, 35, 50, 45, 22, 33, 89, 35, 50, 45, 22, 33, 89, 
35, 50, 45, 22, 33, 89)

print(numPacientex.count(89))

# sets

cidades = {'Belo Horizonte', 'Manaus', 'Fortaleza', 'Natal'}
print(type(cidades))
print(cidades)

cidadeRepeat = {'Belo Horizonte', 'Manaus', 'Fortaleza', 'Natal',
'Belo Horizonte', 'Manaus', 'Fortaleza', 'Natal',
'Belo Horizonte', 'Manaus', 'Fortaleza', 'Natal',
'Belo Horizonte', 'Manaus', 'Fortaleza', 'Natal',
'Belo Horizonte', 'Manaus', 'Fortaleza', 'Natal',
'Belo Horizonte', 'Manaus', 'Fortaleza', 'Natal',
'Belo Horizonte', 'Manaus', 'Fortaleza', 'Natal'}

print(cidadeRepeat)

print('Manaus' in cidades)
print('Recife' in cidades)

cidades.add('Porto Alegre')
print(cidades)

cidades2 = {'Recife', 'Salvador', 'Campo Grande'}
cidades.update(cidades2)

print(cidades)

# Dictionary

codUf = {
    21 : 'Maranhão',
    22 : 'Piauí',
    23 : 'Ceará',
    24 : 'Rio Grande do Norte',
    25 : 'Paraíba',
    26 : 'Pernambuco',
    27 : 'Alagoas',
    28 : 'Sergipe',
    29 : 'Bahia'
}


print(type(codUf))

print(codUf)


print(codUf.values())

codUfDuplic = {
    21 : 'Maranhão',
    22 : 'Piauí',
    23 : 'Ceará',
    24 : 'Rio Grande do Norte',
    25 : 'Paraíba',
    26 : 'Pernambuco',
    27 : 'Alagoas',
    28 : 'Sergipe',
    29 : 'Bahia',
    21 : 'Maranhão',
    22 : 'Piauí',
    23 : 'Ceará',
    24 : 'Rio Grande do Norte',
    25 : 'Paraíba',
    26 : 'Pernambuco',
    27 : 'Alagoas',
    28 : 'Sergipe',
    29 : 'Bahia'
}

print(codUfDuplic)

print(
    codUf.get(22)
)

print(
    codUf.keys()
)

codUf[30] = 'Estado Vira-lata Caramelo'

print(codUf)
