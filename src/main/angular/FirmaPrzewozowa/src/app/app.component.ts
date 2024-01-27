import {Component, OnInit} from '@angular/core';
import { RouterOutlet } from '@angular/router';
import {LoginComponent} from "./components/login/login.component";
import {RegisterComponent} from "./components/register/register.component";
import {PanelDyspozytoraComponent} from "./components/panel-dyspozytora/panel-dyspozytora.component";
import {PanelMechanikaComponent} from "./components/panel-mechanika/panel-mechanika.component";

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet, LoginComponent, RegisterComponent, PanelDyspozytoraComponent, PanelMechanikaComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent implements OnInit{
  title = 'FirmaPrzewozowa';

  ngOnInit() {
  }
}
