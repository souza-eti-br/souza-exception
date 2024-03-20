package br.eti.souza.exception;

import java.util.ArrayList;
import java.util.List;

/**
 * Exceções causada pelo usuário do sistema.
 * @author Alan Moraes Souza
 */
public class UserException extends Exception {

    /** Mensagem internacionalizada da exceção. */
    private final List<I18nMessage> i18nMessages = new ArrayList<>();

    /** Construtor padrão. */
    public UserException() {
    }

    /**
     * Construtor que define a mensagem internacionalizada da exceção.
     * @param message Mensagem internacionalizada da exceção. (a chave é utilizada como a mensagem da exceção)
     */
    public UserException(I18nMessage message) {
        super(message != null ? message.getKey() : (String) null);
        if (message != null) {
            this.i18nMessages.add(message);
        }
    }

    /**
     * Construtor que define a causa da exceção.
     * @param cause Causa da exceção.
     */
    public UserException(Throwable cause) {
        super(null, cause);
    }

    /**
     * Construtor que define a mensagem internacionalizada e a causa da exceção.
     * @param message Mensagem internacionalizada da exceção. (a chave é utilizada como a mensagem da exceção)
     * @param cause Causa da exceção.
     */
    public UserException(I18nMessage message, Throwable cause) {
        super((message != null ? message.getKey() : (String) null), cause);
        if (message != null) {
            this.i18nMessages.add(message);
        }
    }

    /**
     * Inclui uma nova mensagem internacionalizada.
     * @param message Mensagem internacionalizada da exceção.
     */
    public void addI18nMessage(I18nMessage message) {
        if (message != null) {
            this.i18nMessages.add(message);
        }
    }

    /**
     * Retorna as mensagens internacionalizadas da exceção.
     * @return Mensagens internacionalizadas da exceção.
     */
    public I18nMessage[] getI18nMessages() {
        return this.i18nMessages.toArray(I18nMessage[]::new);
    }
}
