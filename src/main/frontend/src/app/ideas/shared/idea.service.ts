import { Injectable } from '@angular/core';
import {Http} from "@angular/http";
import 'rxjs/add/operator/map';

@Injectable()
export class IdeaService {

  constructor(private http: Http) {}

  fetchIdeas(){
    return this.http
      .get('/api/ideas')
      .map(response => response.json());
  }

}
