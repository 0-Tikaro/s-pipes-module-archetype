## Convenience variables for Maven Archetype
#set($testClassName = "${artifactIdCamelCase}ModuleTest")
#set($className = "${artifactIdCamelCase}Module")
##
package cz.cvut.spipes.modules;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

/**
 * @see cz.cvut.spipes.modules.$className
 */
public class $testClassName {

    private $className module;

    @BeforeEach
    public void setUp() {
        module = new $className();
    }

    @Test
    public void loadConfiguration_doesNotThrow() {
        assertDoesNotThrow(() -> module.loadConfiguration());
    }
}