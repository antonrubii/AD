package com.accidentes.repository;
import com.accidentes.model.Accidente;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Repository implements Repositoryinterface{
    private final Logger logger = LoggerFactory.getLogger(Repository.class.getName());


    private final Map<String, Repository> repositories = new HashMap<>();

    @Override
    public List<Repository> getAll() {
        logger.debug("obteniendo accidentes");
        return repositories.values().stream().toList();
    }
    @Override
    public Accidente getbyId(String numero_accidente) {
        logger.debug("obteniendo accidente {}" + numero_accidente );
        return repositories.get(numero_accidente);
    }
    @Override
    public Accidente save(Accidente accidente) {
        logger.debug("save accidente {}",accidente);
        String numero_accidente = repositories.keySet().stream().mapToInt(Integer::intValue).max().orElse(0) + 1;
        Accidente accidenteconId = Accidente.withId(numero_accidente);
        repositories.put(numero_accidente,accidenteconId);
        return accidenteconId;
    }

    @Override
    public Accidente update(Accidente accidente, String numero_accidente) {
        logger.debug("update accidente {}",numero_accidente);
        return repositories.put(numero_accidente,accidente);
    }
    @Override
    public Accidente delete(String numero_accidente){
        logger.debug("delete accidente {}",numero_accidente);
        return repositories.remove(numero_accidente);
    }
}
