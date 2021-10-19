<template>
  <v-container>
    <v-card>
      <v-img contain src="@/assets/mainpage.jpg">
        <v-container class="spacing-playground pa-16" fluid pb-5>
          <v-row class="py-8">
            <v-col align-self="center" white>
              <div class="text-center">
                <h2 class="white--text">
                  어느 지역이든 최고의 비건식당을 찾아줄게요!
                </h2>
              </div>
            </v-col>
          </v-row>
          <v-row class="px-16">
            <v-col class="px-16">
              <form>
                <v-autocomplete
                  class="px-16"
                  filled
                  rounded
                  solo
                ></v-autocomplete>
              </form>
            </v-col>
          </v-row>
        </v-container>
      </v-img>
      <div></div>
      <v-row>
        <v-col
          ><v-card class="pa-3"
            ><v-img
              max-height="245"
              max-width="250"
              src="@/assets/restaurant1.jpg"
            ></v-img></v-card
        ></v-col>
        <v-col
          ><v-card class="pa-3"
            ><v-img
              max-height="245"
              max-width="250"
              src="@/assets/restaurant2.jpg"
            ></v-img></v-card
        ></v-col>
      </v-row>
    </v-card>
  </v-container>
</template>

<script>
export default {
  data: () => ({
    justify: ['start', 'center', 'end', 'space-around', 'space-between'],
  }),
};
</script>

<style></style>
