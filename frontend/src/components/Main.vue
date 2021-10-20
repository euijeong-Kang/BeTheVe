<template>
  <v-container>
    <v-card class="pb-4">
      <v-img contain src="@/assets/mainpage_image2.jpg">
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
              <form action="/restaurants">
                <v-autocomplete
                  filled
                  rounded
                  solo
                  v-model="keyword"
                ></v-autocomplete>
              </form>
            </v-col>
          </v-row>
        </v-container>
      </v-img>
      <v-row>
        <v-col>
          <div class="text-center pa-10 mt-3">
            <h2>이번주 가장 핫한 식당을 소개합니다</h2>
          </div>
        </v-col>
      </v-row>
      <v-row class="pa-4">
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
export default {};
</script>

<style></style>
