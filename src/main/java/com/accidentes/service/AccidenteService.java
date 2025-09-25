package com.accidentes.service;

import com.accidentes.model.Accidente;
import com.accidentes.repository.Repository;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.util.List;
import java.util.logging.Logger;

public class AccidenteService {
    private final Logger logger = LoggerFactory.getLogger(Repository.class.getName());

    private final AccidenteStorage storage;
    private final Repository repository;






    public AccidenteService(AccidenteStorage storage,Repository repository){
        this.storage = storage;
        this.repository = repository;
    }
    @Override
    public List<Accidente> readFromFile(String path){
        logger.info("Reading accidentes from file" + path);
        return storage.readFromFile(new File(path))
    }


    @Override
    public void writeToFile(String path,List<Accidente> accidentes){
        logger.info("Writing accidentes to file" + path);
        storage.writeToFile(new File(path),accidentes);
    }
}



