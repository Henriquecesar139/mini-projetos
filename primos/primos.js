num = 5 //variável com o número que deve ser analisado

mult = 0

for (let i = 2; i < num; i++) {
    if (num % i == 0) {
        mult ++
    }    
}

if (mult == 0) {
    console.log("É primo")
} else {
    console.log("Não é primo")
}
