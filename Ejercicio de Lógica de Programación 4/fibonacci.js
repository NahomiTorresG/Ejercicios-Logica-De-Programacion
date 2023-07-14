//Solicitamos el numero en el prompt
const numero = prompt("Ingrese la cantidad de dígitos que desea ver de la serie Fibonacci, por favor.");


// Verificamos si el valor ingresado es un numero valido
while (isNaN(numero)) {
    //si no es numero, volvemos a pedir un numero valido por el prompt
  numero = prompt("El valor ingresado no es válido. Por favor, ingrese un número válido.");
}

//Tenemos que convertir el numero a entero por si el usuario inserta decimales:
numero = parseInt(numero);

//Calculamos la serie fibonacci con for (La secuencia de Fibonacci es una sucesión infinita de números naturales. Esta serie numérica empieza con 0 y 1, siguiendo con la suma de los dos números anteriores hasta el infinito: 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233.)
var fibonacci = [0, 1];  //Creamos un array llamado fibonacci con los dos primeros numeros de la serie (0 y 1), y se establecen como punto de partida
for (var i = 2; i < numero; i++) {
    fibonacci[i] = fibonacci [i - 1] + fibonacci[i - 2]; //generamos los numeros de la serie sumando los dos numeros anteriores
}


//Imprimimos la serie en consola
console.log(fibonacci.join(", "));