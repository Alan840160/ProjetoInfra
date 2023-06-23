/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.Infraestrutura.Rede;


import br.edu.ifms.Infraestrutura.Banco_Dados.*;
import br.edu.ifms.arch.controller.AbstractSimpleController;
import java.net.URI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

/**
 *
 * @author 07041626105
 */
@RestController
@RequestMapping("/api/rede")
public class RedeController 
        extends AbstractSimpleController<Banco_Dados, Long, Banco_DadosDto, Banco_DadosForm, Banco_DadosRepository, Banco_DadosService>  {

    @Autowired
    @Override
    public void setService(Banco_DadosService service) {
        super.service = service;
        super.setMapper(Banco_DadosMapper.INSTANCE);
    }

    @Override
    public URI createUri(Banco_Dados entity, UriComponentsBuilder uriBuilder) {
        return uriBuilder.path("/api/Banco_Dados/{id}")
                .buildAndExpand(entity.getId())
                .toUri();
    }
}
