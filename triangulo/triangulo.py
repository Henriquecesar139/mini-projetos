lado1 = int (input("Digite o primeiro lado: "))
lado2 = int (input("Digite o segundo lado: "))
lado3 = int (input("Digite o terceiro lado: "))


if lado1 + lado2 < lado3 or lado2 + lado3 < lado1 or lado1 + lado3 < lado2:
    print('Não é um triângulo')
elif lado1 == lado2 and lado1 == lado3:
    print('Equilátero')
elif lado1 == lado2 or lado1 == lado3 or lado3 == lado2:
    print('Isósceles')
else:
    print('Escaleno')
