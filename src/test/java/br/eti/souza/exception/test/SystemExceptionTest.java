package br.eti.souza.exception.test;

import br.eti.souza.exception.SystemException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Testes para br.eti.souza.i18n.Message
 * @author Alan Moraes Souza
 */
public class SystemExceptionTest {

    @Test
    @DisplayName("Teste do construtor com apenas mensagem nula")
    public void constructorWithMessageNull() {
        SystemException e = new SystemException(null);
        Assertions.assertTrue("null".equals(e.getMessage()));
        Assertions.assertNull(e.getCause());
    }

    @Test
    @DisplayName("Teste do construtor com apenas mensagem vazia")
    public void constructorWithMessageEmpty() {
        SystemException e = new SystemException("");
        Assertions.assertTrue("".equals(e.getMessage()));
        Assertions.assertNull(e.getCause());
    }

    @Test
    @DisplayName("Teste do construtor com mensagem nula e causa nula")
    public void constructorWithMessageNullAndCauseNull() {
        SystemException e = new SystemException(null, null);
        Assertions.assertTrue("null".equals(e.getMessage()));
        Assertions.assertNull(e.getCause());
    }

    @Test
    @DisplayName("Teste do construtor com mensagem e causa expecificada")
    public void constructorWithMessageEmptyAndCause() {
        Throwable c = new NullPointerException();
        SystemException e = new SystemException("mensagem", c);
        Assertions.assertTrue("mensagem".equals(e.getMessage()));
        Assertions.assertEquals(c, e.getCause());
    }
}
