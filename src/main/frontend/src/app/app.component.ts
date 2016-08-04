import {Component, ViewEncapsulation} from "@angular/core";
import {HeaderComponent} from "./shared/nav/header/header.component";
import {ROUTER_DIRECTIVES, } from "@angular/router";


@Component({
  moduleId: module.id,
  selector: 'dl-root',
  templateUrl: 'app.component.html',
  styleUrls: ['app.component.css'],
  encapsulation: ViewEncapsulation.None,
  directives: [HeaderComponent, ROUTER_DIRECTIVES]
})
export class AppComponent {
  title = 'app works!';

}
