import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PanelDyspozytoraComponent } from './panel-dyspozytora.component';

describe('PanelDyspozytoraComponent', () => {
  let component: PanelDyspozytoraComponent;
  let fixture: ComponentFixture<PanelDyspozytoraComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [PanelDyspozytoraComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(PanelDyspozytoraComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
