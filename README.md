# PASOS HA EJECUTAR PARA EL FUNCIONAMIENTO DE LA APLICACION

## Herramientas a instalar

### [Java 8](https://www.java.com/es/download/help/windows_manual_download.html)

### [PostgreSQL](https://www.youtube.com/watch?v=n5Ec9bMouWQ)

### [PostgreSQL](https://www.youtube.com/watch?v=n5Ec9bMouWQ)

### [Postman](https://www.postman.com/downloads/)

### [Visual Estudio](https://code.visualstudio.com/)

## Ejecución de Proyecto

```bash
Tener en cuenta que explicación de la ejecución del proyecto se la va a realizar con el editor de texto visualStudioCode

Una vez descargado las herramientas abrimos el pgAdmin 4 y creamos nuestra base de datos.
El nombre obligatorio para la creación de la base de datos es:  vaccination

Una vez descargado el repositorio  lo abrimos en un editor de código (visualStudioCode) y esperamos que se carguen los archivos.

- Abrimos la carpeta src/main/resources y seleccionamos el archivo application.properties
Buscamos los datos:
spring.datasource.password=12345678
Donde apunta el dato 12345678 reemplazamos por la contraseña de base de datos postgres de tu computadora.
Guardamos el archivo

- Abrimos la carpeta src/main/java/com/kruger y seleccionamos el archivo BackendKrugerApplication.java
- Una vez abierto el archivo damos click derecho y se nos mostrará un panel y seleccionamos run java
- Esperamos a que el proyecto ejecute.

NOTA: Luego de realizar los procesos anteriores verificamos en Postgres si se crearon o no las tablas de la base.

- Si las tablas están creadas correctamente:
  En la carpeta raíz abrimos una carpeta llamada scripts luego abrimos el archivo insertCatalog.txt ,  copiamos todo el contenido del archivo y lo ejecutamos en postgres.

  Luego en la misma carpeta abrimos el archivo insertRol.txt, copiamos todo el contenido del archivo y ejecutamos en script en postgres.

  NOTA: la clave encriptada del usuario admin ejecutado por el script es: Pruebas.2022

```

# Abrir la colección de los servicios en postman

```bash
- Una vez que ya se ha instalado postman lo abrimos y nos mostrará una opción llamada import.
- Luegos nos aparecerá un panel y luego seleccionamos uploadFiles.
- Seleccionamos el archivo  VacunacionBackend.postman_collection.json que se encuentra en la carpeta postmancollection en la carpeta raíz del proyecto
- Luego lo importamos.
```

## Proceso de Construccion del proyecto

```bash
Mediante el proceso de construcción se utizaron las siguientes dependencias: oath2, swagger open-pi etc,

Se crearon modelos llamados Catalog, User, Rol y Employee

En los catálogos el usuario ADMIN puede:
- Crear catálogs padre e hijo.
- Obtener los catálogos por el id del padre y obtener todos los catálogos padres
- Se añadió el método delete para que se elimine permanentemente de la base de datos

- En los roles se puede agregar mediante el script los roles asignados para el proyecto.

- Tanto el User, Rol y Employee van de la mano ya que para crear un registro deben de interactuar esas 3 tablas para el guardado en la base de datos.

- Cuando se crear un empleado se realizan las respectivas validaciones de campos requeridos, email correcto y cédula de inentidad que sea ecuatorina.
- También se le asigna el valor del campo is_deleted en 0, created_at, created_by  y se crea automaticamente el usuario y contraseña en la base de datos siendo ésta la contraseña encriptada el número de cédula.
- El rol de ese usuario será el id 2 (EMPLOYEE)

- El usuario creado puede iniciar sesión obtener su token y agregarlo en el Authorization para consumir los endpoints asignados.
Si el token agregado va a interactuar con los endpoints que son para ADMIN, no lo va a permitir ya que cada endpoint pertenece a cada rol.

- Para eliminar nuestro empleado, no lo eliminamos de la manera tradicional mas bien utilizamos el borrador lógico que seteamos el campo is_deleted en 1 para este proyecto, y para consumir nuestro servicio de get  y filtros obtendrá solo los datos que el campos is_deleted sea 0

- Cuando un empleado pueda actualizar la información el campo parámetro en postman "vaccinationstatus": debe ser VACUNADO o NO_VACUNADO ya que el campo está registrado por un tipo enum y eso valida a que se deba poner obligatoriamente el valor correspondiente.

- A su vez el sistema valida que si el usuario está: VACUNADO los parámetros: vaccineDate, vaccineTypeId y doseNumber sean obligarios, si no es el caso no son obligatorios y en base se guardarán como nulos
```

## Nota

```bash
OJO Para el servicio de filtro está comentdo los parámetros a escoger solo se descomenta el filtro a tratar para que consuma.

Tener en cuenta que para guardar los catálogos y usuarios al principio va a salir error puesto que como ejecutamos scripts directo en la base de datos, el sistema añadiría desde el id 1 hasta el que sigue y mostrará un mensaje que ya existe esos ids, por eso toca ejecutar la petición hasta que responda con un ok.

LINK DE SWAGGER: http://localhost:8080/swagger-ui/index.html#/
la aplicacion se abrira por defecto en el puerto 8080

Credenciales Usuario Admin
Usuario:admin@gmail.com
Clave:Pruebas.2022

```
