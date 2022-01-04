import {Component, Input, OnInit} from '@angular/core';
import {FibonacciNumber} from "../../_common/fibonacci-number";
import {FibPosition} from "../../_common/fib-position";
import {FibCalcService} from "../../_services/fib-calc.service";

@Component({
  selector: 'app-fibcalc',
  templateUrl: './fibcalc.component.html',
  styleUrls: ['./fibcalc.component.css']
})
export class FibcalcComponent implements OnInit {

  fibResult: FibonacciNumber | null;
  fibHistory: FibonacciNumber[] = [];
  positions: FibPosition[] = [];

  formFib: any = {
    fibonacciPosition: 1
  };

  constructor(private fibCalcService: FibCalcService) { }

  ngOnInit(): void {
    this.fibResult = null;
    this.listfibHistoryAndPositions();
  }

  listfibHistoryAndPositions(): void {
    this.formFib.fibonacciPosition = 1;
    this.fibCalcService.getAllCalculatedFibonacciNumbers().subscribe(data => {
      this.fibHistory = data;
    })
    this.fibCalcService.getLastTenFibPositions().subscribe(data => {
      this.positions = data;
    })
  }

  onClickCalculateFibonacciNumber() {
    const { fibonacciPosition } = this.formFib;
    if (fibonacciPosition >= 1 && fibonacciPosition <= 20) {
      this.fibCalcService.calculateFibonacciNumber(fibonacciPosition).subscribe(data => {
        this.fibResult = data;
        this.listfibHistoryAndPositions();
      })
    } else {
      this.formFib.fibonacciPosition = 20;
    }
  }

  onClickHistory() {
    this.listfibHistoryAndPositions();
  }
}
