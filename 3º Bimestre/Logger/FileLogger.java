package br.univille.poo.logger;
import java.io.File;
import java.io.FileWriter;

class FileLogger implements Logger{
    @Override
    public void mensagem(String mensagem) {
        try {
            File arquivo = new File("log_java.txt");
            // append
            FileWriter writer = new FileWriter(arquivo, true);
            writer.write(mensagem + "\n");
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
