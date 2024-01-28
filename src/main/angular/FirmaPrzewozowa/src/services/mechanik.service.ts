import {HttpClient} from "@angular/common/http";
import {Injectable} from "@angular/core";

@Injectable({
  providedIn: 'root'
})
export class MechanikService {
  constructor(
    private httpClient: HttpClient
  ) {
  }

  private static readonly MECHANIK_ENPOINT: string ="";
}
