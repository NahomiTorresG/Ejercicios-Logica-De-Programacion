//Solicitamos la temperatura
const temperaturaCelsius = prompt("Ingrese su temperatura en grados Celsius, por favor.");


// Verificamos si el valor ingresado es un numero valido
while (isNaN(temperaturaCelsius)) {
    //si no es numero, volvemos a pedir un numero valido por el prompt
  temperaturaCelsius = prompt("El valor ingresado no es válido. Por favor, ingrese la temperatura en grados Celsius.");
}

//Convertimos la temperatura de Celsius a Fahrenheit y Kelvin
var temperaturaFahrenheit = (temperaturaCelsius * 9 / 5) + 32;
var temperaturaKelvin = parseFloat(temperaturaCelsius) + 273.15;

//Mostramoos los resultados en la consola
console.log("Grados Fahrenheit: " + temperaturaFahrenheit);
console.log("Grados Kelvin: " + temperaturaKelvin);