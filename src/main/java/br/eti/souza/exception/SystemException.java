package br.eti.souza.exception;

/**
 * Exceções causada pelo sistema.
 * @author Alan Moraes Souza
 */
public class SystemException extends Exception {

    /** Mensagem internacionalizada da exceção. */
    private final I18nMessage i18nMessage;

    /** Construtor padrão. */
    public SystemException() {
        this.i18nMessage = null;
    }

    /**
     * Construtor que define a mensagem internacionalizada da exceção.
     * @param message Mensagem internacionalizada da exceção. (a chave é utilizada como a mensagem da exceção)
     */
    public SystemException(I18nMessage message) {
        super(message != null ? message.getKey() : (String) null);
        this.i18nMessage = message;
    }

    /**
     * Construtor que define a causa da exceção.
     * @param cause Causa da exceção.
     */
    public SystemException(Throwable cause) {
        super(null, cause);
        this.i18nMessage = null;
    }

    /**
     * Construtor que define a mensagem internacionalizada e a causa da exceção.
     * @param message Mensagem internacionalizada da exceção. (a chave é utilizada como a mensagem da exceção)
     * @param cause Causa da exceção.
     */
    public SystemException(I18nMessage message, Throwable cause) {
        super((message != null ? message.getKey() : (String) null), cause);
        this.i18nMessage = message;
    }

    /**
     * Retorna a mensagem internacionalizada da exceção.
     * @return Mensagem internacionalizada da exceção.
     */
    public I18nMessage getI18nMessage() {
        return this.i18nMessage;
    }
}
