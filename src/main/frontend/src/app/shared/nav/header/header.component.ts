import {Component} from "@angular/core";
import {ROUTER_DIRECTIVES} from "@angular/router";


@Component({
  moduleId: module.id,
  selector: 'dl-header',
  templateUrl: 'header.component.html',
  styleUrls: ['header.component.css'],
  directives: [ROUTER_DIRECTIVES]
})
export class HeaderComponent {

  constructor() {}


}
