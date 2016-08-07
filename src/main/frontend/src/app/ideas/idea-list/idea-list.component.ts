import {Component, OnInit} from "@angular/core";
import {IdeaListItemComponent} from "../idea-list-item";
import {IdeaService} from "../shared";
import {Idea} from "../shared";
import {User} from "../../users";
import * as moment from 'moment';

@Component({
  moduleId: module.id,
  selector: 'dl-idea-list',
  templateUrl: 'idea-list.component.html',
  styleUrls: ['idea-list.component.css'],
  directives: [IdeaListItemComponent]
})
export class IdeaListComponent implements OnInit{
  ideaList: Idea[] = [];


  constructor(private ideaService: IdeaService) {}

  ngOnInit() {
    this.ideaService.fetchIdeas()
      .subscribe(data => {
        this.ideaList = data.map(item => {
          return new Idea(item.id,
                          item.name,
                          undefined,
                          moment(item.creationTime).fromNow(),
                          new User(item.creator.id,
                                  item.creator.username)
                          );
        })
      })
  }

}
