//Declaramos las variables que vamos a pedir por el prompt

const numero1 = prompt("Ingrese un número: ");
const numero2 = prompt("Ingrese un número: ");
const numero3 = prompt("Ingrese un número: ");

//vamos a pasar los string ingresados en el prompt a números
numero1 = parseInt(numero1);
numero2 = parseInt(numero2);
numero3 = parseInt(numero3);

//Ver si los numeros son iguales
if (numero1 === numero2 && numero2 === numero3){
    console.log("¡Tus números son iguales!");
    document.getElementById("numeros").innerHTML += "<p>¡Tus números son iguales!</p>"
} else {
    //Ordenar los números de mayor a menor
    var numerosOrdenadosDesc = [numero1, numero2, numero3].sort(function(a, b) {
        return b - a;
    });

    //Ordenar los numeros de menor a mayor
    var numerosOrdenadosAsc = [numero1, numero2, numero3].sort(function(a, b) {
        return a- b;
    });

    console.log(numerosOrdenadosDesc.join(", "));
    console.log(numerosOrdenadosAsc.join(", "));

    //Mostrar los numeros ordenados en el DOM
    document.getElementById("numeros").innerHTML += "<p>" + numerosOrdenadosDesc.join(", ") + "</p";
    document.getElementById("numeros").innerHTML += "<p>" + numerosOrdenadosAsc.join(", ") + "</p";
}