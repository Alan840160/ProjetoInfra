/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.Infraestrutura.AD;

import br.edu.ifms.arch.dto.AdapterBaseObjectForm;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 *
 * @author 07041626105
 */
@SuperBuilder
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class SegurancaForm extends AdapterBaseObjectForm {
    
    private String secureConnection;
private String encryptionAlgorithm;
private String authenticationMethod;
}
