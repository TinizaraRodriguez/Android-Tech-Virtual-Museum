# Tech Virtual Museum  :classical_building:

Aplicación dirigida a los usuarios del Tech Virtual Museum mediante la cual podrán escanear diferentes códigos que se encuentran al lado de los diversos objetos del museo. 
Tras el escaneo podrán visualizar información acerca del objeto así como reproducir un vídeo explicativo y/o realizar un comentario.

Asimismo, se centraliza el resto de acciones como la compra de las entradas, conocer sobre las diferentes charlas o seminarios que se impartirán en el museo y comprar los tickets para acudir a esas charlas desde la propia aplicación.


## :ok: Estado del proyecto
Proyecto finalizado 


## :white_check_mark: Tecnologías
* <img src="https://logo-download.com/wp-content/data/images/svg/Kotlin-logo.svg" alt="Kotlin" width="30"/> **Kotlin** - lenguaje de programación usado en el desarrollo de la aplicación

* <img src="https://cdn-icons-png.flaticon.com/512/226/226777.png" alt="Java" width="32"/> **Java** - usado para desarrollar las clases adapter usadas como intermediario entre la clase principal y la base de datos

* <img src="https://cdn.worldvectorlogo.com/logos/android-studio-1.svg" alt="AndroidStudio" width="34"/> **Android Studio** - como entorno de desarrollo único y principal para la versión en android

* <img src="https://miro.medium.com/max/400/1*JktK87FL_sqDDnuxHxe6Fw.png" alt="Firebase" width="32"/> **Firebase** - plataforma de Google que nos ofrece diferentes servicios divididos en módulos para desarrollar aplicaciones

* <img src="https://s3.amazonaws.com/cdn.hotglue.xyz/images/logos/firebase-auth.png" alt="Firebase Auth" width="32"/> **Firebase Auth** - nos ofrece servicios de registro y validación de los inicios y registro de sesión de los usuarios

* <img src="https://miro.medium.com/max/304/1*BXaq7UZ-QoMH0vF0Znjy0A.jpeg" alt="Firestore" width="30"/> **Firestore** - base de datos donde nos encontramos con las diferentes colecciones que almacenan los registros de usuarios, la informacion de los eventos y productos, los eventos que han sido comprados...

* <img src="https://camo.githubusercontent.com/67656699cd98f4b08399428e139231613d62ffb92b43ae8c9d412ad031167f43/68747470733a2f2f75706c6f61642e77696b696d656469612e6f72672f77696b6970656469612f636f6d6d6f6e732f7468756d622f342f34662f596f75547562655f736f6369616c5f77686974655f7371756972636c652e7376672f3132303070782d596f75547562655f736f6369616c5f77686974655f7371756972636c652e7376672e706e67" alt="api youtube" width="30"/> **API Youtube** - Permite añadir funciones de YouTube a la aplicación móvil. En esta app, nos permite mostrar vídeos de los objetos escaneados.

* <img src="https://user-images.githubusercontent.com/56322714/212765471-d7e278e0-85ee-4e7c-bdfb-dfb72dace9b0.png" alt="jira" width="30"/> **Jira** - Software para ayudar al equipo a gestionar el trabajo de desarrollo de la aplicación.



## :wrench: Instalación
El usuario que desee probar la aplicación sólo tiene que acceder al directorio *Documentation* donde ademas de los diferentes códigos QR para los objetos que pertenecen al museo, y de los enlace a la presentación tanto en formato video como en powerpoint, se encontrará con otro directorio denominado *Executables*. Es en éste donde se encuentra ubicado el apk que tiene que descargarse e instalar en su dispositivo android.

Al ser un archivo con extension .apk y no encontrarse en una tienda oficial de descarga de aplicaciones como es la Google Play Store, puede que exista la posibilidad de que le avise de que debe habilitar el permiso de *instalación de aplicaciones de origen desconocido* en su telefono. Tras habilitarlo, solo quedará instalar la aplicación y comenzar a utilizarla.

Para probar la funcionalidad del escaner, se adjunta a continuación algunos de los códigos referentes a los objetos que se pueden encontrar en el museo
<p align="center">
<img width="287" alt="Captura de Pantalla 2022-12-15 a las 1 00 04 p  m" src="https://user-images.githubusercontent.com/56322714/212767054-73b2a1b7-ad8f-4efd-bf5f-cb489e8c2772.png">
<img width="276" alt="Captura de Pantalla 2022-12-15 a las 1 00 20 p  m" src="https://user-images.githubusercontent.com/56322714/212767057-75893fe3-9c63-413d-975c-33012bd1d2e5.png">
<img width="273" alt="Captura de Pantalla 2022-12-15 a las 1 00 37 p  m" src="https://user-images.githubusercontent.com/56322714/212767058-f30602f6-a123-4487-8e5b-4b6643ff0719.png">
<img width="275" alt="Captura de Pantalla 2022-12-15 a las 1 00 49 p  m" src="https://user-images.githubusercontent.com/56322714/212767059-b172cab7-ac50-416d-bb31-2c7cf62187bd.png">
<img width="285" alt="Captura de Pantalla 2022-12-15 a las 1 00 59 p  m" src="https://user-images.githubusercontent.com/56322714/212767061-3f9b25ca-f02f-4d9f-acb3-4f90a3a5f4b6.png">
  </p>



## :hammer:Funcionalidades del proyecto
- `Funcionalidad 1`: Registro y autenticación de los usuarios mediante formularios que estan respaldados por validacion de los campos a traves de expresiones regulares y Firebase Auth

 <img align="center" width="200" src="https://user-images.githubusercontent.com/72140889/212721152-26ec0c1a-5229-4b73-8b69-73f039178224.png" />


- `Funcionalidad 2`: Visualización y edición de la informacion personal del usuario 
<p>
 <img align="center" width="200" src="https://user-images.githubusercontent.com/72140889/212721395-a256be45-798a-4d7f-9289-e0a81d06bb8d.png" />

 <img align="center" width="200" src="https://user-images.githubusercontent.com/72140889/212721364-56229a52-b1ee-40c9-acdc-e2a2ccd51e51.png" />
<p>


- `Funcionalidad 3`: Reseteo de la contraseña en caso de que al usuario se le haya olvidado haciendo uso de Firebase Auth como proveedor de los servicios
<p>
  <img align="center" width="200" src="https://user-images.githubusercontent.com/72140889/212722858-4af46486-0597-4592-9740-c390135a7c9f.jpg" />
<p>


- `Funcionalidad 4`: Mapa interactivo para conocer y crear ruta hasta la localizacion del museo que hace uso de la libreria de Google Maps
<p>
  <img align="center" width="200" src="https://user-images.githubusercontent.com/72140889/212723573-1e6f7e9e-de01-4451-aff3-83cf7e05a037.png " />
<p>


- `Funcionalidad 5`: Compra de las entradas para el museo, con las actividades que lo componen: seleccion de fecha y hora, seleccion de entradas acorde a la edad y situacion laboral del usuario, muestra de informacion personal del usuario asi como seleccion del metodo de pago, y finalmente pantalla informativa de finalizacion de la compra
<p>
  <img align="center" width="200" src="https://user-images.githubusercontent.com/72140889/212723805-5a317fe3-37fa-4bb4-9008-f0f61062a2a1.jpg" />
<p>

<p>
  <img align="center" width="200" src="https://user-images.githubusercontent.com/72140889/212723706-adf3a1fa-1c03-4a99-9a78-1902c267e35c.png" />
  
  <img align="center" width="200" src="https://user-images.githubusercontent.com/72140889/212724295-4db70dbe-4966-4dbd-9ce2-adb622fdd62d.png" />
  
  <img align="center" width="200" src="https://user-images.githubusercontent.com/72140889/212724386-e733957e-ba8a-44d2-8dbc-b988907cb7d3.png" />
  
  <img align="center" width="200" src="https://user-images.githubusercontent.com/72140889/212724338-5b84d8a0-bc3a-448e-be62-764eb68bd37d.png" />
<p>

- `Funcionalidad 6`: Lista de eventos, charlas, seminarios a traves de los informarse de las nuevas tecnologias

<p>
  <img align="center" width="200" src="https://user-images.githubusercontent.com/72140889/212724734-742e2599-0ae8-491a-ada0-6e128fefdff3.png" />
<p>

  - `Funcionalidad 6.1`: Visualización en detalle de cada evento en concreto 
  <p>
      <img align="center" width="200" src="https://user-images.githubusercontent.com/72140889/212724624-50b0fa4e-f4d6-4940-93a5-99c153fed67e.png" />
  <p>

  - `Funcionalidad 6.2`: Compra de tickets para acudir a algún evento
  <p>
    <img align="center" width="200" src="https://user-images.githubusercontent.com/72140889/212724826-842a8881-0696-4df1-8829-8cc4de505f16.png" />
  <p>
  
  
- `Funcionalidad 7`: Escaner QR que se utilizará cuando el usuario se encuentre dentro del museo con el fin de escanear los códigos que tiene cada objeto para obtener información detallada de este.
<p>
  <img align="center" width="200" src="https://user-images.githubusercontent.com/72140889/212725426-5a8e708c-02f7-4e61-b5d2-dd691edd8ec0.png" />
<p>


  - `Funcionalidad 7.1`: Visualización de una descripción e imagen del objeto, junto con dos botones que nos redirigen a la pantalla de comentarios y a la de reproducción del vídeo
  <p>
    <img align="center" width="200" src="https://user-images.githubusercontent.com/72140889/212725578-6d8c8907-85fb-4f42-99d6-d00d06d7744d.png" />
  <p>
  
   - `Funcionalidad 7.1.1`: Opción de añadir y leer comentarios 
    
   <p>
      <img align="center" width="200" src="https://user-images.githubusercontent.com/72140889/212725671-682f6534-20d3-4a9a-a0c2-0fc5a02ea416.png" />
   <p>
    
   - `Funcionalidad 7.1.2`: Opción de reproducir un video en la propia actividad haciendo uso de la API de youtube
    
   <p>
      <img align="center" width="200" src="https://user-images.githubusercontent.com/72140889/212725738-04b829e0-095d-4ff9-96b3-d725f2a65e8f.png" />
   <p>
    
    
- `Funcionalidad 8`: Barra de navegación inferior presente en todas las pantallas desde la cual se puede navegar a las tres pantallas principales: HomePage, el escaner QR y la lista de los eventos
<p>
  <img align="center" width="200" src="https://user-images.githubusercontent.com/72140889/212725818-32d11529-3c12-4f22-9291-34938b7df211.jpg" />
<p>


## :books: Librerías
* <a href="https://github.com/yuriy-budiyev/code-scanner"> Code Scanner </a>
* <a href="https://square.github.io/picasso/"> Picasso </a>
* <a href="https://github.com/prolificinteractive/material-calendarview"> Material Calendar View </a>
* <a href="https://github.com/material-components/material-components-android/tree/master/docs/components"> Material Design UI Componentes for Android </a>
* <a href="https://developers.google.com/maps/documentation/android-sdk?hl=es_419"> Google Maps </a>

## :notebook: Documentacion
La documentación del software, así como recursos adicionales como una presentación en PowerPoint con los puntos clave, maquetas, un vídeo en el que se muestra la aplicación en funcionamiento, etc., se pueden encontrar haciendo clic en este enlace <a href="https://github.com/Tech-Virtual-Museum/Documentation">link</a>.

## :woman: :woman: Colaboradores

<a href="https://github.com/Tech-Virtual-Museum/iOS-Tech-Virtual-Museum/graphs/contributors">
  <img src="https://contrib.rocks/image?repo=Tech-Virtual-Museum/iOS-Tech-Virtual-Museum" /> 
  <sub>Nahima Ortega - iOS</sub>
</a>

<a href="https://github.com/Tech-Virtual-Museum/Android-Tech-Virtual-Museum/graphs/contributors">
  <img src="https://contrib.rocks/image?repo=Tech-Virtual-Museum/Android-Tech-Virtual-Museum" />
  <sub>Tinizara Rodriguez - Android</sub>
</a>
