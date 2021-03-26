package br.eti.souza.exception;

/**
 * Representa a exceção geradas pelo sistema.
 * @author Alan Moraes Souza
 */
public class SystemException extends Exception {

    /**
     * Construtor que define a mensagem da exceção.
     * @param message Mensagem da exceção.
     */
    public SystemException(String message) {
        super(String.valueOf(message).trim());
    }

    /**
     * Construtor que define a mensagem e causa da exceção.
     * @param message Mensagem da exceção.
     * @param cause Causa da exceção.
     */
    public SystemException(String message, Throwable cause) {
        super(String.valueOf(message).trim(), cause);
    }
}
