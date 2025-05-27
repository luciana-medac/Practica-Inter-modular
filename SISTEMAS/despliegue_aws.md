## CREACIÓN DE LA INSTANCIA EN AWS

Entramos en el laboratorio AWS. Desde aquí nos dirigimos al servicio EC2 que se encarga de las instancias.

Una vez en esta ventana, haremos clic en lanzar instancia:

![Captura de pantalla 2025-05-22 125207](https://github.com/user-attachments/assets/e78ff61b-f975-4331-9127-315191110d03)

Elegiremos el sistema operativo de Ubuntu

![Captura de pantalla 2025-05-22 125332](https://github.com/user-attachments/assets/9b538e50-0404-4873-8ce9-d3ab03605479)

Dejaremos todo por determinado y en el apartado de 'Par de claves' elegiremos *vockey* 

![image](https://github.com/user-attachments/assets/edf14015-1c18-41cb-ad51-809656affa65)

Seguidamente veremos la configuración de 'Firewall (grupos de seguridad)' donde dejaremos por defecto *Crear grupo de seguridad* y a la hora de permitir el tráfico seleccionaremos las tres opciones, tanto de SSH como de HTTPS y HTTP

![image](https://github.com/user-attachments/assets/99cb2e67-faf2-4aa8-96bd-cd2026411085)

Finalmente lanzamos la instancia

![Captura de pantalla 2025-05-22 125524](https://github.com/user-attachments/assets/d401a3eb-0265-466f-b0b6-3ff428a00d44)


## INSTALACIÓN DEL SERVIDOR WEB

Para conectarnos desde SSH desde el laboratorio AWS descargamos tanto el .ppk como el .pem

![Captura de pantalla 2025-05-22 125611](https://github.com/user-attachments/assets/74444b4d-56d1-4f68-bbb4-5ad1b8e9d3cc)

Estos pares de llaves los guardaremos en una carpeta llamada *vockey* 

![Captura de pantalla 2025-05-22 125628](https://github.com/user-attachments/assets/1a9efb13-2883-4945-b856-f5cc77edd71a)

Tendriamos dos formas de acceder:
  1. Abriendo la carpeta desde el cmd y copiando de la instancia su DNS público
  2. Desde la aplicacion PUTTY

Hemos elegido la segunda opción, por lo que al abrir la aplicación nos dirigimos a *Connection* > *SSH* > *Auth* > *Credentials*

![Captura de pantalla 2025-05-22 125650](https://github.com/user-attachments/assets/a06bba83-be9e-44ec-a067-0f3a95482adc)

Volvemos al apartado de *Session* donde ingresaremos la dirección IPv4 pública de la instancia

![Captura de pantalla 2025-05-22 125919](https://github.com/user-attachments/assets/ca4bf00a-242d-4711-88c0-9900e6ab5596)

Finalmente nos conectamos con el usuario ubuntu

![Captura de pantalla 2025-05-22 125943](https://github.com/user-attachments/assets/efadeae3-2020-4dc6-9fd4-0107a6a34f94)

Dentro de la terminal, escribiremos los comandos:

  - **sudo update** --> para actualizar los repostorios
  - **sudo apt install tasksel** --> instalar la herramienta

Una vez instalado, ejecutamos: 
  - **sudo tasksel** --> lanzamos la herramienta

Aparecerá el siguiente menú, en el que elegiremos la opcion de Web Server. Para seleccionarla lo haremos con la barra espaciadora y para confirmarlo Tab + Enter

![Captura de pantalla 2025-05-22 130226](https://github.com/user-attachments/assets/0c378d92-0e97-415b-86e3-3a1676d593a2)

## ESTRUCTURA DE ARCHIVOS DESPLEGADA

Descargamos la aplicacion de WinSCP. Y una vez iniciada la aplicación:
 - Seleccionamos el protocolo: SFTP
 - Pegamos la direccion IPv4 pública de la instancia
 - Escribimos las credenciales correspondientes

![image](https://github.com/user-attachments/assets/f820954c-e3df-4e9a-8940-112bbcf4ab3f)

Haremos clic en la opción de Avanzado... 
En esta ventana nos dirigiremos a SSH > Autenticación y en el apartado de *Archivo de clave privada* pondremos la ruta de la carpeta donde tenemos nuestro archivo .ppk que descargamos anteriormente

![image](https://github.com/user-attachments/assets/518ff6c9-10b2-434e-8a28-cc278db8d005)


Una vez conectado, nos dirigimos por una parte al sitio donde tenemos la carpeta de la página web en local y por otra parte a la carpeta /home/ubuntu donde guardaremos la carpeta con nuestra página web

![image](https://github.com/user-attachments/assets/117f2f20-0a5b-467f-a65f-a7aa1f3d0455)


Volvemos a la terminal, donde copiaremos nuestra carpeta a la carpeta de /var/www/html, ya que si lo hacemos de la forma anterior, no nos dejaría por permisos. Escribimos el siguiente comando:
  - sudo cp -r /home/ubuntu/carpeta_proyecto /var/www/html

![image](https://github.com/user-attachments/assets/93691f2d-91b2-4505-8e30-b5c5f97d1b60)
![image](https://github.com/user-attachments/assets/b90ae76c-cd0c-493e-832a-548727bef3e9)


## PÁGINA WEB DESDE EL NAVEGADOR

Si introducimos en el navegador la dirección IPv4 pública de la instancia y establecemos la ruta de la carpeta, nos aparecería correctamente la página web:

![image](https://github.com/user-attachments/assets/b5eb4ffa-3ca5-49b2-932c-1be500dcf9e8)





















