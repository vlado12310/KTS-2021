import { ComponentFixture, TestBed } from '@angular/core/testing';

import { BarmanViewComponent } from './barman-view.component';

describe('BarmanViewComponent', () => {
  let component: BarmanViewComponent;
  let fixture: ComponentFixture<BarmanViewComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ BarmanViewComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(BarmanViewComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
