# Gestor de tareas

## Integrantes
- Montijo Garcia Kennay Alberto - Encargado de registrar tareas.
- Tirado Lam Jose Carlos - Encargado de listar tareas.
- Chavarin Perez Zair Roberto - Encargado de marcar tareas completadas.

## Descripción
Se gestiona el ciclo básico de desarrollo colaborativo de una aplicación Java utilizando las funciones de integración de
Git y GitHub de IntelliJ IDEA, aplicando buenas prácticas de versionado, documentación, trabajo con ramas y revisión
de cambios

El equipo creara una aplicacion en java que administra tareas 
personales que permitirá registrar una tarea, listar tareas y marcar una tarea como completada. 

## Requisitos
* **Java:** JDK [25.0.2]
* **Gestor de versiones:** Git [ 2.52.0.windows.1]
* **IDE:** IntelliJ IDEA [2025 2.1]

## Funcionalidades y responsables
* **Registrar tarea:** Permite crear una tarea con descripción y estado "[Completado]" (Desarrollado por [Kennay Montijo]
* **Listar tareas:** Muestra en consola todas las tareas registradas y sus estados actuales (Desarrollado por [Carlos Tirado]
* **Completar tarea:** Busca una tarea existente y actualiza su estado a "[Completada]" (Desarrollado por [Roberto Chavarin]


## Flujo de colaboración
Se siguió un flujo de trabajo basado en ramas (Branching Workflow):
1. Nadie programó directamente sobre la rama `main`
2. Cada integrante creó una rama específica (ej. `feature/registrar-tarea`).
3. Se integraron los cambios a la rama principal exclusivamente a través de Pull Requests en GitHub.
4. Cada Pull Request fue revisado por al menos otro compañero antes de hacer el "Merge".

## Pruebas
Se realizaron pruebas manuales en la consola para validar cada funcionalidad y se verificó que el programa no terminara de forma inesperada al ingresar opciones inválidas.


## Preguntas de Reflexion
1. ¿Qué diferencia existe entre Git y GitHub?
  R: Git es la herramienta local instalada en tu computadora que gestiona el control de versiones, mientras que GitHub es el servicio en la nube donde se alojan y comparten esos repositorios Git.
2. ¿Por qué conviene revisar git diff antes de hacer commit?
 R: ermite verificar exactamente qué líneas de código se agregaron, modificaron o eliminaron, evitando guardar cambios accidentales o código basura en el historial.
3. ¿Cuál es la diferencia entre commit y push?
    R: El commit guarda un registro de los cambios únicamente en tu computadora de forma local. El push toma esos commits locales y los sube al repositorio remoto
4.  ¿Qué función tiene .gitignore y qué limitación presenta? R: Sirve para indicarle a Git qué archivos o carpetas no debe rastrear ni subirSu limitación es que no elimina los archivos que ya habían sido rastreados
5.  ¿Por qué se versiona el Gradle Wrapper? R: Se versiona para garantizar que el proyecto se ejecute y construya de forma reproducible en la computadora de cualquier persona utilizando la misma versión exacta de Gradle
6.  ¿Cómo ayuda el README a que otra persona reproduzca el proyecto? R: ctúa como la carta de presentación y manual de instrucciones del proyecto, detallando los requisitos, pasos de instalación
7. ¿Qué aportan las ramas y los pull requests al control de calidad? R: Los pull requests añaden una capa de seguridad al requerir que otro integrante revise y apruebe el código
8. ¿Cómo se resolvió el conflicto y qué medidas podrían evitar conflictos innecesarios? R: Mejoramos la comunicacion y trabajamos en partes distintas, tambien se realizan cambias consultandole al otro 
