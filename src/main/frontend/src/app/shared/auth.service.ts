import { Injectable } from '@angular/core';

@Injectable()
export class AuthService {

  isAuthenticated: boolean = false;

  constructor() {}

  logIn(username: string, password: string){}

  logOut(username: string){}

}
