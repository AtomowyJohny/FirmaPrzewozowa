import {HttpClient} from "@angular/common/http";
import {Injectable} from "@angular/core";
import {Observable} from "rxjs";
import {MechanikModel} from "../app/models/MechanikModel";
import {AutobusModel} from "../app/models/AutobusModel";

@Injectable({
  providedIn: 'root'
})
export class MechanikService {
  constructor(
    private httpClient: HttpClient
  ) {
  }

  private static readonly MECHANIK_ENPOINT: string ="http://localhost:8080/mechanik";

  public getMechanikById(id: number): Observable<MechanikModel>{
    return this.httpClient.get<MechanikModel>(
      MechanikService.MECHANIK_ENPOINT + "/" + id
    )
  }

  public getAutobusyMechanika(id: number): Observable<AutobusModel[]>{
    return this.httpClient.get<AutobusModel[]>(
      MechanikService.MECHANIK_ENPOINT + "/" + id + "/" + "autobusy"
    )
  }


}
