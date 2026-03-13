Calculator TDD Project
Descripción
Este proyecto es una aplicación de Calculadora desarrollada utilizando principios de Desarrollo Guiado por Pruebas (TDD).
El objetivo es asegurar que la aplicación sea robusta, mantenible y cumpla con los requisitos mediante la creación de pruebas antes de implementar la lógica.
Incluye operaciones básicas, funciones avanzadas (si se implementan) y una estructura clara orientada a buenas prácticas.

Características
- Operaciones aritméticas básicas: suma, resta, multiplicación y división.
- Funciones avanzadas: raíz cuadrada, exponenciación (si se añaden).
- Menú interactivo por consola.
- Cobertura de pruebas completa con JUnit 5.
- Código estructurado siguiendo principios SOLID.

Instalación
Para instalar el proyecto, sigue estos pasos:
- Clona el repositorio:
git clone https://github.com/Suso777/Calculadora-TDD.git
- Entra en el directorio del proyecto:
cd Calculadora-TDD
- Compila el proyecto con Maven:
mvn clean install



Uso
Para ejecutar la aplicación, utiliza:
mvn exec:java -Dexec.mainClass="org.example.Main"


Ejemplo de ejecución
=== CALCULADORA TDD ===

1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Opción: 1

Introduce el primer número: 10
Introduce el segundo número: 5

Resultado: 15



Ejemplo visual (GIF)
(GIF ilustrativo de un menú interactivo en consola)
https://media.giphy.com/media/gF6jKxM8od8xO/giphy.gif

Testing
Ejecuta los tests con:
mvn test


Asegúrate de que todas las pruebas pasen antes de desplegar o publicar la aplicación.
GIF representando tests pasando
https://media.giphy.com/media/g9582DNuQppxC/giphy.gif
Captura real
Añade aquí tu captura de IntelliJ con todos los tests en verde.


Estructura del proyecto
Calculadora-TDD/
├── pom.xml
├── README.md
└── src
    ├── main
    │   └── java
    │       └── org
    │           └── example
    │               ├── Calculadora.java
    │               └── Main.java
    └── test
        └── java
            └── org
                └── example
                    └── CalculadoraTest.java



Capturas de pantalla
[Parece que el resultado no era seguro para mostrar. ¡Cambiemos de enfoque y probemos algo diferente!]
Añade aquí tus capturas para mostrar el funcionamiento de la aplicación.


Licencia
Este proyecto está bajo la licencia MIT — consulta el archivo LICENSE.md para más detalles.
