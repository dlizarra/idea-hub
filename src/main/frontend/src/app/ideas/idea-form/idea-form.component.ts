import {Component} from "@angular/core";
import {Idea} from "../shared/idea.model";
import {ROUTER_DIRECTIVES} from "@angular/router";

@Component({
  moduleId: module.id,
  selector: 'dl-idea-form',
  templateUrl: 'idea-form.component.html',
  styleUrls: ['idea-form.component.css'],
  directives: [ROUTER_DIRECTIVES]
})
export class IdeaFormComponent {

  idea: any = {}

  constructor() {}


}
