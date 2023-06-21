package br.com.alura.screenmatch.myexceptions;

public class YearConversionErrorException extends RuntimeException {

    private String message;
    public YearConversionErrorException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
