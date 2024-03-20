package br.eti.souza.exception;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Testes para br.eti.souza.exception.SystemException
 * @author Alan Moraes Souza
 */
public class SystemExceptionTest {

    /** Teste para construtor padrão. */
    @Test
    public void testConstructorDefault() {
        var e = new SystemException();
        Assertions.assertEquals(null, e.getI18nMessage());
        Assertions.assertEquals(null, e.getMessage());
        Assertions.assertEquals(null, e.getCause());
    }

    /** Teste para construtor recebendo mensagem nula. */
    @Test
    public void testConstructorMessageNull() {
        var e = new SystemException((I18nMessage) null);
        Assertions.assertEquals(null, e.getI18nMessage());
        Assertions.assertEquals(null, e.getMessage());
        Assertions.assertEquals(null, e.getCause());
    }

    /** Teste para construtor recebendo mensagem preenchida. */
    @Test
    public void testConstructorMessageNotNull() {
        var message = new I18nMessage("key", "arg01", "arg02");
        var e = new SystemException(message);
        Assertions.assertEquals(message, e.getI18nMessage());
        Assertions.assertEquals(message.getKey(), e.getMessage());
        Assertions.assertEquals(null, e.getCause());
    }

    /** Teste para construtor recebendo causa nula. */
    @Test
    public void testConstructorCauseNull() {
        var e = new SystemException((Throwable) null);
        Assertions.assertEquals(null, e.getI18nMessage());
        Assertions.assertEquals(null, e.getMessage());
        Assertions.assertEquals(null, e.getCause());
    }

    /** Teste para construtor recebendo causa nula. */
    @Test
    public void testConstructorCauseNotNull() {
        var cause = new IllegalArgumentException("mensagem");
        var e = new SystemException(cause);
        Assertions.assertEquals(null, e.getI18nMessage());
        Assertions.assertEquals(null, e.getMessage());
        Assertions.assertEquals(cause, e.getCause());
    }

    /** Teste para construtor recebendo mensagem nula e causa nula. */
    @Test
    public void testConstructorMessageNullCauseNull() {
        var e = new SystemException((I18nMessage) null, (Throwable) null);
        Assertions.assertEquals(null, e.getI18nMessage());
        Assertions.assertEquals(null, e.getMessage());
        Assertions.assertEquals(null, e.getCause());
    }

    /** Teste para construtor recebendo mensagem nula e causa preenchida. */
    @Test
    public void testConstructorMessageNullCauseNotNull() {
        var cause = new IllegalArgumentException("mensagem");
        var e = new SystemException((I18nMessage) null, cause);
        Assertions.assertEquals(null, e.getI18nMessage());
        Assertions.assertEquals(null, e.getMessage());
        Assertions.assertEquals(cause, e.getCause());
    }

    /** Teste para construtor recebendo mensagem preenchida e causa nula. */
    @Test
    public void testConstructorMessageNotNullCauseNull() {
        var message = new I18nMessage("key", "arg01", "arg02");
        var e = new SystemException(message, (Throwable) null);
        Assertions.assertEquals(message, e.getI18nMessage());
        Assertions.assertEquals(message.getKey(), e.getMessage());
        Assertions.assertEquals(null, e.getCause());
    }

    /** Teste para construtor recebendo mensagem preenchida e causa preenchida. */
    @Test
    public void testConstructorMessageNotNullCauseNotNull() {
        var message = new I18nMessage("key", "arg01", "arg02");
        var cause = new IllegalArgumentException("mensagem");
        var e = new SystemException(message, cause);
        Assertions.assertEquals(message, e.getI18nMessage());
        Assertions.assertEquals(message.getKey(), e.getMessage());
        Assertions.assertEquals(cause, e.getCause());
    }
}
