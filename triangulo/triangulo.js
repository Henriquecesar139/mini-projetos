lado1 = 5
lado2 = 5
lado3 = 5

if (lado1 + lado2 < lado3 || lado2 + lado3 < lado1 || lado1 + lado3 < lado2) {
    console.log("Não é um triângulo\n")
}

else if(lado1 == lado2 && lado1 == lado3) {
    console.log("Equilátero\n")
}

else if(lado1 == lado2 || lado1 == lado3 || lado3 == lado2) {
    console.log("Isósceles\n")
}

else {
    console.log("Escaleno\n")
}