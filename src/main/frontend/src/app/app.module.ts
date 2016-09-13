import { NgModule } from "@angular/core";
import { BrowserModule } from "@angular/platform-browser";
import { HttpModule } from "@angular/http";
import { FormsModule } from "@angular/forms";
import { AppComponent } from "./app.component";
import { IdeaService } from "./ideas/shared/idea.service";
import { HeaderComponent } from "./shared/nav/header/header.component";
import { IdeaFormComponent } from "./ideas/idea-form/idea-form.component";
import { IdeaListComponent } from "./ideas/idea-list/idea-list.component";
import { IdeaListItemComponent } from "./ideas/idea-list-item/idea-list-item.component";
import { routing } from "./app.routing";
import { POPOVER_DIRECTIVES } from "ng2-popover";
import { LoginComponent } from "./users/login";
import { AuthService } from "./shared/auth.service";
import { NewUserComponent } from "./users/new-user/new-user.component";
import { Ng2Bs3ModalModule } from "ng2-bs3-modal/ng2-bs3-modal";



@NgModule({
  imports: [
    BrowserModule,
    HttpModule,
    FormsModule,
    routing,
    Ng2Bs3ModalModule
  ],
  declarations: [
    AppComponent,
    HeaderComponent,
    IdeaFormComponent,
    IdeaListComponent,
    IdeaListItemComponent,
    LoginComponent,
    NewUserComponent,
    POPOVER_DIRECTIVES
  ],
  bootstrap: [AppComponent],
  providers: [
    AuthService,
    IdeaService,
  ]
})
export class AppModule {
}
