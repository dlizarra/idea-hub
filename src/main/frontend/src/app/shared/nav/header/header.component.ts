import { Component, ViewChild } from "@angular/core";
import { AuthService } from "../../auth.service";



@Component({
  moduleId: module.id,
  selector: 'dl-header',
  templateUrl: 'header.component.html',
  styleUrls: ['header.component.css'],

})
export class HeaderComponent {


  constructor(private authService: AuthService) {
  }


}
