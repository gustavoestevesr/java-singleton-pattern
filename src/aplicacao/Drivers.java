package aplicacao;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Drivers {
        
    public static Drivers drivers;

    private List<String> componentes = List.of("Alto faltante","Microfone","Mouse","Teclado","Rede", "WebCam");

    private Drivers(){

    }

    public static synchronized Drivers getInstance() {
		if (drivers == null)
        drivers = new Drivers();
		return drivers;
	}

    public String atualizarAltoFalante() {
        return String.format("%s atualizado!", componentes.get(0));
    }

    public String atualizarMicrofone() {
        return String.format("%s atualizado!", componentes.get(1));
    }

    public String atualizarMouse() {
        return String.format("%s atualizado!", componentes.get(2));
    }

    public String atualizarTeclado() {
        return String.format("%s atualizado!", componentes.get(3));
    }

    public String atualizarRede() {
        return String.format("%s atualizado!", componentes.get(4));
    }

    public String atualizarWebCam() {
        return String.format("%s atualizado!", componentes.get(5));
    }

    public List<String> atualizarTodosOsDrivers() {
        return componentes.stream()
        .map(c -> new String( c + " atualizado!" + "\n"))
        .collect(Collectors.toList());
    }

}
