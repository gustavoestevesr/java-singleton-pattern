package aplicacao;
public class App {
    public static void main(String[] args) throws Exception {

        /* Pegando a referencia da instancia de Drivers */
        Drivers drivers = Drivers.getInstance();

        /* Acessando os métodos de Drivers */
        // System.out.println(drivers.atualizarAltoFalante());
        // System.out.println(drivers.atualizarMicrofone());
        // System.out.println(drivers.atualizarMouse());
        // System.out.println(drivers.atualizarRede());
        // System.out.println(drivers.atualizarTeclado());
        // System.out.println(drivers.atualizarWebCam());
        System.out.println(drivers.atualizarTodosOsDrivers());
    }
}