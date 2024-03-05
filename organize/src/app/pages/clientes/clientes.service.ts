import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { ClientesResponseDTO } from '../../interface/ClientesResponseDTO';

@Injectable({
  providedIn: 'root'
})
export class ClientesService {

  constructor(private http: HttpClient) { }

  getAllClientes(page: number, size: number): Observable<ClientesResponseDTO[]> {
    return this.http.get<ClientesResponseDTO[]>(`http://localhost:8081/api/v1/clientes?page=0&size=100`);
  }
}
