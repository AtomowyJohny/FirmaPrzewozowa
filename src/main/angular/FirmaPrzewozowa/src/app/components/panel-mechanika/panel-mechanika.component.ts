import {Component, OnInit} from '@angular/core';
import {FormsModule} from "@angular/forms";
import {AutobusService} from "../../../services/autobus.service";
import {AutobusModel} from "../../models/AutobusModel";
import {NgIf} from "@angular/common";
import {MechanikService} from "../../../services/mechanik.service";
import {MechanikModel} from "../../models/MechanikModel";
@Component({
  selector: 'app-panel-mechanika',
  standalone: true,
  imports: [
    FormsModule,
    NgIf
  ],
  templateUrl: './panel-mechanika.component.html',
  styleUrl: './panel-mechanika.component.css',
  providers: [AutobusService, MechanikService],
})
export class PanelMechanikaComponent implements OnInit {
  chargingLevel: number = 50;

  mechanikId: number = 1;

  mechanik: MechanikModel = {id: 0, premia:0, stopienDoswiadczenia: 0, dodatekDoPremiiZaDoswiadczenie: 0, dataUrodzenia: new Date(), dataZatrudnienia: new Date(), dodatekOdLatPracy: 0, imie: "", mnoznikWyplaty: 0, nazwisko: "", numerTelefonu: 0, pesel: 0, stawkaBazowa: 0, wiek: 0};

  autobusy: AutobusModel[] = []

  oneBus: AutobusModel = {id :0, przebieg:0, zasieg:0, iloscMiejsc:0, rokProdukcji:0, model: "", mocNetto:0 }


  constructor(
    private _autobusService: AutobusService,
    private _mechanikService: MechanikService
  ) {
  }

  ngOnInit() {
    this._autobusService.fetchAllBuses().subscribe(
      buses => {
        this.autobusy = buses;
        // console.log(this.autobusy)
      }
    )
    this._autobusService.getAutobusById(1).subscribe(
      bus => {
        this.oneBus = bus;
        // console.log(bus)
      }
    )
    this._mechanikService.getMechanikById(this.mechanikId).subscribe(
      mechanik =>{
        this.mechanik = mechanik
      }
    )
  }




}
