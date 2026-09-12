# Buñuelos Yanelys — punto de partida

Revisión: 7 de septiembre de 2026.
Fuente: conversación «Diseño de aplicación móvil», ID `6a81d32d-30f8-83e9-915f-7bfaca8801bb`.

## Requisitos recuperados

- Una aplicación móvil con login y dos roles: administrador y domiciliario.
- Ventas en punto físico y a domicilio; productos como buñuelos con distintos rellenos, masa y jugos.
- Asignación de varios pedidos a cada domiciliario, detalle y estado del pedido.
- Por decisión del usuario, inventario, insumos y estadísticas quedan fuera del alcance. Se retiraron sus modelos y repositorios; no había código de estadísticas implementado.
- Funciones útiles y realizables sin depender de servicios externos innecesarios.

## Diseño acordado

- Identidad tradicional, casera, cuidada y elegante.
- Eslogan: «El sabor que se siente como en casa».
- Colores: marrón #582B11, crema #E7D7C9, naranja #CC5803 y dorado #FF9505.
- The Artisan para marca; Inter fue propuesta para interfaz tras elegir un estilo moderno y limpio.
- Header fijo con sección actual, menú hamburguesa e ícono de marca; navegación inferior del administrador para Inicio, Ventas y Domicilios. Se debe retirar Inventario y cualquier acceso a estadísticas del diseño; no hay archivos de interfaz móvil en este proyecto para modificar esas pantallas.
- Login con fondo limpio y formulario dentro de un cuadro grande con textura de buñuelo.
- El mensaje anterior afirma haber creado un espacio en Figma, pero no se recuperó un enlace o ID verificable del archivo.

## Estado real del proyecto

- Java 21 configurado en Maven; Java 26 disponible en este entorno.
- Spring Boot 4.1.1, Spring MVC y Spring Data MongoDB.
- MongoDB Atlas configurado mediante `spring.mongodb.uri`, propiedad comprobada en los metadatos de la dependencia instalada.
- La URI incluye credenciales directamente en application.properties. No se reproducen aquí.
- La URI termina en `/`. Tras revisar la captura de Atlas, se configuró `spring.mongodb.database=bunuelos_yanelys`. Antes de este ajuste, el archivo contenía `proyecto-movilesi` como nombre de base.
- POST /api/usuarios guarda UserModel en la colección usuarios.
- UserModel contiene id entero, producto (arreglo), cantidad global, imagen y fecha textual. No representa un usuario con autenticación ni una venta completa.
- El guardado usa save: reutilizar un ID puede actualizar un documento existente.
- Existen los modelos Cuenta, Producto, Venta y Domicilio y sus cuatro repositorios MongoRepository. Todavía no tienen servicios de negocio ni controladores propios; UserServices está vacío y no hay permisos por rol implementados.
- No se encontraron archivos de frontend móvil en esta carpeta.
- No hay PostgreSQL ni Prisma en las dependencias. Su propuesta no está confirmada y no constituye una decisión de arquitectura.

## Verificación y siguiente paso

Se revisaron fuentes, dependencias, configuración y metadatos locales. No se modificaron datos de Atlas ni se verificó una conexión autenticada. Las pruebas no llegaron a ejecutarse: el wrapper falló al arrancar y la ejecución directa de Maven intentó usar un repositorio local inaccesible en C:\.m2\repository.

La base configurada es `bunuelos_yanelys`. El usuario mostró una captura con conexión al clúster, pero no se ha comprobado aquí el acceso a los datos. Por instrucción del usuario, el trabajo actual se limita a las clases: no iniciar la aplicación ni realizar conexiones. Mantener Spring Boot y MongoDB como punto de partida. Venta ya contiene líneas con cantidad y precio por producto; quedan pendientes los servicios que validen datos y calculen totales. Inventario y estadísticas quedan excluidos del desarrollo.
