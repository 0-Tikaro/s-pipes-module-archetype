## Convenience variables for Maven Archetype
#set($className = "${artifactIdCamelCase}Module")
##
package cz.cvut.spipes.modules;

import cz.cvut.spipes.constants.KBSS_MODULE;
import cz.cvut.spipes.engine.ExecutionContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class $className extends AnnotatedAbstractModule {
    private static final Logger LOG = LoggerFactory.getLogger(${className}.class);

    @Override
    ExecutionContext executeSelf() {
        return executionContext;
    }

    @Override
    public String getTypeURI() {
        return KBSS_MODULE.getURI() + "$className";
    }

    @Override
    public void loadConfiguration() {
    }
}
