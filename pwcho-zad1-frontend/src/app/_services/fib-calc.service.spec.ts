import { TestBed } from '@angular/core/testing';

import { FibCalcService } from './fib-calc.service';

describe('FibCalcService', () => {
  let service: FibCalcService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(FibCalcService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
