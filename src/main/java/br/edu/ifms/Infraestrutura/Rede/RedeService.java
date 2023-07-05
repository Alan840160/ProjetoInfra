/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.Infraestrutura.Rede;

import br.edu.ifms.arch.service.AbstractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author 04499997186
 */
@Service
class RedeService extends AbstractService<Rede, Long, RedeForm, RedeRepository> {

    @Autowired
    @Override
    public void setRepository(RedeRepository repository) {
        super.repository = repository;
        super.setMapper(RedeMapper.INSTANCE);
    }
}
