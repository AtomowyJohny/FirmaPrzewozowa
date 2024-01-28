import {Component, OnInit} from '@angular/core';
import {FormsModule} from "@angular/forms";
import {AutobusService} from "../../../services/autobus.service";
import {AutobusModel} from "../../models/AutobusModel";
import {NgIf} from "@angular/common";
import {MechanikService} from "../../../services/mechanik.service";
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

  mechanik: any;

  autobusy: AutobusModel[] = []

  oneBus: AutobusModel = {id :1, przebieg:1, zasieg:1, iloscMiejsc:1, rokProdukcji:1, mocNetto:1 }


  constructor(
    private _autobusService: AutobusService,
    private _mechanikService: MechanikService
  ) {
  }

  ngOnInit() {
    this._autobusService.fetchAllBuses().subscribe(
      buses => {
        this.autobusy = buses;
        console.log(this.autobusy)
      }
    )
    this._autobusService.getAutobusById(1).subscribe(
      bus => {
        this.oneBus = bus;
        console.log(bus)
      }
    )
  }




}
