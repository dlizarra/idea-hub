import { bootstrap } from '@angular/platform-browser-dynamic';
import { enableProdMode } from '@angular/core';
import { AppComponent, environment } from './app/';
import {APP_ROUTER_PROVIDERS} from "./app/app.routes";
import {provideForms, disableDeprecatedForms} from "@angular/forms";
import {HTTP_PROVIDERS} from "@angular/http";
import {IdeaService} from "./app/ideas/shared/idea.service";

if (environment.production) {
  enableProdMode();
}

bootstrap(AppComponent, [
  disableDeprecatedForms(),
  provideForms(),
  APP_ROUTER_PROVIDERS,
  HTTP_PROVIDERS,
  IdeaService
]);

