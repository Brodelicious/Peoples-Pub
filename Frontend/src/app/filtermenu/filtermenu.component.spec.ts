import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FiltermenuComponent } from './filtermenu.component';

describe('FiltermenuComponent', () => {
  let component: FiltermenuComponent;
  let fixture: ComponentFixture<FiltermenuComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ FiltermenuComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(FiltermenuComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
