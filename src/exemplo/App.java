package exemplo;
public class App {
    public static void main(String[] args) throws Exception {

        /* Não é possível instanciar pois não é visível, muito menos, tentar instanciar várias vezes. 
        * Singleton instance = new Singleton();        
        */

        /* Pegando a referencia da instancia de Singleton */
        Singleton instance = Singleton.getInstance();

        /* Acessando o Singleton */
        System.out.println(instance);
    }
}