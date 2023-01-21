package exemplo;
/* O Padrão Singleton tem como definição garantir que uma classe tenha apenas uma instância de si mesma e que forneça um ponto global de acesso a ela.*/
public class Singleton {
        
    /* Para podermos instanciar ou acessar uma instância da classe criou-se um atributo público e estático (da classe) que retorna através de um método estático uma única instância dessa classe. */
    public static Singleton uniqueInstance;

    /* O construtor é privado evitando que essa classe seja instanciada fora dela. Assim, para podermos instanciar ou acessar uma instância da classe criou-se um atributo público e estático (da classe) que retorna através de um método estático uma única instância dessa classe. */
    private Singleton(){

    }

    /* Nesse exemplo nota-se a presença do synchronized, isso se deve pois se tirássemos o synchronized e tentássemos criar duas instâncias da classe num determinado momento verificaríamos que isso é possível. Utilizando synchronized tem-se a certeza que o método nunca será acessado por duas threads ao mesmo tempo. */
    public static synchronized Singleton getInstance() {
		if (uniqueInstance == null)
			uniqueInstance = new Singleton();
		return uniqueInstance;
	}

}
