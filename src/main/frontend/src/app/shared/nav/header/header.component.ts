import { Component } from "@angular/core";
import { POPOVER_DIRECTIVES } from "ng2-popover";
import { AuthService } from "../../auth.service";


@Component({
  moduleId: module.id,
  selector: 'dl-header',
  templateUrl: 'header.component.html',
  styleUrls: ['header.component.css'],
  directives: [POPOVER_DIRECTIVES]
})
export class HeaderComponent {

  constructor(private authService: AuthService) {
  }


}
