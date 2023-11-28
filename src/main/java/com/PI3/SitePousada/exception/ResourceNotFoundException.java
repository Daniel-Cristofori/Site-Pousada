/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.PI3.SitePousada.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 *
 * @author Daniel
 */

@ResponseStatus(HttpStatus.NOT_FOUND) 
public class ResourceNotFoundException extends RuntimeException { 

    public ResourceNotFoundException(String mensagem) { 

    super(mensagem); 

    } 
    
}
