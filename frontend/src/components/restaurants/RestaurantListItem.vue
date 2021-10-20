<template>
  <v-container>
    <v-container>
      <v-row align="center">
        <v-col>
          <v-card>
            <v-row align="center">
              <v-col class="px-6">
                <v-img
                  max-height="245"
                  max-width="250"
                  src="@/assets/restaurant1.jpg"
                  transition="fa"
                ></v-img>
              </v-col>
              <v-col>
                <v-container>
                  <v-row class="py-1">
                    <div class="restaurant-name">
                      상호명: {{ restaurant.name }}
                    </div>
                  </v-row>
                  <v-row class="py-1">
                    <div class="restaurant-phoneNum">
                      전화번호: {{ restaurant.phoneNum }}
                    </div>
                  </v-row>
                  <v-row class="py-1">
                    <div class="restaurant-address">
                      주소: {{ restaurant.address }}
                    </div>
                  </v-row>
                </v-container>
              </v-col>
            </v-row>
          </v-card>
        </v-col>
      </v-row>
    </v-container>
  </v-container>
</template>

<script>
export default {
  props: {
    restaurant: {
      type: Object,
      require: true,
    },
  },
};
</script>

<style></style>
