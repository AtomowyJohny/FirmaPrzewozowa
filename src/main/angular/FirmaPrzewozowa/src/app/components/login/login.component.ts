import { Component } from '@angular/core';
import {FormsModule} from "@angular/forms";

@Component({
  selector: 'app-login',
  standalone: true,
  imports: [
    FormsModule
  ],
  templateUrl: './login.component.html',
  styleUrl: './login.component.css'
})
export class LoginComponent {
  user = {
    login: '',
    password: ''
  };

  onSubmit(): void {
    console.log('Dane logowania:', this.user);
  }

  onRegister(): void {
    console.log('Przekierowanie do rejestracji');
  }

}
