import {Component} from '@angular/core';
import {FormsModule} from "@angular/forms";
import {AutobusService} from "../../../services/autobus-service.service";

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
export class PanelMechanikaComponent {
  chargingLevel: number = 50;

  constructor(
    // private _autobusService: AutobusService
  ) {
  }


}
