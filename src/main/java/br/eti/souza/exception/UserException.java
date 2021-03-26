package br.eti.souza.exception;

import br.eti.souza.i18n.Message;
import java.util.ArrayList;
import java.util.List;

/**
 * Exceção específica para erros causado pelo usuário (Validações, erro de interação, e etc).
 * @author Alan Moraes Souza
 */
public class UserException extends Exception {

    /** Argumentos da mensagem internacionalizada. */
    private final List<Message> messages = new ArrayList<Message>();

    /** Construtor padrão */
    public UserException() {
    }

    /**
     * Construtor que inclui uma mensagem internacionalizada ao criar.
     * @param key Chave da mensagem internacionalizada.
     * @param args Argumentos da mensagem internacionalizada.
     */
    public UserException(String key, Object... args) {
        this.messages.add(new Message(key, args));
    }

    /**
     * Adiciona uma mensagem internacionalizada.
     * @param key Chave da mensagem internacionalizada.
     * @param args Argumentos da mensagem internacionalizada.
     */
    public void addMessage(String key, Object... args) {
        this.messages.add(new Message(key, args));
    }

    /**
     * Verifica se existe mensagem internacionalizada.
     * @return Verdadeiro se existir mensagem internacionalizada.
     */
    public boolean haveMessages() {
        return !this.messages.isEmpty();
    }

    /**
     * Retorna as mensagens internacionalizadas.
     * @return Mensagens internacionalizadas
     */
    public List<Message> getMessages() {
        return this.messages;
    }
}
