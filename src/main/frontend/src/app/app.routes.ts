import {provideRouter, RouterConfig} from "@angular/router";
import {IdeaListComponent} from "./ideas/idea-list/idea-list.component";


const routes: RouterConfig = [
  { path: '', redirectTo: '/ideas', pathMatch: 'full' },
  { path: 'ideas', component: IdeaListComponent }

];

export const APP_ROUTER_PROVIDERS = [
  provideRouter(routes)
];
