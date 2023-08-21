package dev.fischermatte.blog;

import org.junit.jupiter.api.Test;
import org.springframework.modulith.core.ApplicationModules;
import org.springframework.modulith.docs.Documenter;

public class ModulithTests {

    @Test
    public void writeDocumentation() {
        var modules = ApplicationModules.of(DummyShop.class).verify();
        new Documenter(modules)
                .writeModulesAsPlantUml();
    }
}
