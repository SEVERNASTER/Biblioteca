


import java.util.Scanner;

import java.util.ArrayList;

//arreglar cuando pone un indice que no existe en !prestar! y !deudores ==> kind of
//agregar un metodo para editar info de material

public class Biblioteca extends Colores {
    private String nombre;
    private String direccion;
    private Scanner sc;
    private ArrayList<Persona> personas;
    private ArrayList<Persona> deudores;
    private ArrayList<Material> material;// revisar le metodo imprimirMaterial()
                                         // tal vez no deberiamos pasarle el arraylist como parametro cause ya esta como
                                         // atributo
    private Prestamo prestamo;

    public Biblioteca(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        sc = new Scanner(System.in);
        personas = new ArrayList<>();
        deudores = new ArrayList<>();
        material = new ArrayList<>();
        prestamo = new Prestamo();
        agregar();
    }

    public void agregar() {// decirle a chat gpt que agrege libros y personas
    //manualmente como lo hacemos
    Estudiante dennis = new Estudiante("Dennis", "12456", 18, "15kjlh");
    personas.add(dennis);
    Libro libro = new Libro("la odisea", "homero", 150, "14jut", 10);
    material.add(libro);
    Revista revista = new Revista("People", 70, "12jkuy", "social");
    material.add(revista);

    // Crear objetos de tipo Revista y agregarlos al ArrayList de materiales
    Revista revista1 = new Revista("National Geographic", 80, "R1234",
    "Ciencia");
    material.add(revista1);

    Revista revista2 = new Revista("Vogue", 50, "R5678", "Moda");
    material.add(revista2);

    // Crear objetos de tipo Libro y agregarlos al ArrayList de materiales
    Libro libro1 = new Libro("KeyWord", "Elena Garcia",
    200, "L1234", 1);
    material.add(libro1);

    Libro libro2 = new Libro("Soledad", "Gabriel García",
    300, "L5678", 2);
    material.add(libro2);

    // Crear objetos de tipo Docente y agregarlos al ArrayList de personas
    Docente docente1 = new Docente("Juan Pérez", "12345678", 35, "D1234");
    personas.add(docente1);

    Docente docente2 = new Docente("María González", "87654321", 40, "D5678");
    personas.add(docente2);

    // Crear objetos de tipo Estudiante y agregarlos al ArrayList de personas
    Estudiante estudiante1 = new Estudiante("Ana López", "24681357", 20,
    "E1234");
    personas.add(estudiante1);

    Estudiante estudiante2 = new Estudiante("Pedro Sánchez", "13572468", 22,
    "E5678");
    personas.add(estudiante2);

    }

    public void iniciar() {
        System.out.println();
        System.out.println(purple + "\t\t\t   Bienvenido a la biblioteca " + nombre + reset);
        System.out.println();
        boolean menuActivo = true;
        while (menuActivo) {
            System.out.println(cyan + "Menú Principal " + reset);
            System.out.println(red + "1)" + reset + " Registrar" + reset);
            System.out.println(red + "2)" + reset + " Eliminar" + reset);
            System.out.println(red + "3)" + reset + " Editar" + reset);
            System.out.println(red + "4)" + reset + " Personas Registradas" + reset);
            System.out.println(red + "5)" + reset + " Prestar" + reset);
            System.out.println(red + "6)" + reset + " Lista de deudores" + reset);
            System.out.println(red + "7)" + reset + " Agregar Material" + reset);
            System.out.println(red + "8)" + reset + " Lista del Material" + reset);
            System.out.println(red + "9)" + reset + " Devolver Material" + reset);
            System.out.println(red + "0)" + reset + " Salir" + reset);
            System.out.print(green + "Respuesta: " + reset);
            int opcion = sc.nextInt();
            sc.nextLine();
            System.out.println();
            if (opcion == 0) {
                menuActivo = false;
            } else {
                opciones(opcion);
            }

        }

    }

    public void opciones(int opcion) {
        switch (opcion) {
            case 1:
                registrar();
                break;
            case 2:
                eliminar();
                break;
            case 3:
                editar(queQueresEditar());
                break;
            case 4:
                imprimir();
                break;
            case 5:
                prestar();
                break;
            case 6:
                imprimirDeudores();
                break;
            case 7:
                System.out.println(agregarMaterial());// agregar opcion para editar la info del material
                System.out.println();
                break;
            case 8:
                imprimirMaterial(this.material);
                break;
            case 9:
                devolver();
                break;
            case 0:
                break;
            default:
                System.out.println(redBg + "No existe la opcion " + opcion + " " + reset);
                System.out.println();
                break;

        }
    }

    public void registrar() {
        System.out.println(purple + "A quién quieres registrar?" + reset);
        System.out.println(red + "1)" + reset + "Docente");
        System.out.println(red + "2)" + reset + "Estudiante");
        System.out.print(green + "Respuesta: " + reset);
        int respuesta = sc.nextInt();
        sc.nextLine();
        System.out.println();
        switch (respuesta) {
            case 1:
                System.out.print(yellow + "Ingresa el nombre: " + reset);
                String nombre = sc.nextLine();
                System.out.print(yellow + "Ingresa el CI: " + reset);
                String CI = sc.nextLine();
                System.out.print(yellow + "Ingresa la edad: " + reset);
                int edad = sc.nextInt();
                sc.nextLine();
                System.out.print(yellow + "Ingresa el código del Docente: " + reset);
                String codDocente = sc.nextLine();
                System.out.println();
                Docente docente = new Docente(nombre, CI, edad, codDocente);// aca puede ser Persona docente, igual
                                                                            // sirve
                personas.add(docente);
                System.out.println(
                        cyan + "Se ha registrado a " + purple + nombre + reset + cyan + "  como docente" + reset);
                System.out.println();
                break;
            case 2:
                System.out.print(yellow + "Ingresa el nombre: " + reset);
                String nombre1 = sc.nextLine();
                System.out.print(yellow + "Ingresa el CI: " + reset);
                String CI1 = sc.nextLine();
                System.out.print(yellow + "Ingresa la edad: " + reset);
                int edad1 = sc.nextInt();
                sc.nextLine();
                System.out.print(yellow + "Ingresa el codigo del estudiante: " + reset);
                String codEstudiante = sc.nextLine();
                System.out.println();
                Estudiante estudiante = new Estudiante(nombre1, CI1, edad1, codEstudiante);// aca lo mismo
                personas.add(estudiante);
                System.out.println(
                        cyan + "Se ha registrado a " + purple + nombre1 + reset + cyan + " como estudiante" + reset);
                System.out.println();
                break;
            default:
                break;
        }

    }

    /* Debuggear este metodo esta maaaaaal!!! */
    public void eliminar() {// devolver un mensaje que diga se a eliminado object.getNombre()
        imprimir();
        System.out.print(purple + "A quién quieres eliminar?(ingresa el índice): " + reset);
        int indice = sc.nextInt();
        System.out.println();
        if (indice > 0 && indice <= personas.size()) {
            String nombreEliminado = personas.get(indice - 1).getNombre();
            System.out.println(green + "Se ha eliminado a " + red + nombreEliminado + green + " del registro" + reset);
            personas.remove(indice - 1);
        } else {
            System.out.println(redBg + "El índice que has ingresado no existe" + reset);
        }
        System.out.println();
    }

    // codigo copiado del metodo editar, que no estaba mal, pero no era lo
    // que queriamos :(
    /*
     * System.out.println(purple + "A quien quieres agregar?" + reset);
     * System.out.println(red + "1)" + reset + "A un Docente");
     * System.out.println(red + "2)" + reset + "A un Estudiante");
     * System.out.print(green + "Respuesta: " + reset);
     * int respuesta = sc.nextInt();
     * sc.nextLine();
     * switch (respuesta) {
     * case 1:
     * System.out.print(purple + "Ingresa el nombre: " + reset);
     * String nombre = sc.nextLine();
     * System.out.print(purple + "Ingresa el CI: " + reset);
     * String CI = sc.nextLine();
     * System.out.print(purple + "Ingresa la edad: " + reset);
     * int edad = sc.nextInt();
     * sc.nextLine();
     * System.out.print(purple + "Ingresa el codigo del Docente: " + reset);
     * String codDocente = sc.nextLine();
     * System.out.println();
     * Docente docente = new Docente(nombre, CI, edad, codDocente);
     * personas.remove(indice - 1);
     * personas.add(indice - 1, docente);
     * break;
     * case 2:
     * System.out.print(purple + "Ingresa el nombre: " + reset);
     * String nombre1 = sc.nextLine();
     * System.out.print(purple + "Ingresa el CI: " + reset);
     * String CI1 = sc.nextLine();
     * System.out.print(purple + "Ingresa la edad: " + reset);
     * int edad1 = sc.nextInt();
     * sc.nextLine();
     * System.out.print(purple + "Ingresa el codigo del Docente: " + reset);
     * String codDocente1 = sc.nextLine();
     * System.out.println();
     * Estudiante estudiante = new Estudiante(nombre1, CI1, edad1, codDocente1);
     * personas.remove(indice - 1);
     * personas.add(indice - 1, estudiante);
     * break;
     * default:
     * break;
     * }
     */

    public int queQueresEditar(){
        System.out.println(purple + "Qué quieres editar?" + reset);
        System.out.println(red + "1)" + reset + " Personas");
        System.out.println(red + "2)" + reset + " Material");
        System.out.print(green + "Respuesta: " + reset);
        int respuesta = sc.nextInt();
        System.out.println();
        return respuesta;
    }

    public void editar(int respuesta) {// editar persona
        switch (respuesta) {
            case 1:// editar tildes desde aqui
                imprimir();
                if (personas.size() != 0) {
                    System.out.print(purple + "A quién quieres editar?(Ingresa el índice): " + reset);
                    int indice = sc.nextInt();
                    System.out.println();
                    if (verificarIndice(indice, "personas").equals("valido")) {
                        System.out.println(green + "Qué quieres editar?" + reset);
                        System.out.println(red + "1)" + reset + "Nombre");
                        System.out.println(red + "2)" + reset + "CI");
                        System.out.println(red + "3)" + reset + "Edad");
                        System.out.print(green + "Respuesta: " + reset);
                        int respuesta2 = sc.nextInt();
                        System.out.println();
                        editarPersonas(respuesta2, indice - 1);
                    } else {
                        System.out.println(redBg + "No existe el índice " + indice + " " + reset);
                        System.out.println();
                    }
                } else {
                } // nothing
                break;
            case 2:
                imprimirMaterial(material);
                if (material.size() != 0) {
                    System.out.print(purple + "Qué quieres editar?(Ingresa el índice): ");
                    int indice2 = sc.nextInt();
                    System.out.println();
                    if (verificarIndice(indice2, "material").equals("valido")) {
                        opcionesMaterial(indice2 - 1);
                    } else {
                        System.out.println(redBg + "No existe el índice " + indice2 + " " + reset);
                        System.out.println();
                    }
                } else {
                }
                break;
            default:
                System.out.println(redBg + "No existe la opción " + respuesta + " " + reset);
                System.out.println();
                break;
        }
    }

    public String verificarIndice(int indice, String para) {
        String res = "";
        if (para.equals("personas")) {
            if (indice > 0 && indice <= personas.size()) {
                res = "valido";
            } else {
                res = "invalido";
            }
        } else if (para.equals("material")) {
            if (indice > 0 && indice <= material.size()) {
                res = "valido";
            } else {
                res = "invalido";
            }
        }
        return res;
    }

    public void opcionesMaterial(int indice) {
        System.out.println(purple + "Qué quieres editar?" + reset);
        System.out.println(red + "1)" + reset + " Nombre");
        System.out.println(red + "2)" + reset + " Páginas");
        System.out.println(red + "3)" + reset + " Código");

        if (material.get(indice).getTipoMaterial().contains("Libro")) {
            System.out.println(red + "4)" + reset + " Autor");
            System.out.println(red + "5)" + reset + " Edición");
            System.out.print(green + "Respuesta: " + reset);
            int respuesta = sc.nextInt();
            sc.nextLine();
            System.out.println();
            opcionesEditar(respuesta, indice, verificarRespuesta(respuesta, "libro"));

        } else if (material.get(indice).getTipoMaterial().contains("Revista")) {
            System.out.println(red + "4)" + reset + " Tipo");
            System.out.print(green + "Respuesta: " + reset);
            int respuesta = sc.nextInt();
            sc.nextLine();
            opcionesEditar(respuesta, indice, verificarRespuesta(respuesta, "revista"));
        }

    }

    public String verificarRespuesta(int respuesta, String tipo) {
        String res = "";
        if ((respuesta == 4 || respuesta == 5) && tipo.equalsIgnoreCase("LIBRO")) {
            res = "Libro";
        } else if (respuesta == 4 && tipo.equalsIgnoreCase("REVISTA")) {
            res = "Revista";
        }
        return res;
    }

    public void opcionesEditar(int respuesta, int indice, String tipoMaterial) {
        if (tipoMaterial.equalsIgnoreCase("Libro")) {
            editarOpcionesLibro(respuesta, indice);
        } else if (tipoMaterial.equalsIgnoreCase("Revista")) {
            System.out.println();
            System.out.print(purple + "Ingresa el tipo de revista: " + reset);
            String tipoRevista = sc.nextLine();
            System.out.println(green + "Se ha cambiado el tipo de " + red + material.get(indice).getTipo()
                    + green + " a " + red + tipoRevista);
            material.get(indice).setTipo(tipoRevista);
        } else {
            editarOpcionesGenerales(respuesta, indice);
        }
        System.out.println();
    }

    public void editarOpcionesLibro(int respuesta, int indice) {
        switch (respuesta) {
            case 4:
                System.out.print(purple + "Ingresa el autor del libro: " + reset);
                String autor = sc.nextLine();
                System.out.println(green + "Se ha cambiado el autor de " + red + material.get(indice).getAutor()
                        + green + " a " + red + autor + reset);
                material.get(indice).setAutor(autor);
                break;
            case 5:
                System.out.print(purple + "Ingresa la edición del libro: " + reset);
                int edicion = sc.nextInt();
                System.out.println(green + "Se ha cambiado la edición de " + red + material.get(indice).getEdicion()
                        + green + " a " + red + edicion);
                material.get(indice).setEdicion(edicion);
                break;
        }
    }

    public void editarOpcionesGenerales(int respuesta, int indice) {
        switch (respuesta) {
            case 1:
                System.out.print(purple + "Ingresa el nombre del libro: " + reset);
                String nombre = sc.nextLine();
                System.out.println(green + "Se ha cambiado el nombre de " + red + material.get(indice).getNombre()
                        + green + " a " + red + nombre);
                material.get(indice).setNombre(nombre);
                break;

            case 2:
                System.out.print(purple + "Ingresa las páginas del libro: " + reset);
                int paginas = sc.nextInt();
                System.out.println(green + "Se ha cambiado las páginas de " + red + material.get(indice).getPaginas()
                        + green + " a " + red + paginas);
                material.get(indice).setPaginas(paginas);
                ;
                break;
            case 3:
                System.out.print(purple + "Ingresa el código del libro: " + reset);
                String codigo = sc.nextLine();
                System.out.println(green + "Se ha cambiado el código de " + red + material.get(indice).getCodigo()
                        + green + " a " + red + codigo);
                material.get(indice).setCodigo(codigo);
                break;

            default:
                System.out.println(redBg + "No Existe la opción " + respuesta + reset);
                break;
        }
    }

    public void editarPersonas(int respuesta, int indice) {
        sc.nextLine();
        switch (respuesta) {
            case 1:
                System.out.print(yellow + "Ingresa el nombre: " + reset);
                String nombre = sc.nextLine();
                System.out.println();
                System.out.println(cyan + "Se ha cambiado el nombre de " + red + personas.get(indice).getNombre() + cyan
                        + " a " + red + nombre + reset);
                personas.get(indice).setNombre(nombre);
                System.out.println();
                break;
            case 2:
                System.out.print(yellow + "Ingrese el CI: " + reset);
                String ci = sc.nextLine();
                System.out.println();
                System.out.println(cyan + "Se ha cambiado el CI de " + red + personas.get(indice).getCI() + cyan + " a "
                        + red + ci);
                personas.get(indice).setCI(ci);
                System.out.println();
                break;
            case 3:
                System.out.print(yellow + "Ingresa la edad: " + reset);
                String edad = sc.nextLine();
                System.out.println();
                System.out.println(cyan + "Se ha cambiado la edad de " + red + personas.get(indice).getEdad() + cyan
                        + " a " + red + edad + reset);
                personas.get(indice).setNombre(edad);
                System.out.println();
                break;
            default:
                System.out.println(redBg + "No existe la opción " + respuesta + reset);
                System.out.println();
                break;
        }
    }

    public void imprimir() {// probar try catch, si se buggea las demas funciones muy prbablemente sea por
                            // esto
        int indice = 1;
        try {
            Persona personaPrueba = personas.get(indice - 1);
            System.out.println(green + "* Personas registradas *" + reset);
            for (Persona persona : personas) {
                System.out.println(
                        red + indice + ") " + reset + persona.toString() + green + persona.getTipoPersona() + reset);
                indice++;
            }
        } catch (Exception e) {
            System.out.println(redBg + "No hay personas registradas" + reset);
        }
        System.out.println();
    }

    public void imprimirDeudores() {
        if (hayDeudores()) {

            prestamo.imprimirDeudores(deudores);// cambiamos de personas a deudores
            System.out.println();
            System.out.println(red + "1)" + reset + " Más información");
            System.out.println(red + "2)" + reset + " Salir");
            System.out.print(green + "Respuesta: " + reset);
            int respuesta = sc.nextInt();
            System.out.println();
            masInformacion(respuesta);

        } else {
            System.out.println(redBg + "No hay deudores" + reset);
        }
        System.out.println();

    }

    public void masInformacion(int respuesta) {
        switch (respuesta) {
            case 1:// verificar deudores
                try {
                    System.out.print(purple + "Ingresa el índice de la persona: " + reset);
                    int indice = sc.nextInt();
                    System.out.println();
                    Persona persona = deudores.get(indice - 1);
                    ArrayList<Material> material = persona.getArray();
                    System.out.println(blue + "Datos de la persona" + reset);
                    System.out.println(persona.toString() + green + persona.getTipoPersona() + reset);
                    System.out.println();
                    System.out.println(blue + "Material que debe" + reset);
                    for (Material material1 : material) {// le ponemos material1 porque se confunde con el arrayList
                        System.out.println(material1.toString() + green + material1.getTipoMaterial() + reset);
                    }
                } catch (Exception e) {
                    System.out.println();
                    System.out.println(redBg + "El índice que has ingresado no existe" + reset);
                }
                System.out.println();
                break;
            case 2:
                break;
            default:
                break;
        }
    }

    public boolean hayDeudores() {
        boolean hayDeudores = false;
        int contador = 0;
        for (Persona persona : personas) {
            if (persona.getSePresto()) {
                contador++;
            } else {
                // nothing
            }
        }
        if (contador > 0) {
            hayDeudores = true;
        } else {
        }
        return hayDeudores;
    }

    public void prestar() {
        if (personas.size() == 0 || material.size() == 0) {
            System.out.println(redBg + "No hay personas o libros aún" + reset);
            System.out.println();
        } else {
            try {
                imprimir();
                System.out.print(purple + "A quién quieres prestar?(Ingresa el índice): " + reset);
                int indice = sc.nextInt();
                Persona persona = personas.get(indice - 1);// para hacer que falle en caso de que ingrese un indice
                                                           // invaldo
                System.out.println();
                imprimirMaterial(this.material);
                System.out.print(purple + "Qué quieres prestar?(Ingresa el índice): " + reset);
                int indice2 = sc.nextInt();
                Material material1 = material.get(indice2 - 1);// le ponemos material1 porque se confunde con el
                                                               // arraylist
                if (personas.get(indice - 1).getSePresto()) {
                    // nada, porque sino estariamos agreagando 2 veces a la misma persona
                    // por tanto figuaria 2 veces tambien, en la lista de dudores
                } else {
                    deudores.add(personas.get(indice - 1));
                }
                prestamo.prestar(indice - 1, personas, material1);
                System.out.println();
                System.out.println(prestamo.seHaPrestado(personas.get(indice - 1), material1));
                material.remove(material1);
            } catch (Exception e) {
                System.out.println();
                System.out.println(redBg + "El índice que has ingresado no existe" + reset);
            }
            System.out.println();
        }
    }

    public String agregarMaterial() {
        String res = "";
        System.out.println(purple + "Qué quieres agregar?" + reset);
        System.out.println(red + "1)" + reset + " Libro");
        System.out.println(red + "2)" + reset + " Revista");
        System.out.print(green + "Respuesta: " + reset);
        int respuesta = sc.nextInt();
        sc.nextLine();
        System.out.println();
        switch (respuesta) {
            case 1:
                System.out.print(yellow + "Ingrese el nombre: " + reset);
                String nombre = sc.nextLine();
                System.out.print(yellow + "Ingrese el autor: " + reset);
                String autor = sc.nextLine();
                System.out.print(yellow + "Ingrese el número de páginas: " + reset);
                int numPaginas = sc.nextInt();
                sc.nextLine();
                System.out.print(yellow + "Ingrese el código: " + reset);
                String codigo = sc.nextLine();
                System.out.print(yellow + "Ingrese el edición: " + reset);
                int edicion = sc.nextInt();
                System.out.println();
                Libro libro = new Libro(nombre, autor, numPaginas, codigo, edicion);
                material.add(libro);
                res = green + "Se ha agregado " + reset + red + nombre + reset + green + " a la biblioteca" + reset;
                break;
            case 2:// las variables se repiten por eso ponemos el 1
                System.out.print(yellow + "Ingrese el nombre: " + reset);
                String nombre1 = sc.nextLine();
                System.out.print(yellow + "Ingrese el número de páginas: " + reset);
                int numPaginas1 = sc.nextInt();
                sc.nextLine();
                System.out.print(yellow + "Ingrese el código: " + reset);
                String codigo1 = sc.nextLine();
                System.out.print(yellow + "Ingresa el tipo de revista: " + reset);
                String tipo = sc.nextLine();
                System.out.println();
                Revista revista = new Revista(nombre1, numPaginas1, codigo1, tipo);
                material.add(revista);
                res = green + "Se ha agregado " + reset + red + nombre1 + reset + green + " a la biblioteca" + reset;
                break;
            default:
                break;
        }
        return res;
    }

    public void imprimirMaterial(ArrayList<Material> material) {// le ponemos un indice???
        int indice = 1;
        try {
            Material anything = material.get(0);// lo mismo que si ponemos indice - 1 igual que en imprimir()
            System.out.println(green + "* Lista de material *" + reset);
            for (Material material1 : material) {
                System.out.println(red + indice + ")" + reset + material1.toString() + green
                        + material1.getTipoMaterial() + reset);
                indice++;
            }
        } catch (Exception e) {
            System.out.println(redBg + "No hay libros ni revistas" + reset);
        }

        System.out.println();
    }

    public void devolver() {
        try{
            if (hayDeudores()) {
                prestamo.imprimirDeudores(this.personas);
                System.out.println();
                System.out.print(purple + "Quién va a devolver?(Ingresa el índice): " + reset);
                int indice = sc.nextInt();
                System.out.println();
                ArrayList<Material> materialDebe = deudores.get(indice - 1).getArray();
                imprimirMaterial(materialDebe);
                System.out.println(yellow + "Qué libro o revista va a devolver?:" + reset);
                System.out.println(red + "1)" + reset + " Todos");
                System.out.println(red + "2)" + reset + " Todos, excepto...");
                System.out.println(red + "3)" + reset + " Seleccionar índice");
                System.out.print(green + "Respuesta: " + reset);
                int respuesta = sc.nextInt();
                System.out.println();
                System.out.println(devolverOpciones(respuesta, materialDebe, deudores.get(indice - 1), indice - 1));
            } else {
                System.out.println(redBg + "No hay deudores" + reset);
            }
        }catch (Exception e){
            System.out.println(redBg + "No existe el indice que has ingresado" + reset);
        }
        System.out.println();
        
    }

    public String devolverOpciones(int respuesta, ArrayList<Material> materialDebe, Persona persona, int index) {
        String res = "";
        switch (respuesta) {// condicional para ver si ya devolvio todo
            case 1:
                persona.setSePresto(false);
                for (Material material : materialDebe) {// le ponemos material1 porque se confunde con el
                                                        // ArrayList
                    this.material.add(material);
                }
                materialDebe.clear();
                res = purple + persona.getNombre() + green + " ha devuelto todo el material" + reset;
                deudores.remove(index);
                break;
            case 2:
                ArrayList<Integer> indices = pedirIndices(materialDebe.size());
                System.out.println();
                if (indices.isEmpty()) {
                    res = redBg + "No existe el índice que has ingresado" + reset;
                } else if (indices.get(0) == 0) {
                    res = redBg + "No se ha devuelto ningún tipo de material" + reset;
                } else {
                    indices.remove(indices.size() - 1);
                    devolverMaterial(indices, materialDebe, persona);
                    res = verificarMaterial(materialDebe, persona, index);
                }
                break;

            case 3:
                System.out.print(purple + "Ingresa el índice: " + reset);
                int indice2 = sc.nextInt();
                System.out.println();

                try {
                    this.material.add(materialDebe.get(indice2 - 1));
                    // primero guardamos y los datos y despues removemos
                    res = red + persona.getNombre() + green + persona.getTipoPersona().trim() + yellow + " ha devuelto "
                            + red + materialDebe.get(indice2 - 1).getNombre() + green
                            + materialDebe.get(indice2 - 1).getTipoMaterial().trim() + reset;
                    materialDebe.remove(indice2 - 1);

                    if (materialDebe.size() == 0) {// para verificar si ya a devuelto todo
                        persona.setSePresto(false);
                        deudores.remove(index);
                    } else {
                    }
                } catch (Exception e) {
                    res = redBg + "No existe el índice " + indice2 + " " + reset;
                }

                break;
            default:
                System.out.println(redBg + "No existe la opción " + respuesta + " " + reset);
                break;
        }
        return res;
    }

    public ArrayList<Integer> pedirIndices(int loQueDebe) {
        ArrayList<Integer> indices = new ArrayList<>();
        int indice;
        System.out.println(cyan + "Ingresa 0 (cero) para finalizar." + reset);
        do {// cambair esto por un while simplemente
            System.out.print(purple + "Devolver todo excepto: " + reset);
            indice = sc.nextInt();

            if (indice == 0) {
                indices.add(indice);
                break;
            } else if (indice < 1 || indice > loQueDebe) {
                indices.clear();
                break;
            } else {
                indices.add(indice);
            }

        } while (indice != 0);

        return indices;
    }

    public void devolverMaterial(ArrayList<Integer> indices, ArrayList<Material> materialDebe, Persona deudor) {
        ArrayList<Integer> pos = new ArrayList<>();

        for (int i = 0; i < materialDebe.size(); i++) {
            if (indices.contains(i + 1)) {
                continue;
            } else {
                this.material.add(materialDebe.get(i));
                pos.add(i);
                if (materialDebe.size() == 0) {
                    deudor.setSePresto(false);
                } else {
                }
            }
        }
        
        if(pos.isEmpty()){
            //nothing
        }else{
            int aux = pos.size() - 1;
            for (int i = pos.get(aux); i > -1; i--) {
                if (pos.contains(i)) {
                    materialDebe.remove(i);
                } else {
                    continue;
                }
            }
        }
    }

    public String verificarMaterial(ArrayList<Material> materialDebe, Persona persona, int index) {
        String res = "";
        if (materialDebe.size() == 0) {
            res = red + persona.getNombre() + green + " ha devuelto todo el material" + reset;
            deudores.remove(index);
        } else {
            res = yellow + "Se ha devuelto todo el material excepto: " + reset;
            for (int i = 0; i < materialDebe.size(); i++) {
                Material material3 = materialDebe.get(i);
                if (i == materialDebe.size() - 1) {// para el final
                    if (materialDebe.size() == 1) {
                        res += red + material3.getNombre() + reset;
                    } else {
                        res += yellow + " y " + red + material3.getNombre() + reset;
                    }

                } else if (i == 0) {// para el principio
                    res += red + material3.getNombre() + reset;

                } else {// para cualquier otra posicion del array
                    res += yellow + ", " + red + material3.getNombre() + reset;
                }
            }
        }
        return res;
    }
}
