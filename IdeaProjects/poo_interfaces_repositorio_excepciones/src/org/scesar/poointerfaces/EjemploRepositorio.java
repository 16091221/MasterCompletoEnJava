package org.scesar.poointerfaces;

import org.scesar.poointerfaces.modelo.Cliente;
import org.scesar.poointerfaces.repositorio.*;
import org.scesar.poointerfaces.repositorio.excepciones.AccesoDatosException;
import org.scesar.poointerfaces.repositorio.excepciones.EscrituraAccesoDatosException;
import org.scesar.poointerfaces.repositorio.excepciones.LecturaAccesoDatoException;
import org.scesar.poointerfaces.repositorio.excepciones.RegistroDuplicadoAccesoDatosException;
import org.scesar.poointerfaces.repositorio.lista.ClienteListRepositorio;

import java.util.List;

public class EjemploRepositorio {
    public static void main(String[] args) {

        try {


            OrdenablePaginableCrudRepositorio<Cliente> repo = new ClienteListRepositorio();
            repo.crear(new Cliente("Jano", "Pérez"));
            repo.crear(new Cliente("Bea", "González"));
            repo.crear(new Cliente("Luci", "Martinez"));
            Cliente andres = new Cliente("Andrés", "Guzman");
            repo.crear(andres);
            repo.crear(andres);

            repo.crear(null);
            List<Cliente> clientes = repo.listar();
            clientes.forEach(System.out::println);

            System.out.println("===== paginable =====");

            List<Cliente> paginable = repo.listar(0, 2);
            paginable.forEach(System.out::println);

            System.out.println("==== ordenar ====");
            List<Cliente> clientesOrdenAsc = repo.listar("nombre", Direccion.ASC);
            for (Cliente c : clientesOrdenAsc) {
                System.out.println(c);
            }

            System.out.println("==== editar ====");
            Cliente beaActualizar = new Cliente("Bea", "Mena");
            beaActualizar.setId(2);
            repo.editar(beaActualizar);
            Cliente bea = repo.porId(2);
            System.out.println(bea);
            System.out.println("=============================");
            repo.listar("nombre", Direccion.ASC).forEach(System.out::println);

            System.out.println("===== eliminar ======");
            repo.eliminar(2);
            repo.listar().forEach(System.out::println);
            System.out.println("======= total ========");
            System.out.println("Total de registros: " + repo.total());
        }
        catch (RegistroDuplicadoAccesoDatosException e){
            System.out.println("Registro Duplicado " + e.getMessage());
            e.printStackTrace();
        }
        catch (LecturaAccesoDatoException e){
            System.out.println("Lectura: " + e.getMessage());
            e.printStackTrace();
        }
        catch (EscrituraAccesoDatosException e){
            System.out.println("Escritura: " + e.getMessage());
            e.printStackTrace();
        }
        catch (AccesoDatosException e){
            System.out.println("Generica: "+ e.getMessage());
            e.printStackTrace();
        }

    }
}
