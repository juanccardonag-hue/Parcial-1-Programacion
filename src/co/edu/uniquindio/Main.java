package co.edu.uniquindio;
import javax.swing.JOptionPane;

public class main() {

    private static EmpresaDevplus empresa;

    public static void main(String[] args){
        empresa = new EmpresaDevplus("18272026", "DevPlus", "carrera 23 #19-79", "32193939229", "www.devplus.com");
        int opcion = 0;

        do {
            opcion=Integer.parseInt(JOptionPane.showInputDialog(" ༺ Menu DevPlus ༻ " +
                    "\n Selecciona lo que deseas realizar: " +
                    "\n 1. Registar cliente" +
                    "\n 2. Registar desarrollador " +
                    "\n 3. Registrar servicio Adcional " +
                    "\n 4. Registar proyecto " +
                    "\n 5. Consultar cliente por numero de telefono " +
                    "\n 6. Consultar total de todos los proyectos " +
                    "\n 7. Conusltar ingresos por fecha de proyecto " +
                    "\n 8. Salir del menu "));

            switch (opcion){
                case 1:
                    registarCliente();
                    break;

                case 2:
                    registaraDesarrollador();
                    break;

                case 3:
                    registarServicioAdcional();
                    break;

                case 4:
                    registarProyecto();
                    break;

                case 5:
                    consultarTelefonoCliente();
                    break;

                case 6:
                    mostarProyecto();
                    break;

                case 7:
                    consultarIngresosFecha();
                    break;

                case 0:
                    JOptionPane.showMessageDialog(null,"El sistema ha terminado");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Ingrese una opcion valida");
                    break;
            }
        } while (opcion!=0);
    }
}
