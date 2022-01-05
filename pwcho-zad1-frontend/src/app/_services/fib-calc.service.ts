import { Injectable } from '@angular/core';
import {HttpClient, HttpHeaders} from "@angular/common/http";
import {Observable} from "rxjs";
import {FibonacciNumber} from "../_common/fibonacci-number";
import {FibPosition} from "../_common/fib-position";

const API_URL = 'http://localhost:9090/api/server';

const httpOptions = {
  headers: new HttpHeaders({ 'Content-Type': 'application/json' })
};

@Injectable({
  providedIn: 'root'
})
export class FibCalcService {

  constructor(private httpClient: HttpClient) { }

  getAllCalculatedFibonacciNumbers(): Observable<FibonacciNumber[]> {
    return this.httpClient.get<FibonacciNumber[]>(API_URL + `/fib/all`)
  }

  getLastTenFibPositions(): Observable<FibPosition[]> {
    return this.httpClient.get<FibPosition[]>(API_URL + `/position/last10`)
  }

  calculateFibonacciNumber(fibonacciPosition: number): Observable<FibonacciNumber> {
    return this.httpClient.post<FibonacciNumber>(API_URL + `/fib/${fibonacciPosition}`, httpOptions);
  }
}
