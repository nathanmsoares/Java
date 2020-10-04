package br.univille.poo.logger;

public class Main {

	public static void main(final String[] args) {
		Logger logger = LoggerFactory.getInstance().createConsoleLogger();
		logger.mensagem("Teste1");
		Logger file = LoggerFactory.getInstance().createFileLogger();
		file.mensagem("Teste2");  
	}

}
