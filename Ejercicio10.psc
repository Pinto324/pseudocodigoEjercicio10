Algoritmo Ejercicio10
	Multiplicacion <- 0
	Mientras Suma<1000 Hacer
		Escribir 'Ingrese un numero'
		Leer Num
		Suma <- Suma+Num
		Resta <- 1000-Suma
		Escribir 'Disponible ',Resta
		Si Num MOD 6=0 Entonces
			Multiplicacion <- Multiplicacion+1
		FinSi
		Si Num>=1 Y Num<=10 Entonces
			sumab <- sumab+Num
		FinSi
	FinMientras
	Escribir ' a) La cantidad de numeros multiplos de 6 son: ',Multiplicacion
	Escribir ' b) La suma entre 1 a 10 es: ',sumab
FinAlgoritmo
