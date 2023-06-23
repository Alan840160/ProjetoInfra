/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.Infraestrutura.AD;

import br.edu.ifms.arch.BaseObjectMapper;
import br.edu.ifms.arch.ISimpleMapper;
import org.mapstruct.InheritConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

/**
 *
 * @author 07041626105
 */
@Mapper(
        config = BaseObjectMapper.class
)
public interface SegurancaMapper extends ISimpleMapper<Seguranca, SegurancaDto, SegurancaForm> {

    public static final SegurancaMapper INSTANCE = Mappers.getMapper(SegurancaMapper.class);

    @InheritConfiguration(name = "toEntity")
    @Override
    public Seguranca formToEntity(SegurancaForm dto);
    
    @InheritConfiguration(name = "update")
    @Mapping(target = "id", ignore = true)
    @Override
    public Seguranca update(SegurancaForm dto, @MappingTarget Seguranca entity);

    
}
