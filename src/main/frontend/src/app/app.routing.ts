import { Routes, RouterModule } from '@angular/router';

import { IdeaListComponent } from "./ideas/idea-list/idea-list.component";
import { IdeaFormComponent } from "./ideas/idea-form/idea-form.component";


const routes: Routes = [
  {path: '', redirectTo: '/ideas', pathMatch: 'full'},
  {path: 'ideas', component: IdeaListComponent},
  {path: 'ideas/new', component: IdeaFormComponent, pathMatch: 'full'}
];

export const routing = RouterModule.forRoot(routes);
