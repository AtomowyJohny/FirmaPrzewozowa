import { Component } from '@angular/core';
import {FormsModule} from "@angular/forms";

@Component({
  selector: 'app-register',
  standalone: true,
  imports: [
    FormsModule
  ],
  templateUrl: './register.component.html',
  styleUrl: './register.component.css'
})
export class RegisterComponent {
  user = {
    pesel: '',
    firstName: '',
    lastName: '',
    phoneNumber: '',
    role: ''
  };

  onSubmit(): void {
    console.log('Dane rejestracyjne:', this.user);
  }

}
