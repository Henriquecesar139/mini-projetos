n = 5
n2 = n;
fat = 1;

for (let c = n; c > 0; c--) {
    fat = fat * n;
    n--;
}

console.log(n2 + "!" + " = " + fat)