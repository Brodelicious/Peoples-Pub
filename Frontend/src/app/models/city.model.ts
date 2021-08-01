import {Restaurant} from './restaurant.model';

export class City {
  id: number;
  name: string;
  status: number;
  days: number[];
  restaurant: Restaurant;
}
