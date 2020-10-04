package br.univille.poo.logger;

class ConsoleLogger implements Logger{
    public void mensagem(String mensagem){
        System.out.println(mensagem);
    }
}