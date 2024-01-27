import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PanelMechanikaComponent } from './panel-mechanika.component';

describe('PanelMechanikaComponent', () => {
  let component: PanelMechanikaComponent;
  let fixture: ComponentFixture<PanelMechanikaComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [PanelMechanikaComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(PanelMechanikaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
