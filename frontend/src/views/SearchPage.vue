<template>
  <div>
    <v-container>
      <Search></Search>
      <RestaurantListItem
        v-for="restaurant in restaurants"
        :key="restaurant._id"
        :restaurant="restaurant"
      >
      </RestaurantListItem>
    </v-container>
  </div>
</template>

<script>
import RestaurantListItem from '@/components/restaurants/RestaurantListItem.vue';
import Search from '@/components/Search.vue';
import { getRestaurantsByKeyWord } from '@/api/restaurants';

export default {
  components: { RestaurantListItem, Search },
  data() {
    return {
      restaurants: [],
    };
  },
  methods: {
    async fetchData() {
      const { data } = await getRestaurantsByKeyWord('소하');
      this.restaurants = data;
    },
  },
  created() {
    this.fetchData();
  },
};
</script>

<style></style>
