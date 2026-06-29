package net.MaouGaukken.CreateMechanisms.AddonsMananger;

import java.nio.file.*;
import java.io.IOException;
import java.util.List;
import java.util.logging.Logger;

public class EnableAddonRequirement {
    private static final Logger LOGGER = Logger.getLogger(EnableAddonRequirement.class.getName());

    public boolean readAddonRequirement() {
        Path path = Paths.get("config/createmechanisms-common.toml");

        if (Files.exists(path)) {
            try {
                List<String> lines = Files.readAllLines(path);
                for (String line : lines) {
                    if (line.trim().startsWith("enableAddonRequirement")) {
                        String[] parts = line.split("=");
                        if (parts.length == 2) {
                            boolean result = Boolean.parseBoolean(parts[1].trim());
                            return result;
                        }
                    }
                }
            } catch (IOException e) {
                LOGGER.severe("\n\n\n\n5-Erro ao ler arquivo: " + e.getMessage() +"\n Retornando resposta padrão: true\n\n\n\n");
                return true;
            }
        }
        return true;
    }
}

