import { ApplicationConfig } from '@angular/core';
import { provideRouter } from '@angular/router';

import { routes } from './app.routes';
import {AutobusService} from "../services/autobus-service.service";

export const appConfig: ApplicationConfig = {
  providers: [
    provideRouter(routes),
    {provide: AutobusService}
  ]
};
