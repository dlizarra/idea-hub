import { Component, ViewChild } from "@angular/core";
import { AuthService } from "../../auth.service";
import { MODAL_DIRECTIVES } from "ng2-bs3-modal/ng2-bs3-modal";



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
