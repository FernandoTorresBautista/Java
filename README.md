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


## 4. proyectoWebMyBatis
myBatis en Web Project eclipse. Librerias mysql y mybatis.<br>
En Base de datos crear una DB con nombre:"batistest" y agregar algunos registros de ejemplo.<br>
Se configuran los parámetros de acceso a la base de datos en mybatis-config.xml en WebContent->WEB-INF.<br>
Se agrega una consulta usando un servlet para listar clientes de ejemplo cómo controlador. Agregar los mappers ClienteMapper.xml y ClienteMapper.java la interface que define el método que se ha mapeado en el xml.<br>
Se define el método del servlet para la consulta, y por último; Mapear mybatis en web.xml donde se agrega el servlet y su mapping.

## 5. MvnSpring
Proyecto integrando Maven, MyBatis, Spring, JSF y Primefaces. Además de la optimización con el patrón singleton. <br>
- spring core|web +v3.1, jsf +v2.15, primefaces +v5.1, junit v4.12
- Implementación en 3 capas,
  - Presentacíon 
  - Servicio y 
  - Persistencia

Usando la DB del proyecto 4 y sin cambiar nada. <br>
En general se tienen 2 métodos, listar y actualizar. <br>
Se agrega el paquete de DAO en sus repectivos class e interfaz. <br>
Se agrega el paquete de service en sus repectivos class e interfaz. <br>
Se agrega el paquete managedBean para los elementos de entrada y salida de la vista. <br> 
Se agrega MyBatisSqlSessionFactorySingleton en un nuevo paquete db.util para mejorar la comunicación entre daos y mappers. <br>
Se pueden apreciar 3 vistas simples usando primefaces, e implementando los métodos del managedBean. <br>
Por últumo, en web.xml, se mapea Jsf, el contexto en este caso Development para mi local y por último spring. <br>

## patronDecorador
Ejemplo de clases abstractas usadas para aplicar un patrón decorador de bebidas.

## 








###### Java Maven JSP Spring MyBatis JSF PrimeFaces
