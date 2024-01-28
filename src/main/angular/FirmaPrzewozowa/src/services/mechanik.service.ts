import {HttpClient} from "@angular/common/http";
import {Injectable} from "@angular/core";
import {Observable} from "rxjs";
import {MechanikModel} from "../app/models/MechanikModel";

@Injectable({
  providedIn: 'root'
})
export class MechanikService {
  constructor(
    private httpClient: HttpClient
  ) {
  }

  private static readonly MECHANIK_ENPOINT: string ="";

  public getMechanikById(id: number): Observable<MechanikModel>{
    return this.httpClient.get<MechanikModel>(
      MechanikService.MECHANIK_ENPOINT + "/" + id
    )
  }


}
