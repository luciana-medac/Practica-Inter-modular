## DOCUMENTACIÓN DE LA BASE DE DATOS EN LA NUBE

Entramos en el servicio de Aurora and RDS y creamos una base de datos, en MySQL

![Captura de pantalla 2025-05-22 124802](https://github.com/user-attachments/assets/d9ac518f-fa9e-4065-9a92-9c5bd96cfa19)

Creamos un grupo de seguridad de Workbench donde estableceremos una regla de entrada para que entre todo el tráfico. Este grupo se añadirá
a la base de datos, modificandola y seleccionando este grupo.

![Captura de pantalla 2025-05-22 124852](https://github.com/user-attachments/assets/fa465754-8912-443a-9c62-cbef9a3c3033)

Abrimos la aplicación de MySQL Workbench, en la pestaña de DataBase > Connect to Database. Nos aparecerá la siguiente pestaña:
 - Strored Connections --> dejamos la opción vacía
 - Hostname --> el punto de enlace de nuestra base de datos en AWS
 - Username --> admin (o el nombre de usuario que se le haya establecido al crear la BD)

![Captura de pantalla 2025-05-22 125104](https://github.com/user-attachments/assets/5aef5df6-b477-48d7-badc-d90ba7e02436)

Ya tendríamos la BD de datos conectada, ahora podríamos utilizarla en nuestro programa Java

![image](https://github.com/user-attachments/assets/134e5aaa-2691-4a7c-b4ee-dedb4fb854cb)

