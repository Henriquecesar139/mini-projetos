n = int (input("Digite um número: "))
n2 = n
fat = 1

for c in range(n, 0, -1):
    fat = fat * n
    n = n - 1

print(f'{n2}! = {fat}')