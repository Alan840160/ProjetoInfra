/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.Infraestrutura.Banco_Dados;

import br.edu.ifms.arch.service.AbstractService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;


/**
 *
 * @author 07041626105
 */
@Service
public class Banco_DadosService 
        extends AbstractService<Banco_Dados, Long, Banco_DadosForm, Banco_DadosRepository> {

    @Autowired
    @Override
    public void setRepository(Banco_DadosRepository repository) {
        super.repository = repository;
        super.setMapper(Banco_DadosMapper.INSTANCE);
    }
    
    
}