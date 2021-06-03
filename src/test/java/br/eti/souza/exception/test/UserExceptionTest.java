package br.eti.souza.exception.test;

import br.eti.souza.exception.UserException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Testes para br.eti.souza.i18n.Message
 * @author Alan Moraes Souza
 */
public class UserExceptionTest {

    @Test
    @DisplayName("Teste do construtor vazio")
    public void constructorEmpty() {
        UserException e = new UserException();
        Assertions.assertTrue(null == e.getMessage());
        Assertions.assertTrue(!e.haveMessages());
    }

    @Test
    @DisplayName("Teste do construtor com mensagem")
    public void constructorWithMessage() {
        UserException e = new UserException("key1", "arg1", "arg2");
        Assertions.assertTrue(e.haveMessages());
        Assertions.assertTrue("key1".equals(e.getMessages().get(0).getKey()));
        Assertions.assertArrayEquals(new String[]{"arg1", "arg2"}, e.getMessages().get(0).getArgs());
    }

    @Test
    @DisplayName("Teste da adição de mensagens")
    public void addMessages() {
        UserException e = new UserException();
        Assertions.assertTrue(!e.haveMessages());
        e.addMessage("key1", "arg1", "arg2");
        Assertions.assertTrue(e.haveMessages());
        Assertions.assertTrue("key1".equals(e.getMessages().get(0).getKey()));
        Assertions.assertArrayEquals(new String[]{"arg1", "arg2"}, e.getMessages().get(0).getArgs());
        e.addMessage("key2", "arg3");
        Assertions.assertTrue(e.haveMessages());
        Assertions.assertTrue("key2".equals(e.getMessages().get(1).getKey()));
        Assertions.assertArrayEquals(new String[]{"arg3"}, e.getMessages().get(1).getArgs());
    }
}
