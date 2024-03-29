import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {AutobusModel} from "../app/models/AutobusModel";
@Injectable({
  providedIn: 'root'
})
export class AutobusService {
  constructor(
    private httpClient: HttpClient
  ) {
  }

  private static readonly AUTOBUS_ENDPOINT: string = 'http://localhost:8080/autobusy';

  public fetchAllBuses(): Observable<AutobusModel[]> {
    return this.httpClient.get<AutobusModel[]>(
      AutobusService.AUTOBUS_ENDPOINT
    );
  }

  public getAutobusById(id: number): Observable<AutobusModel> {
    return this.httpClient.get<AutobusModel>(
      AutobusService.AUTOBUS_ENDPOINT + "/" + id
    )
  }
}
