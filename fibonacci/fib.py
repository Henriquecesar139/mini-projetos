n = int (input('Digite a quantidade de termos: '))

t1 = 0
t2 = 1

for c in range(n):
    print(t1)
    t3 = t2
    t2 = t1 + t2
    t1 = t3