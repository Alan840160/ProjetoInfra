/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.Infraestrutura.AD;


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
@RequestMapping("/api/Seguranca")
public class SegurancaController 
        extends AbstractSimpleController<Seguranca, Long, SegurancaDto, SegurancaForm, SegurancaRepository, SegurancaService>  {

    @Autowired
    @Override
    public void setService(SegurancaService service) {
        super.service = service;
        super.setMapper(SegurancaMapper.INSTANCE);
    }

    @Override
    public URI createUri(Seguranca entity, UriComponentsBuilder uriBuilder) {
        return uriBuilder.path("/api/Seguranca/{id}")
                .buildAndExpand(entity.getId())
                .toUri();
    }
}
