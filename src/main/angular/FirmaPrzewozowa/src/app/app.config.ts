import { ApplicationConfig } from '@angular/core';
import { provideRouter } from '@angular/router';

import { routes } from './app.routes';
import {AutobusService} from "../services/autobus.service";
import {HTTP_INTERCEPTORS} from "@angular/common/http";

export const appConfig: ApplicationConfig = {
  providers: [
    provideRouter(routes),
    {provide: AutobusService}
  ]
};
