//Solicitamos el numero en el prompt
const numero = prompt("Ingrese el número del cual quiere calcular su factorial, por favor.");


// Verificamos si el valor ingresado es un numero valido
while (isNaN(numero)) {
    //si no es numero, volvemos a pedir un numero valido por el prompt
  numero = prompt("El valor ingresado no es válido. Por favor, ingrese un número válido.");
}


//Tenemos que convertir el numero a entero por si el usuario inserta decimales:
numero = parseInt(numero);

//Calculamos el factorial del numero utilizando un for
var factorial = 1;
for (var i = 1; i <= numero; i++) { //multiplicamos cada entero desde 1 hasta el valor ingresado
    factorial *= i;
}


//Imprimimos el resultado en consola
console.log(factorial);