import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Autobus} from "../app/models/Autobus";
@Injectable({
  providedIn: 'root'
})
export class AutobusService {
  constructor(
    private httpClient: HttpClient
  ) {
  }

  private static readonly AUTOBUS_ENDPOINT: string = 'http://localhost:8080/autobusy';

  public fetchAllBuses(): Observable<Autobus[]> {
    return this.httpClient.get<Autobus[]>(
      AutobusService.AUTOBUS_ENDPOINT
    );
  }
}
