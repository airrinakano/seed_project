<template>
  <div class="header-container">
    <header class="header">
      <v-spacer></v-spacer>
      <v-row no-gutters>
        <v-col><router-link to="/about"> ABOUT </router-link></v-col>
        <v-col> <router-link to="/demo">CONCEPT</router-link></v-col>
        <v-col><router-link to="/item"> ITEMS</router-link></v-col>
        <v-col> <router-link to="/login"> LOGIN</router-link></v-col>
        <v-col>
          <router-link to="/contact">
            CONTACT<v-icon large
              >mdi-credit-card-contactless</v-icon
            ></router-link
          ></v-col
        >
        <v-col> <router-link to="/cart"> CART</router-link></v-col>
      </v-row>
    </header>
  </div>
</template>

<script>
// import { mdiCreditCardWirelessOutline } from "@mdi/js";
export default {
  name: "GlobalHeader",
  props: {
    msg: String,
  },
  methods: {},
  data: () => ({}),
  computed: {},
  mounted() {},
};
</script>

<style scoped>
header {
  z-index: 100000;
  text-align: center;
  position: fixed;
  top: 0;
  width: 100%;
  color: #888;
  background: white;
  height: 1rem;
  transition: all 0.3s ease;
}
.header-container {
  background: rgba(0, 0, 0, 0.4);
}

.col {
  cursor: pointer;
  text-align: center;
}
.row {
  line-height: 7rem;
}

a {
  text-decoration: none;
  position: relative;
  text-shadow: 0px 1px 2px #777;
  line-height: 4rem;
  color: white;
  font-family: PT Sans, sans-serif;
  font-weight: 700;
  letter-spacing: 0.05em;
  width: 100%;
}
a::after {
  position: absolute;
  bottom: 2px;
  left: 0;
  content: "";
  width: 100%;
  height: 2px;
  background: white;
  opacity: 0;
  visibility: hidden;
  transition: 0.3s;
}
a:hover::after {
  bottom: -10px;
  opacity: 1;
  visibility: visible;
}
</style>
