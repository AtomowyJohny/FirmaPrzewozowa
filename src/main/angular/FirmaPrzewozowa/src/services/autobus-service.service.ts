import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {autobus} from "../app/models/autobus";

@Injectable({
  providedIn: 'root'
})
export class AutobusService {
  constructor(
    private httpClient: HttpClient
  ) {
  }

  private static readonly AUTOBUS_ENDPOINT: string = 'http://localhost:8080/autobusy';

  public fetchAllBuses(): Observable<autobus[]> {
    return this.httpClient.get<autobus[]>(
      AutobusService.AUTOBUS_ENDPOINT
    );
  }
}
