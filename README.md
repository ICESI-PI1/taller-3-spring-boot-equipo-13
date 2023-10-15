# Informe Taller de Desarrollo con Spring Boot y JWT

**Video demostracion del proyecto:** https://youtu.be/aW78n1uYKcU 

**Integrantes:**

- Juan Jose Diaz Parra - A00381098
- Mateo Silva Lasso - A00382277
- Luis Eduardo Charria - A00381789

## Introducción

En este informe, presentaremos los resultados y avances obtenidos durante el taller de desarrollo de una aplicación utilizando Spring Boot. El objetivo del taller consistió en crear una API REST para gestionar libros y autores, además de implementar un sistema de autenticación utilizando JSON Web Tokens (JWT). A lo largo del informe, describiremos las etapas de desarrollo, las soluciones implementadas y las dificultades encontradas.

## Desarrollo de la Aplicación

### Paso 1: Iniciar un Nuevo Proyecto Spring Boot

La primera etapa del taller consistió en iniciar un nuevo proyecto Spring Boot utilizando Spring Initializr. Se configuraron las dependencias necesarias, incluyendo Spring Web y JWT.

### Paso 2: Definir Entidades y Relaciones

Se definieron las entidades "Autor" y "Libro" junto con sus relaciones. La entidad "Autor" incluye atributos como id, nombre y nacionalidad. La entidad "Libro" incluye id, título, fecha de publicación y una relación con el autor.

### Paso 3: Crear Repositorios, Servicios y Controladores

Se procedió a la creación de los repositorios, servicios y controladores necesarios para las entidades "Autor" y "Libro". Esto permitió la manipulación de datos y la exposición de los endpoints requeridos.

### Paso 4: Implementar Endpoints

Se implementaron los siguientes endpoints para gestionar las operaciones CRUD en las entidades:

**Autor:**
- `GET /autores`: Listar todos los autores.
- `GET /autores/{id}`: Obtener detalles de un autor específico.
- `POST /autores`: Crear un nuevo autor.
- `PUT /autores/{id}`: Actualizar un autor existente.
- `DELETE /autores/{id}`: Eliminar un autor.
- `GET /autores/{id}/libros`: Listar los libros de un autor específico.

**Libro:**
- `GET /libros`: Listar todos los libros.
- `GET /libros/{id}`: Obtener detalles de un libro específico.
- `POST /libros`: Crear un nuevo libro.
- `PUT /libros/{id}`: Actualizar un libro existente.
- `DELETE /libros/{id}`: Eliminar un libro.

### Paso 5: Implementar Autenticación JWT

Se desarrolló un sistema de autenticación utilizando JSON Web Tokens (JWT). Esto incluyó la creación de un endpoint `POST /auth` que recibe un nombre de usuario y contraseña y devuelve un token JWT si las credenciales son válidas.

### Paso 6: Seguridad en Endpoints

Se configuró la seguridad en los endpoints para que todos requieran un token JWT válido, excepto el endpoint `/auth`. Esto garantiza que solo los usuarios autenticados puedan acceder a las operaciones.

### Paso 7: Pruebas

Se realizaron pruebas exhaustivas utilizando Postman para verificar el funcionamiento de los endpoints y la autenticación.

## Dificultades en el Desarrollo

A lo largo del taller, se encontraron desafíos que requerían investigación y resolución. Algunas de las dificultades notables incluyeron:

- Configuración de seguridad: Configurar la seguridad en Spring Boot, especialmente para requerir un token JWT en los endpoints, fue un desafío que se superó con la revisión de la documentación y pruebas exhaustivas.

- Integración de JWT: La integración de JWT y la generación de tokens JWT válidos requerían una comprensión profunda de los conceptos de autenticación.

- Relaciones de entidades: Definir y gestionar las relaciones entre las entidades "Autor" y "Libro" planteó un desafío adicional en el diseño de las entidades y los repositorios.

## Conclusiones Generales

El equipo considera que el taller ha sido una experiencia valiosa que ha ampliado su conocimiento en el desarrollo de aplicaciones con Spring Boot y la implementación de autenticación JWT. Las conclusiones generales son las siguientes:

1. **Conocimiento de Spring Boot**: El equipo demostró un buen conocimiento de Spring Boot al lograr desarrollar una aplicación que cumple con los requisitos de una API REST y autenticación JWT.

2. **Modelado de Entidades y Relaciones**: Se ha adquirido una comprensión sólida en el modelado de entidades y relaciones, lo que es fundamental en el desarrollo de aplicaciones.

3. **Implementación de Endpoints**: La implementación de endpoints y operaciones CRUD se ha logrado siguiendo estándares RESTful, permitiendo la manipulación eficiente de datos.

4. **Éxito en la Implementación de JWT**: La implementación de autenticación JWT se ha logrado con éxito, reforzando el entendimiento de la seguridad en aplicaciones web.

El equipo considera este taller como una preparación sólida para enfrentar proyectos más desafiantes en el futuro, y se siente satisfecho con los resultados obtenidos.
