package br.eti.souza.exception;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Testes para br.eti.souza.exception.UserException
 * @author Alan Moraes Souza
 */
public class UserExceptionTest {

    /** Teste para construtor padrão. */
    @Test
    public void testConstructorDefault() {
        var e = new UserException();
        Assertions.assertArrayEquals(new I18nMessage[0], e.getI18nMessages());
        Assertions.assertEquals(null, e.getMessage());
        Assertions.assertEquals(null, e.getCause());
        var message = new I18nMessage("key", "arg01", "arg02");
        e.addI18nMessage(message);
        Assertions.assertArrayEquals(new I18nMessage[]{message}, e.getI18nMessages());
    }

    /** Teste para construtor recebendo mensagem nula. */
    @Test
    public void testConstructorMessageNull() {
        var e = new UserException((I18nMessage) null);
        Assertions.assertArrayEquals(new I18nMessage[0], e.getI18nMessages());
        Assertions.assertEquals(null, e.getMessage());
        Assertions.assertEquals(null, e.getCause());
        var message = new I18nMessage("key", "arg01", "arg02");
        e.addI18nMessage(message);
        Assertions.assertArrayEquals(new I18nMessage[]{message}, e.getI18nMessages());
    }

    /** Teste para construtor recebendo mensagem preenchida. */
    @Test
    public void testConstructorMessageNotNull() {
        var message01 = new I18nMessage("key01", "arg0101", "arg0102");
        var e = new UserException(message01);
        Assertions.assertArrayEquals(new I18nMessage[]{message01}, e.getI18nMessages());
        Assertions.assertEquals(message01.getKey(), e.getMessage());
        Assertions.assertEquals(null, e.getCause());
        var message02 = new I18nMessage("key02", "arg0201", "arg0202");
        e.addI18nMessage(message02);
        Assertions.assertArrayEquals(new I18nMessage[]{message01, message02}, e.getI18nMessages());
    }

    /** Teste para construtor recebendo causa nula. */
    @Test
    public void testConstructorCauseNull() {
        var e = new UserException((Throwable) null);
        Assertions.assertArrayEquals(new I18nMessage[0], e.getI18nMessages());
        Assertions.assertEquals(null, e.getMessage());
        Assertions.assertEquals(null, e.getCause());
        var message = new I18nMessage("key", "arg01", "arg02");
        e.addI18nMessage(message);
        Assertions.assertArrayEquals(new I18nMessage[]{message}, e.getI18nMessages());
    }

    /** Teste para construtor recebendo causa nula. */
    @Test
    public void testConstructorCauseNotNull() {
        var cause = new IllegalArgumentException("mensagem");
        var e = new UserException(cause);
        Assertions.assertArrayEquals(new I18nMessage[0], e.getI18nMessages());
        Assertions.assertEquals(null, e.getMessage());
        Assertions.assertEquals(cause, e.getCause());
        var message = new I18nMessage("key", "arg01", "arg02");
        e.addI18nMessage(message);
        Assertions.assertArrayEquals(new I18nMessage[]{message}, e.getI18nMessages());
    }

    /** Teste para construtor recebendo mensagem nula e causa nula. */
    @Test
    public void testConstructorMessageNullCauseNull() {
        var e = new UserException((I18nMessage) null, (Throwable) null);
        Assertions.assertArrayEquals(new I18nMessage[0], e.getI18nMessages());
        Assertions.assertEquals(null, e.getMessage());
        Assertions.assertEquals(null, e.getCause());
        var message = new I18nMessage("key", "arg01", "arg02");
        e.addI18nMessage(message);
        Assertions.assertArrayEquals(new I18nMessage[]{message}, e.getI18nMessages());
    }

    /** Teste para construtor recebendo mensagem nula e causa preenchida. */
    @Test
    public void testConstructorMessageNullCauseNotNull() {
        var cause = new IllegalArgumentException("mensagem");
        var e = new UserException((I18nMessage) null, cause);
        Assertions.assertArrayEquals(new I18nMessage[0], e.getI18nMessages());
        Assertions.assertEquals(null, e.getMessage());
        Assertions.assertEquals(cause, e.getCause());
        var message = new I18nMessage("key", "arg01", "arg02");
        e.addI18nMessage(message);
        Assertions.assertArrayEquals(new I18nMessage[]{message}, e.getI18nMessages());
    }

    /** Teste para construtor recebendo mensagem preenchida e causa nula. */
    @Test
    public void testConstructorMessageNotNullCauseNull() {
        var message01 = new I18nMessage("key01", "arg0101", "arg0102");
        var e = new UserException(message01, (Throwable) null);
        Assertions.assertArrayEquals(new I18nMessage[]{message01}, e.getI18nMessages());
        Assertions.assertEquals(message01.getKey(), e.getMessage());
        Assertions.assertEquals(null, e.getCause());
        var message02 = new I18nMessage("key02", "arg0201", "arg0202");
        e.addI18nMessage(message02);
        Assertions.assertArrayEquals(new I18nMessage[]{message01, message02}, e.getI18nMessages());
    }

    /** Teste para construtor recebendo mensagem preenchida e causa preenchida. */
    @Test
    public void testConstructorMessageNotNullCauseNotNull() {
        var message01 = new I18nMessage("key01", "arg0101", "arg0102");
        var cause = new IllegalArgumentException("mensagem");
        var e = new UserException(message01, cause);
        Assertions.assertArrayEquals(new I18nMessage[]{message01}, e.getI18nMessages());
        Assertions.assertEquals(message01.getKey(), e.getMessage());
        Assertions.assertEquals(cause, e.getCause());
        var message02 = new I18nMessage("key02", "arg0201", "arg0202");
        e.addI18nMessage(message02);
        Assertions.assertArrayEquals(new I18nMessage[]{message01, message02}, e.getI18nMessages());
    }
}
