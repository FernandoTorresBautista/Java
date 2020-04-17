# Java
Recordatorio general de Java <br>
Jdk 1.8 +
Maven 3.6.3 +
JUnit 4.12 +
Tomcat 7.0.47
<br>
El desarrollo tiene un orden de prioridad dependiendo de los conceptos

## 1. proyectoMaven1
Proyecto Maven Jar<br>
Pruebas Unitarias <br>
Uso de JUnit a traves de una operación simple

## 2. proyectoMavenWar1
Proyecto Maven War<br>
Uso de JSP

## 3. ServletJsp
Proyecto Web MVC<br>
Creado usando Dynamic Web Project. <br>
Consta de 3 capas modelo, controlador y vista. <br>
El modelo consta de una simple operacion.<br>
El controlador consta de una extensión de la clase HttpSevlet y sobrescribe el metodo doGet para servilo en la vista index.html
Modificamos el web.xml para agregar el servlet y su respectivo mapping a url y el serlet.
WebContent contiene sólo dos archivos, uno que es el index, y otro con el resultado(usa JSP).

