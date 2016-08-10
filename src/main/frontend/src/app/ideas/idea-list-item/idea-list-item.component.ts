import { Component, OnInit, Input } from '@angular/core';
import { Idea } from "../shared";

@Component({
  moduleId: module.id,
  selector: 'dl-idea-list-item',
  templateUrl: 'idea-list-item.component.html',
  styleUrls: ['idea-list-item.component.css']
})
export class IdeaListItemComponent {

  @Input() idea: Idea;

  constructor() {}

}
