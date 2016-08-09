import {provideRouter, RouterConfig} from "@angular/router";
import {IdeaListComponent} from "./ideas/idea-list/idea-list.component";
import {IdeaFormComponent} from "./ideas/idea-form/idea-form.component";


const routes: RouterConfig = [
  { path: '', redirectTo: '/ideas', pathMatch: 'full' },
  { path: 'ideas', component: IdeaListComponent },
  { path: 'ideas/new', component: IdeaFormComponent, pathMatch: 'full'}
];

export const APP_ROUTER_PROVIDERS = [
  provideRouter(routes)
];
