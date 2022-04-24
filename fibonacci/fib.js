n = 8 //Quantidade de termos

t1 = 0
t2 = 1

for (let i = 0; i < n; i++) {
    console.log(t1)
    t3 = t2
    t2 = t1 + t2
    t1 = t3    
    
}