package com.example.Trabalho;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.CacheEvict;

import java.util.List;
import java.util.Optional;

@Service
public class ImovelService {

    private final ImovelRepository imovelRepository;

    @Autowired
    public ImovelService(ImovelRepository imovelRepository) {
        this.imovelRepository = imovelRepository;
    }

    // Create
    public Imovel createImovel(Imovel imovel) {
        return imovelRepository.save(imovel);
    }

    // Read
    @Cacheable(value = "imovel", key = "#id")
    public Optional<Imovel> getImovel(String id) {
        return imovelRepository.findById(id);
    }

    public List<Imovel> getAllImoveis() {
        return imovelRepository.findAll();
    }

    // Update
    @CacheEvict(value = "imovel", key = "#imovel.id")
    public Imovel updateImovel(Imovel imovel) {
        return imovelRepository.save(imovel);
    }

    // Delete
    @CacheEvict(value = "imovel", key = "#id")
    public void deleteImovel(String id) {
        imovelRepository.deleteById(id);
    }
}
