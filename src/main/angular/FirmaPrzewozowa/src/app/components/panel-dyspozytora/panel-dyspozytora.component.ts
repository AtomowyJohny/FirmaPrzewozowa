import {Component, OnInit} from '@angular/core';
import {AutobusService} from "../../../services/autobus-service.service";
import {Autobus} from "../../models/Autobus";

@Component({
  selector: 'app-panel-dyspozytora',
  standalone: true,
  imports: [],
  templateUrl: './panel-dyspozytora.component.html',
  styleUrl: './panel-dyspozytora.component.css'
})
export class PanelDyspozytoraComponent implements OnInit {

  autobusy: Autobus[] = [];

  constructor(
    private _autobusService: AutobusService
  ) {
  }



  ngOnInit() {
    // this.getAutobusy();
  }


  // getAutobusy(): void{
  //   this._autobusService.fetchAllBuses().subscribe(
  //     bus => {
  //       this.autobusy = autobusy
  //     }
  //   )
  // }

  assignBusToWorker(): void {
  }

  removeBusFromWorker(): void {
  }

  goToWorkerAddition(): void {
  }
}
