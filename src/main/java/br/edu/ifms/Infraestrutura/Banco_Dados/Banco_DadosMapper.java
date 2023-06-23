/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.Infraestrutura.Banco_Dados;

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
public interface Banco_DadosMapper extends ISimpleMapper<Banco_Dados, Banco_DadosDto, Banco_DadosForm> {

    public static final Banco_DadosMapper INSTANCE = Mappers.getMapper(Banco_DadosMapper.class);

    @InheritConfiguration(name = "toEntity")
    @Override
    public Banco_Dados formToEntity(Banco_DadosForm dto);
    
    @InheritConfiguration(name = "update")
    @Mapping(target = "id", ignore = true)
    @Override
    public Banco_Dados update(Banco_DadosForm dto, @MappingTarget Banco_Dados entity);

    
}
