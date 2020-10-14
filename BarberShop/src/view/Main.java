/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import model.Cliente;
import model.Servico;
import model.Usuario;

/**
 *
 * @author Samuel
 */
public class Main {
    
    
    public static void main(String[] args) {
        
        String nome = "Samuel";
        
        System.out.println(nome);
        
        Servico servico = new Servico(1,"barba",30);
        
        System.out.println(servico.getDescricao());
        System.out.println(servico.getValor());
        
        
        Cliente cliente =  new Cliente(1, "Samuel", "Rua Mains alves 225", "87600-000");
        System.out.println(cliente.getNome());
        
        Usuario usuario = new Usuario(2, "admin", "123");
        System.out.println(usuario.getNome());
        
        
        
        
        
    }
    
    
}
