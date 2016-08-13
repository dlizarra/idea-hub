import { Component } from "@angular/core";

@Component({
  moduleId: module.id,
  selector: 'dl-login',
  templateUrl: 'login.component.html',
  styleUrls: ['login.component.css']
})
export class LoginComponent {

  username: string = '';
  password: string = '';

  constructor() {
  }

}
