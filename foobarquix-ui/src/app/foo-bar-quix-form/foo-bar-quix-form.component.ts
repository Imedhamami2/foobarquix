import { Component, EventEmitter, OnInit, Output } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-foo-bar-quix-form',
  templateUrl: './foo-bar-quix-form.component.html'
})
export class FooBarQuixFormComponent implements OnInit {
  @Output() submitNumberOutput = new EventEmitter<number>();
  fooBarQuixForm: FormGroup;
  numberRegEx = /^[1-9]\d*$/;

  constructor(private formBuilder: FormBuilder) {

  }

  ngOnInit(): void {
    this.fooBarQuixForm = this.formBuilder.group({
      inputNumber: [
        null,
        [Validators.required, Validators.pattern(this.numberRegEx)],
      ],
    });
  }

  submitNumber(form): void {
  }
  
  getErrorInput() {
    return this.fooBarQuixForm.get('inputNumber').hasError('required')
      ? 'Field is required'
      : this.fooBarQuixForm.get('inputNumber').hasError('pattern')
      ? 'Not a valid number'
      : '';
  }

}
