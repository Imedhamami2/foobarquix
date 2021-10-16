import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Result } from './model/result';
import * as pathUtils from './utils/path-utils';

@Injectable({
  providedIn: 'root'
})
export class FooBarQuixService {
  constructor(private http: HttpClient) { }

  convertNumber(inputNumber) {
    return this.http.get<Result>(pathUtils.SERVER_NAME_DEV_LOCAL + '/' + inputNumber);
  }

}
