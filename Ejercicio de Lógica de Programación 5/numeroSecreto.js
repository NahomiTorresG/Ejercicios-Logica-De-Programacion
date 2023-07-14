var resultado;
var arr = [];
var i = 0;
var key = 77;

do {
    const numero = prompt("Ingresa un numero del 1 al 100");

    // Verificamos si el valor ingresado es un numero valido
    while (isNaN(numero)) {
        //si no es numero, volvemos a pedir un numero valido por el prompt
        numero = prompt("El valor ingresado no es válido. Por favor, ingrese un número válido.");
    }



    //Tenemos que convertir el numero a entero por si el usuario inserta decimales:
    const valor = parseInt(numero);


    if (valor > 0 && valor < 100) {
        if (valor == 77) {
            console.log("¡Felicidades! Adivinaste el número secreto.");
            console.log(arr);
            resultado = true;
        } else {
            console.log("Ups! El número secreto es incorrecto, vuelve a intentarlo.");
            arr[i] = valor;
            i++;
            resultado = false;
        }

    } else {
        console.log("Ingresa un valor entre el 1 y el 100.");
        arr[i] = valor;
        i++;
        resultado = false;
    }

}

while (resultado == false);