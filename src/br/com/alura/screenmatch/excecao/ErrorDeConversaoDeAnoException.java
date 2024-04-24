package br.com.alura.screenmatch.excecao;

public class ErrorDeConversaoDeAnoException extends RuntimeException {
    private String mensagem;

    public ErrorDeConversaoDeAnoException(String messagem) {
        this.mensagem = messagem;
    }

    @Override
    public String getMessage(){
        return this.mensagem;
    }

}
