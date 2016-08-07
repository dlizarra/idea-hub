import {User} from "../../users";
export class Idea {

  constructor(public id: number,
              public name: string,
              public description?: string,
              public creationTime?: string,
              public creator?: User) {
    this.id = id;
    this.name = name;
    this.description = description;
    this.creator = creator;
  }

}
