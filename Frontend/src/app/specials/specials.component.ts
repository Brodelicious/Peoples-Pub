import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-specials',
  templateUrl: './specials.component.html',
  styleUrls: ['./specials.component.css']
})
export class SpecialsComponent implements OnInit {

  constructor() { 
  }

  ngOnInit(): void {
    let selectedDay: String;
    this.daySelect(new Date().getDay());
  }

  daySelect(day: Number): void{
    var daySelect = document.getElementById("daySelect");
    var dayBtns = daySelect!.getElementsByClassName("btn");
    for (var i = 0; i < 7; i++){
      if(i == day){
        dayBtns[i].className += " active";
        this.selectedDay = dayBtns[i].textContent;
      }
      else{
        dayBtns[i].className = dayBtns[i].className.replace(" active", "");
      }
    }
  }
}
