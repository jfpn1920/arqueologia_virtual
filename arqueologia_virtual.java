import java.util.Scanner;
public class arqueologia_virtual {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] nombresHallazgos = new String[10];
        String[] tiposPiezas = new String[10];
        String[] civilizaciones = new String[10];
        String[] epocas = new String[10];
        String[] sitiosArqueologicos = new String[10];
        String[] ubicaciones = new String[10];
        String[] antiguedades = new String[10];
        String[] materiales = new String[10];
        String[] arqueologos = new String[10];
        String[] estados = new String[10];
        int total = 0;
        int opcion;
        //-------------------------------------------//
        //--|menu_principal_de_arqueologia_virtual|--//
        //-------------------------------------------//
        do {
            System.out.println("menu principal de arqueologia virtual");
            System.out.println("1) Registrar hallazgo");
            System.out.println("2) Editar hallazgo");
            System.out.println("3) Listar hallazgos");
            System.out.println("4) Buscar hallazgo");
            System.out.println("5) Eliminar hallazgo");
            System.out.println("6) Mostrar resumen");
            System.out.println("7) Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = entrada.nextInt();
            entrada.nextLine();
            switch (opcion) {
                //------------------------//
                //--|registrar_hallazgo|--//
                //------------------------//
                case 1:
                    if (total >= nombresHallazgos.length) {
                        System.out.println("No hay espacio para registrar mas hallazgos.");
                        break;
                    }
                    int id = total + 1;
                    System.out.println("registro de hallazgo arqueologico");
                    System.out.println("id del hallazgo a registrar: " + id);
                    System.out.print("nombre del hallazgo: ");
                    nombresHallazgos[total] = entrada.nextLine();
                    System.out.print("tipo de pieza: ");
                    tiposPiezas[total] = entrada.nextLine();
                    System.out.print("civilizacion: ");
                    civilizaciones[total] = entrada.nextLine();
                    System.out.print("epoca: ");
                    epocas[total] = entrada.nextLine();
                    System.out.print("sitio arqueologico: ");
                    sitiosArqueologicos[total] = entrada.nextLine();
                    System.out.print("ubicacion: ");
                    ubicaciones[total] = entrada.nextLine();
                    System.out.print("antiguedad aproximada: ");
                    antiguedades[total] = entrada.nextLine();
                    System.out.print("material: ");
                    materiales[total] = entrada.nextLine();
                    System.out.print("nombre del arqueologo: ");
                    arqueologos[total] = entrada.nextLine();
                    System.out.print("estado del hallazgo: ");
                    estados[total] = entrada.nextLine();
                    System.out.println("Hallazgo registrado correctamente.");
                    total++;
                    break;
                //---------------------//
                //--|editar_hallazgo|--//
                //---------------------//
                case 2:
                    if (total == 0) {
                        System.out.println("No existen hallazgos registrados.");
                        break;
                    }
                    System.out.println("Datos de los hallazgos");
                    for (int i = 0; i < total; i++) {
                        System.out.println("ID: " + (i + 1) + " | Hallazgo: " + nombresHallazgos[i] + " | Tipo: " + tiposPiezas[i] + " | Civilizacion: " + civilizaciones[i] + " | Epoca: " + epocas[i] + " | Sitio: " + sitiosArqueologicos[i] + " | Ubicacion: " + ubicaciones[i] + " | Antiguedad: " + antiguedades[i] + " | Material: " + materiales[i] + " | Arqueologo: " + arqueologos[i] + " | Estado: " + estados[i]);
                    }
                    System.out.print("Ingrese el ID del hallazgo: ");
                    int idEditar = entrada.nextInt();
                    entrada.nextLine();
                    if (idEditar >= 1 && idEditar <= total) {
                        int posicion = idEditar - 1;
                        System.out.println("Editar el dato del hallazgo");
                        System.out.print("Nuevo nombre del hallazgo: ");
                        nombresHallazgos[posicion] = entrada.nextLine();
                        System.out.print("Nuevo tipo de pieza: ");
                        tiposPiezas[posicion] = entrada.nextLine();
                        System.out.print("Nueva civilizacion: ");
                        civilizaciones[posicion] = entrada.nextLine();
                        System.out.print("Nueva epoca: ");
                        epocas[posicion] = entrada.nextLine();
                        System.out.print("Nuevo sitio arqueologico: ");
                        sitiosArqueologicos[posicion] = entrada.nextLine();
                        System.out.print("Nueva ubicacion: ");
                        ubicaciones[posicion] = entrada.nextLine();
                        System.out.print("Nueva antiguedad aproximada: ");
                        antiguedades[posicion] = entrada.nextLine();
                        System.out.print("Nuevo material: ");
                        materiales[posicion] = entrada.nextLine();
                        System.out.print("Nuevo nombre del arqueologo: ");
                        arqueologos[posicion] = entrada.nextLine();
                        System.out.print("Nuevo estado del hallazgo: ");
                        estados[posicion] = entrada.nextLine();
                        System.out.println("Hallazgo actualizado correctamente.");
                    } else {
                        System.out.println("ID no encontrada.");
                    }
                    break;
                //----------------------//
                //--|listar_hallazgos|--//
                //----------------------//
                case 3:
                    if (total == 0) {
                        System.out.println("No existen hallazgos registrados.");
                    } else {
                        System.out.println("Lista de hallazgos arqueologicos");
                        for (int i = 0; i < total; i++) {
                            System.out.println("ID: " + (i + 1) + " | Hallazgo: " + nombresHallazgos[i] + " | Tipo: " + tiposPiezas[i] + " | Civilizacion: " + civilizaciones[i] + " | Epoca: " + epocas[i] + " | Sitio: " + sitiosArqueologicos[i] + " | Ubicacion: " + ubicaciones[i] + " | Antiguedad: " + antiguedades[i] + " | Material: " + materiales[i] + " | Arqueologo: " + arqueologos[i] + " | Estado: " + estados[i]);
                        }
                    }
                    break;
                //---------------------//
                //--|buscar_hallazgo|--//
                //---------------------//
                case 4:
                    if (total == 0) {
                        System.out.println("No existen hallazgos registrados.");
                        break;
                    }
                    System.out.println("busqueda de hallazgo");
                    System.out.print("ingresa la id para buscar hallazgo: ");
                    int idBusqueda = entrada.nextInt();
                    entrada.nextLine();
                    if (idBusqueda >= 1 && idBusqueda <= total) {
                        int posicion = idBusqueda - 1;
                        System.out.println("Datos del hallazgo encontrado:");
                        System.out.println("ID: " + idBusqueda + " | Hallazgo: " + nombresHallazgos[posicion] + " | Tipo: " + tiposPiezas[posicion] + " | Civilizacion: " + civilizaciones[posicion] + " | Epoca: " + epocas[posicion] + " | Sitio: " + sitiosArqueologicos[posicion] + " | Ubicacion: " + ubicaciones[posicion] + " | Antiguedad: " + antiguedades[posicion] + " | Material: " + materiales[posicion] + " | Arqueologo: " + arqueologos[posicion] + " | Estado: " + estados[posicion]);
                    } else {
                        System.out.println("ID no encontrada.");
                    }
                    break;
                //-----------------------//
                //--|eliminar_hallazgo|--//
                //-----------------------//
                case 5:
                    if (total == 0) {
                        System.out.println("No existen hallazgos registrados.");
                        break;
                    }
                    System.out.println("Datos de los hallazgos");
                    for (int i = 0; i < total; i++) {
                        System.out.println("ID: " + (i + 1) + " | Hallazgo: " + nombresHallazgos[i] + " | Tipo: " + tiposPiezas[i] + " | Civilizacion: " + civilizaciones[i] + " | Epoca: " + epocas[i] + " | Sitio: " + sitiosArqueologicos[i] + " | Ubicacion: " + ubicaciones[i] + " | Antiguedad: " + antiguedades[i] + " | Material: " + materiales[i] + " | Arqueologo: " + arqueologos[i] + " | Estado: " + estados[i]);
                    }
                    System.out.print("Ingrese el ID del hallazgo a eliminar: ");
                    int idEliminar = entrada.nextInt();
                    entrada.nextLine();
                    if (idEliminar >= 1 && idEliminar <= total) {
                        int posicion = idEliminar - 1;
                        for (int i = posicion; i < total - 1; i++) {
                            nombresHallazgos[i] = nombresHallazgos[i + 1];
                            tiposPiezas[i] = tiposPiezas[i + 1];
                            civilizaciones[i] = civilizaciones[i + 1];
                            epocas[i] = epocas[i + 1];
                            sitiosArqueologicos[i] = sitiosArqueologicos[i + 1];
                            ubicaciones[i] = ubicaciones[i + 1];
                            antiguedades[i] = antiguedades[i + 1];
                            materiales[i] = materiales[i + 1];
                            arqueologos[i] = arqueologos[i + 1];
                            estados[i] = estados[i + 1];
                        }
                        total--;
                        System.out.println("Hallazgo eliminado correctamente.");
                    } else {
                        System.out.println("ID no encontrada.");
                    }
                    break;
                //---------------------//
                //--|mostrar_resumen|--//
                //---------------------//
                case 6:
                    if (total == 0) {
                        System.out.println("No existen hallazgos registrados.");
                        break;
                    }
                    int investigacion = 0;
                    int catalogados = 0;
                    int restaurados = 0;
                    int exhibidos = 0;
                    int danados = 0;
                    int otrosEstados = 0;
                    for (int i = 0; i < total; i++) {
                        if (estados[i].equalsIgnoreCase("En investigacion")) {
                            investigacion++;
                        } else if (estados[i].equalsIgnoreCase("Catalogado")) {
                            catalogados++;
                        } else if (estados[i].equalsIgnoreCase("Restaurado")) {
                            restaurados++;
                        } else if (estados[i].equalsIgnoreCase("Exhibido")) {
                            exhibidos++;
                        } else if (estados[i].equalsIgnoreCase("Dañado")) {
                            danados++;
                        } else {
                            otrosEstados++;
                        }
                    }
                    String tipoMayor = tiposPiezas[0];
                    int cantidadTipoMayor = 0;
                    for (int i = 0; i < total; i++) {
                        int cantidadTipo = 0;
                        for (int j = 0; j < total; j++) {
                            if (tiposPiezas[i].equalsIgnoreCase(tiposPiezas[j])) {
                                cantidadTipo++;
                            }
                        }
                        if (cantidadTipo > cantidadTipoMayor) {
                            cantidadTipoMayor = cantidadTipo;
                            tipoMayor = tiposPiezas[i];
                        }
                    }
                    String civilizacionMayor = civilizaciones[0];
                    int cantidadCivilizacionMayor = 0;
                    for (int i = 0; i < total; i++) {
                        int cantidadCivilizacion = 0;
                        for (int j = 0; j < total; j++) {
                            if (civilizaciones[i].equalsIgnoreCase(civilizaciones[j])) {
                                cantidadCivilizacion++;
                            }
                        }
                        if (cantidadCivilizacion > cantidadCivilizacionMayor) {
                            cantidadCivilizacionMayor = cantidadCivilizacion;
                            civilizacionMayor = civilizaciones[i];
                        }
                    }
                    String sitioMayor = sitiosArqueologicos[0];
                    int cantidadSitioMayor = 0;
                    for (int i = 0; i < total; i++) {
                        int cantidadSitio = 0;
                        for (int j = 0; j < total; j++) {
                            if (sitiosArqueologicos[i].equalsIgnoreCase(sitiosArqueologicos[j])) {
                                cantidadSitio++;
                            }
                        }
                        if (cantidadSitio > cantidadSitioMayor) {
                            cantidadSitioMayor = cantidadSitio;
                            sitioMayor = sitiosArqueologicos[i];
                        }
                    }
                    String materialMayor = materiales[0];
                    int cantidadMaterialMayor = 0;
                    for (int i = 0; i < total; i++) {
                        int cantidadMaterial = 0;
                        for (int j = 0; j < total; j++) {
                            if (materiales[i].equalsIgnoreCase(materiales[j])) {
                                cantidadMaterial++;
                            }
                        }
                        if (cantidadMaterial > cantidadMaterialMayor) {
                            cantidadMaterialMayor = cantidadMaterial;
                            materialMayor = materiales[i];
                        }
                    }
                    String arqueologoMayor = arqueologos[0];
                    int cantidadArqueologoMayor = 0;
                    for (int i = 0; i < total; i++) {
                        int cantidadArqueologo = 0;
                        for (int j = 0; j < total; j++) {
                            if (arqueologos[i].equalsIgnoreCase(arqueologos[j])) {
                                cantidadArqueologo++;
                            }
                        }
                        if (cantidadArqueologo > cantidadArqueologoMayor) {
                            cantidadArqueologoMayor = cantidadArqueologo;
                            arqueologoMayor = arqueologos[i];
                        }
                    }
                    System.out.println("resumen de arqueologia virtual");
                    System.out.println("Hallazgos registrados: " + total);
                    System.out.println("Tipo de pieza mas frecuente: " + tipoMayor);
                    System.out.println("Civilizacion con mas hallazgos: " + civilizacionMayor);
                    System.out.println("Sitio arqueologico con mas descubrimientos: " + sitioMayor);
                    System.out.println("Material mas utilizado: " + materialMayor);
                    System.out.println("Arqueologo con mas descubrimientos: " + arqueologoMayor);
                    System.out.println("En investigacion: " + investigacion);
                    System.out.println("Catalogados: " + catalogados);
                    System.out.println("Restaurados: " + restaurados);
                    System.out.println("Exhibidos: " + exhibidos);
                    System.out.println("Dañados: " + danados);
                    System.out.println("Otros estados: " + otrosEstados);
                    break;
                //------------------------------//
                //--|salir_del_menu_principal|--//
                //------------------------------//
                case 7:
                    System.out.println("Gracias por utilizar Arqueologia Virtual.");
                    break;
                default:
                    System.out.println("Opcion no valida.");
            }
        } while (opcion != 7);
        entrada.close();
    }
}