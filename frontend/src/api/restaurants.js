import { restaurants } from './index';

function getRestaurantsByKeyWord(keyWord) {
  return restaurants.get(keyWord);
}

export { getRestaurantsByKeyWord };
