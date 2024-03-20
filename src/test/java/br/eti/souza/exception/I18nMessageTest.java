package br.eti.souza.exception;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Testes para br.eti.souza.exception.I18nMessage
 * @author Alan Moraes Souza
 */
public class I18nMessageTest {

    /** Teste para construtor recebendo string nula. */
    @Test
    public void testConstructorStringNull() {
        var message = new I18nMessage(null);
        Assertions.assertEquals("null", message.getKey());
        Assertions.assertArrayEquals(new String[0], message.getArgs());
    }

    /** Teste para construtor recebendo string vazia. */
    @Test
    public void testConstructorStringEmpty() {
        var message = new I18nMessage("");
        Assertions.assertEquals("", message.getKey());
        Assertions.assertArrayEquals(new String[0], message.getArgs());
    }

    /** Teste para construtor recebendo string preenchida. */
    @Test
    public void testConstructorStringNotEmpty() {
        var message = new I18nMessage("key");
        Assertions.assertEquals("key", message.getKey());
        Assertions.assertArrayEquals(new String[0], message.getArgs());
    }

    /** Teste para construtor recebendo string nula e array de strings nulas. */
    @Test
    public void testConstructorStringNullArrayOfNull() {
        var message = new I18nMessage(null, null, null, null);
        Assertions.assertEquals("null", message.getKey());
        Assertions.assertArrayEquals(new String[]{"null", "null", "null"}, message.getArgs());
    }

    /** Teste para construtor recebendo string nula e array de strings vazias. */
    @Test
    public void testConstructorStringNullArrayOfEmpty() {
        var message = new I18nMessage(null, "", "", "");
        Assertions.assertEquals("null", message.getKey());
        Assertions.assertArrayEquals(new String[]{"", "", ""}, message.getArgs());
    }

    /** Teste para construtor recebendo string nula e array de strings preenchidas. */
    @Test
    public void testConstructorStringNullArrayOfNotEmpty() {
        var message = new I18nMessage(null, "arg01", "arg02", "arg03");
        Assertions.assertEquals("null", message.getKey());
        Assertions.assertArrayEquals(new String[]{"arg01", "arg02", "arg03"}, message.getArgs());
    }

    /** Teste para construtor recebendo string vazia e array de strings nulas. */
    @Test
    public void testConstructorStringEmptyArrayOfNull() {
        var message = new I18nMessage("", null, null, null);
        Assertions.assertEquals("", message.getKey());
        Assertions.assertArrayEquals(new String[]{"null", "null", "null"}, message.getArgs());
    }

    /** Teste para construtor recebendo string vazia e array de strings vazias. */
    @Test
    public void testConstructorStringEmptyArrayOfEmpty() {
        var message = new I18nMessage("", "", "", "");
        Assertions.assertEquals("", message.getKey());
        Assertions.assertArrayEquals(new String[]{"", "", ""}, message.getArgs());
    }

    /** Teste para construtor recebendo string vazia e array de strings preenchidas. */
    @Test
    public void testConstructorStringEmptyArrayOfNotEmpty() {
        var message = new I18nMessage("", "arg01", "arg02", "arg03");
        Assertions.assertEquals("", message.getKey());
        Assertions.assertArrayEquals(new String[]{"arg01", "arg02", "arg03"}, message.getArgs());
    }

    /** Teste para construtor recebendo string preenchida e array de strings nulas. */
    @Test
    public void testConstructorStringNotEmptyArrayOfNull() {
        var message = new I18nMessage("key", null, null, null);
        Assertions.assertEquals("key", message.getKey());
        Assertions.assertArrayEquals(new String[]{"null", "null", "null"}, message.getArgs());
    }

    /** Teste para construtor recebendo string preenchida e array de strings vazias. */
    @Test
    public void testConstructorStringNotEmptyArrayOfEmpty() {
        var message = new I18nMessage("key", "", "", "");
        Assertions.assertEquals("key", message.getKey());
        Assertions.assertArrayEquals(new String[]{"", "", ""}, message.getArgs());
    }

    /** Teste para construtor recebendo string preenchida e array de strings preenchidas. */
    @Test
    public void testConstructorStringNotEmptyArrayOfNotEmpty() {
        var message = new I18nMessage("key", "arg01", "arg02", "arg03");
        Assertions.assertEquals("key", message.getKey());
        Assertions.assertArrayEquals(new String[]{"arg01", "arg02", "arg03"}, message.getArgs());
    }
}
