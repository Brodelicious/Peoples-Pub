import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-specials',
  templateUrl: './specials.component.html',
  styleUrls: ['./specials.component.css']
})

export class SpecialsComponent implements OnInit {
  selectedDay: String;
  daySelect: HTMLElement;
  priceRange: HTMLElement;
  dayBtns: HTMLCollectionOf<Element>;
  maxPrice: Number;

  constructor() { }

  ngOnInit(): void { 

    this.daySelect = document.getElementById("daySelect");
    this.dayBtnClick(new Date().getDay());
    this.dayBtns = this.daySelect.getElementsByClassName("btn");

    this.dayBtnClick(new Date().getDay());

    this.priceRange = document.getElementById("priceRange");
    this.maxPrice = Number((document.getElementById("priceRange") as HTMLInputElement).value);
  }

  dayBtnClick(dayClicked: Number): void{
    var day = new Array(7);
    day[0] = "Sunday";
    day[1] = "Monday";
    day[2] = "Tuesday";
    day[3] = "Wednesday";
    day[4] = "Thursday";
    day[5] = "Friday";
    day[6] = "Saturday";

    this.selectedDay = day[Number(dayClicked)];

    for (var i = 0; i < 7; i++){
      if(i == dayClicked){
        this.dayBtns[i].className += " active";
      }
      else{
        this.dayBtns[i].className = this.dayBtns[i].className.replace(" active", "");
      }
    }
  }
}
