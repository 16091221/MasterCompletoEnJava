import { Component, OnInit } from '@angular/core';
import { Cliente } from './cliente';
import { ClienteService } from './cliente.service';
import { Router, ActivatedRoute } from '@angular/router';
import swal from 'sweetalert2';

@Component({
  selector: 'app-form',
  templateUrl: './form.component.html'
})
export class FormComponent implements OnInit {

  public cliente: Cliente = new Cliente();
  public titulo: string = "Crear Cliente"

  constructor(public clienteService: ClienteService, public router: Router, public activatedRoute: ActivatedRoute) { }

  ngOnInit() {
    this.cargarCliente();
  }

  cargarCliente(): void{
    this.activatedRoute.params.subscribe(
      params => {
        let id = params['id']
        if(id){
          this.clienteService.getCliente(id).subscribe(cliente => this.cliente = cliente)
        }
      }
    )
  }

  create(): void{
    this.clienteService.create(this.cliente).subscribe(
      cliente => {
      this.router.navigate(['/clientes'])
      swal.fire('Cliente Guardado', `El cliente ${cliente.nombre} ha sido creado con éxito`, `success`)
    }
    )
  }

  update():void{
    this.clienteService.update(this.cliente).subscribe(
      json => {
        this.router.navigate(['/clientes'])
        swal.fire('Cliente Actualizado', `${json.mensaje}: ${json.cliente.nombre}`, 'success')
      }
    )
  }

}
