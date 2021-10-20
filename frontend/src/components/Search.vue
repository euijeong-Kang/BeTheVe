<template>
  <v-container>
    <v-card class="py-4">
      <v-row class="pa-4 mx-4" align="center">
        <v-col>
          <span>OOO지역 추천 식당</span>
        </v-col>
        <v-col>
          <v-sheet max-width="700">
            <v-slide-group multiple show-arrows>
              <v-slide-item v-for="n in 4" :key="n" v-slot="{ active, toggle }">
                <v-btn
                  class="mx-2"
                  :input-value="active"
                  active-class="orange white--text"
                  depressed
                  rounded
                  @click="toggle"
                >
                  Options {{ n }}
                </v-btn>
              </v-slide-item>
            </v-slide-group>
          </v-sheet>
        </v-col>
      </v-row>
    </v-card>
  </v-container>
</template>

<script>
export default {};
</script>

<style></style>
