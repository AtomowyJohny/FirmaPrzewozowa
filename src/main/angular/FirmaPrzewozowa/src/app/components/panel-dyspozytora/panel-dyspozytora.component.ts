import {Component, OnInit} from '@angular/core';
import {AutobusService} from "../../../services/autobus.service";
import {AutobusModel} from "../../models/AutobusModel";

@Component({
  selector: 'app-panel-dyspozytora',
  standalone: true,
  imports: [],
  templateUrl: './panel-dyspozytora.component.html',
  styleUrl: './panel-dyspozytora.component.css'
})
export class PanelDyspozytoraComponent implements OnInit {

  autobusy: AutobusModel[] = [];

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
