import { Component, OnInit } from '@angular/core';

@Component({
  moduleId: module.id,
  selector: 'dl-new-user',
  templateUrl: 'new-user.component.html',
  styleUrls: ['new-user.component.css']
})
export class NewUserComponent {

  username: string = '';
  password: string = '';

  constructor() {}

}
