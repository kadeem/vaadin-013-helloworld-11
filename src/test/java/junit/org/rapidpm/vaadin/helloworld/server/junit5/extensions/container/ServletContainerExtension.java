package junit.org.rapidpm.vaadin.helloworld.server.junit5.extensions.container;

import org.junit.jupiter.api.extension.AfterEachCallback;
import org.junit.jupiter.api.extension.BeforeEachCallback;
import org.junit.jupiter.api.extension.TestExtensionContext;
import org.rapidpm.vaadin.server.Main;

/**
 *
 */
public class ServletContainerExtension implements BeforeEachCallback, AfterEachCallback {


  @Override
  public void beforeEach(TestExtensionContext context) throws Exception {
    Main.start();
  }


  @Override
  public void afterEach(TestExtensionContext context) throws Exception {
    Main.shutdown();
  }

}
