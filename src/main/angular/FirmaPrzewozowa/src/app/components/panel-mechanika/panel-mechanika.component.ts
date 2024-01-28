import {Component, OnInit} from '@angular/core';
import {FormsModule} from "@angular/forms";
import {AutobusService} from "../../../services/autobus-service.service";
import {Autobus} from "../../models/Autobus";
@Component({
  selector: 'app-panel-mechanika',
  standalone: true,
  imports: [
    FormsModule
  ],
  templateUrl: './panel-mechanika.component.html',
  styleUrl: './panel-mechanika.component.css',
  providers: [AutobusService]
})
export class PanelMechanikaComponent implements OnInit {
  chargingLevel: number = 50;

  mechanikId: number = 1;

  autobusy: Autobus[] = []

  constructor(
    private _autobusService: AutobusService
  ) {
  }

  ngOnInit() {
    this._autobusService.fetchAllBuses().subscribe(
      buses => {
        this.autobusy = buses;
        console.log(this.autobusy)
      }
    )
  }


}
